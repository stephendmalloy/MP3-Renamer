/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PathSelector.java
 *
 * Created on Sep 21, 2009, 8:45:06 PM
 */

package mp3metagen;

/**
 *
 * @author stephenmalloy - stephendmalloy@gmail.com
 */

import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

public class PathSelector extends javax.swing.JDialog {

    String type;
    Mp3ConvertGUI mainWindow;

    /** Creates new form PathSelector */
    public PathSelector(java.awt.Frame parent, boolean modal, String type, Mp3ConvertGUI parentWin) {
        super(parent, modal);

        this.type = type;
        this.mainWindow = parentWin;
        
        initComponents();

        jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Folder Path");
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jFileChooser1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jFileChooser1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed

        if (evt.getActionCommand().equals("CancelSelection")) {

            this.dispose();

        } else if (evt.getActionCommand().equals("ApproveSelection")) {

            
            File file = jFileChooser1.getSelectedFile();
            mainWindow.setPath( type, file.getAbsolutePath() );
            dispose();


        } else {

            // ....

        }

    }//GEN-LAST:event_jFileChooser1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PathSelector dialog = new PathSelector(new javax.swing.JFrame(), true, "", null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables

}
