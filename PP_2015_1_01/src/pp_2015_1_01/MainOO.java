package pp_2015_1_01;

import javax.swing.JOptionPane;


public class MainOO {
    
    public static void main(String[] args){
        jairoPerdeu2Vezes();
        uesley();
        rubem();
    }
    
    private static void jairoPerdeu2Vezes(){
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
