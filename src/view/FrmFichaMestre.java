package view;

import control.FichaMestreController;
import control.MestreController;
import control.RacaClasseController;
import control.UsuarioController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Classe;
import model.FichaMestre;
import model.Raca; 

public class FrmFichaMestre extends javax.swing.JFrame {
    
    int cont = 0;
    int codMestre;
    int codUsuario;
    int codFichaMestre;
    ArrayList<Raca> rac;
    UsuarioController usuarioController;
    FichaMestreController fichaMestreController;
    RacaClasseController racaClasseRPG;
    MestreController mestreController;
    
    public FrmFichaMestre(int codigoUsuario, int codigoFichaMestre, int codigoMestre) throws SQLException, ClassNotFoundException {
        initComponents();
        codFichaMestre = codigoFichaMestre;
        codUsuario = codigoUsuario;
        codMestre = codigoMestre;
        txtHistoria.setLineWrap(true);
        txtHistoria.setWrapStyleWord(true);
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setWrapStyleWord(true);
        fichaMestreController = new FichaMestreController();
        racaClasseRPG = new RacaClasseController();
        mestreController = new MestreController();
        usuarioController = new UsuarioController();
        classeRPG();
        racaRPG();
        reconhecimentoFicha(codFichaMestre);
    }

    public FrmFichaMestre() throws SQLException, ClassNotFoundException {
        initComponents();
        codFichaMestre = 83;
        codUsuario = 1;
        txtHistoria.setLineWrap(true);
        txtHistoria.setWrapStyleWord(true);
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setWrapStyleWord(true);
        fichaMestreController = new FichaMestreController();
        racaClasseRPG = new RacaClasseController();
        mestreController = new MestreController();
        classeRPG();
        racaRPG();
        reconhecimentoFicha(codFichaMestre);
    }
    
    public FichaMestre compacta(){
        String classe = (String) cmbClasse.getSelectedItem();
        String raca = (String) cmbRaca.getSelectedItem();
        
        float classeArm;
        float vida;
        float desloc;
        float forca;
        float destreza;
        float constituicao;
        float inteligencia;
        float sabedoria;
        float carisma;
        float nivel;
        float pontosXP;
        float inspiracao;
        float bonusProficiencia;
        float prata;
        float ouro;
        float platina;
        
        if(this.txtClasseArmad.getText().isEmpty())
            classeArm = 0;
        else
            classeArm = Float.parseFloat(this.txtClasseArmad.getText());
        
        if(this.txtVida.getText().isEmpty())
            vida = 0;
        else
            vida = Float.parseFloat(this.txtVida.getText());
        
        if(this.txtDeslocamento.getText().isEmpty())
            desloc = 0;
        else
            desloc = Float.parseFloat(this.txtDeslocamento.getText());
        
        if(this.txtForcaPersonagem.getText().isEmpty())
            forca = 0;
        else
            forca = Float.parseFloat(this.txtForcaPersonagem.getText());
        
        if(this.txtDestrezaPersonagem.getText().isEmpty())
            destreza = 0;
        else
            destreza = Float.parseFloat(this.txtDestrezaPersonagem.getText());
        
        if(this.txtConstituicaoPersonagem.getText().isEmpty())
            constituicao = 0;
        else
            constituicao = Float.parseFloat(this.txtConstituicaoPersonagem.getText());
        
        if(this.txtInteligenciaPersonagem.getText().isEmpty())
            inteligencia = 0;
        else
            inteligencia = Float.parseFloat(this.txtInteligenciaPersonagem.getText());
        
        if(this.txtSabedoriaPersonagem.getText().isEmpty())
            sabedoria = 0;
        else
            sabedoria = Float.parseFloat(this.txtSabedoriaPersonagem.getText());
        
        if(this.txtCarismaPersonagem.getText().isEmpty())
            carisma = 0;
        else
            carisma = Float.parseFloat(this.txtCarismaPersonagem.getText());
        
        if(this.txtNivel.getText().isEmpty())
            nivel = 0;
        else
            nivel = Float.parseFloat(this.txtNivel.getText());
        
        if(this.txtPontosXP.getText().isEmpty())
            pontosXP = 0;
        else
            pontosXP = Float.parseFloat(this.txtPontosXP.getText());
        
        if(this.txtInspiracao.getText().isEmpty())
            inspiracao = 0;
        else
            inspiracao = Float.parseFloat(this.txtInspiracao.getText());
        
        if(this.txtBonusProficiencia.getText().isEmpty())
            bonusProficiencia = 0;
        else
            bonusProficiencia = Float.parseFloat(this.txtBonusProficiencia.getText());
        
        if(this.txtPrata.getText().isEmpty())
            prata = 0;
        else
            prata = Float.parseFloat(this.txtPrata.getText());
        
        if(this.txtOuro.getText().isEmpty())
            ouro = 0;
        else
            ouro = Float.parseFloat(this.txtOuro.getText());
        
        if(this.txtPlatina.getText().isEmpty())
            platina = 0;
        else
            platina = Float.parseFloat(this.txtPlatina.getText());
        
        FichaMestre fm = fichaMestreController.compactando(codFichaMestre, this.txtNombre.getText(), classe, raca, classeArm, vida, desloc, forca, inteligencia, destreza, sabedoria, constituicao, carisma, nivel, this.txtTendencia.getText(), this.txtNomeUsuario.getText(), pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, this.txtHistoria.getText(), this.txtEquipamentos.getText(), this.txtCaracteristicas.getText(), this.radioVida1.isSelected(), this.radioVida2.isSelected(), this.radioVida3.isSelected(), this.radioMorte1.isSelected(), this.radioMorte2.isSelected(), this.radioMorte3.isSelected());                                                             
        return fm;
    }
    
