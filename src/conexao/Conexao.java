package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {    
       
        String driver = "com.mysql.cj.jdbc.Driver"; 
        String url = "jdbc:mysql://143.106.241.3:3306/cl19458";
        String usuario = "cl19458";
        String senha = "cl*10022000";
        
        try{
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, senha);
        } 
        catch (SQLException ex) {
            throw new RuntimeException("Erro de conexao", ex);
        }
    }
}