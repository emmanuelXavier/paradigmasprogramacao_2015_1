package pp_2015_1_05;

import javax.swing.JOptionPane;


public class Pp_2015_1_05 {

    
    public static void main(String[] args) {
        TiposContas tipo = new TiposContas();
        tipo.setCodigo("1");
        tipo.setNome("Poupança");
        
      //  Conta conta = new Conta();
      //  conta.setAgencia("123123");
      //  conta.setNumero("234234");
       // conta.setTipo(new TiposContas());
      //  conta.getTipo().setCodigo("1");
       // conta.getTipo().setNome("poupanca");
        
        Cliente cliente = new Cliente();
        cliente.setNome("Jairo");
        cliente.setEndereco("R. das bibas");
        cliente.setAgencia("2345");
        cliente.setNumero("234");
        cliente.setTipo(tipo);
        
        JOptionPane.showMessageDialog(null, cliente.getNome());

        
        
        
    }
}
