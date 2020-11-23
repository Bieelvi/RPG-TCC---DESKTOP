package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.UploadsDAO;
import model.Imagem;

public class UploadsController {
    
    UploadsDAO uploadsDAO;

    public UploadsController() {
        this.uploadsDAO = new UploadsDAO();
    }
    
    public boolean passaImagem(String nome, byte[] imagem, int codMestre) throws SQLException{
        return uploadsDAO.passaImagem(nome, imagem, codMestre);
    }
    
    public ArrayList passaBanco(int codMestre) throws SQLException{
        ArrayList banco = uploadsDAO.passaBanco(codMestre);
        return banco;
    }
}
