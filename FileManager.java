/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3metagen;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import java.util.ArrayList;

/**
 *
 * @author stephenmalloy
 */
public class FileManager {

    public FileManager() {

    }

    public ArrayList getFiles(String path, String type) {

        ArrayList list = new ArrayList();

        File folder = new File(path);

        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {

            for (int i = 0; i < listOfFiles.length; i++) {

                if (!listOfFiles[i].isDirectory()) {

                    if (listOfFiles[i].getName().endsWith(type)) {

                        list.add(listOfFiles[i].getName().trim());
                    }
                }

            }

        }

        return list;
    }

    public boolean renameFile(String oldFile, String newFile) {

        File file = new File(oldFile);
        File file2 = new File(newFile);
        return file.renameTo(file2);
    }

    public boolean copyFile(String srFile, String dtFile)  {
        FileUtils f = new FileUtils();
        try {
            f.copyFile(new File(srFile), new File(dtFile));
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    

}
