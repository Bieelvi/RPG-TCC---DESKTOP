package view;

import control.FichaMestreController;
import control.MestreController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.FichaMestre;
import model.Mestre;

public class FrmMestre extends javax.swing.JFrame {

    int a = 0;
    int codUsuario;    
    int codMestre = 0;
    int codFichaMestre = 0;
    MestreController mestreController;
    FichaMestreController fichaMestreController;
    ArrayList<Mestre> mestres;
    ArrayList<FichaMestre> fichas = null;
    
    public FrmMestre(int codUsuario){
        initComponents();
        this.mestreController = new MestreController();
        fichaMestreController = new FichaMestreController();
        this.codUsuario = codUsuario;
        buscaMestres(); 
    }

    public FrmMestre(){
        initComponents();
        this.codUsuario = 1;
        this.mestreController = new MestreController();
        fichaMestreController = new FichaMestreController();
        buscaMestres();
    }
    
    public void add(){
        if(a == 0){
            new AddMestre(this.codUsuario).setVisible(true);
            a++;
        }
    }
    
    public final void buscaMestres(){
        
        try {
            mestres = mestreController.mestreBanco(codUsuario);
        } 
        catch(SQLException | ClassNotFoundException ex){
            System.out.println("Mano deu error relacionado ao bancor. ERROR: " + ex);
        }
        
        DefaultComboBoxModel mestreCBM = new DefaultComboBoxModel();
        mestreCBM.addElement("<Selecione>");
        
        for(Mestre m: mestres)
            mestreCBM.addElement(m.getNomeMestre());
            
        mestreCBM.addElement("<Criar Novo Mestre>");
        cmbMestre.setModel(mestreCBM);
    }
    
    public void buscaFichas(int codMestre){
        try {
            fichas = fichaMestreController.puxaFichas(codMestre);
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
        DefaultComboBoxModel fichaCBM = new DefaultComboBoxModel();
        fichaCBM.addElement("<Selecione>");
        
        for(FichaMestre fm: fichas)
            fichaCBM.addElement(fm.getNome());
        
        fichaCBM.addElement("<Criar Nova Ficha>");
        cmbFichas.setModel(fichaCBM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFicha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmbMestre = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        cmbFichas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setForeground(new java.awt.Color(51, 255, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Selecione uma Ficha");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Abrir Ficha Seleionada:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Funções do Mestre");

        btnFicha.setBackground(new java.awt.Color(255, 255, 255));
        btnFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iconeFicha.jpeg"))); // NOI18N
        btnFicha.setText("Ficha Selecionada");
        btnFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/d20.png"))); // NOI18N
        jButton1.setText("Funções");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbMestre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMestreItemStateChanged(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\STI\\Desktop\\lupinha.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbFichas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFichasItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Selecione um Mestre");

        btnVoltar.setText("voltar");
        btnVoltar.setMargin(new java.awt.Insets(2, 5, 2, 5));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jLabel3)))
                    .addComponent(cmbMestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbFichas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmbMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmbFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmUploads(codMestre, codUsuario).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaActionPerformed
        String mestreSelec = (String) this.cmbMestre.getSelectedItem();
        String fichaSelec = (String) this.cmbFichas.getSelectedItem();
        
        try {
            if(fichaSelec.isEmpty() || mestreSelec.isEmpty() || fichaSelec.equals("<Selecione>") || mestreSelec.equals("<Selecione>"))
                if(fichaSelec.isEmpty() || fichaSelec.equals("<Selecione>"))
                    JOptionPane.showMessageDialog(null, "Selecione um mestre e depois uma ficha correspondente a este mestre");
                if(mestreSelec.isEmpty() || mestreSelec.equals("<Selecione>"))
                    JOptionPane.showMessageDialog(null, "Selecione uma ficha !!!");
            else{
                new FrmFichaMestre(codUsuario, codFichaMestre, codMestre).setVisible(true);
                setVisible(false);
            }
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmMestre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFichaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscaMestres();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbMestreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMestreItemStateChanged
        String itemCmbPerso = (String) this.cmbMestre.getSelectedItem();
        
        if(itemCmbPerso.equals("<Criar Novo Mestre>"))
            add();
        else
            for(Mestre j: mestres)
                if(j.getNomeMestre().equals(itemCmbPerso)){
                    codMestre = j.getCodigoMestre();
                    this.buscaFichas(j.getCodigoMestre());
                }
        
    }//GEN-LAST:event_cmbMestreItemStateChanged

    private void cmbFichasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFichasItemStateChanged
        if(this.cmbFichas.getSelectedItem().equals("<Criar Nova Ficha>"))
            codFichaMestre = 0;
        else
            for(FichaMestre f: fichas)
                if(f.getNome().equals(this.cmbFichas.getSelectedItem()))
                    codFichaMestre = f.getCodFichaMestre();
    }//GEN-LAST:event_cmbFichasItemStateChanged

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new FrmBemVindo(codUsuario).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FrmMestre().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFicha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbFichas;
    private javax.swing.JComboBox<String> cmbMestre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
