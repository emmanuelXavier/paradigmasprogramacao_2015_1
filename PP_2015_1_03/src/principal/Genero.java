package principal;

import java.util.List;

public class Genero {
    private int codigo;
    private String nome;

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
    
    public List<Genero> pesquisar(String nome){
        return null;
    }
    
    
}
