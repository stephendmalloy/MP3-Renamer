/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3metagen;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**
 *
 * @author stephenmalloy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = (int)screenSize.getWidth();     // getting Screen width
        int screenHeight = (int)screenSize.getHeight();  // getting Screen height

        Mp3ConvertGUI mcg = new Mp3ConvertGUI();
        
        mcg.setLocation(((screenWidth / 2) - (mcg.getWidth()/2)),
         ((screenHeight / 2) - (mcg.getHeight()/2)));

        mcg.setVisible(true);

    }

}
