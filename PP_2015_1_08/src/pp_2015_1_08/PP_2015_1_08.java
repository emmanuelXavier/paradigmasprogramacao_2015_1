package pp_2015_1_08;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PP_2015_1_08 {

    public static void main(String[] args) {
        while(true)
         autenticar(fabrica(JOptionPane.showInputDialog("Classe")));
        
    }   
    //POLIMORFICO
    private static void autenticar(Usuario usuario){

        usuario.setLogin(JOptionPane.showInputDialog("Informe o login"));
        usuario.setSenha(JOptionPane.showInputDialog("Informe a senha"));
        if (usuario.autenticar())
            JOptionPane.showMessageDialog(null, "Entrando no sistema");
        else
            JOptionPane.showMessageDialog(null,"Usuário inválido");
    }
    
    private static Usuario fabrica(String nome){
        try {
            try {
                return (Usuario) Class.forName("pp_2015_1_08."+nome).newInstance();
            } catch (InstantiationException ex) {
                JOptionPane.showMessageDialog(null, "Essa classe não pode ser instanciada");
            } catch (IllegalAccessException ex) {
                JOptionPane.showMessageDialog(null, "Construtora privada");

            }
        } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "Classe não encontrada");

        }
        return null;
    }
    
   /*NAO POLIMORFICO 
    private static void autenticarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setLogin(JOptionPane.showInputDialog("Informe o login"));
        usuario.setSenha(JOptionPane.showInputDialog("Informe a senha"));
        if (usuario.autenticar())
            JOptionPane.showMessageDialog(null, "Entrando no sistema");
        else
            JOptionPane.showMessageDialog(null,"Usuário inválido");
    } 
    
    private static void autenticarUsuarioGerente(){
        UsuarioGerente usuario = new UsuarioGerente();
        usuario.setLogin(JOptionPane.showInputDialog("Informe o login"));
        usuario.setSenha(JOptionPane.showInputDialog("Informe a senha"));
        if (usuario.autenticar())
            JOptionPane.showMessageDialog(null, "Entrando no sistema");
        else
            JOptionPane.showMessageDialog(null,"Usuário inválido");
    }
    */
    
    
}
