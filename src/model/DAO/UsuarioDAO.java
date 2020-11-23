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
            String sql = "INSERT INTO usuario (nome_usuario, senha_usuario, email_usuario, hierarquia) values (?, ?, ?, 0);";
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
                int cod = rs.getInt("codigo_usuario");
                String nome = rs.getString("nome_usuario");
                String email = rs.getString("email_usuario");
                String senha = rs.getString("senha_usuario");
                int hierarquia = rs.getInt("hierarquia");
                
                Usuario u = new Usuario(cod, nome, email, senha, hierarquia);
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
    
    public int procuraCodUsuario(String email) throws SQLException{
        
        ResultSet rs;
        int codigo = -1;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String emailUsuario = rs.getString("email_usuario");
                int codigoUsuario = rs.getInt("codigo_usuario");
                if(emailUsuario.equals(email)){
                    codigo = codigoUsuario;
                }
            }
            
            stmt.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        
        return codigo;
    }
    
    public String procuraEmail(int codigo) throws SQLException{
        
        ResultSet rs;
        String email = "";
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String emailUsuario = rs.getString("email_usuario");
                int codigoUsuario = rs.getInt("codigo_usuario");
                
                if(codigoUsuario == codigo){
                    email = emailUsuario;
                }
            }
            
            stmt.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        
        return email;
    }
    
    public String procuraNome(int codUsuario) throws SQLException{
        
        ResultSet rs;
        String nome = null;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM usuario WHERE codigo_usuario = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codUsuario);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String nomeUsuario = rs.getString("email_usuario");
                
                nome = nomeUsuario;
            }
            
            stmt.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        return nome;
    }
    
    public boolean exclui(int cod) throws SQLException{
        
        boolean del = false;
        
        try{
            
            con = new Conexao().getConnection();
            String sql = "DELETE FROM `cl19458`.`usuario` WHERE (`codigo_usuario` = ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            stmt.execute();
            stmt.close();
            del = true;
        }
        catch(Exception ex){
            System.out.println(ex);
            del = false;
        }
        finally {
            con.close();
        }
        
        return del;
    }
}
