package pp_2015_1_02;

import java.util.Date;
import javax.swing.JOptionPane;

public class Pessoa {
    int codigo;
    String nome;
    String cpf;
    String sexo;
    double salario;
    Date data;
    
    void cadastrar(){
        JOptionPane.showMessageDialog(null, "O aluno foi cadastro com sucesso.");
    }
     
}


