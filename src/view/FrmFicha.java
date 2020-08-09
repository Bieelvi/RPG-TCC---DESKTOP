package view;

import control.AcessoController;
import control.RacaClasseRPG;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Classe;
import model.Ficha;
import model.Raca;

public class FrmFicha extends javax.swing.JFrame {
    
    Ficha ficha;
    RacaClasseRPG racaClasseRPG;
    String emailUsua;
    AcessoController acessoControllerFicha;
    
    public FrmFicha(String email, AcessoController acessoControllerLogin) {
        initComponents();
        emailUsua = email;
        ficha = new Ficha();
        racaClasseRPG = new RacaClasseRPG();
        acessoControllerFicha = acessoControllerLogin;
        classeRPG();
        racaRPG();
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtHistoriaDoPersonagem.setLineWrap(true);
        txtHistoriaDoPersonagem.setWrapStyleWord(true);
        txtCaracteristicasPersonagem.setLineWrap(true);
        txtCaracteristicasPersonagem.setWrapStyleWord(true);
    }
    
    public final void classeRPG(){
        DefaultComboBoxModel classeBox = new DefaultComboBoxModel();
        ArrayList <Classe> cla = racaClasseRPG.classe();
        classeBox.addElement("<Selecione>");
        for (Classe c: cla){
            classeBox.addElement(c.getNome());
        }
        classeBox.addElement("Criar nova Classe");
        cmbClasse.setModel(classeBox);
    }
    
