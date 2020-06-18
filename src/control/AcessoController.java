package control;

import java.util.ArrayList;
import model.Usuario;

public class AcessoController {
    
    private final ArrayList<Usuario> bancoDadosArray;

    //CONTRUTOR QUE INICIA COM ALGUNS USUARIOS NA ARRAY, PARA TESTES
    public AcessoController() {
        bancoDadosArray = new ArrayList();
        
        Usuario j1 = new Usuario("Edilson", "edilsonlinefilho@gmail.com", "123456");
        Usuario j2 = new Usuario("Gab Well", "gubirosin@gmail.com", "123456");
        Usuario j3 = new Usuario("Bieelvi", "bieelvi@gmail.com", "123456");
        
        bancoDadosArray.add(j1);
        bancoDadosArray.add(j2);
        bancoDadosArray.add(j3);
    }
    
    //METODO QUE RECEBE COMO PARAMETRO USUARIO, EMAIL E SENHA E ADICIONA NA ARRAY
    public void adicionaArray(String usuario, String email, String senha){        
        Usuario j = new Usuario(usuario, email, senha);        
        
        bancoDadosArray.add(j);
    }
    
    //METODO QUE RECEBE COMO PARAMETRO EMAIL(CONF EMAIL) E SENHA(CONF) E CONFERE PARA VER SE ESTA CORRETO
    public boolean verificaEmailSenha(String email, String cEmail, String senha, String cSenha){
        boolean confirmado = false;
        
        if(email.equals(cEmail) && senha.equals(cSenha)){
            confirmado = true;
        }
        
        return confirmado;
    }
    
    public boolean verificaUsuarioPeloEmail(String email){
        boolean existe = true;
        
        for(Usuario j: bancoDadosArray){
            String e = j.getEmail();
            
            if(e.equals(email)){
                existe = false;
            }       
        } 
        
        return existe;
    }

    //METODO QUE RECEBE COMO PARAMENTRO USUARIO E SENHA. E CONFERE SE ESTA NO ARRAY CRIADO 
    public boolean verificaAcesso(String email, String senha){
        boolean acesso = false;

        for(Usuario j: bancoDadosArray){
            String e = j.getEmail();
            String s = j.getSenha();
            
            if(e.equals(email) && s.equals(senha)){
                acesso = true;
            }       
        }    
        return acesso;
    }
}
