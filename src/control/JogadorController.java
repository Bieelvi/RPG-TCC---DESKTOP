package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.JogadorDAO;
import model.Jogador;

public class JogadorController {
    
    JogadorDAO jogadorDAO = new JogadorDAO();
    
    public ArrayList jogadoresBanco(int codUsuario) throws SQLException, ClassNotFoundException{
        ArrayList<Jogador> banco = jogadorDAO.puxandoPersonagens();
        ArrayList<Jogador> filtro = new ArrayList();
        int i = 1;
        int k = 1;
        System.out.println("-0-0-0-0-0-0-0-0-0-");
        for(Jogador j: banco){
            System.out.println(i);
            if(codUsuario == j.getCodigoUsuario()){
                System.out.println(i + " -0-0-> " + k);
                filtro.add(j);
                k++;
            }
            i++;
        }
        return filtro;
    }
    
}