    public final void racaRPG(){
        DefaultComboBoxModel classeBox = new DefaultComboBoxModel();
        ArrayList <Raca> rac = racaClasseRPG.raca();
        classeBox.addElement("<Selecione>");
        for (Raca c: rac){
            classeBox.addElement(c.getNome());
        }
        classeBox.addElement("Criar nova Raça");
        cmbRaca.setModel(classeBox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblClassePersonagem = new javax.swing.JLabel();
        lblRacaPersonagem = new javax.swing.JLabel();
        lblNivelPersonagem = new javax.swing.JLabel();
        txtNivelPersonagem = new javax.swing.JTextField();
        lblTendenciaPersonagem = new javax.swing.JLabel();
        txtTendenciaPersonagem = new javax.swing.JTextField();
        lblNomeJogador = new javax.swing.JLabel();
        txtNomeJogador = new javax.swing.JTextField();
        lblExpPersonagem = new javax.swing.JLabel();
        txtExpPersonagem = new javax.swing.JTextField();
        lblNomePersonagem = new javax.swing.JLabel();
        cmbClasse = new javax.swing.JComboBox<>();
        cmbRaca = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        cmbNomePersonagem = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblForcaPersonagem = new javax.swing.JLabel();
        txtForcaPersonagem = new javax.swing.JTextField();
        txtForcaModificadorPersonagem = new javax.swing.JTextField();
        lblDestrezaPersonagem = new javax.swing.JLabel();
        txtDestrezaPersonagem = new javax.swing.JTextField();
        txtDestrezaModificadorPersonagem = new javax.swing.JTextField();
        lblConstituicaoPersonagem = new javax.swing.JLabel();
        txtConstituicaoPersonagem = new javax.swing.JTextField();
        txtConstituicaoModificadorPersonagem = new javax.swing.JTextField();
        lblInteligenciaPersonagem = new javax.swing.JLabel();
        txtInteligenciaPersonagem = new javax.swing.JTextField();
        txtInteligenciaModificadorPersonagem = new javax.swing.JTextField();
        lblSabedoriaPersonaem = new javax.swing.JLabel();
        txtSabedoriaPersonagem = new javax.swing.JTextField();
        txtSabedoriaModificadorPersonagem = new javax.swing.JTextField();
        lblCarismaPersonagem = new javax.swing.JLabel();
        txtCarismaPersonagem = new javax.swing.JTextField();
        txtCarismaModificadorPersonagem = new javax.swing.JTextField();
        btnCalculaModificador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radioForcaPersonagem = new javax.swing.JRadioButton();
        radioDestrezaPersonagem = new javax.swing.JRadioButton();
        radioConstituicaoPersonagem = new javax.swing.JRadioButton();
        radioSabedoriaPersonagem = new javax.swing.JRadioButton();
        radioInteligenciaPersonagem = new javax.swing.JRadioButton();
        radioCarismaPersonagem = new javax.swing.JRadioButton();
        txtTesteForcaPersonagem = new javax.swing.JTextField();
        txtTesteDestrezaPersongem = new javax.swing.JTextField();
        txtTesteConstituicaoPersonagem = new javax.swing.JTextField();
        txtTesteInteligenciaPersonagem = new javax.swing.JTextField();
        txtTesteSabedoriaPersonagem = new javax.swing.JTextField();
        txtTesteCarismaPersonagem = new javax.swing.JTextField();
        lblTesteResistencia = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtPericiaAcrobaciaPersonagem = new javax.swing.JTextField();
        lblPericiasPersonagem = new javax.swing.JLabel();
        radioAcrobaciaPersonagem = new javax.swing.JRadioButton();
        radioArcanismoPersonagem = new javax.swing.JRadioButton();
        txtArcanismoPersonagem = new javax.swing.JTextField();
        txtAtuacaoPersonagem = new javax.swing.JTextField();
        txtAtletismoPersonagem = new javax.swing.JTextField();
        radioAtletismoPersonagem = new javax.swing.JRadioButton();
        radioAtuacaoPersonagem = new javax.swing.JRadioButton();
        txtHistoriaPersonagem = new javax.swing.JTextField();
        radioHistoriaPersonagem = new javax.swing.JRadioButton();
        txtIntimidacaoPersonagem = new javax.swing.JTextField();
        radioIntimidacaoPersonagem = new javax.swing.JRadioButton();
        txtBlefarPersonagem = new javax.swing.JTextField();
        txtFurtividadePersonagem = new javax.swing.JTextField();
        radioFurtividadePersonagem = new javax.swing.JRadioButton();
        radioBlefarPersonagem = new javax.swing.JRadioButton();
        radioPrestidigitacaoPersonagem = new javax.swing.JRadioButton();
        txtPrestidigitacaoPersonagem = new javax.swing.JTextField();
        txtPersuassaoPersonagem = new javax.swing.JTextField();
        radioPercuassaoPersonagem = new javax.swing.JRadioButton();
        radioPercepcaoPersonagem = new javax.swing.JRadioButton();
        txtPercepcaoPersonagem = new javax.swing.JTextField();
        txtNaturezaPersonagem = new javax.swing.JTextField();
        radioNaturezaPersonagem = new javax.swing.JRadioButton();
        radioMedicina = new javax.swing.JRadioButton();
        txtMedicinaPersonagem = new javax.swing.JTextField();
        txtLidarAnimaisPersonagem = new javax.swing.JTextField();
        radioLidarAnimaisPersonagem = new javax.swing.JRadioButton();
        radioInvestigacaoPersonagem = new javax.swing.JRadioButton();
        txtInvestigacaoPersonagem = new javax.swing.JTextField();
        txtInuicaoPersonagem = new javax.swing.JTextField();
        radioIntuicaoPersonagem = new javax.swing.JRadioButton();
        txtSobrevivenciaPersonagem = new javax.swing.JTextField();
        radioSobrevivenciaPersonagem = new javax.swing.JRadioButton();
        txtReligaoPersonagem = new javax.swing.JTextField();
        radioReligiaoPersonagem = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEquipamentos = new javax.swing.JTextArea();
        lblDinheiroEquipamentosPersonagem = new javax.swing.JLabel();
        lblPrataPersonagem = new javax.swing.JLabel();
        txtPrataPersonagem = new javax.swing.JTextField();
        txtOuroPersonagem = new javax.swing.JTextField();
        lblOuroPersonagem = new javax.swing.JLabel();
        txtPlatinaPersonagem = new javax.swing.JTextField();
        lblPlatinaPersonagem = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblCaracteristicasPersonagem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCaracteristicasPersonagem = new javax.swing.JTextArea();
        lblFracassosPersonagem = new javax.swing.JLabel();
        lblTestesContraMortePersonagem = new javax.swing.JLabel();
        radioSucessoUmPersonagem = new javax.swing.JRadioButton();
        radioSucessoDoisPersonagem = new javax.swing.JRadioButton();
        radioSucessoTresPersonagem = new javax.swing.JRadioButton();
        radioFracassoUmPersonagem = new javax.swing.JRadioButton();
        radioFracassoDoisPersonagem = new javax.swing.JRadioButton();
        radioFracassoTresPersonagem = new javax.swing.JRadioButton();
        lblSucessosPersonagem = new javax.swing.JLabel();
        txtBonusProficienciaPersonagem = new javax.swing.JTextField();
        txtInspiracaoPersonagem = new javax.swing.JTextField();
        lblInspiracaoPersonagem = new javax.swing.JLabel();
        lblBonusProficienciaPersonagem = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHistoriaDoPersonagem = new javax.swing.JTextArea();
        lblHistoriaPersonagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblClassePersonagem.setText("CLASSE");

        lblRacaPersonagem.setText("RAÇA");

        lblNivelPersonagem.setText("NÍVEL");

        lblTendenciaPersonagem.setText("TENDÊNCIA");

        lblNomeJogador.setText("NOME DO JOGADOR");

        lblExpPersonagem.setText("PONTOS DE EXPERIÊNCIA");

        lblNomePersonagem.setText("NOME DO PERSONAGEM");

        cmbClasse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClasseItemStateChanged(evt);
            }
        });
        cmbClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClasseActionPerformed(evt);
            }
        });

        cmbRaca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRacaItemStateChanged(evt);
            }
        });
        cmbRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRacaActionPerformed(evt);
            }
        });

        jLabel3.setText("DESLOC.");

        jLabel1.setText("CLASSE ARMAD.");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIDA");

        cmbNomePersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomePersonagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomePersonagem)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTendenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtExpPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClassePersonagem)
                                    .addComponent(lblRacaPersonagem))
                                .addGap(139, 139, 139))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNivelPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNivelPersonagem)
                            .addComponent(lblTendenciaPersonagem))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExpPersonagem)
                            .addComponent(lblNomeJogador)
                            .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClassePersonagem)
                            .addComponent(lblNivelPersonagem)
                            .addComponent(lblNomeJogador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbClasse)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNivelPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExpPersonagem))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRacaPersonagem)
                                    .addComponent(lblTendenciaPersonagem))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbRaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTendenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExpPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomePersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGap(4, 4, 4))
        );

        lblForcaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForcaPersonagem.setText("FORÇA");

        txtForcaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtForcaModificadorPersonagem.setEnabled(false);

        lblDestrezaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDestrezaPersonagem.setText("DESTREZA");

        txtDestrezaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDestrezaModificadorPersonagem.setEnabled(false);

        lblConstituicaoPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConstituicaoPersonagem.setText("CONSTITUIÇÃO");

        txtConstituicaoModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConstituicaoModificadorPersonagem.setEnabled(false);

        lblInteligenciaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInteligenciaPersonagem.setText("INTELIGÊNCIA");

        txtInteligenciaModificadorPersonagem.setEnabled(false);

        lblSabedoriaPersonaem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSabedoriaPersonaem.setText("SABEDORIA");

        txtSabedoriaPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSabedoriaPersonagemActionPerformed(evt);
            }
        });

        txtSabedoriaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSabedoriaModificadorPersonagem.setEnabled(false);

        lblCarismaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarismaPersonagem.setText("CARISMA");

        txtCarismaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCarismaModificadorPersonagem.setEnabled(false);

        btnCalculaModificador.setText("Modificador");
        btnCalculaModificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaModificadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConstituicaoPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConstituicaoPersonagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtDestrezaModificadorPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDestrezaPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDestrezaPersonagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblForcaPersonagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtForcaPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtForcaModificadorPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConstituicaoModificadorPersonagem))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarismaPersonagem)
                    .addComponent(lblCarismaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSabedoriaModificadorPersonagem)
                    .addComponent(txtInteligenciaPersonagem)
                    .addComponent(lblInteligenciaPersonagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(txtCarismaModificadorPersonagem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInteligenciaModificadorPersonagem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSabedoriaPersonaem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSabedoriaPersonagem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnCalculaModificador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInteligenciaPersonagem)
                    .addComponent(lblForcaPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtForcaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteligenciaPersonagem))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInteligenciaModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForcaModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDestrezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestrezaModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSabedoriaModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDestrezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSabedoriaPersonaem, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSabedoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblConstituicaoPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConstituicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCarismaPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCarismaPersonagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConstituicaoModificadorPersonagem)
                    .addComponent(txtCarismaModificadorPersonagem))
                .addGap(18, 18, 18)
                .addComponent(btnCalculaModificador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        radioForcaPersonagem.setText("FORÇA");
        radioForcaPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioForcaPersonagemActionPerformed(evt);
            }
        });

        radioDestrezaPersonagem.setText("DESTREZA");

        radioConstituicaoPersonagem.setText("CONSTITUIÇÃO");

        radioSabedoriaPersonagem.setText("SABEDORIA");
        radioSabedoriaPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSabedoriaPersonagemActionPerformed(evt);
            }
        });

        radioInteligenciaPersonagem.setText("INTELIGÊNCIA");
        radioInteligenciaPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInteligenciaPersonagemActionPerformed(evt);
            }
        });

        radioCarismaPersonagem.setText("CARISMA");
        radioCarismaPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCarismaPersonagemActionPerformed(evt);
            }
        });

        txtTesteForcaPersonagem.setEnabled(false);

        txtTesteDestrezaPersongem.setEnabled(false);

        txtTesteConstituicaoPersonagem.setEnabled(false);

        txtTesteInteligenciaPersonagem.setEnabled(false);

        txtTesteSabedoriaPersonagem.setEnabled(false);

        txtTesteCarismaPersonagem.setEnabled(false);

        lblTesteResistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTesteResistencia.setText("TESTE DE RESISTÊNCIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTesteResistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTesteForcaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTesteDestrezaPersongem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTesteConstituicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTesteInteligenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTesteSabedoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTesteCarismaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioConstituicaoPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioDestrezaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioForcaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioInteligenciaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioSabedoriaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioCarismaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblTesteResistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioForcaPersonagem)
                    .addComponent(txtTesteForcaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDestrezaPersonagem)
                    .addComponent(txtTesteDestrezaPersongem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioConstituicaoPersonagem)
                    .addComponent(txtTesteConstituicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInteligenciaPersonagem)
                    .addComponent(txtTesteInteligenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSabedoriaPersonagem)
                    .addComponent(txtTesteSabedoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCarismaPersonagem)
                    .addComponent(txtTesteCarismaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtPericiaAcrobaciaPersonagem.setEnabled(false);

        lblPericiasPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPericiasPersonagem.setText("PERÍCIAS");

        radioAcrobaciaPersonagem.setText("Acrobacia");

        radioArcanismoPersonagem.setText("Arcanismo");

        txtArcanismoPersonagem.setEnabled(false);

        txtAtuacaoPersonagem.setEnabled(false);

        txtAtletismoPersonagem.setEnabled(false);

        radioAtletismoPersonagem.setText("Atletismo");

        radioAtuacaoPersonagem.setText("Atuação");

        txtHistoriaPersonagem.setEnabled(false);

        radioHistoriaPersonagem.setText("História");

        txtIntimidacaoPersonagem.setEnabled(false);

        radioIntimidacaoPersonagem.setText("Intimidação");

        txtBlefarPersonagem.setEnabled(false);

        txtFurtividadePersonagem.setEnabled(false);

        radioFurtividadePersonagem.setText("Furtividade");

        radioBlefarPersonagem.setText("Blefar");

        radioPrestidigitacaoPersonagem.setText("Prestidigitação");

        txtPrestidigitacaoPersonagem.setEnabled(false);

        txtPersuassaoPersonagem.setEnabled(false);

        radioPercuassaoPersonagem.setText("Persuassão");

        radioPercepcaoPersonagem.setText("Percepção");

        txtPercepcaoPersonagem.setEnabled(false);

        txtNaturezaPersonagem.setEnabled(false);

        radioNaturezaPersonagem.setText("Natureza");

        radioMedicina.setText("Medicina");

        txtMedicinaPersonagem.setEnabled(false);

        txtLidarAnimaisPersonagem.setEnabled(false);

        radioLidarAnimaisPersonagem.setText("Lidar com Animais");

        radioInvestigacaoPersonagem.setText("Investigação");

        txtInvestigacaoPersonagem.setEnabled(false);

        txtInuicaoPersonagem.setEnabled(false);

        radioIntuicaoPersonagem.setText("Intuição");

        txtSobrevivenciaPersonagem.setEnabled(false);

        radioSobrevivenciaPersonagem.setText("Sobrevivência");

        txtReligaoPersonagem.setEnabled(false);

        radioReligiaoPersonagem.setText("Religião");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPericiasPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtInuicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioIntuicaoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtInvestigacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioInvestigacaoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtLidarAnimaisPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioLidarAnimaisPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtMedicinaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioMedicina))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNaturezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioNaturezaPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPercepcaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPercepcaoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPersuassaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPercuassaoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrestidigitacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReligaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioReligiaoPersonagem)
                                    .addComponent(radioPrestidigitacaoPersonagem)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtSobrevivenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSobrevivenciaPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPericiaAcrobaciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioAcrobaciaPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtArcanismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioArcanismoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtAtletismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioAtletismoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtAtuacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioAtuacaoPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtBlefarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBlefarPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtFurtividadePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioFurtividadePersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtHistoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioHistoriaPersonagem))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtIntimidacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioIntimidacaoPersonagem)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblPericiasPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPericiaAcrobaciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAcrobaciaPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArcanismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioArcanismoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtletismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAtletismoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtuacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAtuacaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBlefarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBlefarPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFurtividadePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFurtividadePersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHistoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioHistoriaPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntimidacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioIntimidacaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInuicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioIntuicaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvestigacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioInvestigacaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLidarAnimaisPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioLidarAnimaisPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicinaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMedicina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaturezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNaturezaPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPercepcaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPercepcaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersuassaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPercuassaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrestidigitacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPrestidigitacaoPersonagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioReligiaoPersonagem)
                    .addComponent(txtReligaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobrevivenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioSobrevivenciaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtEquipamentos.setColumns(20);
        txtEquipamentos.setRows(5);
        jScrollPane1.setViewportView(txtEquipamentos);

        lblDinheiroEquipamentosPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDinheiroEquipamentosPersonagem.setText("Dinheiro e Equipamentos");

        lblPrataPersonagem.setText("Prata");

        lblOuroPersonagem.setText("Ouro");

        lblPlatinaPersonagem.setText("Platina");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrataPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrataPersonagem)
                    .addComponent(txtOuroPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOuroPersonagem)
                    .addComponent(txtPlatinaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlatinaPersonagem))
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDinheiroEquipamentosPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDinheiroEquipamentosPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblPrataPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrataPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblOuroPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOuroPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblPlatinaPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlatinaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblCaracteristicasPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracteristicasPersonagem.setText("Caracteristicas");

        txtCaracteristicasPersonagem.setColumns(20);
        txtCaracteristicasPersonagem.setRows(5);
        jScrollPane2.setViewportView(txtCaracteristicasPersonagem);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCaracteristicasPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCaracteristicasPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFracassosPersonagem.setText("FRACASSOS");

        lblTestesContraMortePersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTestesContraMortePersonagem.setText("TESTES CONTRA A MORTE");

        radioSucessoUmPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSucessoUmPersonagemActionPerformed(evt);
            }
        });

        radioSucessoDoisPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSucessoDoisPersonagemActionPerformed(evt);
            }
        });

        radioSucessoTresPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSucessoTresPersonagemActionPerformed(evt);
            }
        });

        radioFracassoUmPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFracassoUmPersonagemActionPerformed(evt);
            }
        });

        radioFracassoDoisPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFracassoDoisPersonagemActionPerformed(evt);
            }
        });

        radioFracassoTresPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFracassoTresPersonagemActionPerformed(evt);
            }
        });

        lblSucessosPersonagem.setText("SUCESSOS");
        lblSucessosPersonagem.setName(""); // NOI18N

        txtInspiracaoPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInspiracaoPersonagemActionPerformed(evt);
            }
        });

        lblInspiracaoPersonagem.setText("INSPIRAÇÃO");

        lblBonusProficienciaPersonagem.setText("BÔNUS DE PROFICIÊNCIA");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        txtHistoriaDoPersonagem.setColumns(20);
        txtHistoriaDoPersonagem.setRows(5);

        jScrollPane3.setViewportView(txtHistoriaDoPersonagem);

        lblHistoriaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistoriaPersonagem.setText("HISTORIA");

        jButton1.setText("SALVAR FICHA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblTestesContraMortePersonagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblSucessosPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblFracassosPersonagem))
                                            .addGap(14, 14, 14)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(radioSucessoUmPersonagem)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(radioSucessoDoisPersonagem))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(radioFracassoUmPersonagem)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(radioFracassoDoisPersonagem)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radioFracassoTresPersonagem)
                                                .addComponent(radioSucessoTresPersonagem))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtInspiracaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblInspiracaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBonusProficienciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBonusProficienciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(lblHistoriaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTestesContraMortePersonagem)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(radioSucessoUmPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioSucessoDoisPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioSucessoTresPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSucessosPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(radioFracassoUmPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioFracassoDoisPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioFracassoTresPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFracassosPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtInspiracaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblInspiracaoPersonagem))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBonusProficienciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblBonusProficienciaPersonagem)))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHistoriaPersonagem)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void radioSabedoriaPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSabedoriaPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSabedoriaPersonagemActionPerformed

    private void radioInteligenciaPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInteligenciaPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInteligenciaPersonagemActionPerformed

    private void radioCarismaPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCarismaPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCarismaPersonagemActionPerformed

    private void radioSucessoUmPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSucessoUmPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSucessoUmPersonagemActionPerformed

    private void radioSucessoDoisPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSucessoDoisPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSucessoDoisPersonagemActionPerformed

    private void radioSucessoTresPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSucessoTresPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSucessoTresPersonagemActionPerformed

    private void radioFracassoUmPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFracassoUmPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFracassoUmPersonagemActionPerformed

    private void radioFracassoDoisPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFracassoDoisPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFracassoDoisPersonagemActionPerformed

    private void radioFracassoTresPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFracassoTresPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFracassoTresPersonagemActionPerformed

    private void txtInspiracaoPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInspiracaoPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInspiracaoPersonagemActionPerformed

    private void btnCalculaModificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaModificadorActionPerformed
        try{
            int forca = Integer.parseInt(this.txtForcaPersonagem.getText());
            this.txtForcaModificadorPersonagem.setText(Integer.toString(ficha.calculaModificador(forca)));
        } catch (RuntimeException exe){
            JOptionPane.showMessageDialog(null, "Não pode usar números acima de 20 ou abaixo de 0!");
            System.out.println("Não pode usar números acima de 20 ou abaixo de 0!");
            this.txtForcaPersonagem.setText("");
        }

        try{
            int destreza = Integer.parseInt(this.txtDestrezaPersonagem.getText());
            this.txtDestrezaModificadorPersonagem.setText(Integer.toString(ficha.calculaModificador(destreza)));
        } catch (RuntimeException exe){
            JOptionPane.showMessageDialog(null, "Não pode usar números acima de 20 ou abaixo de 0!");
            System.out.println("Não pode usar números acima de 20 ou abaixo de 0!");
            this.txtDestrezaPersonagem.setText("");
        }

        try{
            int constituicao = Integer.parseInt(this.txtConstituicaoPersonagem.getText());
            this.txtConstituicaoModificadorPersonagem.setText(Integer.toString(ficha.calculaModificador(constituicao)));
        } catch (RuntimeException exe){
            JOptionPane.showMessageDialog(null, "Não pode usar números acima de 20 ou abaixo de 0!");
            System.out.println("Não pode usar números acima de 20 ou abaixo de 0!");
            this.txtConstituicaoPersonagem.setText("");
        }

        try{
            int inteligencia = Integer.parseInt(this.txtInteligenciaPersonagem.getText());
            this.txtInteligenciaModificadorPersonagem.setText(Integer.toString(ficha.calculaModificador(inteligencia)));
        } catch (RuntimeException exe){
            JOptionPane.showMessageDialog(null, "Não pode usar números acima de 20 ou abaixo de 0!");
            System.out.println("Não pode usar números acima de 20 ou abaixo de 0!");
            this.txtInteligenciaPersonagem.setText("");
        }

        try{
            int sabedoria = Integer.parseInt(this.txtSabedoriaPersonagem.getText());
            this.txtSabedoriaModificadorPersonagem.setText(Integer.toString(ficha.calculaModificador(sabedoria)));
        } catch (RuntimeException exe){
            JOptionPane.showMessageDialog(null, "Não pode usar números acima de 20 ou abaixo de 0!");
            System.out.println("Não pode usar números acima de 20 ou abaixo de 0!");
            this.txtSabedoriaPersonagem.setText("");
        }

        try{
            int carisma = Integer.parseInt(this.txtCarismaPersonagem.getText());
            this.txtCarismaModificadorPersonagem.setText(Integer.toString(ficha.calculaModificador(carisma)));
        } catch (RuntimeException exe){
            JOptionPane.showMessageDialog(null, "Não pode usar números acima de 20 ou abaixo de 0!");
            System.out.println("Não pode usar números acima de 20 ou abaixo de 0!");
            this.txtCarismaPersonagem.setText("");
        }

    }//GEN-LAST:event_btnCalculaModificadorActionPerformed

    private void txtSabedoriaPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSabedoriaPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSabedoriaPersonagemActionPerformed

    private void cmbClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasseActionPerformed
        //JOptionPane.showMessageDialog(null, cmbClasseActionPerformed);
    }//GEN-LAST:event_cmbClasseActionPerformed

    private void cmbClasseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClasseItemStateChanged
        
        if(cmbClasse.getSelectedItem().equals("Criar nova Classe")){
            //new AddClasse().setVisible(true);
            //AddClasse teste = AddClasse.getInstance();
            //if (teste != null){
                new AddClasse(racaClasseRPG).setVisible(true);
            //}
        }   
    }//GEN-LAST:event_cmbClasseItemStateChanged

    private void radioForcaPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioForcaPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioForcaPersonagemActionPerformed

    private void cmbRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRacaActionPerformed
        
    }//GEN-LAST:event_cmbRacaActionPerformed

    private void cmbRacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRacaItemStateChanged
        if(cmbRaca.getSelectedItem().equals("Criar nova Raça")){
            new AddRaca().setVisible(true);
        }
    }//GEN-LAST:event_cmbRacaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbNomePersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomePersonagemActionPerformed
        //if(cmbNamePersonagem.getSelectedItem().equals("Criar nova Raça")){}
    }//GEN-LAST:event_cmbNomePersonagemActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculaModificador;
    private javax.swing.JComboBox<String> cmbClasse;
    private javax.swing.JComboBox<String> cmbNomePersonagem;
    private javax.swing.JComboBox<String> cmbRaca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblBonusProficienciaPersonagem;
    private javax.swing.JLabel lblCaracteristicasPersonagem;
    private javax.swing.JLabel lblCarismaPersonagem;
    private javax.swing.JLabel lblClassePersonagem;
    private javax.swing.JLabel lblConstituicaoPersonagem;
    private javax.swing.JLabel lblDestrezaPersonagem;
    private javax.swing.JLabel lblDinheiroEquipamentosPersonagem;
    private javax.swing.JLabel lblExpPersonagem;
    private javax.swing.JLabel lblForcaPersonagem;
    private javax.swing.JLabel lblFracassosPersonagem;
    private javax.swing.JLabel lblHistoriaPersonagem;
    private javax.swing.JLabel lblInspiracaoPersonagem;
    private javax.swing.JLabel lblInteligenciaPersonagem;
    private javax.swing.JLabel lblNivelPersonagem;
    private javax.swing.JLabel lblNomeJogador;
    private javax.swing.JLabel lblNomePersonagem;
    private javax.swing.JLabel lblOuroPersonagem;
    private javax.swing.JLabel lblPericiasPersonagem;
    private javax.swing.JLabel lblPlatinaPersonagem;
    private javax.swing.JLabel lblPrataPersonagem;
    private javax.swing.JLabel lblRacaPersonagem;
    private javax.swing.JLabel lblSabedoriaPersonaem;
    private javax.swing.JLabel lblSucessosPersonagem;
    private javax.swing.JLabel lblTendenciaPersonagem;
    private javax.swing.JLabel lblTesteResistencia;
    private javax.swing.JLabel lblTestesContraMortePersonagem;
    private javax.swing.JRadioButton radioAcrobaciaPersonagem;
    private javax.swing.JRadioButton radioArcanismoPersonagem;
    private javax.swing.JRadioButton radioAtletismoPersonagem;
    private javax.swing.JRadioButton radioAtuacaoPersonagem;
    private javax.swing.JRadioButton radioBlefarPersonagem;
    private javax.swing.JRadioButton radioCarismaPersonagem;
    private javax.swing.JRadioButton radioConstituicaoPersonagem;
    private javax.swing.JRadioButton radioDestrezaPersonagem;
    private javax.swing.JRadioButton radioForcaPersonagem;
    private javax.swing.JRadioButton radioFracassoDoisPersonagem;
    private javax.swing.JRadioButton radioFracassoTresPersonagem;
    private javax.swing.JRadioButton radioFracassoUmPersonagem;
    private javax.swing.JRadioButton radioFurtividadePersonagem;
    private javax.swing.JRadioButton radioHistoriaPersonagem;
    private javax.swing.JRadioButton radioInteligenciaPersonagem;
    private javax.swing.JRadioButton radioIntimidacaoPersonagem;
    private javax.swing.JRadioButton radioIntuicaoPersonagem;
    private javax.swing.JRadioButton radioInvestigacaoPersonagem;
    private javax.swing.JRadioButton radioLidarAnimaisPersonagem;
    private javax.swing.JRadioButton radioMedicina;
    private javax.swing.JRadioButton radioNaturezaPersonagem;
    private javax.swing.JRadioButton radioPercepcaoPersonagem;
    private javax.swing.JRadioButton radioPercuassaoPersonagem;
    private javax.swing.JRadioButton radioPrestidigitacaoPersonagem;
    private javax.swing.JRadioButton radioReligiaoPersonagem;
    private javax.swing.JRadioButton radioSabedoriaPersonagem;
    private javax.swing.JRadioButton radioSobrevivenciaPersonagem;
    private javax.swing.JRadioButton radioSucessoDoisPersonagem;
    private javax.swing.JRadioButton radioSucessoTresPersonagem;
    private javax.swing.JRadioButton radioSucessoUmPersonagem;
    private javax.swing.JTextField txtArcanismoPersonagem;
    private javax.swing.JTextField txtAtletismoPersonagem;
    private javax.swing.JTextField txtAtuacaoPersonagem;
    private javax.swing.JTextField txtBlefarPersonagem;
    private javax.swing.JTextField txtBonusProficienciaPersonagem;
    private javax.swing.JTextArea txtCaracteristicasPersonagem;
    private javax.swing.JTextField txtCarismaModificadorPersonagem;
    private javax.swing.JTextField txtCarismaPersonagem;
    private javax.swing.JTextField txtConstituicaoModificadorPersonagem;
    private javax.swing.JTextField txtConstituicaoPersonagem;
    private javax.swing.JTextField txtDestrezaModificadorPersonagem;
    private javax.swing.JTextField txtDestrezaPersonagem;
    private javax.swing.JTextArea txtEquipamentos;
    private javax.swing.JTextField txtExpPersonagem;
    private javax.swing.JTextField txtForcaModificadorPersonagem;
    private javax.swing.JTextField txtForcaPersonagem;
    private javax.swing.JTextField txtFurtividadePersonagem;
    private javax.swing.JTextArea txtHistoriaDoPersonagem;
    private javax.swing.JTextField txtHistoriaPersonagem;
    private javax.swing.JTextField txtInspiracaoPersonagem;
    private javax.swing.JTextField txtInteligenciaModificadorPersonagem;
    private javax.swing.JTextField txtInteligenciaPersonagem;
    private javax.swing.JTextField txtIntimidacaoPersonagem;
    private javax.swing.JTextField txtInuicaoPersonagem;
    private javax.swing.JTextField txtInvestigacaoPersonagem;
    private javax.swing.JTextField txtLidarAnimaisPersonagem;
    private javax.swing.JTextField txtMedicinaPersonagem;
    private javax.swing.JTextField txtNaturezaPersonagem;
    private javax.swing.JTextField txtNivelPersonagem;
    private javax.swing.JTextField txtNomeJogador;
    private javax.swing.JTextField txtOuroPersonagem;
    private javax.swing.JTextField txtPercepcaoPersonagem;
    private javax.swing.JTextField txtPericiaAcrobaciaPersonagem;
    private javax.swing.JTextField txtPersuassaoPersonagem;
    private javax.swing.JTextField txtPlatinaPersonagem;
    private javax.swing.JTextField txtPrataPersonagem;
    private javax.swing.JTextField txtPrestidigitacaoPersonagem;
    private javax.swing.JTextField txtReligaoPersonagem;
    private javax.swing.JTextField txtSabedoriaModificadorPersonagem;
    private javax.swing.JTextField txtSabedoriaPersonagem;
    private javax.swing.JTextField txtSobrevivenciaPersonagem;
    private javax.swing.JTextField txtTendenciaPersonagem;
    private javax.swing.JTextField txtTesteCarismaPersonagem;
    private javax.swing.JTextField txtTesteConstituicaoPersonagem;
    private javax.swing.JTextField txtTesteDestrezaPersongem;
    private javax.swing.JTextField txtTesteForcaPersonagem;
    private javax.swing.JTextField txtTesteInteligenciaPersonagem;
    private javax.swing.JTextField txtTesteSabedoriaPersonagem;
    // End of variables declaration//GEN-END:variables
}
