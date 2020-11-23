package view;


import control.UploadsController;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Imagem;
//import sun.misc.IOUtils;

public class FrmUploads extends javax.swing.JFrame {
    JFileChooser chooser = new JFileChooser();
    File f, destino;
    UploadsController uploadsController;
    int codigoMestre;
    ArrayList<Imagem> banco = null;
    
    public FrmUploads() {
        initComponents();
        uploadsController = new UploadsController();
        codigoMestre = 65;
        imagens();
    }
    
    public FrmUploads(int codMestre) {
        initComponents();
        uploadsController = new UploadsController();
        codigoMestre = codMestre;
        imagens();
    }

    public final void imagens(){
        try {
            banco = uploadsController.passaBanco(codigoMestre);
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.addElement("<Selecione>");
        
        for(Imagem i: banco)
            dcbm.addElement(i.getNomeImagem());
            
        this.cmbImages.setModel(dcbm);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbImages = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Selecione um Imagem de seu PC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbImages.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbImagesItemStateChanged(evt);
            }
        });

        jTextField1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbImages, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbImages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        jTextField1.setText(f.getName());
        
        ImageIcon imageIcon = new ImageIcon(f.getPath());
        if(imageIcon.getIconHeight() > 100 || imageIcon.getIconWidth() > 300){
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(100, 300, java.awt.Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            jLabel1.setIcon(icon); 
        }
        else
            jLabel1.setIcon(imageIcon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FileInputStream myStream = null;        
        byte[] bArray;

        try {
            myStream = new FileInputStream(f);
        } 
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        try {
            bArray = new byte[myStream.available()];
        } 
        catch (IOException ex) {
            System.out.println(ex);
            bArray = new byte[0];
        }
        try {
            int i = myStream.read(bArray, 0, (int) f.length());
            //System.out.println(i);
        } 
        catch (IOException ex) {
            System.out.println(ex);
        }
        
        try {
            boolean up = uploadsController.passaImagem(f.getName(), bArray, codigoMestre);
            if(up)
                JOptionPane.showMessageDialog(null, "Upload realizado com sucesso");
            else
                JOptionPane.showMessageDialog(null, "Upload NÃO realizado");
        } 
        catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Upload NÃO realizado. ERROR BRUTAL: " + ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbImagesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbImagesItemStateChanged
        //File f1 = null;
        byte[] b;
        for(Imagem i: banco)
            if(i.getNomeImagem().equals((String) cmbImages.getSelectedItem())){
                b = i.getConteudoImagem();
                new ImageIcon(b).getImage();
                ImageIcon imageIcon = new ImageIcon(b);
                if(imageIcon.getIconHeight() > 100 || imageIcon.getIconWidth() > 300){
                    Image image = imageIcon.getImage();
                    Image newimg = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(newimg);
                    jLabel1.setIcon(icon); 
                }
                else
                    jLabel1.setIcon(imageIcon);
                /*try {
                    myStream.write(b, 0, (int) f.length());
                } 
                catch (IOException ex) {
                    System.out.println(ex);
                }
                catch(Exception ex){
                    System.out.println("manor aqui 2: " + ex);
                }
                ImageIcon imageIcon = new ImageIcon(f.getPath());
                if(imageIcon.getIconHeight() > 100 || imageIcon.getIconWidth() > 300){
                    Image image = imageIcon.getImage();
                    Image newimg = image.getScaledInstance(100, 300, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(newimg);
                    jLabel1.setIcon(icon); 
                }
                else
                    jLabel1.setIcon(imageIcon);*/
            }
    }//GEN-LAST:event_cmbImagesItemStateChanged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmUploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUploads().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbImages;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
