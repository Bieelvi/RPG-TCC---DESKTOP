package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Mestre;

public class MestreDAO {
    
    Connection con;
    
    public boolean addMestre(String nomeMestre, int codUsuario) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO mestre (codigo_usuario, nome_mestre) values (?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codUsuario);
            stmt.setString(2, nomeMestre);
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
    
    public ArrayList<Mestre> puxandoMestre(int codUsuario) throws SQLException, ClassNotFoundException{
        
        ArrayList<Mestre> banco = new ArrayList();
        ResultSet rs;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM mestre where codigo_usuario like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codUsuario);
            rs = stmt.executeQuery();
        
            while(rs.next()){
            
                String nomeMestre = rs.getString("nome_mestre");
                int codMestre = rs.getInt("codigo_mestre");

                if(!nomeMestre.equals("") && codMestre > 0){
                    Mestre j = new Mestre(nomeMestre, codMestre, codUsuario);
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
    
    public boolean alteraNomeMestre(String nomeNovo, int codMestre) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE mestre SET nome_mestre = ? WHERE codigo_mestre = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nomeNovo);
            stmt.setInt(2, codMestre);
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
    
}
