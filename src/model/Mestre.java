package model;

public class Mestre {
    
    private String nomeMestre;
    private int codigoMestre;
    private int codigoUsuario;

    public Mestre(String nomeJogador, int codigoJogador, int codigoUsuario) {
        this.nomeMestre = nomeJogador;
        this.codigoMestre = codigoJogador;
        this.codigoUsuario = codigoUsuario;
    }

    public Mestre(String nomeJogador, int codJogador) {
        this.nomeMestre = nomeJogador;
        this.codigoMestre = codJogador;
    }
    
    public String getNomeMestre() {
        return nomeMestre;
    }

    public void setNomeMestre(String nomeMestre) {
        this.nomeMestre = nomeMestre;
    }

    public int getCodigoMestre() {
        return codigoMestre;
    }

    public void setCodigoMestre(int codigoMestre) {
        this.codigoMestre = codigoMestre;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
}