    public void calculaMod(){
        try{
            int forca = Integer.parseInt(this.txtForcaPersonagem.getText());
            this.txtForcaModificadorPersonagem.setText(Integer.toString(fichaMestreController.calculaModificador(forca)));
        } catch (RuntimeException exe){
            this.txtForcaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Força: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int destreza = Integer.parseInt(this.txtDestrezaPersonagem.getText());
            this.txtDestrezaModificadorPersonagem.setText(Integer.toString(fichaMestreController.calculaModificador(destreza)));
        } catch (RuntimeException exe){
            this.txtDestrezaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Destreza: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int constituicao = Integer.parseInt(this.txtConstituicaoPersonagem.getText());
            this.txtConstituicaoModificadorPersonagem.setText(Integer.toString(fichaMestreController.calculaModificador(constituicao)));
        } catch (RuntimeException exe){
            this.txtConstituicaoPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Constituição: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int inteligencia = Integer.parseInt(this.txtInteligenciaPersonagem.getText());
            this.txtInteligenciaModificadorPersonagem.setText(Integer.toString(fichaMestreController.calculaModificador(inteligencia)));
        } catch (RuntimeException exe){
            this.txtInteligenciaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Inteligencia: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int sabedoria = Integer.parseInt(this.txtSabedoriaPersonagem.getText());
            this.txtSabedoriaModificadorPersonagem.setText(Integer.toString(fichaMestreController.calculaModificador(sabedoria)));
        } catch (RuntimeException exe){
            this.txtSabedoriaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Sabedoria: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int carisma = Integer.parseInt(this.txtCarismaPersonagem.getText());
            this.txtCarismaModificadorPersonagem.setText(Integer.toString(fichaMestreController.calculaModificador(carisma)));
        } catch (RuntimeException exe){
            this.txtCarismaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Carisma: Não pode usar números acima de 20 ou abaixo de 0!");
        }
    }
    
