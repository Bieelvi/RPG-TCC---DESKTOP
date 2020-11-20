package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.FichaMestreDAO;
import model.FichaMestre;

public class FichaMestreController {
    
    FichaMestreDAO fichaMestreDAO = new FichaMestreDAO();
        
    public int cadastraFicha(FichaMestre fm, int codMestre) throws SQLException{
        int cf = fichaMestreDAO.passaFicha(fm, codMestre);
        return cf;
    }
    public boolean atualizacao(FichaMestre f) throws SQLException{
        boolean atualizando = fichaMestreDAO.atualicao(f);
        return atualizando;
    }
    
    public FichaMestre compactando(int codFichaMestre, String nome, String classe, String raca, float classeArm, float vida, float desloc, float forca, float inteligencia, float destreza, float sabedoria, float constituicao, float carisma, float nivel, String tendencia, String nomeJoga, float pontosXP, float inspiracao, float bonusProficiencia, float ouro, float prata, float platina, String historia, String equipamentos, String caracteristicas, boolean vida1, boolean vida2, boolean vida3, boolean morte1, boolean morte2, boolean morte3){
        FichaMestre f = new FichaMestre(codFichaMestre, nome, classe, raca, classeArm, vida, desloc, forca, inteligencia, destreza, sabedoria, constituicao, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historia, equipamentos, caracteristicas, vida1, vida2, vida3, morte1, morte2, morte3);
        return f;
    }
    
    public ArrayList<FichaMestre> puxaFichas(int codigoMestre) throws SQLException, ClassNotFoundException{
        ArrayList<FichaMestre> fichaBanco = fichaMestreDAO.puxandoFichasDoMestre(codigoMestre);
        return fichaBanco;
    }
    
    public FichaMestre puxaDados(int codigoFichaMestre) throws SQLException, ClassNotFoundException{
        FichaMestre fichaBanco = fichaMestreDAO.puxandoDadosDaFichaDoMestre(codigoFichaMestre);
        return fichaBanco;
    }
    
    public boolean alteraNome(String nomeNovo, int codFicha) throws SQLException{
        boolean alterando = fichaMestreDAO.alteraNome(nomeNovo, codFicha);
        return alterando;
    }
    
    public int calculaModificador(int atributo){
        int modificacao = 0;

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
                if (atributo > 20 || atributo < 0)
                    throw new RuntimeException("Numero invalido, menor que 0 ou maior que 20");
            break;
        }
        return modificacao;
    }
    
    public ArrayList testeResistencia(String classe, boolean forcaPrest, boolean destrezaPrest, boolean constituicaoPrest, boolean inteligenciaPrest, boolean sabedoriaPrest, boolean carismaPrest){
        ArrayList prest = new ArrayList();
        
        switch(classe){
            case "Barbaro":
                forcaPrest = true;
                destrezaPrest = false;
                constituicaoPrest = true;
                inteligenciaPrest = false;
                sabedoriaPrest = false;
                carismaPrest = false;
            break;
            case "Bardo":
                forcaPrest = false;
                destrezaPrest = true;
                constituicaoPrest = false;
                inteligenciaPrest = false;
                sabedoriaPrest = false;
                carismaPrest = true;
            break; 
            case "Bruxo":
                forcaPrest = false;
                destrezaPrest = false;
                constituicaoPrest = false;
                inteligenciaPrest = false;
                sabedoriaPrest = true;
                carismaPrest = true;
                break; 
            case "Clerigo":
                forcaPrest = false;
                destrezaPrest = false;
                constituicaoPrest = false;
                inteligenciaPrest = false;
                sabedoriaPrest = true;
                carismaPrest = true;
            break;
            case "Druida":
                forcaPrest = false;
                destrezaPrest = false;
                constituicaoPrest = false;
                inteligenciaPrest = true;
                sabedoriaPrest = true;
                carismaPrest = false;
            break;    
            case "Feiticeiro":
                forcaPrest = false;
                destrezaPrest = false;
                constituicaoPrest = true;
                inteligenciaPrest = false;
                sabedoriaPrest = false;
                carismaPrest = true;
            break;  
            case "Guerreiro":
                forcaPrest = true;
                destrezaPrest = false;
                constituicaoPrest = true;
                inteligenciaPrest = false;
                sabedoriaPrest = false;
                carismaPrest = false;
            break;
            case "Ladino":
                forcaPrest = false;
                destrezaPrest = true;
                constituicaoPrest = false;
                inteligenciaPrest = true;
                sabedoriaPrest = false;
                carismaPrest = false;
            break;
            case "Mago":
                forcaPrest = false;
                destrezaPrest = false;
                constituicaoPrest = false;
                inteligenciaPrest = true;
                sabedoriaPrest = true;
                carismaPrest = false;
            break;   
            case "Monge":
                forcaPrest = true;
                destrezaPrest = true;
                constituicaoPrest = false;
                inteligenciaPrest = false;
                sabedoriaPrest = false;
                carismaPrest = false;
            break;
            case "Paladino":
                forcaPrest = false;
                destrezaPrest = false;
                constituicaoPrest = false;
                inteligenciaPrest = false;
                sabedoriaPrest = true;
                carismaPrest = true;
            break;
            case "Patrulheiro":
                forcaPrest = true;
                destrezaPrest = true;
                constituicaoPrest = false;
                inteligenciaPrest = false;
                sabedoriaPrest = false;
                carismaPrest = false;
            break;       
        }
        
        prest.add(forcaPrest);
        prest.add(destrezaPrest);
        prest.add(constituicaoPrest);
        prest.add(inteligenciaPrest);
        prest.add(sabedoriaPrest);
        prest.add(carismaPrest);
        
        return prest;
    }
    
    public String buscaNome(int codMestre) throws SQLException, ClassNotFoundException{
        String alterando = fichaMestreDAO.puxandoNome(codMestre);
        return alterando;
    }
}