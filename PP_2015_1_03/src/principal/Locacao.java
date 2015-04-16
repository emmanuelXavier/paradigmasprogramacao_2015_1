package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private int codigo;
    private Date data;
    private int cliente;
    private Date devolucao;
    private float valor;
    private List<Filme> filmes;
    private int funcionario;
    
    public void locar(int cliente, int funcionario){
        this.codigo = 1; // seria gerado pelo sistema
        this.data = new Date();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.filmes = new ArrayList<Filme>();
    }
    
    public boolean addFilme(Filme filme){
        if (filme.locar()){
            this.filmes.add(filme);
            return true;
        }else
            return false;
            
        
            
    }
    
}
