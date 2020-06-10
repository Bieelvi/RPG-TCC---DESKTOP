package model;
public class Ficha {
   
    //METODOS
    public int calculaModificador(int atributo){
        int modificacao=0;

        switch (atributo) {
            case 0:case 1:
                modificacao = -5;
                break;
            case 2:case 3:
                modificacao = -4;
                break;
            case 4:case 5:
                modificacao = -3;
                break;
            case 6:case 7:
                modificacao = -2;
                break;
            case 8:case 9:
                modificacao = -1;
                break;
            case 10:case 11:
                modificacao = 0;
                break;
            case 12:case 13:
                modificacao = 1;
                break;
            case 14:case 15:
                modificacao = 2;
                break;
            case 16:case 17:
                modificacao = 3;
                break;
            case 18:case 19:
                modificacao = 4;
                break;
            case 20:
                modificacao = 5;
                    break;
            default:
                if (atributo > 20 || atributo < 0){
                    throw new RuntimeException("Numero invalido, menor que 0 ou maior que 20");
                };
                break;
        }
            return modificacao;
    }

    public int calculaPericia(boolean pericia, int modificador){
        int valorPerificias;
        
        if(pericia == true){
            valorPerificias = getBonusProficiencia() + modificador;
        } 
        else {
            valorPerificias = modificador;
        }
        
        return valorPerificias;
    }
    
    public void testeResistencia(){              
        String classe = getClasse();
        
        switch(classe){
            case "Barbaro":
                setsForca(true);
                setsDestreza(false);
                setsConstituicao(true);
                setsInteligencia(false);
                setsSabedoria(false);
                setsCarisma(false);
                break;
            case "Bardo":
                setsForca(false);
                setsDestreza(true);
                setsConstituicao(false);
                setsInteligencia(false);
                setsSabedoria(false);
                setsCarisma(true);
                break; 
            case "Bruxo":
                setsForca(false);
                setsDestreza(false);
                setsConstituicao(false);
                setsInteligencia(false);
                setsSabedoria(true);
                setsCarisma(true);
                break; 
            case "Clerigo":
                setsForca(false);
                setsDestreza(false);
                setsConstituicao(false);
                setsInteligencia(false);
                setsSabedoria(true);
                setsCarisma(true);
                break;
            case "Druida":
                setsForca(false);
                setsDestreza(false);
                setsConstituicao(false);
                setsInteligencia(true);
                setsSabedoria(true);
                setsCarisma(false);
                break;    
            case "Feiticeiro":
                setsForca(false);
                setsDestreza(false);
                setsConstituicao(true);
                setsInteligencia(false);
                setsSabedoria(false);
                setsCarisma(true);
                break;  
            case "Guerreiro":
                setsForca(true);
                setsDestreza(false);
                setsConstituicao(true);
                setsInteligencia(false);
                setsSabedoria(false);
                setsCarisma(false);
                break;
            case "Ladino":
                setsForca(false);
                setsDestreza(true);
                setsConstituicao(false);
                setsInteligencia(true);
                setsSabedoria(false);
                setsCarisma(false);
                break;
            case "Mago":
                setsForca(false);
                setsDestreza(false);
                setsConstituicao(false);
                setsInteligencia(true);
                setsSabedoria(true);
                setsCarisma(false);
                break;   
            case "Monge":
                setsForca(true);
                setsDestreza(true);
                setsConstituicao(false);
                setsInteligencia(false);
                setsSabedoria(false);
                setsCarisma(false);
                break;
            case "Paladino":
                setsForca(false);
                setsDestreza(false);
                setsConstituicao(false);
                setsInteligencia(false);
                setsSabedoria(true);
                setsCarisma(true);
                break;
            case "Patrulheiro":
                setsForca(true);
                setsDestreza(true);
                setsConstituicao(false);
                setsInteligencia(false);
                setsSabedoria(false);
                setsCarisma(false);
                break;       
        }
    }
    
    public int calculaResistencia(boolean resistencia, int modificador){
        int valorResistencia;
        
        if(resistencia == true){
            valorResistencia = getBonusProficiencia() + modificador;
        }
        else {
            valorResistencia = modificador;
        }
        
        return valorResistencia;
    }
    
