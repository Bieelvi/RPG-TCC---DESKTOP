package view;

import control.FichaController;
import control.JogadorController;
import control.RacaClasseController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Classe;
import model.Ficha;
import model.Raca; 

public class FrmFichaMestre extends javax.swing.JFrame {
    
    int codFicha;
    int codUsuario;
    String nomeJogador;
    FichaController fichaController;
    RacaClasseController racaClasseRPG;
    JogadorController jogadorController;
    
    public FrmFichaMestre(int codigoUsuario, int codigoFicha, String nomeJogador) throws SQLException {
        initComponents();
        codFicha = codigoFicha;
        codUsuario = codigoUsuario;
        this.nomeJogador = nomeJogador;
        txtHistoria.setLineWrap(true);
        txtHistoria.setWrapStyleWord(true);
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setWrapStyleWord(true);
        fichaController = new FichaController();
        racaClasseRPG = new RacaClasseController();
        jogadorController = new JogadorController();
        this.txtNomeUsuario.setText(nomeJogador);
        classeRPG();
        racaRPG();
        reconhecimentoFicha(codigoFicha);
    }

    public FrmFichaMestre() throws SQLException {
        initComponents();
        codFicha = 83;
        codUsuario = 1;
        txtHistoria.setLineWrap(true);
        txtHistoria.setWrapStyleWord(true);
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setWrapStyleWord(true);
        fichaController = new FichaController();
        racaClasseRPG = new RacaClasseController();
        jogadorController = new JogadorController();
        this.txtNomeUsuario.setText("Ghannor");
        classeRPG();
        racaRPG();
        reconhecimentoFicha(codFicha);
    }
    
    public FrmFichaMestre(int codFichaMestre) throws SQLException {
        initComponents();
        codFicha = 83;
        codUsuario = 1;
        txtHistoria.setLineWrap(true);
        txtHistoria.setWrapStyleWord(true);
        txtEquipamentos.setLineWrap(true);
        txtEquipamentos.setWrapStyleWord(true);
        txtCaracteristicas.setLineWrap(true);
        txtCaracteristicas.setWrapStyleWord(true);
        fichaController = new FichaController();
        racaClasseRPG = new RacaClasseController();
        jogadorController = new JogadorController();
        this.txtNomeUsuario.setText("Ghannor");
        classeRPG();
        racaRPG();
        reconhecimentoFicha(codFicha);
    }
    
