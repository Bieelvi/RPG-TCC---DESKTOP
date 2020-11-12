package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.JogadorDAO;
import model.Jogador;

public class JogadorController {
    
    JogadorDAO jogadorDAO = new JogadorDAO();
    
    public boolean addJogador(String nomePerso, int codUsuario) throws SQLException{
        boolean passou = jogadorDAO.addPersonagem(nomePerso, codUsuario);
        return passou;
    }
    
    public ArrayList jogadoresBanco(int codUsuario) throws SQLException, ClassNotFoundException{
        ArrayList<Jogador> banco = jogadorDAO.puxandoPersonagens(codUsuario);
        return banco;
    }
    
    public boolean alteraNome(String nomeNovo, int codFicha) throws SQLException{
        boolean alterando = jogadorDAO.alteraNome(nomeNovo, codFicha);
        return alterando;
    }
    
    public String buscaNome(int codFicha) throws SQLException, ClassNotFoundException{
        String alterando = jogadorDAO.puxandoNome(codFicha);
        return alterando;
    }
}