    public final void reconhecimentoFicha(int codigoFicha) throws SQLException, ClassNotFoundException{
        if(codigoFicha > 0){
            try {
                FichaMestre f = null;
                try {
                    f = fichaMestreController.puxaDados(codigoFicha);
                } 
                catch (ClassNotFoundException ex) {
                    System.out.println(ex);
                }
                
                this.txtNombre.setText(f.getNome());
                cmbClasse.setSelectedItem(f.getClasse());
                cmbRaca.setSelectedItem(f.getRaca());
                this.txtClasseArmad.setText(Float.toString(f.getClasseArm()));
                this.txtVida.setText(Float.toString(f.getVida()));
                this.txtDeslocamento.setText(Float.toString(f.getDesloc()));
                this.txtForcaPersonagem.setText(Integer.toString((int) f.getForca()));
                this.txtInteligenciaPersonagem.setText(Integer.toString((int) f.getInteligencia()));
                this.txtDestrezaPersonagem.setText(Integer.toString((int) f.getDestreza()));
                this.txtSabedoriaPersonagem.setText(Integer.toString((int) f.getSabedoria()));
                this.txtConstituicaoPersonagem.setText(Integer.toString((int) f.getConstituicao()));
                this.txtCarismaPersonagem.setText(Integer.toString((int) f.getCarisma()));
                this.txtNivel.setText(Float.toString(f.getNivel()));
                this.txtTendencia.setText(f.getTendencia()); 
                this.txtNomeUsuario.setText(f.getNomeJoga());
                this.txtPontosXP.setText(Float.toString(f.getPontosXP()));
                this.txtInspiracao.setText(Float.toString(f.getInspiracao()));
                this.txtBonusProficiencia.setText(Float.toString(f.getBonusProficiencia()));
                this.txtOuro.setText(Float.toString(f.getOuro()));
                this.txtPrata.setText(Float.toString(f.getPrata()));
                this.txtPlatina.setText(Float.toString(f.getPlatina()));
                this.txtHistoria.setText(f.getHistoriaPersonagem()); 
                this.txtEquipamentos.setText(f.getEquipamentos()); 
                this.txtCaracteristicas.setText(f.getCaracteristicas()); 
                this.radioVida1.setSelected(f.isVida1());
                this.radioVida2.setSelected(f.isVida2()); 
                this.radioVida3.setSelected(f.isVida3()); 
                this.radioMorte1.setSelected(f.isMorte1()); 
                this.radioMorte2.setSelected(f.isMorte2()); 
                this.radioMorte3.setSelected(f.isMorte3()); 
                
                calculaMod();
            } 
            catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        else
            try {
                this.txtNomeUsuario.setText(usuarioController.pegaNome(codUsuario));
                this.txtNombre.setText(fichaMestreController.buscaNome(codFichaMestre));
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
    }
    
    public final void classeRPG() throws SQLException{
        DefaultComboBoxModel classeBox = new DefaultComboBoxModel();
        ArrayList <Classe> cla = racaClasseRPG.classe();
        classeBox.addElement("<Selecione>");
        
        for (Classe c: cla)
            classeBox.addElement(c.getNome());
        
        cmbClasse.setModel(classeBox);
    }
    
    public final void racaRPG() throws SQLException{
        DefaultComboBoxModel classeBox = new DefaultComboBoxModel();
        rac = racaClasseRPG.raca();
        classeBox.addElement("<Selecione>");
        
        for (Raca c: rac)
            classeBox.addElement(c.getNome());
        
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
        txtNomeUsuario = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHistoria = new javax.swing.JTextArea();
        lblHistoriaPersonagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        lblClassePersonagem.setText("CLASSE");

        lblRacaPersonagem.setText("RAÇA");

        lblNivelPersonagem.setText("NÍVEL");

        lblTendenciaPersonagem.setText("TENDÊNCIA");

        lblNomeJogador.setText("NOME DO USUARIO");

        txtNomeUsuario.setEnabled(false);

        lblExpPersonagem.setText("PONTOS DE EXPERIÊNCIA");

        lblNomePersonagem.setText("NOME DO PERSONAGEM");

        cmbRaca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRacaItemStateChanged(evt);
            }
        });

        txtDeslocamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("DESLOC.");

        jLabel1.setText("CLASSE ARMAD.");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIDA");

