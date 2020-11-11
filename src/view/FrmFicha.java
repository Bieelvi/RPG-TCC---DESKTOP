package view;

import control.FichaController;
import control.RacaClasseController;
import control.UsuarioController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Classe;
import model.Ficha;
import model.FichaTop;
import model.Raca; 

public class FrmFicha extends javax.swing.JFrame {
    
    Ficha ficha;
    int codUsuario;
    RacaClasseController racaClasseRPG;
    String emailUsua;
    UsuarioController usuarioController;
    FichaController fichaController;
    String raca;
    String classe;
    int codFicha;
    
    public FrmFicha(int codigoUsuario, int codigoFicha) throws SQLException {
        initComponents();
        ficha = new Ficha();
        racaClasseRPG = new RacaClasseController();
        codUsuario = codigoUsuario;
        codFicha = codigoFicha;
        usuarioController = new UsuarioController();
        emailUsua = usuarioController.emailViaCodUsuario(codUsuario);
        classeRPG();
        racaRPG();
        fichaController = new FichaController();
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtHistoria.setLineWrap(true);
        txtHistoria.setWrapStyleWord(true);
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setWrapStyleWord(true);
        raca = "Não definida";
        classe = "Não definida";
    }
    
    /*public void reconhecimentoFicha(int codigoFicha){
        if(codigoFicha > 0){
            FichaTop ficha = fichaController.puxaDados();
        }
    }*/
    
    public final void classeRPG() throws SQLException{
        DefaultComboBoxModel classeBox = new DefaultComboBoxModel();
        ArrayList <Classe> cla = racaClasseRPG.classe();
        classeBox.addElement("<Selecione>");
        for (Classe c: cla){
            classeBox.addElement(c.getNome());
        }
        classeBox.addElement("Criar nova Classe");
        cmbClasse.setModel(classeBox);
    }
    
