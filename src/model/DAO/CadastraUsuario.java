package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class CadastraUsuario {
    
    MessageDigest m = MessageDigest.getInstance("MD5");
    Connection con = null;
    BigInteger password1 = new BigInteger(1, m.digest());

    public CadastraUsuario() throws NoSuchAlgorithmException{
    }
            
    public boolean passaUsuario(String usuario, String email, String password) throws SQLException{
        
        boolean passou = false;
        
        try{
            m.update(password.getBytes(), 0, password.length());
            password = String.format("%1$032X", password1);
            
            con = new Conexao().getConnection();
            String sql = "INSERT INTO usuario (nomeUsuario, senhaUsuario, emailUsuario, hierarquiaUsuario) values (?, ?, ?, 0);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, password);
            stmt.setString(3, email);
            stmt.execute();
            stmt.close();
            passou = true;
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        return passou;
    }
}
