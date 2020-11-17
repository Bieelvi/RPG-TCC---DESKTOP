package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Ficha;
import model.DAO.FichaMestreDAO;
import model.FichaMestre;

public class FichaMestreController {
    
    FichaMestreDAO fichaMestreDAO = new FichaMestreDAO();
        
    public boolean cadastraFicha(Ficha f, int codUsuario) throws SQLException{
        boolean cadastro;
        cadastro = fichaMestreDAO.passaFicha(f, codUsuario);
        return cadastro;
    }
    
    public ArrayList convertRadio(boolean acrobacia, boolean arcanismo, boolean atletismo, boolean atuacao, boolean blefar, boolean furtividade, boolean historiaPerici, boolean intimidacao, boolean investigacao, boolean natureza, boolean percepcao, boolean persuacao, boolean prestidigitacao, boolean religiao, boolean sobreviencia, boolean forcaPrest, boolean destrezaPrest, boolean acrobaciaPrest, boolean constituicaoPrest, boolean inteligenciaPrest, boolean sabedoriaPrest, boolean carismaPrest, boolean vida1, boolean vida2, boolean vida3, boolean morte1, boolean morte2, boolean morte3, boolean intuicao, boolean medicina){
        
        ArrayList conjunto = new ArrayList();
        
        conjunto.add(acrobacia);
        conjunto.add(arcanismo);
        conjunto.add(atletismo);
        conjunto.add(atuacao);
        conjunto.add(blefar);
        conjunto.add(furtividade);
        conjunto.add(historiaPerici);
        conjunto.add(intimidacao);
        conjunto.add(investigacao);
        conjunto.add(natureza);
        conjunto.add(percepcao);
        conjunto.add(persuacao);
        conjunto.add(prestidigitacao);
        conjunto.add(religiao);
        conjunto.add(sobreviencia);
        conjunto.add(forcaPrest);
        conjunto.add(destrezaPrest);
        conjunto.add(acrobaciaPrest);
        conjunto.add(constituicaoPrest);
        conjunto.add(inteligenciaPrest);
        conjunto.add(sabedoriaPrest);
        conjunto.add(carismaPrest);
        conjunto.add(vida1);
        conjunto.add(vida2);
        conjunto.add(vida3);
        conjunto.add(morte1);
        conjunto.add(morte2);
        conjunto.add(morte3);
        conjunto.add(intuicao);
        conjunto.add(medicina);
        
        return conjunto;
    }
    
    public boolean atualizacao(Ficha f, int codFicha) throws SQLException{
        boolean atualizando = fichaMestreDAO.atualicao(f, codFicha);
        return atualizando;
    }
    
    public Ficha compactando(String nome, String classe, String raca, float classeArm, float vida, float desloc, float forca, float inteligencia, float destreza, float sabedoria, float constituicao, float carisma, float nivel, String tendencia, String nomeJoga, float pontosXP, float inspiracao, float bonusProficiencia, float ouro, float prata, float platina, String historia, String equipamentos, String caracteristicas, ArrayList radios){
        int i = 0;
        
        boolean acrobacia = false; 
        boolean arcanismo = false; 
        boolean atletismo = false; 
        boolean atuacao = false; 
        boolean blefar = false;
        boolean furtividade = false;
        boolean historiaPerici = false;
        boolean intimidacao = false;
        boolean investigacao = false;
        boolean natureza = false;
        boolean percepcao = false;
        boolean persuacao = false;
        boolean prestidigitacao = false;
        boolean religiao = false;
        boolean sobreviencia = false;
        boolean forcaPrest = false;
        boolean destrezaPrest = false;
        boolean acrobaciaPrest = false;
        boolean constituicaoPrest = false;
        boolean inteligenciaPrest = false;
        boolean sabedoriaPrest = false;
        boolean carismaPrest = false;
        boolean vida1 = false;
        boolean vida2 = false;
        boolean vida3 = false;
        boolean morte1 = false;
        boolean morte2 = false;
        boolean morte3 = false;
        boolean intuicao = false;
        boolean medicina = false;
        
        for(Object r: radios){
            switch(i){
                case 0:
                    acrobacia = (boolean) r;
                break;
                case 1:
                    arcanismo = (boolean) r;
                break;
                case 2:
                    atletismo = (boolean) r;
                break;
                case 3:
                    atuacao = (boolean) r;
                break;
                case 4:
                    blefar = (boolean) r;
                break;
                case 5:
                    furtividade = (boolean) r;
                break;
                case 6:
                    historiaPerici = (boolean) r;
                break;
                case 7:
                    intimidacao = (boolean) r;
                break;
                case 8:
                    investigacao = (boolean) r;
                break;
                case 9:
                    natureza = (boolean) r;
                break;
                case 10:
                    percepcao = (boolean) r;
                break;
                case 11:
                    persuacao = (boolean) r;
                break;
                case 12:
                    prestidigitacao = (boolean) r;
                break;
                case 13:
                    religiao = (boolean) r;
                break;
                case 14:
                    sobreviencia = (boolean) r;
                break;
                case 15:
                    forcaPrest = (boolean) r;
                break;
                case 16:
                    destrezaPrest = (boolean) r;
                break;
                case 17:
                    acrobaciaPrest = (boolean) r;
                break;
                case 18:
                    constituicaoPrest = (boolean) r;
                break;
                case 19:
                    inteligenciaPrest = (boolean) r;
                break;
                case 20:
                    sabedoriaPrest = (boolean) r;
                break;
                case 21:
                    carismaPrest = (boolean) r;
                break;
                case 22:
                    vida1 = (boolean) r;
                break;
                case 23:
                    vida2 = (boolean) r;
                break;
                case 24:
                    vida3 = (boolean) r;
                break;
                case 25:
                    morte1 = (boolean) r;
                break;
                case 26:
                    morte2 = (boolean) r;
                break;
                case 27:
                    morte3 = (boolean) r;
                break;
                case 28:
                    intuicao = (boolean) r;
                break;
                case 29:
                    medicina  = (boolean) r;
                break;
            }
            i++;
        }
        
        Ficha f = new Ficha(nome, classe, raca, classeArm, vida, desloc, forca, inteligencia, destreza, sabedoria, constituicao, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historia, equipamentos, caracteristicas, acrobacia, arcanismo, atletismo, atuacao, blefar, furtividade, historiaPerici, intimidacao, investigacao, natureza, percepcao, persuacao, prestidigitacao, religiao, sobreviencia, forcaPrest, destrezaPrest, acrobaciaPrest, constituicaoPrest, inteligenciaPrest, sabedoriaPrest, carismaPrest, vida1, vida2, vida3, morte1, morte2, morte3, intuicao, medicina);
        
        return f;
    }
    
    public ArrayList<FichaMestre> puxaFichas(int codigoMestre) throws SQLException{
        ArrayList<FichaMestre> fichaBanco = fichaMestreDAO.puxaFichas(codigoMestre);
        return fichaBanco;
    }
    
    public boolean alteraNome(String nomeNovo, int codFicha) throws SQLException{
        boolean alterando = fichaMestreDAO.alteraNome(nomeNovo, codFicha);
        return alterando;
    }
}