package pp_2015_1_06;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PP_2015_1_06 {

    public static void main(String[] args) {
        Carros carro = new Carros();
        carro.acelerar();
        carro.acelerar(200);
        
        String[] opcoes = {"Cadastrar","Salvar","sair"};
        JOptionPane.showMessageDialog(null, (String) JOptionPane.showInputDialog(null, "infome", "A sistemas", 2, null, opcoes, null));

    }
    
   
    
}
