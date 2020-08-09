package control;

import java.util.ArrayList;
import model.Classe;
import model.Raca;


public class RacaClasseRPG {
    
    private ArrayList <Classe> bancoDadosClasse;
    private ArrayList <Raca> bancoDadosRaca;
    
    //INSTANCIA O BANCO DE CLASSES COM ALGUMAS CLASSES COMO DEFAULT
    public ArrayList <Classe> classe() {
        bancoDadosClasse = new ArrayList();
        
        Classe c1 = new Classe("Bárbaro");
        Classe c2 = new Classe("Bardo");
        Classe c3 = new Classe("Bruxo");
        Classe c4 = new Classe("Clérigo");
        Classe c5 = new Classe("Druida");
        Classe c6 = new Classe("Feiticeiro");
        Classe c7 = new Classe("Guerreiro");
        Classe c8 = new Classe("Ladino");
        Classe c9 = new Classe("Mago");
        Classe c10 = new Classe("Monge");
        Classe c11 = new Classe("Paladino");
        Classe c12 = new Classe("Patrulheiro");
        
        bancoDadosClasse.add(c1);
        bancoDadosClasse.add(c2);
        bancoDadosClasse.add(c3);
        bancoDadosClasse.add(c4);
        bancoDadosClasse.add(c5);
        bancoDadosClasse.add(c6);
        bancoDadosClasse.add(c7);
        bancoDadosClasse.add(c8);
        bancoDadosClasse.add(c9);
        bancoDadosClasse.add(c10);
        bancoDadosClasse.add(c11);
        bancoDadosClasse.add(c12);
        
        return bancoDadosClasse;
    }
    
    //INSTANCIA O BANCO DE RAÇA COM ALGUMAS RAÇA COMO DEFAULT
    public ArrayList raca() {
        bancoDadosRaca = new ArrayList();
        
        Raca c1 = new Raca("Anão", (float) 7.5);
        Raca c2 = new Raca("Draconato", (float) 9.0);
        Raca c3 = new Raca("Elfo", (float) 9.0);
        Raca c4 = new Raca("Gnomo", (float) 7.5);
        Raca c5 = new Raca("Halfling", (float) 7.5);
        Raca c6 = new Raca("Humano", (float) 9.0);
        Raca c7 = new Raca("Meio Elfo", (float) 9.0);
        Raca c8 = new Raca("Meio Orc", (float) 9.0);
        Raca c9 = new Raca("Tiefling", (float) 9.0);
        
        bancoDadosRaca.add(c1);
        bancoDadosRaca.add(c2);
        bancoDadosRaca.add(c3);
        bancoDadosRaca.add(c4);
        bancoDadosRaca.add(c5);
        bancoDadosRaca.add(c6);
        bancoDadosRaca.add(c7);
        bancoDadosRaca.add(c8);
        bancoDadosRaca.add(c9);
        
        return bancoDadosRaca;
    }
    
    //INSTANCIA NOVAS CLASSES NO BANCO
    public boolean novaClasse(String nome){
        boolean veri = true;
        
        for(Classe c: bancoDadosClasse){
            if(c.getNome().equals(nome)){
                veri = false;
            }       
        }
        
        if(veri == true){
            Classe c = new Classe(nome);
        }
        
        return veri;
    }
    
    //INSTANCIA NOVAS RAÇAS NO BANCO
    public boolean novaRaca(String nome, int desloc){
        boolean veri = true;
        
        for(Raca c: bancoDadosRaca){
            if(c.getNome().equals(nome)){
                veri = false;
            }       
        }
        
        if(veri == true){
            Raca c = new Raca(nome, desloc);
        }
        
        return veri;
    }
}
