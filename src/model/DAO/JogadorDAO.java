package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Jogador;

public class JogadorDAO {
    
    Connection con;
            
    public boolean addPersonagem(String nome, int fkIdUsuario, int fkIdFicha) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO usuario (nomePersonagem, fk_idUsuario, fk_idFicha) values (?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, fkIdUsuario);
            stmt.setInt(3, fkIdFicha);
            stmt.execute();
            stmt.close();
            passou = true;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        return passou;
    }
    
    public ArrayList<Jogador> puxandoPersonagens() throws SQLException, ClassNotFoundException{
        
        ArrayList<Jogador> banco = new ArrayList();
        ResultSet rs;
        int i=0;
        
        try{
            
            con = new Conexao().getConnection();

            String sql = "SELECT * FROM jogador";

            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            System.out.println(i);
        
        
            while(rs.next()){
                i++;
            
                String nome = rs.getString("nome_jogador");
                int codJogador = rs.getInt("codigo_jogador");
                int codUsuario = rs.getInt("codigo_usuario");
                int codFicha;
                
                if(rs.getInt("codigo_ficha") > 0)
                    codFicha = rs.getInt("codigo_ficha");
                else
                    codFicha = 0;

                if(!nome.equals("") && codJogador > 0 && codUsuario > 0){
                    Jogador j = new Jogador(nome, codJogador, codFicha, codUsuario);
                    banco.add(j);
                    System.out.println(i + nome);
                }
            }
            
            stmt.close();
        }
        catch(NullPointerException ex){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>É aqui fi");
        }
        finally{
            con.close();
        }
        
        return banco;
    }

}
