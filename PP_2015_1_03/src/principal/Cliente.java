package principal;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Cliente {
     private int codigo;
     private String nome;
     private String telefone;
     private Date dataNascimento;
     private String endereco;
    
    
    
    public Cliente(String nome,Date data){
        JOptionPane.showMessageDialog(null, "Criado");
        this.nome = nome;
        this.dataNascimento = data;
        System.out.print(this.nome + " dt: " + this.dataNascimento);
    }
    
   public Cliente(){
        
    }
   
  private void conectar(){
       //code of connection
   }
   
  private boolean validarCampo(){
       return true;
   }
    
  private void registrarLog(){
       //code
   }
   
  private void desconectar(){
       //code
   }
   
   
  public boolean salvar(){
        conectar();
        validarCampo();
        JOptionPane.showMessageDialog(null, "Cadastrando cliente");
        registrarLog();
        desconectar();
        return true;
   }
    
  public boolean alterar(){
       
        JOptionPane.showMessageDialog(null, "Alterando cliente");
        return true;
    }
    
   public boolean excluir(){
        JOptionPane.showMessageDialog(null, "Excluindo cliente");
        return true;
    }
    
   public List<Cliente> pesquisa(String nome){
        JOptionPane.showMessageDialog(null, "Cadastrando cliente");
        return null;
    }
    
    public void finalize(){
        JOptionPane.showMessageDialog(null, "Objeto destruído.");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
