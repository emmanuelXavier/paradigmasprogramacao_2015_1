package pp_2015_1_01;

import javax.swing.JOptionPane;


public class PP_2015_1_01 {

    
    public static void main(String[] args) {
        jairo();
        uesley();
        rubem();
    }
    
    private static void jairo(){
        String cpf = JOptionPane.showInputDialog("Informe o cpf");
        if (validarCpf(cpf))
            JOptionPane.showMessageDialog(null, "Cpf válido");
        else
            JOptionPane.showMessageDialog(null, "inválido");
    }
    
    private static void uesley(){
        String cpf = JOptionPane.showInputDialog("Informe o cpf");
        if (validarCpf(cpf))
            JOptionPane.showMessageDialog(null, "Cpf válido");
        else
            JOptionPane.showMessageDialog(null, "inválido");
    }
    
    private static void rubem(){
        String cpf = JOptionPane.showInputDialog("Informe o cpf");
        if (validarCpf(cpf))
            JOptionPane.showMessageDialog(null, "Cpf válido");
        else
            JOptionPane.showMessageDialog(null, "inválido");
    }
    
    private static boolean validarCpf(String cpf){
        if (cpf.equals("123"))
            return true;
        else
            return false;
    }
}
