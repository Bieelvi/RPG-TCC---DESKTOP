package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FichaMestre;

public class FichaMestreDAO {
    
    Connection con;
    
    public boolean passaFicha(FichaMestre fm, int codMestre) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO ficha (codigo_mestre, nome, classe, raca, classeArm, vida, desloc, forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historiaPersonagem, equipamentos, caracteristicas, vida1, vida2, vida3, morte1, morte2, morte3) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codMestre);
            stmt.setString(2, fm.getNome());
            stmt.setString(3, fm.getClasse());
            stmt.setString(4, fm.getRaca());
            stmt.setFloat(5, fm.getClasseArm());
            stmt.setFloat(6, fm.getVida());
            stmt.setFloat(7, fm.getDesloc());
            stmt.setFloat(8, fm.getForca());
            stmt.setFloat(9, fm.getDestreza());
            stmt.setFloat(10, fm.getConstituicao());
            stmt.setFloat(11, fm.getInteligencia());
            stmt.setFloat(12, fm.getSabedoria());
            stmt.setFloat(13, fm.getCarisma());
            stmt.setFloat(14, fm.getNivel());
            stmt.setString(15, fm.getTendencia());
            stmt.setString(16, fm.getNomeJoga());
            stmt.setFloat(17, fm.getPontosXP());
            stmt.setFloat(18, fm.getInspiracao());
            stmt.setFloat(19, fm.getBonusProficiencia());
            stmt.setFloat(20, fm.getOuro());
            stmt.setFloat(21, fm.getPrata());
            stmt.setFloat(22, fm.getPlatina());
            stmt.setString(23, fm.getHistoriaPersonagem());
            stmt.setString(24, fm.getEquipamentos());
            stmt.setString(25, fm.getCaracteristicas());
            stmt.setBoolean(26, fm.isVida1());
            stmt.setBoolean(27, fm.isVida2());
            stmt.setBoolean(28, fm.isVida3());
            stmt.setBoolean(29, fm.isMorte1());
            stmt.setBoolean(30, fm.isMorte2());
            stmt.setBoolean(31, fm.isMorte3());
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

    public boolean atualicao(FichaMestre f) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE ficha_mestre SET nome = ?, classe = ?, raca = ?, classeArm = ?, vida = ?, desloc = ?, forca = ?, destreza = ?, constituicao = ?, inteligencia = ?, sabedoria = ?, carisma = ?, nivel = ?, tendencia = ?, nomeJoga = ?, pontosXP = ?, inspiracao = ?, bonusProficiencia = ?, ouro = ?, prata = ?, platina = ?, historiaPersonagem = ?, equipamentos = ?, caracteristicas = ?, vida1 = ?, vida2 = ?, vida3 = ?, morte1 = ?, morte2 = ?, morte3 = ? where codigo_ficha_mestre = " + f.getCodFichaMestre() + ";";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getClasse());
            stmt.setString(3, f.getRaca());
            stmt.setFloat(4, f.getClasseArm());
            stmt.setFloat(5, f.getVida());
            stmt.setFloat(6, f.getDesloc());
            stmt.setFloat(7, f.getForca());
            stmt.setFloat(8, f.getDestreza());
            stmt.setFloat(9, f.getConstituicao());
            stmt.setFloat(10, f.getInteligencia());
            stmt.setFloat(11, f.getSabedoria());
            stmt.setFloat(12, f.getCarisma());
            stmt.setFloat(13, f.getNivel());
            stmt.setString(14, f.getTendencia());
            stmt.setString(15, f.getNomeJoga());
            stmt.setFloat(16, f.getPontosXP());
            stmt.setFloat(17, f.getInspiracao());
            stmt.setFloat(18, f.getBonusProficiencia());
            stmt.setFloat(19, f.getOuro());
            stmt.setFloat(20, f.getPrata());
            stmt.setFloat(21, f.getPlatina());
            stmt.setString(22, f.getHistoriaPersonagem());
            stmt.setString(23, f.getEquipamentos());
            stmt.setString(24, f.getCaracteristicas());
            stmt.setBoolean(25, f.isVida1());
            stmt.setBoolean(26, f.isVida2());
            stmt.setBoolean(27, f.isVida3());
            stmt.setBoolean(28, f.isMorte1());
            stmt.setBoolean(29, f.isMorte2());
            stmt.setBoolean(30, f.isMorte3());
            
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
    
    public ArrayList<FichaMestre> puxandoFichasDoMestre(int codMestre) throws SQLException, ClassNotFoundException{
        
        ArrayList<FichaMestre> banco = new ArrayList();
        ResultSet rs;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM ficha_mestre where codigo_mestre like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codMestre);
            rs = stmt.executeQuery();
        
            while(rs.next()){
            
                int cod = rs.getInt("codigo_ficha_mestre");
                    String nome = rs.getString("nome"); 
                    String classe = rs.getString("classe");
                    String raca = rs.getString("raca");
                    float classeArm = rs.getFloat("classeArm");
                    float vida = rs.getFloat("vida");
                    float desloc = rs.getFloat("desloc");
                    float forca = rs.getFloat("forca");
                    float destreza = rs.getFloat("destreza");
                    float constituicao = rs.getFloat("constituicao");
                    float inteligencia = rs.getFloat("inteligencia");
                    float sabedoria = rs.getFloat("sabedoria");
                    float carisma = rs.getFloat("carisma");
                    float nivel = rs.getFloat("nivel");
                    String tendencia = rs.getString("tendencia");
                    String nomeJoga = rs.getString("nomeJoga");
                    float pontosXP = rs.getFloat("pontosXP");
                    float inspiracao = rs.getFloat("inspiracao");
                    float bonusProficiencia = rs.getFloat("bonusProficiencia");
                    float ouro = rs.getFloat("ouro");
                    float prata = rs.getFloat("prata");
                    float platina = rs.getFloat("platina");
                    String historiaPersonagem = rs.getString("historiaPersonagem");
                    String equipamentos = rs.getString("equipamentos");
                    String caracteristicas = rs.getString("caracteristicas");
                    boolean vida1 = rs.getBoolean("vida1");
                    boolean vida2 = rs.getBoolean("vida2");
                    boolean vida3 = rs.getBoolean("vida3");
                    boolean morte1 = rs.getBoolean("morte1");
                    boolean morte2 = rs.getBoolean("morte2");
                    boolean morte3 = rs.getBoolean("morte3");

                if(!nome.equals("") && cod > 0){
                    FichaMestre fm = new FichaMestre(cod, nome, classe, raca, classeArm, vida, desloc, forca, inteligencia, destreza, sabedoria, constituicao, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historiaPersonagem, equipamentos, caracteristicas, vida1, vida2, vida3, morte1, morte2, morte3);
                    banco.add(fm);
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
    
    public FichaMestre puxandoDadosDaFichaDoMestre(int codFichaMestre) throws SQLException, ClassNotFoundException{
        
        FichaMestre banco = null;
        ResultSet rs;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM ficha_mestre where codigo_ficha_mestre like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codFichaMestre);
            rs = stmt.executeQuery();
        
            while(rs.next()){
                int cod = rs.getInt("codigo_ficha_mestre");
                    String nome = rs.getString("nome"); 
                    String classe = rs.getString("classe");
                    String raca = rs.getString("raca");
                    float classeArm = rs.getFloat("classeArm");
                    float vida = rs.getFloat("vida");
                    float desloc = rs.getFloat("desloc");
                    float forca = rs.getFloat("forca");
                    float destreza = rs.getFloat("destreza");
                    float constituicao = rs.getFloat("constituicao");
                    float inteligencia = rs.getFloat("inteligencia");
                    float sabedoria = rs.getFloat("sabedoria");
                    float carisma = rs.getFloat("carisma");
                    float nivel = rs.getFloat("nivel");
                    String tendencia = rs.getString("tendencia");
                    String nomeJoga = rs.getString("nomeJoga");
                    float pontosXP = rs.getFloat("pontosXP");
                    float inspiracao = rs.getFloat("inspiracao");
                    float bonusProficiencia = rs.getFloat("bonusProficiencia");
                    float ouro = rs.getFloat("ouro");
                    float prata = rs.getFloat("prata");
                    float platina = rs.getFloat("platina");
                    String historiaPersonagem = rs.getString("historiaPersonagem");
                    String equipamentos = rs.getString("equipamentos");
                    String caracteristicas = rs.getString("caracteristicas");
                    boolean vida1 = rs.getBoolean("vida1");
                    boolean vida2 = rs.getBoolean("vida2");
                    boolean vida3 = rs.getBoolean("vida3");
                    boolean morte1 = rs.getBoolean("morte1");
                    boolean morte2 = rs.getBoolean("morte2");
                    boolean morte3 = rs.getBoolean("morte3");

                if(!nome.equals("") && cod > 0)
                    banco = new FichaMestre(cod, nome, classe, raca, classeArm, vida, desloc, forca, inteligencia, destreza, sabedoria, constituicao, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historiaPersonagem, equipamentos, caracteristicas, vida1, vida2, vida3, morte1, morte2, morte3);
            
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
    
    public boolean alteraNome(String nomeNovo, int codFicha) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE ficha_mestre SET nome = ? WHERE codigo_ficha_mestre = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nomeNovo);
            stmt.setInt(2, codFicha);
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
    
    public String puxandoNome(int codFichaMestre) throws SQLException {
        String nome = null;
        ResultSet rs;
        
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM ficha_mestre where codigo_ficha_mestre like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codFichaMestre);
            rs = stmt.executeQuery();
        
            while(rs.next()){
            
                String nomeMestre = rs.getString("nome");
                nome = nomeMestre;
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
        return nome;
    }
}
