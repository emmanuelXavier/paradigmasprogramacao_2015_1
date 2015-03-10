package pp_2015_1_01;

import javax.swing.JOptionPane;


public class Pessoa {
    private String cpf;
    
    
    public void setCpf(String cpf){
        this.cpf = cpf;
        if (validarCpf())
            JOptionPane.showMessageDialog(null, "Cpf válido");
        else
            JOptionPane.showMessageDialog(null, "Cpf invalido");
    }
    
    private boolean validarCpf(){
        if (cpf.equals("123"))
            return true;
        else
            return false;
                    
    }
    
    
}
