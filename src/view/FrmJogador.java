package view;

import control.JogadorController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Jogador;

public class FrmJogador extends javax.swing.JFrame {

    int codUsuario;
    JogadorController jogadorController;
    Jogador jogador;
    ArrayList<Jogador> jogadores;
    
    public FrmJogador(int codUsuario){
        this.codUsuario = codUsuario;
        this.jogadorController = new JogadorController();
        
        try {
            jogadores = jogadorController.jogadoresBanco(codUsuario);
        } 
        catch(SQLException ex){
            System.out.println("Mano deu erro relacionado ao SQL. ERROR: " + ex);
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Mano deu erro de classe mano. ERROR: " + ex);
        }
        initComponents();
    }

    public FrmJogador(){
        this.codUsuario = 3;
        this.jogadorController = new JogadorController();
        
        try {
            jogadores = jogadorController.jogadoresBanco(codUsuario);
        } 
        catch(SQLException ex){
            System.out.println("Mano deu erro relacionado ao SQL. ERROR: " + ex);
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Mano deu erro de classe mano. ERROR: " + ex);
        }
        initComponents();
    }
    
    public final void jogadores(){
        
        try {
            jogadores = jogadorController.jogadoresBanco(codUsuario);
        } 
        catch(SQLException ex){
            System.out.println("Mano deu erro relacionado ao SQL. ERROR: " + ex);
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Mano deu erro de classe mano. ERROR: " + ex);
        }
        
        DefaultComboBoxModel personagemCBM = new DefaultComboBoxModel();
        personagemCBM.addElement("<Selecione>");
        
        for(Jogador j: jogadores)
            personagemCBM.addElement(j.getNomeJogador());
            
        personagemCBM.addElement("<Criar Novo Personagem>");
        cmbPerso.setModel(personagemCBM);
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
        cmbPerso = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Selecione um personagem:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Acessar Ficha:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Entrar Sala:");

        btnFicha.setBackground(new java.awt.Color(255, 255, 255));
        btnFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iconeFicha.jpeg"))); // NOI18N
        btnFicha.setText("Ficha");
        btnFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/d20.png"))); // NOI18N
        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbPerso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPersoItemStateChanged(evt);
            }
        });
        cmbPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPersoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\STI\\Desktop\\lupinha.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel3)))
                    .addComponent(cmbPerso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmbPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
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

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaActionPerformed
        String nomeJogador = (String) this.cmbPerso.getSelectedItem();
        for(Jogador j: jogadores){
            if(j.getNomeJogador().equals(nomeJogador)){
                if(j.getCodigoFicha() == 0)
                    JOptionPane.showMessageDialog(null, "Este personagem Não possui ficha cadastrada!");
                
                try{
                    new FrmFicha(codUsuario, j.getCodigoFicha(), nomeJogador).setVisible(true);
                    setVisible(false);
                }
                catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_btnFichaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jogadores();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbPersoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPersoItemStateChanged
        String itemCmbPerso = (String) this.cmbPerso.getSelectedItem();
        if(itemCmbPerso.equals("<Criar Novo Personagem>")){
            new AddPersonagem(this.codUsuario).setVisible(true);
        }
    }//GEN-LAST:event_cmbPersoItemStateChanged

    private void cmbPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPersoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPersoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFicha;
    private javax.swing.JComboBox<String> cmbPerso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