    public final void reconhecimentoFicha(int codigoFicha){
        if(codigoFicha > 0){
            try {
                Ficha f = fichaController.puxaDados(codigoFicha);
                
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
                this.radioAcrobacia.setSelected(f.isAcrobacia());
                this.radioArcanismo.setSelected(f.isArcanismo()); 
                this.radioAtletismo.setSelected(f.isAtletismo()); 
                this.radioAtuacao.setSelected(f.isAtuacao());
                this.radioBlefar.setSelected(f.isBlefar()); 
                this.radioFurtividade.setSelected(f.isFurtividade()); 
                this.radioHistoria.setSelected(f.isHistoria());
                this.radioIntimidacao.setSelected(f.isIntimidacao()); 
                this.radioInvestigacao.setSelected(f.isInvestigacao()); 
                this.radioNatureza.setSelected(f.isNatureza());
                this.radioPercepcao.setSelected(f.isPercepcao()); 
                this.radioPersuasao.setSelected(f.isPersuasao()); 
                this.radioPrestidigitacao.setSelected(f.isPrestidigitacao()); 
                this.radioReligiao.setSelected(f.isReligiao());
                this.radioSobrevivencia.setSelected(f.isSobrevivencia()); 
                this.radioForca.setSelected(f.isForcaPrest());
                this.radioDestreza.setSelected(f.isDestrezaPrest()); 
                this.radioLidarAnimais.setSelected(f.isLidarComAnimais()); 
                this.radioConstituicao.setSelected(f.isConstituicaoPrest()); 
                this.radioInteligencia.setSelected(f.isInteligenciaPrest()); 
                this.radioSabedoria.setSelected(f.isSabedoriaPrest());
                this.radioCarisma.setSelected(f.isCarismaPrest());
                this.radioVida1.setSelected(f.isVida1());
                this.radioVida2.setSelected(f.isVida2()); 
                this.radioVida3.setSelected(f.isVida3()); 
                this.radioMorte1.setSelected(f.isMorte1()); 
                this.radioMorte2.setSelected(f.isMorte2()); 
                this.radioMorte3.setSelected(f.isMorte3()); 
                this.radioIntuicao.setSelected(f.isIntuicao()); 
                this.radioMedicina.setSelected(f.isMedicina());
                
                try{
                    int forca = (int) f.getForca();
                    this.txtForcaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(forca)));
                } catch (RuntimeException exe){
                    this.txtForcaPersonagem.setText("");
                    JOptionPane.showMessageDialog(null, "Força: Não pode usar números acima de 20 ou abaixo de 0!");
                }

                try{
                    int destreza = (int) f.getDestreza();
                    this.txtDestrezaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(destreza)));
                } catch (RuntimeException exe){
                    this.txtDestrezaPersonagem.setText("");
                    JOptionPane.showMessageDialog(null, "Destreza: Não pode usar números acima de 20 ou abaixo de 0!");
                }

                try{
                    int constituicao = (int) f.getConstituicao();
                    this.txtConstituicaoModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(constituicao)));
                } catch (RuntimeException exe){
                    this.txtConstituicaoPersonagem.setText("");
                    JOptionPane.showMessageDialog(null, "Constituição: Não pode usar números acima de 20 ou abaixo de 0!");
                }

                try{
                    int inteligencia = (int) f.getInteligencia();
                    this.txtInteligenciaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(inteligencia)));
                } catch (RuntimeException exe){
                    this.txtInteligenciaPersonagem.setText("");
                    JOptionPane.showMessageDialog(null, "Inteligencia: Não pode usar números acima de 20 ou abaixo de 0!");
                }

                try{
                    int sabedoria = (int) f.getSabedoria();
                    this.txtSabedoriaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(sabedoria)));
                } catch (RuntimeException exe){
                    this.txtSabedoriaPersonagem.setText("");
                    JOptionPane.showMessageDialog(null, "Sabedoria: Não pode usar números acima de 20 ou abaixo de 0!");
                }

                try{
                    int carisma = (int) f.getCarisma();
                    this.txtCarismaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(carisma)));
                } catch (RuntimeException exe){
                    this.txtCarismaPersonagem.setText("");
                    JOptionPane.showMessageDialog(null, "Carisma: Não pode usar números acima de 20 ou abaixo de 0!");
                }
            } 
            catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
            atualizarResistencia();
            atualizarPericias();
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
        ArrayList <Raca> rac = racaClasseRPG.raca();
        classeBox.addElement("<Selecione>");
        
        for (Raca c: rac)
            classeBox.addElement(c.getNome());
        
        cmbRaca.setModel(classeBox);
    }

    public void atualizarResistencia(){
        double bonusProficienciaDouble;
            if(txtBonusProficiencia.getText().equals(""))
                bonusProficienciaDouble = 0;
            else
                bonusProficienciaDouble = Double.parseDouble(this.txtBonusProficiencia.getText());
        
        int bonusProficiencia = (int)bonusProficienciaDouble;
            
        try{
            this.txtTesteForcaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioForca.isSelected(), Integer.parseInt(this.txtForcaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtTesteForcaPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtTesteDestrezaPersongem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioDestreza.isSelected(), Integer.parseInt(this.txtDestrezaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtTesteDestrezaPersongem.setText(Integer.toString(0));
        }
        
        try{
            this.txtTesteConstituicaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioConstituicao.isSelected(), Integer.parseInt(this.txtConstituicaoModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtTesteConstituicaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtTesteInteligenciaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioInteligencia.isSelected(), Integer.parseInt(this.txtInteligenciaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtTesteInteligenciaPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtTesteSabedoriaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioSabedoria.isSelected(), Integer.parseInt(this.txtSabedoriaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtTesteSabedoriaPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtTesteCarismaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioCarisma.isSelected(), Integer.parseInt(this.txtCarismaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtTesteCarismaPersonagem.setText(Integer.toString(0));
        }
    }
    
    public void atualizarPericias(){
        double bonusProficienciaDouble;
            if(txtBonusProficiencia.getText().equals(""))
                bonusProficienciaDouble = 0;
            else
                bonusProficienciaDouble = Double.parseDouble(this.txtBonusProficiencia.getText());
        
        int bonusProficiencia = (int)bonusProficienciaDouble;
            
        try{
            this.txtAcrobaciaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioAcrobacia.isSelected(), Integer.parseInt(this.txtDestrezaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtAcrobaciaPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtArcanismoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioArcanismo.isSelected(), Integer.parseInt(this.txtInteligenciaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtArcanismoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtAtletismoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioAtletismo.isSelected(), Integer.parseInt(this.txtForcaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtAtletismoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtAtuacaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioAtuacao.isSelected(), Integer.parseInt(this.txtCarismaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtAtuacaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtBlefarPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioBlefar.isSelected(), Integer.parseInt(this.txtCarismaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtBlefarPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtFurtividadePersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioFurtividade.isSelected(), Integer.parseInt(this.txtDestrezaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtFurtividadePersonagem.setText(Integer.toString(0));
        }
            
        try{
            this.txtHistoriaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioHistoria.isSelected(), Integer.parseInt(this.txtInteligenciaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtHistoriaPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtIntimidacaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioIntimidacao.isSelected(), Integer.parseInt(this.txtCarismaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtIntimidacaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtIntuicaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioIntuicao.isSelected(), Integer.parseInt(this.txtSabedoriaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtIntuicaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtInvestigacaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioInvestigacao.isSelected(), Integer.parseInt(this.txtInteligenciaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtInvestigacaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtLidarAnimaisPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioLidarAnimais.isSelected(), Integer.parseInt(this.txtSabedoriaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtLidarAnimaisPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtMedicinaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioMedicina.isSelected(), Integer.parseInt(this.txtSabedoriaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtMedicinaPersonagem.setText(Integer.toString(0));
        }
            
        try{
            this.txtNaturezaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioNatureza.isSelected(), Integer.parseInt(this.txtInteligenciaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtNaturezaPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtPercepcaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioPercepcao.isSelected(), Integer.parseInt(this.txtSabedoriaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtPercepcaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtPersuasaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioPersuasao.isSelected(), Integer.parseInt(this.txtCarismaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtPersuasaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtPrestidigitacaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioPrestidigitacao.isSelected(), Integer.parseInt(this.txtDestrezaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtPrestidigitacaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtReligiaoPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioReligiao.isSelected(), Integer.parseInt(this.txtInteligenciaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtReligiaoPersonagem.setText(Integer.toString(0));
        }
        
        try{
            this.txtSobrevivenciaPersonagem.setText(Integer.toString(fichaController.calculaResistenciaOuPericia(this.radioSobrevivencia.isSelected(), Integer.parseInt(this.txtSabedoriaModificadorPersonagem.getText()), bonusProficiencia)));
        }
        catch(NumberFormatException nfe){
            this.txtSobrevivenciaPersonagem.setText(Integer.toString(0));
        }
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
        txtAcrobaciaPersonagem = new javax.swing.JTextField();
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
        txtPersuasaoPersonagem = new javax.swing.JTextField();
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
        txtIntuicaoPersonagem = new javax.swing.JTextField();
        radioIntuicao = new javax.swing.JRadioButton();
        txtSobrevivenciaPersonagem = new javax.swing.JTextField();
        radioSobrevivencia = new javax.swing.JRadioButton();
        txtReligiaoPersonagem = new javax.swing.JTextField();
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

        txtNomeUsuario.setEnabled(false);

        lblExpPersonagem.setText("PONTOS DE EXPERIÊNCIA");

        lblNomePersonagem.setText("NOME DO PERSONAGEM");

        cmbClasse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClasseItemStateChanged(evt);
            }
        });

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

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostTxtNombre(evt);
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
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        radioForca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioForca(evt);
            }
        });

        radioDestreza.setText("DESTREZA");
        radioDestreza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioDestreza(evt);
            }
        });

        radioConstituicao.setText("CONSTITUIÇÃO");
        radioConstituicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioConstituicao(evt);
            }
        });

        radioSabedoria.setText("SABEDORIA");
        radioSabedoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioSabedoria(evt);
            }
        });

        radioInteligencia.setText("INTELIGÊNCIA");
        radioInteligencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioInteligencia(evt);
            }
        });

        radioCarisma.setText("CARISMA");
        radioCarisma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioCarisma(evt);
            }
        });

        txtTesteForcaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTesteForcaPersonagem.setEnabled(false);

        txtTesteDestrezaPersongem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTesteDestrezaPersongem.setEnabled(false);

        txtTesteConstituicaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTesteConstituicaoPersonagem.setEnabled(false);

        txtTesteInteligenciaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTesteInteligenciaPersonagem.setEnabled(false);

        txtTesteSabedoriaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTesteSabedoriaPersonagem.setEnabled(false);

        txtTesteCarismaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        txtAcrobaciaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcrobaciaPersonagem.setEnabled(false);

        lblPericiasPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPericiasPersonagem.setText("PERÍCIAS");

        radioAcrobacia.setText("Acrobacia");
        radioAcrobacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioAcrobacia(evt);
            }
        });

        radioArcanismo.setText("Arcanismo");
        radioArcanismo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioArcanismo(evt);
            }
        });

        txtArcanismoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtArcanismoPersonagem.setEnabled(false);

        txtAtuacaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAtuacaoPersonagem.setEnabled(false);

        txtAtletismoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAtletismoPersonagem.setEnabled(false);

        radioAtletismo.setText("Atletismo");
        radioAtletismo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioAtletismo(evt);
            }
        });

        radioAtuacao.setText("Atuação");
        radioAtuacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioAtuacao(evt);
            }
        });

        txtHistoriaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHistoriaPersonagem.setEnabled(false);

        radioHistoria.setText("História");
        radioHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioHistoria(evt);
            }
        });

        txtIntimidacaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntimidacaoPersonagem.setEnabled(false);

        radioIntimidacao.setText("Intimidação");
        radioIntimidacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioIntimidacao(evt);
            }
        });

        txtBlefarPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBlefarPersonagem.setEnabled(false);

        txtFurtividadePersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFurtividadePersonagem.setEnabled(false);

        radioFurtividade.setText("Furtividade");
        radioFurtividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioFurtividade(evt);
            }
        });

        radioBlefar.setText("Blefar");
        radioBlefar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioBlefar(evt);
            }
        });

        radioPrestidigitacao.setText("Prestidigitação");
        radioPrestidigitacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioPrestidigitacao(evt);
            }
        });

        txtPrestidigitacaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrestidigitacaoPersonagem.setEnabled(false);

        txtPersuasaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPersuasaoPersonagem.setEnabled(false);

        radioPersuasao.setText("Persuasão");
        radioPersuasao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioPersuacao(evt);
            }
        });

        radioPercepcao.setText("Percepção");
        radioPercepcao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioPercepcao(evt);
            }
        });

        txtPercepcaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPercepcaoPersonagem.setEnabled(false);

        txtNaturezaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNaturezaPersonagem.setEnabled(false);

        radioNatureza.setText("Natureza");
        radioNatureza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioNatureza(evt);
            }
        });

        radioMedicina.setText("Medicina");
        radioMedicina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioMedicina(evt);
            }
        });

        txtMedicinaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMedicinaPersonagem.setEnabled(false);

        txtLidarAnimaisPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLidarAnimaisPersonagem.setEnabled(false);

        radioLidarAnimais.setText("Lidar com Animais");
        radioLidarAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioLidarComAnimais(evt);
            }
        });

        radioInvestigacao.setText("Investigação");
        radioInvestigacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioInvestigacao(evt);
            }
        });

        txtInvestigacaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInvestigacaoPersonagem.setEnabled(false);

        txtIntuicaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntuicaoPersonagem.setEnabled(false);

        radioIntuicao.setText("Intuição");
        radioIntuicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioIntuicao(evt);
            }
        });

        txtSobrevivenciaPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSobrevivenciaPersonagem.setEnabled(false);

        radioSobrevivencia.setText("Sobrevivência");
        radioSobrevivencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioSobrevivencia(evt);
            }
        });

        txtReligiaoPersonagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReligiaoPersonagem.setEnabled(false);

        radioReligiao.setText("Religião");
        radioReligiao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickedRadioReligiao(evt);
            }
        });

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
                                .addComponent(txtIntuicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(txtPersuasaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPersuasao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrestidigitacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReligiaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioReligiao)
                                    .addComponent(radioPrestidigitacao)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtSobrevivenciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSobrevivencia))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtAcrobaciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtAcrobaciaPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtIntuicaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtPersuasaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPersuasao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrestidigitacaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPrestidigitacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioReligiao)
                    .addComponent(txtReligiaoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lblSucessosPersonagem.setText("SUCESSOS");
        lblSucessosPersonagem.setName(""); // NOI18N

        txtBonusProficiencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBonusProficiencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostBonusProficiente(evt);
            }
        });

        txtInspiracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
        lblHistoriaPersonagem.setText("HISTÓRIA");

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
    
    private void btnCalculaModificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaModificadorActionPerformed
        try{
            int forca = Integer.parseInt(this.txtForcaPersonagem.getText());
            this.txtForcaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(forca)));
        } catch (RuntimeException exe){
            this.txtForcaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Força: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int destreza = Integer.parseInt(this.txtDestrezaPersonagem.getText());
            this.txtDestrezaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(destreza)));
        } catch (RuntimeException exe){
            this.txtDestrezaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Destreza: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int constituicao = Integer.parseInt(this.txtConstituicaoPersonagem.getText());
            this.txtConstituicaoModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(constituicao)));
        } catch (RuntimeException exe){
            this.txtConstituicaoPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Constituição: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int inteligencia = Integer.parseInt(this.txtInteligenciaPersonagem.getText());
            this.txtInteligenciaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(inteligencia)));
        } catch (RuntimeException exe){
            this.txtInteligenciaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Inteligencia: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int sabedoria = Integer.parseInt(this.txtSabedoriaPersonagem.getText());
            this.txtSabedoriaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(sabedoria)));
        } catch (RuntimeException exe){
            this.txtSabedoriaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Sabedoria: Não pode usar números acima de 20 ou abaixo de 0!");
        }

        try{
            int carisma = Integer.parseInt(this.txtCarismaPersonagem.getText());
            this.txtCarismaModificadorPersonagem.setText(Integer.toString(fichaController.calculaModificador(carisma)));
        } catch (RuntimeException exe){
            this.txtCarismaPersonagem.setText("");
            JOptionPane.showMessageDialog(null, "Carisma: Não pode usar números acima de 20 ou abaixo de 0!");
        }
        
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_btnCalculaModificadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String classe = (String) cmbClasse.getSelectedItem();
        String raca = (String) cmbRaca.getSelectedItem();
        
        ArrayList radios = fichaController.convertRadio(radioAcrobacia.isSelected(), radioArcanismo.isSelected(), radioAtletismo.isSelected(), radioAtuacao.isSelected(), radioBlefar.isSelected(), radioFurtividade.isSelected(), radioHistoria.isSelected(), radioIntimidacao.isSelected(), radioInvestigacao.isSelected(), radioNatureza.isSelected(), radioPercepcao.isSelected(), radioPersuasao.isSelected(), radioPrestidigitacao.isSelected(), radioReligiao.isSelected(), radioSobrevivencia.isSelected(), radioForca.isSelected(), radioDestreza.isSelected(), radioLidarAnimais.isSelected(), radioConstituicao.isSelected(), radioInteligencia.isSelected(), radioSabedoria.isSelected(), radioCarisma.isSelected(), radioVida1.isSelected(), radioVida2.isSelected(), radioVida3.isSelected(), radioMorte1.isSelected(), radioMorte2.isSelected(), radioMorte3.isSelected(), radioIntuicao.isSelected(), radioMedicina.isSelected());
        Ficha f = fichaController.compactando(this.txtNombre.getText(), classe, raca, Float.parseFloat(this.txtClasseArmad.getText()), Float.parseFloat(this.txtVida.getText()), Float.parseFloat(this.txtDeslocamento.getText()), Float.parseFloat(this.txtForcaPersonagem.getText()), Float.parseFloat(this.txtInteligenciaPersonagem.getText()), Float.parseFloat(this.txtDestrezaPersonagem.getText()), Float.parseFloat(this.txtSabedoriaPersonagem.getText()), Float.parseFloat(this.txtConstituicaoPersonagem.getText()), Float.parseFloat(this.txtCarismaPersonagem.getText()), Float.parseFloat(this.txtNivel.getText()), this.txtTendencia.getText(), this.txtNomeUsuario.getText(), Float.parseFloat(this.txtPontosXP.getText()), Float.parseFloat(this.txtInspiracao.getText()), Float.parseFloat(this.txtBonusProficiencia.getText()), Float.parseFloat(this.txtOuro.getText()), Float.parseFloat(this.txtPrata.getText()), Float.parseFloat(this.txtPlatina.getText()), this.txtHistoria.getText(), this.txtEquipamentos.getText(), this.txtCaracteristicas.getText(), radios);
        
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

    private void cmbRacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRacaItemStateChanged
        //if(cmbRaca.getSelectedItem().equals("Criar nova Raça"))
    }//GEN-LAST:event_cmbRacaItemStateChanged

    private void cmbClasseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClasseItemStateChanged
        int i = 0;
        ArrayList prest;
        String classe = (String) cmbClasse.getSelectedItem();
        
        if(!cmbClasse.getSelectedItem().equals("<Selecione>")){
            prest = fichaController.testeResistencia(classe, radioForca.isSelected(), radioDestreza.isSelected(), radioConstituicao.isSelected(), radioInteligencia.isSelected(), radioSabedoria.isSelected(), radioCarisma.isSelected());
            for(Object o: prest){
                switch(i){
                    case 0:
                        radioForca.setSelected((boolean) o);
                    break;
                    case 1:
                        radioDestreza.setSelected((boolean) o);
                    break;
                    case 2:
                        radioConstituicao.setSelected((boolean) o);
                    break;
                    case 3:
                        radioInteligencia.setSelected((boolean) o);
                    break;
                    case 4:
                        radioSabedoria.setSelected((boolean) o);
                    break;
                    case 5:
                        radioCarisma.setSelected((boolean) o);
                    break;
                }
                i++;
            }
        }  
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_cmbClasseItemStateChanged

    private void onClickedRadioForca(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioForca
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioForca

    private void onClickedRadioDestreza(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioDestreza
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioDestreza

    private void onClickedRadioConstituicao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioConstituicao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioConstituicao

    private void onClickedRadioInteligencia(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioInteligencia
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioInteligencia

    private void onClickedRadioSabedoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioSabedoria
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioSabedoria

    private void onClickedRadioCarisma(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioCarisma
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioCarisma

    private void focusLostBonusProficiente(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLostBonusProficiente
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_focusLostBonusProficiente

    private void onClickedRadioAcrobacia(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioAcrobacia
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioAcrobacia

    private void onClickedRadioArcanismo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioArcanismo
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioArcanismo

    private void onClickedRadioAtletismo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioAtletismo
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioAtletismo

    private void onClickedRadioAtuacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioAtuacao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioAtuacao

    private void onClickedRadioBlefar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioBlefar
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioBlefar

    private void onClickedRadioFurtividade(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioFurtividade
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioFurtividade

    private void onClickedRadioHistoria(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioHistoria
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioHistoria

    private void onClickedRadioIntimidacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioIntimidacao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioIntimidacao

    private void onClickedRadioIntuicao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioIntuicao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioIntuicao

    private void onClickedRadioInvestigacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioInvestigacao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioInvestigacao

    private void onClickedRadioLidarComAnimais(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioLidarComAnimais
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioLidarComAnimais

    private void onClickedRadioMedicina(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioMedicina
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioMedicina

    private void onClickedRadioNatureza(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioNatureza
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioNatureza

    private void onClickedRadioPercepcao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioPercepcao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioPercepcao

    private void onClickedRadioPersuacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioPersuacao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioPersuacao

    private void onClickedRadioPrestidigitacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioPrestidigitacao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioPrestidigitacao

    private void onClickedRadioReligiao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioReligiao
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioReligiao

    private void onClickedRadioSobrevivencia(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickedRadioSobrevivencia
        atualizarResistencia();
        atualizarPericias();
    }//GEN-LAST:event_onClickedRadioSobrevivencia

    private void focusLostTxtNombre(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLostTxtNombre
        int i;
        boolean alterandoJogador;
        boolean alterandoFicha;
        
        if(!this.txtNombre.getText().equals(nomeJogador)){
            i = JOptionPane.showConfirmDialog(null, "Deseja alterar o nome de seu personagem?");

            switch (i) {
                case JOptionPane.YES_OPTION:
                    try {
                        alterandoJogador = this.jogadorController.alteraNome(this.txtNombre.getText(), codFicha);
                        alterandoFicha = this.fichaController.alteraNome(this.txtNombre.getText(), codFicha);
                        if(alterandoJogador && alterandoFicha){
                            JOptionPane.showMessageDialog(null, "Nome Alterado com sucesso");
                            nomeJogador = jogadorController.buscaNome(codFicha);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Nome NÃO Alterado com sucesso");
                            this.txtNombre.setText(nomeJogador);
                    } 
                    catch (SQLException | ClassNotFoundException ex) {
                        System.out.println(ex);
                    }
                break;
                case JOptionPane.NO_OPTION: case JOptionPane.CANCEL_OPTION:
                    this.txtNombre.setText(nomeJogador);
                break;
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Nome NÃO Alterado");
    }//GEN-LAST:event_focusLostTxtNombre

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
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Baguiu deu erro mermão");
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
    private javax.swing.JTextField txtAcrobaciaPersonagem;
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
    private javax.swing.JTextField txtIntuicaoPersonagem;
    private javax.swing.JTextField txtInvestigacaoPersonagem;
    private javax.swing.JTextField txtLidarAnimaisPersonagem;
    private javax.swing.JTextField txtMedicinaPersonagem;
    private javax.swing.JTextField txtNaturezaPersonagem;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtOuro;
    private javax.swing.JTextField txtPercepcaoPersonagem;
    private javax.swing.JTextField txtPersuasaoPersonagem;
    private javax.swing.JTextField txtPlatina;
    private javax.swing.JTextField txtPontosXP;
    private javax.swing.JTextField txtPrata;
    private javax.swing.JTextField txtPrestidigitacaoPersonagem;
    private javax.swing.JTextField txtReligiaoPersonagem;
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
