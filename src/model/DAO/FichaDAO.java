package model.DAO;
//Ficha
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Ficha;

public class FichaDAO {
    
    Connection con;
    JogadorDAO jogadorDAO;
    
    public boolean passaFicha(Ficha f, int codUsuario) throws SQLException{
        jogadorDAO = new JogadorDAO();
        boolean passou = false;
        ResultSet rs;
        int i = 0;
        
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO ficha (nome, classe, raca, classeArm, vida, desloc, forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historiaPersonagem, equipamentos, caracteristicas, acrobacia, arcanismo, atletismo, atuacao, enganacao, furtividade, historia, intimidacao, intuicao, investigacao, lidarComAnimais, medicina, natureza, percepcao, persuasao, prestidigitacao, religiao, sobrevivencia, forcaPrest, destrezaPrest, constituicaoPrest, inteligenciaPrest, sabedoriaPrest, carismaPrest, vida1, vida2, vida3, morte1, morte2, morte3) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
            stmt.setBoolean(25, f.isAcrobacia());
            stmt.setBoolean(26, f.isArcanismo());
            stmt.setBoolean(27, f.isAtletismo());
            stmt.setBoolean(28, f.isAtuacao());
            stmt.setBoolean(29, f.isBlefar());
            stmt.setBoolean(30, f.isFurtividade());
            stmt.setBoolean(31, f.isHistoria());
            stmt.setBoolean(32, f.isIntimidacao());
            stmt.setBoolean(33, f.isIntuicao());
            stmt.setBoolean(34, f.isInvestigacao());
            stmt.setBoolean(35, f.isLidarComAnimais());
            stmt.setBoolean(36, f.isMedicina());
            stmt.setBoolean(37, f.isNatureza());
            stmt.setBoolean(38, f.isPercepcao());
            stmt.setBoolean(39, f.isPersuasao());
            stmt.setBoolean(40, f.isPrestidigitacao());
            stmt.setBoolean(41, f.isReligiao());
            stmt.setBoolean(42, f.isSobrevivencia());
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
            
            sql = "Select * from ficha order by codigo_ficha desc";
            stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            int codFicha = 0;
            
            while(rs.next() && i == 0){
                i++;
                codFicha = rs.getInt("codigo_ficha");
            }
            
            stmt.close();
            passou = jogadorDAO.updateCodFicha(codUsuario, codFicha);;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally {
            con.close();
        }
        return passou;
    }
    
    
    public boolean atualicao(Ficha f, int codFicha) throws SQLException{
        boolean passou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE ficha SET nome = ?, classe = ?, raca = ?, classeArm = ?, vida = ?, desloc = ?, forca = ?, destreza = ?, constituicao = ?, inteligencia = ?, sabedoria = ?, carisma = ?, nivel = ?, tendencia = ?, nomeJoga = ?, pontosXP = ?, inspiracao = ?, bonusProficiencia = ?, ouro = ?, prata = ?, platina = ?, historiaPersonagem = ?, equipamentos = ?, caracteristicas = ?, acrobacia = ?, arcanismo = ?, atletismo = ?, atuacao = ?, enganacao = ?, furtividade = ?, historia = ?, intimidacao = ?, intuicao = ?, investigacao = ?, lidarComAnimais = ?, medicina = ?, natureza = ?, percepcao = ?, persuasao = ?, prestidigitacao = ?, religiao = ?, sobrevivencia = ?, forcaPrest = ?, destrezaPrest = ?, constituicaoPrest = ?, inteligenciaPrest = ?, sabedoriaPrest = ?, carismaPrest = ?, vida1 = ?, vida2 = ?, vida3 = ?, morte1 = ?, morte2 = ?, morte3 = ? where codigo_ficha = " + codFicha + ";";
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
            stmt.setBoolean(25, f.isAcrobacia());
            stmt.setBoolean(26, f.isArcanismo());
            stmt.setBoolean(27, f.isAtletismo());
            stmt.setBoolean(28, f.isAtuacao());
            stmt.setBoolean(29, f.isBlefar());
            stmt.setBoolean(30, f.isFurtividade());
            stmt.setBoolean(31, f.isHistoria());
            stmt.setBoolean(32, f.isIntimidacao());
            stmt.setBoolean(33, f.isIntuicao());
            stmt.setBoolean(34, f.isInvestigacao());
            stmt.setBoolean(35, f.isLidarComAnimais());
            stmt.setBoolean(36, f.isMedicina());
            stmt.setBoolean(37, f.isNatureza());
            stmt.setBoolean(38, f.isPercepcao());
            stmt.setBoolean(39, f.isPersuasao());
            stmt.setBoolean(40, f.isPrestidigitacao());
            stmt.setBoolean(41, f.isReligiao());
            stmt.setBoolean(42, f.isSobrevivencia());
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
    
    public Ficha puxaFicha(int codFicha) throws SQLException{
        jogadorDAO = new JogadorDAO();
        Ficha banco = null;
        ResultSet rs;
        int i = 0;
        
        try{
            con = new Conexao().getConnection();
            String sql = "Select * from ficha where codigo_ficha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codFicha);
            rs = stmt.executeQuery();
            
            while(rs.next() && i == 0){
                i++;
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
                boolean acrobacia = rs.getBoolean("acrobacia");
                boolean arcanismo = rs.getBoolean("arcanismo");
                boolean atletismo = rs.getBoolean("atletismo");
                boolean atuacao = rs.getBoolean("atuacao");
                boolean enganacao = rs.getBoolean("enganacao");
                boolean furtividade = rs.getBoolean("furtividade");
                boolean historia = rs.getBoolean("historia");
                boolean intimidacao = rs.getBoolean("intimidacao");
                boolean intuicao = rs.getBoolean("intuicao");
                boolean investigacao = rs.getBoolean("investigacao");
                boolean lidarComAnimais = rs.getBoolean("lidarComAnimais");
                boolean medicina = rs.getBoolean("medicina");
                boolean natureza = rs.getBoolean("natureza");
                boolean percepcao = rs.getBoolean("percepcao");
                boolean persuasao = rs.getBoolean("persuasao");
                boolean prestidigitacao = rs.getBoolean("prestidigitacao");
                boolean religiao = rs.getBoolean("religiao");
                boolean sobrevivencia = rs.getBoolean("sobrevivencia");
                boolean forcaPrest = rs.getBoolean("forcaPrest");
                boolean destrezaPrest = rs.getBoolean("destrezaPrest");
                boolean constituicaoPrest = rs.getBoolean("constituicaoPrest");
                boolean inteligenciaPrest = rs.getBoolean("inteligenciaPrest");
                boolean sabedoriaPrest = rs.getBoolean("sabedoriaPrest");
                boolean carismaPrest = rs.getBoolean("carismaPrest");
                boolean vida1 = rs.getBoolean("vida1");
                boolean vida2 = rs.getBoolean("vida2");
                boolean vida3 = rs.getBoolean("vida3");
                boolean morte1 = rs.getBoolean("morte1");
                boolean morte2 = rs.getBoolean("morte2");
                boolean morte3 = rs.getBoolean("morte3");
                
                banco = new Ficha(nome, classe, raca, classeArm, vida, desloc, forca, inteligencia, destreza, sabedoria, constituicao, carisma, nivel, tendencia, nomeJoga, pontosXP, inspiracao, bonusProficiencia, ouro, prata, platina, historiaPersonagem, equipamentos, caracteristicas, acrobacia, arcanismo, atletismo, atuacao, enganacao, furtividade, historia, intimidacao, investigacao, natureza, percepcao, persuasao, prestidigitacao, religiao, sobrevivencia, forcaPrest, destrezaPrest, lidarComAnimais, constituicaoPrest, inteligenciaPrest, sabedoriaPrest, carismaPrest, vida1, vida2, vida3, morte1, morte2, morte3, intuicao, medicina);
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