    public final void racaRPG() throws SQLException{
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
        txtNivel = new javax.swing.JTextField();
        lblTendenciaPersonagem = new javax.swing.JLabel();
        txtTendencia = new javax.swing.JTextField();
        lblNomeJogador = new javax.swing.JLabel();
        txtNomeJogador = new javax.swing.JTextField();
        lblExpPersonagem = new javax.swing.JLabel();
        txtPontosXP = new javax.swing.JTextField();
        lblNomePersonagem = new javax.swing.JLabel();
        cmbClasse = new javax.swing.JComboBox<>();
        cmbRaca = new javax.swing.JComboBox<>();
        txtDeslocamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClasseArmad = new javax.swing.JTextField();
        txtVida = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
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
        radioForca = new javax.swing.JRadioButton();
        radioDestreza = new javax.swing.JRadioButton();
        radioConstituicao = new javax.swing.JRadioButton();
        radioSabedoria = new javax.swing.JRadioButton();
        radioInteligencia = new javax.swing.JRadioButton();
        radioCarisma = new javax.swing.JRadioButton();
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
        radioAcrobacia = new javax.swing.JRadioButton();
        radioArcanismo = new javax.swing.JRadioButton();
        txtArcanismoPersonagem = new javax.swing.JTextField();
        txtAtuacaoPersonagem = new javax.swing.JTextField();
        txtAtletismoPersonagem = new javax.swing.JTextField();
        radioAtletismo = new javax.swing.JRadioButton();
        radioAtuacao = new javax.swing.JRadioButton();
        txtHistoriaPersonagem = new javax.swing.JTextField();
        radioHistoria = new javax.swing.JRadioButton();
        txtIntimidacaoPersonagem = new javax.swing.JTextField();
        radioIntimidacao = new javax.swing.JRadioButton();
        txtBlefarPersonagem = new javax.swing.JTextField();
        txtFurtividadePersonagem = new javax.swing.JTextField();
        radioFurtividade = new javax.swing.JRadioButton();
        radioBlefar = new javax.swing.JRadioButton();
        radioPrestidigitacao = new javax.swing.JRadioButton();
        txtPrestidigitacaoPersonagem = new javax.swing.JTextField();
        txtPersuassaoPersonagem = new javax.swing.JTextField();
        radioPersuasao = new javax.swing.JRadioButton();
        radioPercepcao = new javax.swing.JRadioButton();
        txtPercepcaoPersonagem = new javax.swing.JTextField();
        txtNaturezaPersonagem = new javax.swing.JTextField();
        radioNatureza = new javax.swing.JRadioButton();
        radioMedicina = new javax.swing.JRadioButton();
        txtMedicinaPersonagem = new javax.swing.JTextField();
        txtLidarAnimaisPersonagem = new javax.swing.JTextField();
        radioLidarAnimais = new javax.swing.JRadioButton();
        radioInvestigacao = new javax.swing.JRadioButton();
        txtInvestigacaoPersonagem = new javax.swing.JTextField();
        txtInuicaoPersonagem = new javax.swing.JTextField();
        radioIntuicao = new javax.swing.JRadioButton();
        txtSobrevivenciaPersonagem = new javax.swing.JTextField();
        radioSobrevivencia = new javax.swing.JRadioButton();
        txtReligaoPersonagem = new javax.swing.JTextField();
        radioReligiao = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEquipamentos = new javax.swing.JTextArea();
        lblDinheiroEquipamentosPersonagem = new javax.swing.JLabel();
        lblPrataPersonagem = new javax.swing.JLabel();
        txtPrata = new javax.swing.JTextField();
        txtOuro = new javax.swing.JTextField();
        lblOuroPersonagem = new javax.swing.JLabel();
        txtPlatina = new javax.swing.JTextField();
        lblPlatinaPersonagem = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblCaracteristicasPersonagem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCaracteristicas = new javax.swing.JTextArea();
        lblFracassosPersonagem = new javax.swing.JLabel();
        lblTestesContraMortePersonagem = new javax.swing.JLabel();
        radioVida1 = new javax.swing.JRadioButton();
        radioVida2 = new javax.swing.JRadioButton();
        radioVida3 = new javax.swing.JRadioButton();
        radioMorte1 = new javax.swing.JRadioButton();
        radioMorte2 = new javax.swing.JRadioButton();
        radioMorte3 = new javax.swing.JRadioButton();
        lblSucessosPersonagem = new javax.swing.JLabel();
        txtBonusProficiencia = new javax.swing.JTextField();
        txtInspiracao = new javax.swing.JTextField();
        lblInspiracaoPersonagem = new javax.swing.JLabel();
        lblBonusProficienciaPersonagem = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHistoria = new javax.swing.JTextArea();
        lblHistoriaPersonagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblClassePersonagem.setText("CLASSE");

        lblRacaPersonagem.setText("RAÇA");

        lblNivelPersonagem.setText("NÍVEL");

        lblTendenciaPersonagem.setText("TENDÊNCIA");

        lblNomeJogador.setText("NOME DO USUARIO");

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

        txtClasseArmad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClasseArmadActionPerformed(evt);
            }
        });

        txtVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidaActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtClasseArmad))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDeslocamento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTendencia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPontosXP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(txtTendencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPontosXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomePersonagem)
                        .addGap(11, 11, 11)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClasseArmad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeslocamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        radioForca.setText("FORÇA");
        radioForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioForcaActionPerformed(evt);
            }
        });

        radioDestreza.setText("DESTREZA");

        radioConstituicao.setText("CONSTITUIÇÃO");

        radioSabedoria.setText("SABEDORIA");
        radioSabedoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSabedoriaActionPerformed(evt);
            }
        });

        radioInteligencia.setText("INTELIGÊNCIA");
        radioInteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInteligenciaActionPerformed(evt);
            }
        });

        radioCarisma.setText("CARISMA");
        radioCarisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCarismaActionPerformed(evt);
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
                            .addComponent(radioConstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioDestreza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioForca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioInteligencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioSabedoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioCarisma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblTesteResistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioForca)
                    .addComponent(txtTesteForcaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDestreza)
                    .addComponent(txtTesteDestrezaPersongem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioConstituicao)
                    .addComponent(txtTesteConstituicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInteligencia)
                    .addComponent(txtTesteInteligenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSabedoria)
                    .addComponent(txtTesteSabedoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCarisma)
                    .addComponent(txtTesteCarismaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtPericiaAcrobaciaPersonagem.setEnabled(false);

        lblPericiasPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPericiasPersonagem.setText("PERÍCIAS");

        radioAcrobacia.setText("Acrobacia");

        radioArcanismo.setText("Arcanismo");

        txtArcanismoPersonagem.setEnabled(false);

        txtAtuacaoPersonagem.setEnabled(false);

        txtAtletismoPersonagem.setEnabled(false);

        radioAtletismo.setText("Atletismo");

        radioAtuacao.setText("Atuação");

        txtHistoriaPersonagem.setEnabled(false);

        radioHistoria.setText("História");

        txtIntimidacaoPersonagem.setEnabled(false);

        radioIntimidacao.setText("Intimidação");

        txtBlefarPersonagem.setEnabled(false);

        txtFurtividadePersonagem.setEnabled(false);

        radioFurtividade.setText("Furtividade");

        radioBlefar.setText("Blefar");

        radioPrestidigitacao.setText("Prestidigitação");

        txtPrestidigitacaoPersonagem.setEnabled(false);

        txtPersuassaoPersonagem.setEnabled(false);

        radioPersuasao.setText("Persuassão");

        radioPercepcao.setText("Percepção");

        txtPercepcaoPersonagem.setEnabled(false);

        txtNaturezaPersonagem.setEnabled(false);

        radioNatureza.setText("Natureza");

        radioMedicina.setText("Medicina");

        txtMedicinaPersonagem.setEnabled(false);

        txtLidarAnimaisPersonagem.setEnabled(false);

        radioLidarAnimais.setText("Lidar com Animais");

        radioInvestigacao.setText("Investigação");

        txtInvestigacaoPersonagem.setEnabled(false);

        txtInuicaoPersonagem.setEnabled(false);

        radioIntuicao.setText("Intuição");

        txtSobrevivenciaPersonagem.setEnabled(false);

        radioSobrevivencia.setText("Sobrevivência");

        txtReligaoPersonagem.setEnabled(false);

        radioReligiao.setText("Religião");

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
                                .addComponent(radioIntuicao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtInvestigacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioInvestigacao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtLidarAnimaisPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioLidarAnimais))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtMedicinaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioMedicina))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNaturezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioNatureza))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPercepcaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPercepcao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPersuassaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPersuasao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrestidigitacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReligaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioReligiao)
                                    .addComponent(radioPrestidigitacao)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtSobrevivenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSobrevivencia))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPericiaAcrobaciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioAcrobacia))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtArcanismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioArcanismo))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtAtletismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioAtletismo))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtAtuacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioAtuacao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtBlefarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBlefar))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtFurtividadePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioFurtividade))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtHistoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioHistoria))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtIntimidacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioIntimidacao)))
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
                    .addComponent(radioAcrobacia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArcanismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioArcanismo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtletismoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAtletismo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtuacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAtuacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBlefarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBlefar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFurtividadePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFurtividade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHistoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioHistoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntimidacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioIntimidacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInuicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioIntuicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvestigacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioInvestigacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLidarAnimaisPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioLidarAnimais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicinaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMedicina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaturezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioNatureza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPercepcaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPercepcao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersuassaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPersuasao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrestidigitacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPrestidigitacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioReligiao)
                    .addComponent(txtReligaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobrevivenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioSobrevivencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtPrata, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrataPersonagem)
                    .addComponent(txtOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOuroPersonagem)
                    .addComponent(txtPlatina, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtPrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblOuroPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblPlatinaPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlatina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblCaracteristicasPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracteristicasPersonagem.setText("Caracteristicas");

        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setRows(5);
        jScrollPane2.setViewportView(txtCaracteristicas);

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

        radioVida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVida1ActionPerformed(evt);
            }
        });

        radioVida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVida2ActionPerformed(evt);
            }
        });

        radioVida3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVida3ActionPerformed(evt);
            }
        });

        radioMorte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMorte1ActionPerformed(evt);
            }
        });

        radioMorte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMorte2ActionPerformed(evt);
            }
        });

        radioMorte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMorte3ActionPerformed(evt);
            }
        });

        lblSucessosPersonagem.setText("SUCESSOS");
        lblSucessosPersonagem.setName(""); // NOI18N

        txtInspiracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInspiracaoActionPerformed(evt);
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

        txtHistoria.setColumns(20);
        txtHistoria.setRows(5);

        jScrollPane3.setViewportView(txtHistoria);

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
                                                    .addComponent(radioVida1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(radioVida2))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(radioMorte1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(radioMorte2)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radioMorte3)
                                                .addComponent(radioVida3))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtInspiracao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblInspiracaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBonusProficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addComponent(radioVida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioVida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSucessosPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(radioMorte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioMorte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radioMorte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFracassosPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtInspiracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblInspiracaoPersonagem))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBonusProficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void radioSabedoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSabedoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSabedoriaActionPerformed

    private void radioInteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInteligenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInteligenciaActionPerformed

    private void radioCarismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCarismaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCarismaActionPerformed

    private void radioVida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioVida1ActionPerformed

    private void radioVida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVida2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioVida2ActionPerformed

    private void radioVida3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVida3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioVida3ActionPerformed

    private void radioMorte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMorte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMorte1ActionPerformed

    private void radioMorte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMorte2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMorte2ActionPerformed

    private void radioMorte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMorte3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMorte3ActionPerformed

    private void txtInspiracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInspiracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInspiracaoActionPerformed

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

    private void radioForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioForcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioForcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ArrayList radios = fichaController.convertRadio(radioAcrobacia.isSelected(), radioArcanismo.isSelected(), radioAtletismo.isSelected(), radioAtuacao.isSelected(), radioBlefar.isSelected(), radioFurtividade.isSelected(), radioHistoria.isSelected(), radioIntimidacao.isSelected(), radioInvestigacao.isSelected(), radioNatureza.isSelected(), radioPercepcao.isSelected(), radioPersuasao.isSelected(), radioPrestidigitacao.isSelected(), radioReligiao.isSelected(), radioSobrevivencia.isSelected(), radioForca.isSelected(), radioDestreza.isSelected(), radioLidarAnimais.isSelected(), radioConstituicao.isSelected(), radioInteligencia.isSelected(), radioSabedoria.isSelected(), radioCarisma.isSelected(), radioVida1.isSelected(), radioVida2.isSelected(), radioVida3.isSelected(), radioMorte1.isSelected(), radioMorte2.isSelected(), radioMorte3.isSelected(), radioIntuicao.isSelected(), radioMedicina.isSelected());
        FichaTop f = fichaController.compactando(this.txtNombre.getText(), this.classe, this.raca, Float.parseFloat(this.txtClasseArmad.getText()), Float.parseFloat(this.txtVida.getText()), Float.parseFloat(this.txtDeslocamento.getText()), Float.parseFloat(this.txtForcaPersonagem.getText()), Float.parseFloat(this.txtInteligenciaPersonagem.getText()), Float.parseFloat(this.txtDestrezaPersonagem.getText()), Float.parseFloat(this.txtSabedoriaPersonagem.getText()), Float.parseFloat(this.txtConstituicaoPersonagem.getText()), Float.parseFloat(this.txtCarismaPersonagem.getText()), Float.parseFloat(this.txtNivel.getText()), this.txtTendencia.getText(), this.txtNomeJogador.getText(), Float.parseFloat(this.txtPontosXP.getText()), Float.parseFloat(this.txtInspiracao.getText()), Float.parseFloat(this.txtBonusProficiencia.getText()), Float.parseFloat(this.txtOuro.getText()), Float.parseFloat(this.txtPrata.getText()), Float.parseFloat(this.txtPlatina.getText()), this.txtHistoria.getText(), this.txtEquipamentos.getText(), this.txtCaracteristicas.getText(), radios);
        
        if(codFicha == 0){
            boolean cadastrando = false;
            try {
                cadastrando = fichaController.cadastraFicha(f, codUsuario);   
            } 
            catch(SQLException ex){
                System.out.println(ex);
            }
            if(cadastrando)
                JOptionPane.showMessageDialog(null, "Ficha Cadastrada com sucesso!!!");
            else
                JOptionPane.showMessageDialog(null, "Cuidado!!! Ficha não cadastrada!!!");
        }
        else{
            boolean atualizando = false;
            try {
                atualizando = fichaController.atualizacao(f, codFicha);
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
            if(atualizando)
                JOptionPane.showMessageDialog(null, "Ficha Atualizada com sucesso!!!");
            else
                JOptionPane.showMessageDialog(null, "Cuidado!!! Ficha não Atualizada!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidaActionPerformed

    private void txtClasseArmadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClasseArmadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClasseArmadActionPerformed

    private void cmbRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRacaActionPerformed

    }//GEN-LAST:event_cmbRacaActionPerformed

    private void cmbRacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRacaItemStateChanged

        raca = (String) cmbRaca.getSelectedItem();

        if(cmbRaca.getSelectedItem().equals("Criar nova Raça")){
            new AddRaca().setVisible(true);
        }
    }//GEN-LAST:event_cmbRacaItemStateChanged

    private void cmbClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClasseActionPerformed
        //JOptionPane.showMessageDialog(null, cmbClasseActionPerformed);
    }//GEN-LAST:event_cmbClasseActionPerformed

    private void cmbClasseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClasseItemStateChanged

        classe = (String) cmbClasse.getSelectedItem();

        if(cmbClasse.getSelectedItem().equals("Criar nova Classe")){
            new AddClasse(emailUsua).setVisible(true);
        }
    }//GEN-LAST:event_cmbClasseItemStateChanged


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
    private javax.swing.JRadioButton radioAcrobacia;
    private javax.swing.JRadioButton radioArcanismo;
    private javax.swing.JRadioButton radioAtletismo;
    private javax.swing.JRadioButton radioAtuacao;
    private javax.swing.JRadioButton radioBlefar;
    private javax.swing.JRadioButton radioCarisma;
    private javax.swing.JRadioButton radioConstituicao;
    private javax.swing.JRadioButton radioDestreza;
    private javax.swing.JRadioButton radioForca;
    private javax.swing.JRadioButton radioFurtividade;
    private javax.swing.JRadioButton radioHistoria;
    private javax.swing.JRadioButton radioInteligencia;
    private javax.swing.JRadioButton radioIntimidacao;
    private javax.swing.JRadioButton radioIntuicao;
    private javax.swing.JRadioButton radioInvestigacao;
    private javax.swing.JRadioButton radioLidarAnimais;
    private javax.swing.JRadioButton radioMedicina;
    private javax.swing.JRadioButton radioMorte1;
    private javax.swing.JRadioButton radioMorte2;
    private javax.swing.JRadioButton radioMorte3;
    private javax.swing.JRadioButton radioNatureza;
    private javax.swing.JRadioButton radioPercepcao;
    private javax.swing.JRadioButton radioPersuasao;
    private javax.swing.JRadioButton radioPrestidigitacao;
    private javax.swing.JRadioButton radioReligiao;
    private javax.swing.JRadioButton radioSabedoria;
    private javax.swing.JRadioButton radioSobrevivencia;
    private javax.swing.JRadioButton radioVida1;
    private javax.swing.JRadioButton radioVida2;
    private javax.swing.JRadioButton radioVida3;
    private javax.swing.JTextField txtArcanismoPersonagem;
    private javax.swing.JTextField txtAtletismoPersonagem;
    private javax.swing.JTextField txtAtuacaoPersonagem;
    private javax.swing.JTextField txtBlefarPersonagem;
    private javax.swing.JTextField txtBonusProficiencia;
    private javax.swing.JTextArea txtCaracteristicas;
    private javax.swing.JTextField txtCarismaModificadorPersonagem;
    private javax.swing.JTextField txtCarismaPersonagem;
    private javax.swing.JTextField txtClasseArmad;
    private javax.swing.JTextField txtConstituicaoModificadorPersonagem;
    private javax.swing.JTextField txtConstituicaoPersonagem;
    private javax.swing.JTextField txtDeslocamento;
    private javax.swing.JTextField txtDestrezaModificadorPersonagem;
    private javax.swing.JTextField txtDestrezaPersonagem;
    private javax.swing.JTextArea txtEquipamentos;
    private javax.swing.JTextField txtForcaModificadorPersonagem;
    private javax.swing.JTextField txtForcaPersonagem;
    private javax.swing.JTextField txtFurtividadePersonagem;
    private javax.swing.JTextArea txtHistoria;
    private javax.swing.JTextField txtHistoriaPersonagem;
    private javax.swing.JTextField txtInspiracao;
    private javax.swing.JTextField txtInteligenciaModificadorPersonagem;
    private javax.swing.JTextField txtInteligenciaPersonagem;
    private javax.swing.JTextField txtIntimidacaoPersonagem;
    private javax.swing.JTextField txtInuicaoPersonagem;
    private javax.swing.JTextField txtInvestigacaoPersonagem;
    private javax.swing.JTextField txtLidarAnimaisPersonagem;
    private javax.swing.JTextField txtMedicinaPersonagem;
    private javax.swing.JTextField txtNaturezaPersonagem;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNomeJogador;
    private javax.swing.JTextField txtOuro;
    private javax.swing.JTextField txtPercepcaoPersonagem;
    private javax.swing.JTextField txtPericiaAcrobaciaPersonagem;
    private javax.swing.JTextField txtPersuassaoPersonagem;
    private javax.swing.JTextField txtPlatina;
    private javax.swing.JTextField txtPontosXP;
    private javax.swing.JTextField txtPrata;
    private javax.swing.JTextField txtPrestidigitacaoPersonagem;
    private javax.swing.JTextField txtReligaoPersonagem;
    private javax.swing.JTextField txtSabedoriaModificadorPersonagem;
    private javax.swing.JTextField txtSabedoriaPersonagem;
    private javax.swing.JTextField txtSobrevivenciaPersonagem;
    private javax.swing.JTextField txtTendencia;
    private javax.swing.JTextField txtTesteCarismaPersonagem;
    private javax.swing.JTextField txtTesteConstituicaoPersonagem;
    private javax.swing.JTextField txtTesteDestrezaPersongem;
    private javax.swing.JTextField txtTesteForcaPersonagem;
    private javax.swing.JTextField txtTesteInteligenciaPersonagem;
    private javax.swing.JTextField txtTesteSabedoriaPersonagem;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
