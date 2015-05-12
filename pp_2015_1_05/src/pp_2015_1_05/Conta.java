/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_2015_1_05;

/**
 *
 * @author emmanuelsilvaxavier
 */
public class Conta {
    
    private String agencia;
    private String numero;
    private TiposContas tipo = new TiposContas();

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TiposContas getTipo() {
        return tipo;
    }

    public void setTipo(TiposContas tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
