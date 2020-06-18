package model;
public class Raca {

    public Raca(String nome, float deslocPersonagem) {
        this.nome = nome;
        this.deslocPersonagem = deslocPersonagem;
    }
    
    private String nome;
    private float deslocPersonagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDeslocPersonagem() {
        return deslocPersonagem;
    }

    public void setDeslocPersonagem(float deslocPersonagem) {
        this.deslocPersonagem = deslocPersonagem;
    }
    
}
