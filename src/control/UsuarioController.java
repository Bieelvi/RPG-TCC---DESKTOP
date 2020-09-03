package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.UsuarioDAO;
import model.Usuario;

public class UsuarioController {
    
    UsuarioDAO usuarioDAO;

    public UsuarioController(){
        usuarioDAO = new UsuarioDAO();
    }
    
    public boolean adicionaBanco(String usuario, String email, String senha) throws SQLException{ 
        boolean add = usuarioDAO.passaUsuario(usuario, email, senha);
        return add;
    }
    
    public ArrayList banco() throws SQLException{
        ArrayList<Usuario> banco = usuarioDAO.banco();
        return banco;
    }
    
    public boolean hierarquia(String email) throws SQLException{
        boolean hierarquia = false;
        ArrayList<Usuario> banco = usuarioDAO.banco();
        
        for(Usuario j: banco)
            if(j.getEmailUsuario().equals(email))
                if(j.getHierarquiaUsuario() == 1)
                    hierarquia = true;
        return hierarquia;
    }
    
    public String procura(String email) throws SQLException{
        String nome = "";
        ArrayList<Usuario> banco = usuarioDAO.banco();
        
        for(Usuario j: banco)
            if(j.getEmailUsuario().equals(email))
                nome = j.getNomeUsuario();
        
        return nome;
    }
    
    public boolean verificaEmailSenha(String email, String cEmail, String senha, String cSenha){
        boolean confirmado = false;
        
        if(email.equals(cEmail) && senha.equals(cSenha)){
            confirmado = true;
        }
        
        return confirmado;
    }
    
    public boolean procuraNomeUsuario(String email) throws SQLException{
        ArrayList<Usuario> banco = usuarioDAO.banco();
        boolean existe = false;
        
        for(Usuario j: banco)
            if(j.getEmailUsuario().equals(email))
                existe = true;
        
        return existe;
    }

    public boolean verificaAcesso(String email, String senha) throws SQLException{
        boolean acesso = false;

        ArrayList<Usuario> banco = usuarioDAO.banco();
        
        for(Usuario j: banco)
            if(j.getEmailUsuario().equals(email) && j.getSenhaUsuario().equals(senha))
                acesso = true;
        
        return acesso;
    }
}
