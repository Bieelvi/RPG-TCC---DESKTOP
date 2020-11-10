package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.FichaTop;

public class FichaDAO {
    
    Connection con;
    
    public boolean passaFicha(FichaTop f) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO ficha (nome, classe, raca, classeArm, vida, desloc, forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historiaPersonagem, equipamentos, caracteristicas, acrobacia, arcanismo, atletismo, atuacao, enganacao, furtividade, historia, intimidacao, intuicao, investigacao, lidarComAnimais, medicina, natureza, percepcao, persuacao, prestidigitacao, religiao, sobrevivencia, forcaPrest, destrezaPrest, constituicaoPrest, inteligenciaPrest, sabedoriaPrest, carismaPrest, vida1, vida2, vida3, morte1, morte2, morte3) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
            stmt.setString(22, f.getHistoria());
            stmt.setString(23, f.getEquipamentos());
            stmt.setString(24, f.getCaracteristicas());
            stmt.setBoolean(25, f.isAcrobacia());
            stmt.setBoolean(26, f.isArcanismo());
            stmt.setBoolean(27, f.isAtletismo());
            stmt.setBoolean(28, f.isAtuacao());
            stmt.setBoolean(29, f.isBlefar());
            stmt.setBoolean(30, f.isFurtividade());
            stmt.setBoolean(31, f.isHistoriaPerici());
            stmt.setBoolean(32, f.isIntimidacao());
            stmt.setBoolean(33, f.isIntuicao());
            stmt.setBoolean(34, f.isInvestigacao());
            stmt.setBoolean(35, f.isLidarAnimais());
            stmt.setBoolean(36, f.isMedicina());
            stmt.setBoolean(37, f.isNatureza());
            stmt.setBoolean(38, f.isPercepcao());
            stmt.setBoolean(39, f.isPersuacao());
            stmt.setBoolean(40, f.isPrestidigitacao());
            stmt.setBoolean(41, f.isReligiao());
            stmt.setBoolean(42, f.isSobreviencia());
            stmt.setBoolean(43, f.isForcaPrest());
            stmt.setBoolean(44, f.isDestrezaPrest());
            stmt.setBoolean(45, f.isConstituicaoPrest());
            stmt.setBoolean(46, f.isInteligenciaPrest());
            stmt.setBoolean(47, f.isSabedoriaPrest());
            stmt.setBoolean(48, f.isCarismaPrest());
            stmt.setBoolean(49, f.isVida1());
            stmt.setBoolean(50, f.isVida2());
            stmt.setBoolean(51, f.isVida3());
            stmt.setBoolean(52, f.isMorte1());
            stmt.setBoolean(53, f.isMorte2());
            stmt.setBoolean(54, f.isMorte3());
            
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
