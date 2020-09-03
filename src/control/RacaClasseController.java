package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Classe;
import model.DAO.RacaClasseDAO;
import model.Raca;


public class RacaClasseController {
    
    RacaClasseDAO racaClasseDAO;

    public RacaClasseController() {
        racaClasseDAO = new RacaClasseDAO();
    }
    
    public ArrayList bancoRaca() throws SQLException{
        ArrayList<Raca> banco = racaClasseDAO.bancoRaca();
        return banco;
    }
    
    public ArrayList bancoClasse() throws SQLException{
        ArrayList<Classe> banco = racaClasseDAO.bancoClasse();
        return banco;
    }
    
    public ArrayList <Classe> classe() throws SQLException {
        ArrayList<Classe> banco = racaClasseDAO.bancoClasse();
        return banco;
    }
    
    //INSTANCIA O BANCO DE RAÇA COM ALGUMAS RAÇA COMO DEFAULT
    public ArrayList raca() throws SQLException {
        ArrayList<Raca> banco = racaClasseDAO.bancoRaca();
        return banco;
    }
    
    //INSTANCIA NOVAS CLASSES NO BANCO
    public boolean novaClasse(String nome) throws SQLException{
        
        ArrayList<Classe> banco = racaClasseDAO.bancoClasse();
        
        boolean veri = true;
        
        for(Classe c: banco){
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
    public boolean novaRaca(String nome, int desloc) throws SQLException{
        
        ArrayList<Raca> banco = racaClasseDAO.bancoRaca();
        boolean veri = true;
        
        for(Raca c: banco){
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
