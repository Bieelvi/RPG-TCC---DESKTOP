package model.ClasseRPG;

import model.Ficha;
import model.ManipulaFicha;

public class Barbaro extends ClassePadrao{  
    
    ManipulaFicha manipulaFicha;

    @Override
    public void criaPersonagens() {
        Ficha ficha = new Ficha();
        
        ficha.setForca(15);
        ficha.setConstituicao(14);
        ficha.setDestreza(13);
        ficha.setInteligencia(8);
        ficha.setSabedoria(12);
        ficha.setCarisma(10);
        
        manipulaFicha.calculaModificador(0);
        manipulaFicha.calculaPericia(true, 0);
        manipulaFicha.calculaResistencia(true, 0);
        manipulaFicha.testeResistencia();
    }
    
}
