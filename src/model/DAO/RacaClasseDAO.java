package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Classe;
import model.Raca;

public class RacaClasseDAO {
    
    Connection con;
    
    public boolean passaRaca(String nome, float desloc) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO raca (nomeRaca, deslocamentoPersonagemRaca) values (?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setFloat(2, desloc);
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
    
    public boolean passaClasse(String nome) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO classe (nomeClasse) values (?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
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
    
    public ArrayList bancoRaca() throws SQLException{
        
        ResultSet rs;
        ArrayList<Raca> banco = new ArrayList();
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM raca";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                String nome = rs.getString("nomeRaca");
                float desloc = rs.getFloat("deslocamentoPersonagemRaca");
                
                Raca r = new Raca(nome, desloc);
                banco.add(r);
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
    
    public ArrayList bancoClasse() throws SQLException{
        
        ResultSet rs;
        ArrayList<Classe> banco = new ArrayList();
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM classe";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("nomeClasse");
                Classe c = new Classe(nome);
                banco.add(c);
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
