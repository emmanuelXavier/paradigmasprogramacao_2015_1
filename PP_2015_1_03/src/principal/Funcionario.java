package principal;

import java.util.List;


public class Funcionario {
    
    private int codigo;
    private String nome;
    private String cpf;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
      public boolean salvar(){
        //code
        return true;
    }
    
    public boolean alterar(){
        //code
        return true;
    }
    
    public boolean excluir(){
        //code
        return true;
    }
    
    public List<Funcionario> pesquisar(String nome){
        return null;
    }
    
}
