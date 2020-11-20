package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.MestreDAO;
import model.Mestre;

public class MestreController {
    
    MestreDAO mestreDAO = new MestreDAO();
    
    public boolean addMestre(String nomeMestre, int codUsuario) throws SQLException{
        boolean passou = mestreDAO.addMestre(nomeMestre, codUsuario);
        return passou;
    }
    
    public ArrayList mestreBanco(int codUsuario) throws SQLException, ClassNotFoundException{
        ArrayList<Mestre> banco = mestreDAO.puxandoMestre(codUsuario);
        return banco;
    }
    
    public boolean alteraNome(String nomeNovo, int codFicha) throws SQLException{
        boolean alterando = mestreDAO.alteraNomeMestre(nomeNovo, codFicha);
        return alterando;
    }
}
