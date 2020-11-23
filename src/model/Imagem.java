package model;

public class Imagem {

    public Imagem(int codigoImagem, int codigoMestre, String nomeImagem, byte[] conteudoImagem) {
        this.codigoImagem = codigoImagem;
        this.codigoMestre = codigoMestre;
        this.nomeImagem = nomeImagem;
        this.conteudoImagem = conteudoImagem;
    }
    
    private int codigoImagem;
    private int codigoMestre;
    private String nomeImagem;
    private byte[] conteudoImagem;

    public int getCodigoImagem() {
        return codigoImagem;
    }

    public void setCodigoImagem(int codigoImagem) {
        this.codigoImagem = codigoImagem;
    }

    public int getCodigoMestre() {
        return codigoMestre;
    }

    public void setCodigoMestre(int codigoMestre) {
        this.codigoMestre = codigoMestre;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    public byte[] getConteudoImagem() {
        return conteudoImagem;
    }

    public void setConteudoImagem(byte[] conteudoImagem) {
        this.conteudoImagem = conteudoImagem;
    }
    
}
