package model;

public class Jogador {
    
    private String nomeJogador;
    private int codigoJogador;
    private int codigoFicha;
    private int codigoUsuario;

    public Jogador(String nomeJogador, int codigoJogador, int codigoFicha, int codigoUsuario) {
        this.nomeJogador = nomeJogador;
        this.codigoJogador = codigoJogador;
        this.codigoFicha = codigoFicha;
        this.codigoUsuario = codigoUsuario;
    }

    public Jogador(String nomeJogador, int codJogador, int codFicha) {
        this.nomeJogador = nomeJogador;
        this.codigoJogador = codJogador;
        this.codigoFicha = codFicha;
    }

    public Jogador(String nomeJogador, int codJogador) {
        this.nomeJogador = nomeJogador;
        this.codigoJogador = codJogador;
        this.codigoFicha = 0;
    }
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getCodigoJogador() {
        return codigoJogador;
    }

    public void setCodigoJogador(int codigoJogador) {
        this.codigoJogador = codigoJogador;
    }

    public int getCodigoFicha() {
        return codigoFicha;
    }

    public void setCodigoFicha(int codigoFicha) {
        this.codigoFicha = codigoFicha;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
}
