package control;

import java.util.ArrayList;
import model.Usuario;

public class AcessoController {
    
    private final ArrayList<Usuario> bancoDadosArray;

    //CONTRUTOR QUE INICIA COM ALGUNS USUARIOS NA ARRAY, PARA TESTES
    public AcessoController() {
        bancoDadosArray = new ArrayList();
        
        Usuario j1 = new Usuario("admin", "admin@admin", "123");
        Usuario j2 = new Usuario("adm", "adm@adm", "1234");
        Usuario j3 = new Usuario("gabriel", "gabriel@gabriel", "12345");
        Usuario j4 = new Usuario("marcella", "marcella@marcella", "123456");
        Usuario j5 = new Usuario("bieelvi", "bieelvi@bieelvi", "1234567");
        
        bancoDadosArray.add(j1);
        bancoDadosArray.add(j2);
        bancoDadosArray.add(j3);
        bancoDadosArray.add(j4);
        bancoDadosArray.add(j5);
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

    //METODO QUE RECEBE COMO PARAMENTRO USUARIO E SENHA. E CONFERE SE ESTA NO ARRAY CRIADO 
    public boolean verificaAcesso(String usuario, String senha){
        boolean acesso = true;

        for(Usuario j: bancoDadosArray){
            String u = j.getUsuario();
            String s = j.getSenha();
            
            if(u.equals(usuario) && s.equals(senha)){
                acesso = true;
            } else {
                acesso = false;
            }            
        }    
        return acesso;
    }
}
