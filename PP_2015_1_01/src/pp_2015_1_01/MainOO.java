package pp_2015_1_01;

import javax.swing.JOptionPane;


public class MainOO {
    
    public static void main(String[] args){
        jairo();
        uesley();
        rubem();
    }
    
    private static void jairo(){
        Pessoa obj = new Pessoa();
        obj.setCpf(JOptionPane.showInputDialog("Informe o cpf"));
    }
    
    private static void uesley(){
        Pessoa obj = new Pessoa();
        obj.setCpf(JOptionPane.showInputDialog("Informe o cpf"));
    }
    
    private static void rubem(){
        Pessoa obj = new Pessoa();
        obj.setCpf(JOptionPane.showInputDialog("Informe o cpf"));
    }
    
}