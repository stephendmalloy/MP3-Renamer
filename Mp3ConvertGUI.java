/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Mp3ConvertGUI.java
 *
 * Created on Aug 18, 2010, 4:42:34 PM
 */

package mp3metagen;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author stephenmalloy
 */
public class Mp3ConvertGUI extends javax.swing.JFrame {

    public String mp3Path, outputPath;

    public FileManager fileManager;

    public boolean doOverwrite = true;
    public boolean doWriteToPath = false;

    /** Creates new form Mp3ConvertGUI */
    public Mp3ConvertGUI() {
        initComponents();
        fileManager = new FileManager();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        progressBar = new javax.swing.JProgressBar();
        txtMp3Path = new javax.swing.JTextField();
        btnMp3Browse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputInfo = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnConvert = new javax.swing.JButton();
        radOverwrite = new javax.swing.JRadioButton();
        radWriteToPath = new javax.swing.JRadioButton();
        txtOutputPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnOutputPath = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MP3 Metadata Converter - CheshireWare");
        setBackground(new java.awt.Color(223, 223, 223));

        txtMp3Path.setEditable(false);
        txtMp3Path.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPathClickedHandler(evt);
            }
        });

        btnMp3Browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationIcons/folder_explore.png"))); // NOI18N
        btnMp3Browse.setText("Browse");
        btnMp3Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMp3BrowseActionPerformed(evt);
            }
        });

        jLabel4.setText("MP3 Path:");

        jLabel3.setText("Output information:");

        txtOutputInfo.setColumns(20);
        txtOutputInfo.setRows(5);
        jScrollPane1.setViewportView(txtOutputInfo);

        btnConvert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationIcons/music.png"))); // NOI18N
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        buttonGroup1.add(radOverwrite);
        radOverwrite.setSelected(true);
        radOverwrite.setText("Rename existing MP3 files");
        radOverwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOverwriteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radWriteToPath);
        radWriteToPath.setText("Copy renamed MP3 files to output path");
        radWriteToPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radWriteToPathActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, radWriteToPath, org.jdesktop.beansbinding.ELProperty.create("${selected}"), txtOutputPath, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        txtOutputPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOutputPathActionPerformed(evt);
            }
        });
        txtOutputPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOutputPathClickHandler(evt);
            }
        });

        jLabel1.setText("Output path:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, radWriteToPath, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jLabel1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        btnOutputPath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationIcons/folder_explore.png"))); // NOI18N
        btnOutputPath.setText("Browse");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, radWriteToPath, org.jdesktop.beansbinding.ELProperty.create("${selected}"), btnOutputPath, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        btnOutputPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputPathActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem2.setText("Exit");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuExitItemClicked(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationIcons/information.png"))); // NOI18N
        jMenuItem1.setText("About");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuAboutClickHandler(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(progressBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtMp3Path, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 554, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnMp3Browse))
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtOutputPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 534, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(btnOutputPath))
                            .add(layout.createSequentialGroup()
                                .add(radOverwrite)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(radWriteToPath)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 232, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                            .add(jSeparator3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                            .add(btnConvert))
                        .add(22, 22, 22))
                    .add(layout.createSequentialGroup()
                        .add(jLabel3)
                        .addContainerGap(599, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtMp3Path, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnMp3Browse))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(radWriteToPath)
                    .add(radOverwrite))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtOutputPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnOutputPath))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1)
                .add(btnConvert)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(3, 3, 3)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radOverwriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOverwriteActionPerformed
        doOverwrite = true;
        doWriteToPath = false;
    }//GEN-LAST:event_radOverwriteActionPerformed

    private void radWriteToPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radWriteToPathActionPerformed
        doOverwrite = false;
        doWriteToPath = true;
    }//GEN-LAST:event_radWriteToPathActionPerformed

    private void btnMp3BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMp3BrowseActionPerformed
        showPathSelector("mp3");
    }//GEN-LAST:event_btnMp3BrowseActionPerformed

    private void btnOutputPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputPathActionPerformed
        showPathSelector("output");
    }//GEN-LAST:event_btnOutputPathActionPerformed

    private void txtPathClickedHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPathClickedHandler
        showPathSelector("mp3");
    }//GEN-LAST:event_txtPathClickedHandler

    private void txtOutputPathClickHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOutputPathClickHandler
        if (!radOverwrite.isSelected()) {
            showPathSelector("output");
        }
    }//GEN-LAST:event_txtOutputPathClickHandler

    private void txtOutputPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOutputPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOutputPathActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed

        ArrayList fileList = fileManager.getFiles(txtMp3Path.getText(), "mp3");

        if (fileList.size() < 1) {
            JOptionPane.showMessageDialog(null,"No MP3 files were detected in the MP3 path that you specified.","ERROR",JOptionPane.ERROR_MESSAGE);
        } else {
            Mp3Converter mc = new Mp3Converter(this, fileList);
            mc.start();
        }

    }//GEN-LAST:event_btnConvertActionPerformed

    private void mnuAboutClickHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAboutClickHandler

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = (int)screenSize.getWidth();     // getting Screen width
        int screenHeight = (int)screenSize.getHeight();  // getting Screen height

        About abt = new About(this, true);

        abt.setLocation(((screenWidth / 2) - (abt.getWidth()/2)),
         ((screenHeight / 2) - (abt.getHeight()/2)));
        
        abt.setVisible(true);

    }//GEN-LAST:event_mnuAboutClickHandler

    private void mnuExitItemClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuExitItemClicked
        System.exit(1);
    }//GEN-LAST:event_mnuExitItemClicked



    public void setPath(String txtField,String path) {
        if (txtField.equals("mp3")) {
            txtMp3Path.setText(path);
            this.mp3Path = path;
        } else if (txtField.equals("output")) {
            txtOutputPath.setText(path);
            this.outputPath = path;
        }
    }

    public String getInputPath() {
        return this.txtMp3Path.getText().trim();
    }
    public String getOutputPath() {
        return this.txtOutputPath.getText().trim();
    }

    private void showPathSelector(String type) {
        PathSelector ps = new PathSelector(this,true,type,this);
        ps.setLocationRelativeTo(null);
        ps.setVisible(true);
    }

    public void setProgressBarMaxInterval(int val) {
        progressBar.setMaximum(val);
    }

    public void updateProgress(int val, int max) {
        btnConvert.setEnabled(false);
        progressBar.setValue(val);
        progressBar.setStringPainted(true);
        progressBar.setString("converting track " + val + " of " + max);

    }
    public void clearProgress() {
        progressBar.setValue(progressBar.getMinimum());
        progressBar.setString("");
        btnConvert.setEnabled(true);
    }

    public void updateOutput(String copy) {
        txtOutputInfo.setText(txtOutputInfo.getText() + copy);
        txtOutputInfo.setCaretPosition(txtOutputInfo.getText().length());
    }

    public void clearOutput() {
        txtOutputInfo.setText("");
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mp3ConvertGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnMp3Browse;
    private javax.swing.JButton btnOutputPath;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JRadioButton radOverwrite;
    private javax.swing.JRadioButton radWriteToPath;
    private javax.swing.JTextField txtMp3Path;
    private javax.swing.JTextArea txtOutputInfo;
    private javax.swing.JTextField txtOutputPath;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}