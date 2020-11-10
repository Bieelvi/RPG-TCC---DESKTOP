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
            
    public boolean addPersonagem(String nomePerso, int codUsuario) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO jogador (codigo_usuario, codigo_ficha, nome_jogador) values (?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codUsuario);
            stmt.setInt(2, 0);
            stmt.setString(3, nomePerso);
            stmt.execute();
            stmt.close();
            passou = true;
        }
        catch(Exception ex){
            System.out.println(ex);
            passou = false;
        }
        finally {
            con.close();
        }
        return passou;
    }
    
    public ArrayList<Jogador> puxandoPersonagens() throws SQLException, ClassNotFoundException{
        
        ArrayList<Jogador> banco = new ArrayList();
        ResultSet rs;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM jogador";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
        
            while(rs.next()){
            
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
                }
            }
            
            stmt.close();
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            con.close();
        }
        
        return banco;
    }

}
