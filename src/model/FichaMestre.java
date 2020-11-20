package model;

public class FichaMestre {
    public FichaMestre(int codFichaMestre, String nome, String classe, String raca, float classeArm, float vida, float desloc, float forca, float inteligencia, float destreza, float sabedoria, float constituicao, float carisma, float nivel, String tendencia, String nomeJoga, float pontosXP, float inspiracao, float bonusProficiencia, float ouro, float prata, float platina, String historia, String equipamentos, String caracteristicas, boolean vida1, boolean vida2, boolean vida3, boolean morte1, boolean morte2, boolean morte3) {
        this.codFichaMestre = codFichaMestre;
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.classeArm = classeArm;
        this.vida = vida;
        this.desloc = desloc;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.sabedoria = sabedoria;
        this.constituicao = constituicao;
        this.carisma = carisma;
        this.nivel = nivel;
        this.tendencia = tendencia;
        this.nomeJoga = nomeJoga;
        this.pontosXP = pontosXP;
        this.inspiracao = inspiracao;
        this.bonusProficiencia = bonusProficiencia;
        this.ouro = ouro;
        this.prata = prata;
        this.platina = platina;
        this.historiaPersonagem = historia;
        this.equipamentos = equipamentos;
        this.caracteristicas = caracteristicas;
        this.vida1 = vida1;
        this.vida2 = vida2;
        this.vida3 = vida3;
        this.morte1 = morte1;
        this.morte2 = morte2;
        this.morte3 = morte3;
    }
    
    private int codFichaMestre;
    private String nome;
    private String classe;
    private String raca;
    private float classeArm;
    private float vida;
    private float desloc;
    private float forca;
    private float inteligencia;
    private float destreza;
    private float sabedoria;
    private float constituicao;
    private float carisma;
    private float nivel;
    private String tendencia;
    private String nomeJoga;
    private float pontosXP;
    private float inspiracao;
    private float bonusProficiencia;
    private float ouro;
    private float prata;
    private float platina;
    private String historiaPersonagem;
    private String equipamentos;
    private String caracteristicas;
    private boolean vida1;
    private boolean vida2;
    private boolean vida3;
    private boolean morte1;
    private boolean morte2;
    private boolean morte3;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public float getClasseArm() {
        return classeArm;
    }

    public void setClasseArm(float classeArm) {
        this.classeArm = classeArm;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getDesloc() {
        return desloc;
    }

    public void setDesloc(float desloc) {
        this.desloc = desloc;
    }

    public float getForca() {
        return forca;
    }

    public void setForca(float forca) {
        this.forca = forca;
    }

    public float getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(float inteligencia) {
        this.inteligencia = inteligencia;
    }

    public float getDestreza() {
        return destreza;
    }

    public void setDestreza(float destreza) {
        this.destreza = destreza;
    }

    public float getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(float sabedoria) {
        this.sabedoria = sabedoria;
    }

    public float getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(float constituicao) {
        this.constituicao = constituicao;
    }

    public float getCarisma() {
        return carisma;
    }

    public void setCarisma(float carisma) {
        this.carisma = carisma;
    }

    public float getNivel() {
        return nivel;
    }

    public void setNivel(float nivel) {
        this.nivel = nivel;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public String getNomeJoga() {
        return nomeJoga;
    }

    public void setNomeJoga(String nomeJoga) {
        this.nomeJoga = nomeJoga;
    }

    public float getPontosXP() {
        return pontosXP;
    }

    public void setPontosXP(float pontosXP) {
        this.pontosXP = pontosXP;
    }

    public float getInspiracao() {
        return inspiracao;
    }

    public void setInspiracao(float inspiracao) {
        this.inspiracao = inspiracao;
    }

    public float getBonusProficiencia() {
        return bonusProficiencia;
    }

    public void setBonusProficiencia(float bonusProficiencia) {
        this.bonusProficiencia = bonusProficiencia;
    }

    public float getOuro() {
        return ouro;
    }

    public void setOuro(float ouro) {
        this.ouro = ouro;
    }

    public float getPrata() {
        return prata;
    }

    public void setPrata(float prata) {
        this.prata = prata;
    }

    public float getPlatina() {
        return platina;
    }

    public void setPlatina(float platina) {
        this.platina = platina;
    }

    public String getHistoriaPersonagem() {
        return historiaPersonagem;
    }

    public void setHistoriaPersonagem(String historiaPersonagem) {
        this.historiaPersonagem = historiaPersonagem;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean isVida1() {
        return vida1;
    }

    public void setVida1(boolean vida1) {
        this.vida1 = vida1;
    }

    public boolean isVida2() {
        return vida2;
    }

    public void setVida2(boolean vida2) {
        this.vida2 = vida2;
    }

    public boolean isVida3() {
        return vida3;
    }

    public void setVida3(boolean vida3) {
        this.vida3 = vida3;
    }

    public boolean isMorte1() {
        return morte1;
    }

    public void setMorte1(boolean morte1) {
        this.morte1 = morte1;
    }

    public boolean isMorte2() {
        return morte2;
    }

    public void setMorte2(boolean morte2) {
        this.morte2 = morte2;
    }

    public boolean isMorte3() {
        return morte3;
    }

    public void setMorte3(boolean morte3) {
        this.morte3 = morte3;
    }

    public int getCodFichaMestre() {
        return codFichaMestre;
    }

    public void setCodFichaMestre(int codFichaMestre) {
        this.codFichaMestre = codFichaMestre;
    }
    
}