        txtClasseArmad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtVida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("SALVAR FICHA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVida)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDeslocamento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbRaca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
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
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(cmbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExpPersonagem))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRacaPersonagem)
                                    .addComponent(lblTendenciaPersonagem))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTendencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPontosXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(cmbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))
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
                        .addGap(26, 26, 26))))
        );

        lblForcaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForcaPersonagem.setText("FORÇA");

        txtForcaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtForcaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtForcaModificadorPersonagem.setEnabled(false);

        lblDestrezaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDestrezaPersonagem.setText("DESTREZA");

        txtDestrezaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDestrezaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDestrezaModificadorPersonagem.setEnabled(false);

        lblConstituicaoPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConstituicaoPersonagem.setText("CONSTITUIÇÃO");

        txtConstituicaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtConstituicaoModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConstituicaoModificadorPersonagem.setEnabled(false);

        lblInteligenciaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInteligenciaPersonagem.setText("INTELIGÊNCIA");

        txtInteligenciaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtInteligenciaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInteligenciaModificadorPersonagem.setEnabled(false);

        lblSabedoriaPersonaem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSabedoriaPersonaem.setText("SABEDORIA");

        txtSabedoriaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSabedoriaModificadorPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSabedoriaModificadorPersonagem.setEnabled(false);

        lblCarismaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarismaPersonagem.setText("CARISMA");

        txtCarismaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDestrezaModificadorPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestrezaPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDestrezaPersonagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(lblForcaPersonagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtForcaModificadorPersonagem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtForcaPersonagem, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInteligenciaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtInteligenciaModificadorPersonagem)
                            .addComponent(lblSabedoriaPersonaem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSabedoriaPersonagem)
                            .addComponent(txtSabedoriaModificadorPersonagem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtInteligenciaPersonagem))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtConstituicaoPersonagem)
                                .addComponent(lblConstituicaoPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConstituicaoModificadorPersonagem)
                                .addComponent(lblCarismaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCarismaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCarismaModificadorPersonagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnCalculaModificador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                                    .addComponent(txtSabedoriaModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDestrezaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSabedoriaPersonaem, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSabedoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblConstituicaoPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConstituicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConstituicaoModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(lblCarismaPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCarismaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCarismaModificadorPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnCalculaModificador))
        );

        txtEquipamentos.setColumns(20);
        txtEquipamentos.setRows(5);
        jScrollPane1.setViewportView(txtEquipamentos);

        lblDinheiroEquipamentosPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDinheiroEquipamentosPersonagem.setText("DINHEIRO E EQUIPAMENTOS");

        lblPrataPersonagem.setText("Prata");

        txtPrata.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOuro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOuroPersonagem.setText("Ouro");

        txtPlatina.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
        lblCaracteristicasPersonagem.setText("CARACTERÍSTICAS");

        txtCaracteristicas.setColumns(20);
        txtCaracteristicas.setRows(5);
        jScrollPane2.setViewportView(txtCaracteristicas);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lblCaracteristicasPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCaracteristicasPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        lblFracassosPersonagem.setText("FRACASSOS");

        lblTestesContraMortePersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTestesContraMortePersonagem.setText("TESTES CONTRA A MORTE");

        lblSucessosPersonagem.setText("SUCESSOS");
        lblSucessosPersonagem.setName(""); // NOI18N

        txtBonusProficiencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtInspiracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblInspiracaoPersonagem.setText("INSPIRAÇÃO");

        lblBonusProficienciaPersonagem.setText("BÔNUS DE PROFICIÊNCIA");

        txtHistoria.setColumns(20);
        txtHistoria.setRows(5);

        jScrollPane3.setViewportView(txtHistoria);

        lblHistoriaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistoriaPersonagem.setText("HISTÓRIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
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
                                    .addComponent(lblBonusProficienciaPersonagem)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblHistoriaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHistoriaPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTestesContraMortePersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioVida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioVida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSucessosPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(radioMorte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioMorte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioMorte3))
                            .addComponent(lblFracassosPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInspiracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInspiracaoPersonagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBonusProficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBonusProficienciaPersonagem))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FichaMestre fm = this.compacta();
        
        if(codFichaMestre == 0){
            boolean cadastrando = false;
            try {
                codFichaMestre = fichaMestreController.cadastraFicha(fm, codMestre);   
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
                atualizando = fichaMestreController.atualizacao(fm);
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

    private void cmbRacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRacaItemStateChanged
        for(Raca r: rac)
            if(r.getNome().equals(this.cmbRaca.getSelectedItem()))
                this.txtDeslocamento.setText(Float.toString(r.getDeslocPersonagem()));
    }//GEN-LAST:event_cmbRacaItemStateChanged

    private void btnCalculaModificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaModificadorActionPerformed
        calculaMod();
    }//GEN-LAST:event_btnCalculaModificadorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        try{
            new FrmMestre(codUsuario).setVisible(true);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFichaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FrmFichaMestre().setVisible(true);
            } 
            catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Baguiu deu erro mermão");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculaModificador;
    private javax.swing.JComboBox<String> cmbClasse;
    private javax.swing.JComboBox<String> cmbRaca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JLabel lblPlatinaPersonagem;
    private javax.swing.JLabel lblPrataPersonagem;
    private javax.swing.JLabel lblRacaPersonagem;
    private javax.swing.JLabel lblSabedoriaPersonaem;
    private javax.swing.JLabel lblSucessosPersonagem;
    private javax.swing.JLabel lblTendenciaPersonagem;
    private javax.swing.JLabel lblTestesContraMortePersonagem;
    private javax.swing.JRadioButton radioMorte1;
    private javax.swing.JRadioButton radioMorte2;
    private javax.swing.JRadioButton radioMorte3;
    private javax.swing.JRadioButton radioVida1;
    private javax.swing.JRadioButton radioVida2;
    private javax.swing.JRadioButton radioVida3;
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
    private javax.swing.JTextArea txtHistoria;
    private javax.swing.JTextField txtInspiracao;
    private javax.swing.JTextField txtInteligenciaModificadorPersonagem;
    private javax.swing.JTextField txtInteligenciaPersonagem;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtOuro;
    private javax.swing.JTextField txtPlatina;
    private javax.swing.JTextField txtPontosXP;
    private javax.swing.JTextField txtPrata;
    private javax.swing.JTextField txtSabedoriaModificadorPersonagem;
    private javax.swing.JTextField txtSabedoriaPersonagem;
    private javax.swing.JTextField txtTendencia;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
