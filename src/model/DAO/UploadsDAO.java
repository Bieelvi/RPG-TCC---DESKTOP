package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Imagem;

public class UploadsDAO {
    
    Connection con;
            
    public boolean passaImagem(String nome, byte[] foto, int codMestre) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO imagem (codigo_mestre, nome_imagem, conteudo_imagem) values (?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codMestre);
            stmt.setString(2, nome);
            stmt.setBytes(3, foto);
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
    
    public ArrayList passaBanco(int codigoMestre) throws SQLException{
        ArrayList banco = new ArrayList();
        ResultSet rs;
        
        try{
            con = new Conexao().getConnection();
            String sql = "Select * from imagem where codigo_mestre = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigoMestre);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int codImagem = rs.getInt("codigo_imagem");
                int codMestre = rs.getInt("codigo_mestre");
                String nomeImagem = rs.getString("nome_imagem");
                byte[] conteudo = rs.getBytes("conteudo_imagem");
                
                Imagem i = new Imagem(codImagem, codMestre, nomeImagem, conteudo);
                banco.add(i);
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
