package model;
public class Usuario {

    public Usuario(String nomeUsuario, String emailUsuario, String senhaUsuario, int hierarquiaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.hierarquiaUsuario = hierarquiaUsuario;
    }

    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private int hierarquiaUsuario;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public int getHierarquiaUsuario() {
        return hierarquiaUsuario;
    }

    public void setHierarquiaUsuario(int hierarquiaUsuario) {
        this.hierarquiaUsuario = hierarquiaUsuario;
    }
    
}