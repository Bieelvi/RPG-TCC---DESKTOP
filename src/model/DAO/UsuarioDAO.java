package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioDAO {
    
    Connection con;
            
    public boolean passaUsuario(String usuario, String email, String password) throws SQLException{
        boolean passou = false;
        
        try{
            
            con = new Conexao().getConnection();
            String sql = "INSERT INTO usuario (nomeUsuario, senhaUsuario, emailUsuario, hierarquiaUsuario) values (?, ?, ?, 0);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, password);
            stmt.setString(3, email);
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
    
    public ArrayList banco() throws SQLException{
        
        ResultSet rs;
        ArrayList<Usuario> banco = new ArrayList();
        
        try{
            
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String nome = rs.getString("nomeUsuario");
                String email = rs.getString("emailUsuario");
                String senha = rs.getString("senhaUsuario");
                int hierarquia = rs.getInt("hierarquiaUsuario");
                
                Usuario u = new Usuario(nome, email, senha, hierarquia);
                banco.add(u);
                
            }
            
            stmt.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        
        return banco;
    }
}
