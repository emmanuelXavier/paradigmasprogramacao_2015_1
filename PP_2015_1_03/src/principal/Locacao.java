package principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Locacao {
    private int codigo;
    private Date data;
    private Cliente cliente;
    private Date devolucao;
    private float valor;
    private List<Filme> filmes;
    private Funcionario funcionario;
    
    public void locar(Cliente cliente, Funcionario funcionario){
        this.codigo = 1; // seria gerado pelo sistema
        this.data = new Date();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.filmes = new ArrayList<Filme>();
        this.valor = 0;
    }
    
    public boolean addFilme(Filme filme){
        if (filme.locar()){
            this.filmes.add(filme);
            this.valor = this.valor + filme.getValor();
            return true;
        }else
            return false;       
    }
    
    
    public void finalizarLocacao(){
        this.devolucao = new Date();
        imprimirCupom();
    }
    
    
    
    public void imprimirCupom(){
        int i;
        String impressao = "Locadora do Rubão\n";
        impressao += "Funcionário: " + this.funcionario.getNome() + "\n";
        impressao += "Cliente: " + this.cliente.getNome() + "\n";
        for (i = 0; i < this.filmes.size(); i++){
            impressao += "Filme: " + filmes.get(i).getTitulo();
            impressao += " valor: " + filmes.get(i).getValor() + "\n";
        }
        
        impressao += "\nTotal R$ " + this.valor;
        Icon image = new ImageIcon("guitar.jpg");
        JOptionPane.showMessageDialog(null, impressao, "Rubão locadora", 0, image);
    }
    
}
