package model;

public class ManipulaFicha {  
    
    Ficha ficha = new Ficha();
       
    //METODOS
    public int calculaModificador(int atributo){
        int modificacao;

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
                modificacao = -20;
                break;
        }
            return modificacao;
    }

    public int calculaPericia(boolean pericia, int modificador){
        int valorPerificias;
        
        if(pericia == true){
            valorPerificias = ficha.getBonusProficiencia() + modificador;
        } 
        else {
            valorPerificias = modificador;
        }
        
        return valorPerificias;
    }
    
    public void testeResistencia(){              
        String classe = ficha.getClasse();
        
        switch(classe){
            case "Barbaro":
                ficha.setsForca(true);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(true);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(false);
                break;
            case "Bardo":
                ficha.setsForca(false);
                ficha.setsDestreza(true);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(true);
                break; 
            case "Bruxo":
                ficha.setsForca(false);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(true);
                ficha.setsCarisma(true);
                break; 
            case "Clerigo":
                ficha.setsForca(false);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(true);
                ficha.setsCarisma(true);
                break;
            case "Druida":
                ficha.setsForca(false);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(true);
                ficha.setsSabedoria(true);
                ficha.setsCarisma(false);
                break;    
            case "Feiticeiro":
                ficha.setsForca(false);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(true);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(true);
                break;  
            case "Guerreiro":
                ficha.setsForca(true);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(true);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(false);
                break;
            case "Ladino":
                ficha.setsForca(false);
                ficha.setsDestreza(true);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(true);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(false);
                break;
            case "Mago":
                ficha.setsForca(false);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(true);
                ficha.setsSabedoria(true);
                ficha.setsCarisma(false);
                break;   
            case "Monge":
                ficha.setsForca(true);
                ficha.setsDestreza(true);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(false);
                break;
            case "Paladino":
                ficha.setsForca(false);
                ficha.setsDestreza(false);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(true);
                ficha.setsCarisma(true);
                break;
            case "Patrulheiro":
                ficha.setsForca(true);
                ficha.setsDestreza(true);
                ficha.setsConstituicao(false);
                ficha.setsInteligencia(false);
                ficha.setsSabedoria(false);
                ficha.setsCarisma(false);
                break;       
        }
    }
    
    public int calculaResistencia(boolean resistencia, int modificador){
        int valorResistencia;
        
        if(resistencia == true){
            valorResistencia = ficha.getBonusProficiencia() + modificador;
        }
        else {
            valorResistencia = modificador;
        }
        
        return valorResistencia;
    }
}