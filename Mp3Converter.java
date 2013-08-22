/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3metagen;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cmc.music.common.ID3ReadException;
import org.cmc.music.metadata.IMusicMetadata;
import org.cmc.music.clean.*;
import org.cmc.music.myid3.*;
import org.cmc.music.metadata.MusicMetadata;
import org.cmc.music.metadata.MusicMetadataSet;


/**
 *
 * @author stephenmalloy
 */
public class Mp3Converter extends Thread {

    private Mp3ConvertGUI mcg;
    private ArrayList listOfFiles;
    private FileManager fm;
    private int successCount, failureCount;

    public Mp3Converter(Mp3ConvertGUI mcg, ArrayList listOfFiles) {
        this.mcg = mcg;
        this.listOfFiles = listOfFiles;
        this.fm = new FileManager();
    }


    @Override
    public void run() {

        successCount = 0;
        failureCount = 0;
        
        if (listOfFiles.size() > 0) {

            mcg.clearOutput();

            mcg.setProgressBarMaxInterval(listOfFiles.size());

            mcg.updateOutput("Detected " + listOfFiles.size() + " MP3 files to convert.\r\n");

            for (int i = 0; i < listOfFiles.size(); i++) {

                // TODO windows will not have this slash...
                String fileName = mcg.mp3Path + "/" + (String) listOfFiles.get(i);

                mcg.updateOutput("Attempting to convert " + fileName + "\r\n");

                File src = new File(fileName);

                try {

                    MusicMetadataSet src_set = new MyID3().read(src); // read metadata

                    if (src_set == null) {

                        mcg.updateOutput("No metadata detected for " + fileName + ". Aborting.\r\n");
                        failureCount++;

                    } else {

                        //System.out.println("Meta data is: " + src_set);

                        IMusicMetadata metadata = src_set.getSimplified();

                        String newName = metadata.getSongTitle() + "_" + metadata.getArtist() + "_" + metadata.getAlbum();
                        newName = newName.replaceAll(" ", "_");
                        newName = newName.replaceAll("null_", "").trim() + ".mp3";

                        if (mcg.doOverwrite) {

                            fm.renameFile(fileName, mcg.mp3Path + "/" + newName);

                        } else if (mcg.doWriteToPath) {

                            fm.copyFile(fileName, mcg.outputPath + "/" + newName);

                        }

                        mcg.updateOutput("Rename complete for " + newName + "\r\n");
                        successCount++;

                    }


                } catch (IOException ex) {
                    Logger.getLogger(Mp3Converter.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ID3ReadException ex) {
                    Logger.getLogger(Mp3Converter.class.getName()).log(Level.SEVERE, null, ex);
                }

                mcg.updateProgress(i, listOfFiles.size());


            }  // end list iterator
            
            mcg.clearProgress();
            mcg.updateOutput("\r\nConversion complete. " + successCount + " successful - " + failureCount + " failed");
            Toolkit.getDefaultToolkit().beep();


        } else {

            // update UI
            mcg.clearOutput();
            mcg.updateOutput("No MP3 files detected.");

        }  // end if files to convert




    }  // end run method



}
