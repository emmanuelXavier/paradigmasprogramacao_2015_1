/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_2015_1_05;

/**
 *
 * @author emmanuelsilvaxavier
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private Conta conta = new Conta();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    public void setAgencia(String agencia){
         conta.setAgencia(agencia);
    }
    
    public void setNumero(String numero){
        conta.setNumero(numero);
    }
    
    public void setTipo(TiposContas tipo){
        conta.setTipo(tipo);
    }
    
    
    
    
}