    //ATRIBUTOS E GET SET
    private int vida;
    private int classeArmadura;
    private int iniciativa;
    private double deslocamento;
    private String nomeJogador;
    private String nomePersonagem;
    private String classe;
    private String raca;
    private String alinhamento;    
    private int exp;
    private boolean inspiracao;    
    private int bonusProficiencia;
    
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    
    private boolean sForca;
    private boolean sDestreza;
    private boolean sConstituicao;
    private boolean sInteligencia;
    private boolean sSabedoria;
    private boolean sCarisma;
    
    private boolean acrobacia;
    private boolean arcanismo;
    private boolean atletismo;
    private boolean atuacao;
    private boolean blefar;
    private boolean furtividade;
    private boolean historia;
    private boolean investigacao;
    private boolean lidarComAnimais;
    private boolean medicina;
    private boolean natureza;
    private boolean percepcao;
    private boolean persuasao;
    private boolean prestidigitacao;
    private boolean religiao;
    private boolean sobrevivencia;
    
    private int vAcrobacia;
    private int vArcanismo;
    private int vAtletismo;
    private int vAtuacao;
    private int vBlefar;
    private int vFurtividade;
    private int vHistoria;
    private int vInvestigacao;
    private int vLidarComAnimais;
    private int vMedicina;
    private int vNatureza;
    private int vPercepcao;
    private int vPersuasao;
    private int vPrestidigitacao;
    private int vReligiao;
    private int vSobrevivencia;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(int classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public double getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(double deslocamento) {
        this.deslocamento = deslocamento;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(String alinhamento) {
        this.alinhamento = alinhamento;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public boolean getInspiracao() {
        return inspiracao;
    }

    public void setInspiracao(boolean inspiracao) {
        this.inspiracao = inspiracao;
    }

    public int getBonusProficiencia() {
        return bonusProficiencia;
    }

    public void setBonusProficiencia(int bonusProficiencia) {
        this.bonusProficiencia = bonusProficiencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public boolean getsForca() {
        return sForca;
    }

    public void setsForca(boolean sForca) {
        this.sForca = sForca;
    }

    public boolean getsDestreza() {
        return sDestreza;
    }

    public void setsDestreza(boolean sDestreza) {
        this.sDestreza = sDestreza;
    }

    public boolean getsConstituicao() {
        return sConstituicao;
    }

    public void setsConstituicao(boolean sConstituicao) {
        this.sConstituicao = sConstituicao;
    }

    public boolean getsInteligencia() {
        return sInteligencia;
    }

    public void setsInteligencia(boolean sInteligencia) {
        this.sInteligencia = sInteligencia;
    }

    public boolean getsSabedoria() {
        return sSabedoria;
    }

    public void setsSabedoria(boolean sSabedoria) {
        this.sSabedoria = sSabedoria;
    }

    public boolean getsCarisma() {
        return sCarisma;
    }

    public void setsCarisma(boolean sCarisma) {
        this.sCarisma = sCarisma;
    }

    public boolean getAcrobacia() {
        return acrobacia;
    }

    public void setAcrobacia(boolean acrobacia) {
        this.acrobacia = acrobacia;
    }

    public boolean getArcanismo() {
        return arcanismo;
    }

    public void setArcanismo(boolean arcanismo) {
        this.arcanismo = arcanismo;
    }

    public boolean getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(boolean atletismo) {
        this.atletismo = atletismo;
    }

    public boolean getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(boolean atuacao) {
        this.atuacao = atuacao;
    }

    public boolean getBlefar() {
        return blefar;
    }

    public void setBlefar(boolean blefar) {
        this.blefar = blefar;
    }

    public boolean getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(boolean furtividade) {
        this.furtividade = furtividade;
    }

    public boolean getHistoria() {
        return historia;
    }

    public void setHistoria(boolean historia) {
        this.historia = historia;
    }

    public boolean getInvestigacao() {
        return investigacao;
    }

    public void setInvestigacao(boolean investigacao) {
        this.investigacao = investigacao;
    }

    public boolean getLidarComAnimais() {
        return lidarComAnimais;
    }

    public void setLidarComAnimais(boolean lidarComAnimais) {
        this.lidarComAnimais = lidarComAnimais;
    }

    public boolean getMedicina() {
        return medicina;
    }

    public void setMedicina(boolean medicina) {
        this.medicina = medicina;
    }

    public boolean getNatureza() {
        return natureza;
    }

    public void setNatureza(boolean natureza) {
        this.natureza = natureza;
    }

    public boolean getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(boolean percepcao) {
        this.percepcao = percepcao;
    }

    public boolean getPersuasao() {
        return persuasao;
    }

    public void setPersuasao(boolean persuasao) {
        this.persuasao = persuasao;
    }

    public boolean getPrestidigitacao() {
        return prestidigitacao;
    }

    public void setPrestidigitacao(boolean prestidigitacao) {
        this.prestidigitacao = prestidigitacao;
    }

    public boolean getReligiao() {
        return religiao;
    }

    public void setReligiao(boolean religiao) {
        this.religiao = religiao;
    }

    public boolean getSobrevivencia() {
        return sobrevivencia;
    }

    public void setSobrevivencia(boolean sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    public int getvAcrobacia() {
        return vAcrobacia;
    }

    public void setvAcrobacia(int vAcrobacia) {
        this.vAcrobacia = vAcrobacia;
    }

    public int getvArcanismo() {
        return vArcanismo;
    }

    public void setvArcanismo(int vArcanismo) {
        this.vArcanismo = vArcanismo;
    }

    public int getvAtletismo() {
        return vAtletismo;
    }

    public void setvAtletismo(int vAtletismo) {
        this.vAtletismo = vAtletismo;
    }

    public int getvAtuacao() {
        return vAtuacao;
    }

    public void setvAtuacao(int vAtuacao) {
        this.vAtuacao = vAtuacao;
    }

    public int getvBlefar() {
        return vBlefar;
    }

    public void setvBlefar(int vBlefar) {
        this.vBlefar = vBlefar;
    }

    public int getvFurtividade() {
        return vFurtividade;
    }

    public void setvFurtividade(int vFurtividade) {
        this.vFurtividade = vFurtividade;
    }

    public int getvHistoria() {
        return vHistoria;
    }

    public void setvHistoria(int vHistoria) {
        this.vHistoria = vHistoria;
    }

    public int getvInvestigacao() {
        return vInvestigacao;
    }

    public void setvInvestigacao(int vInvestigacao) {
        this.vInvestigacao = vInvestigacao;
    }

    public int getvLidarComAnimais() {
        return vLidarComAnimais;
    }

    public void setvLidarComAnimais(int vLidarComAnimais) {
        this.vLidarComAnimais = vLidarComAnimais;
    }

    public int getvMedicina() {
        return vMedicina;
    }

    public void setvMedicina(int vMedicina) {
        this.vMedicina = vMedicina;
    }

    public int getvNatureza() {
        return vNatureza;
    }

    public void setvNatureza(int vNatureza) {
        this.vNatureza = vNatureza;
    }

    public int getvPercepcao() {
        return vPercepcao;
    }

    public void setvPercepcao(int vPercepcao) {
        this.vPercepcao = vPercepcao;
    }

    public int getvPersuasao() {
        return vPersuasao;
    }

    public void setvPersuasao(int vPersuasao) {
        this.vPersuasao = vPersuasao;
    }

    public int getvPrestidigitacao() {
        return vPrestidigitacao;
    }

    public void setvPrestidigitacao(int vPrestidigitacao) {
        this.vPrestidigitacao = vPrestidigitacao;
    }

    public int getvReligiao() {
        return vReligiao;
    }

    public void setvReligiao(int vReligiao) {
        this.vReligiao = vReligiao;
    }

    public int getvSobrevivencia() {
        return vSobrevivencia;
    }

    public void setvSobrevivencia(int vSobrevivencia) {
        this.vSobrevivencia = vSobrevivencia;
    }
}    