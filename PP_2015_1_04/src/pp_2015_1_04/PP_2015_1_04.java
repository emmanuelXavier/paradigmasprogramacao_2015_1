package pp_2015_1_04;

import java.util.Locale;
import javax.swing.JOptionPane;

public class PP_2015_1_04 {

    public static void main(String[] args) {
       /* Professor professor = new Professor();
        professor.setMatricula(1);
        professor.setNome("Emmanuel");
        professor.salvar();*/
        
        Disciplina disciplina = new Disciplina();
        disciplina.setCodigo(1);
        disciplina.setNome("Paradigmas da programação");
        disciplina.setCargaHoraria(72);
        //disciplina.setProfessor(professor);
        disciplina.setMatricula(1);
        disciplina.setNomeProfessor("Emmanuel");
        disciplina.salvarProfessor();
        disciplina = null;
        JOptionPane.showMessageDialog(null, disciplina.getNomeProfessor());
    
    }
}
