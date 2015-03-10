package principal;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Cliente {
    int codigo;
    String nome;
    String telefone;
    Date dataNascimento;
    String endereco;
    
    
    Cliente(String nome,Date data){
        JOptionPane.showMessageDialog(null, "Criado");
        this.nome = nome;
        this.dataNascimento = data;
        System.out.print(this.nome + " dt: " + this.dataNascimento);
    }
    
    boolean salvar(){
        JOptionPane.showMessageDialog(null, "Cadastrando cliente");
        return true;
    }
    
    boolean alterar(){
        JOptionPane.showMessageDialog(null, "Alterando cliente");
        return true;
    }
    
    boolean excluir(){
        JOptionPane.showMessageDialog(null, "Excluindo cliente");
        return true;
    }
    
    List<Cliente> pesquisa(String nome){
        JOptionPane.showMessageDialog(null, "Cadastrando cliente");
        return null;
    }
    
    public void finalize(){
        JOptionPane.showMessageDialog(null, "Objeto destruído.");
    }
}
