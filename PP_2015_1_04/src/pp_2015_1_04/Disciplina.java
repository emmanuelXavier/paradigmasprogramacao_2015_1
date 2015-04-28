/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_2015_1_04;

/**
 *
 * @author emmanuelsilvaxavier
 */
public class Disciplina {
    
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private Professor professor = new Professor();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void salvarProfessor(){
        professor.salvar();
    }
    
    public void setMatricula(int matricula){
        professor.setMatricula(matricula);
    }
    
    public void setNomeProfessor(String nome){
        professor.setNome(nome);
    }
    
    public String getNomeProfessor(){
        return professor.getNome();
    }
    
    
    
}
