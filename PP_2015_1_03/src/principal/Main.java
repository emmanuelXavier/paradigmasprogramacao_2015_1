package principal;

import com.sun.media.sound.JARSoundbankReader;
import java.awt.FlowLayout;
import java.util.Date;
import javax.imageio.spi.RegisterableService;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
                
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setDataNascimento(new Date());
        cliente.setNome("Emmanuel");
        cliente.salvar();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(1);
        funcionario.setNome("Wesley");
        funcionario.setCpf("005.464.923-23");
        
        Genero genero = new Genero();
        genero.setCodigo(1);
        genero.setNome("Terror");

        Filme f = new Filme();
        f.setCodigo(1);
        f.setTitulo("Os Vingadores II");
        f.setNomeGenero("Terror");
        f.setAno(2015);
        f.setQtdExemplares(2);
        f.setValor(10);
        f = null;
        Filme f2 = new Filme();
        f2.setCodigo(1);
        f2.setTitulo("Batman vs SuperMan");
  
        f2.setAno(2015);
        f2.setQtdExemplares(2);
        f2.setValor(12);
        
        Locacao locacao = new Locacao();
        locacao.locar(cliente, funcionario);
        
        Locacao locacao2 = new Locacao();
        locacao2.locar(cliente, funcionario);
        
        Locacao locacao3 = new Locacao();
        locacao3.locar(cliente, funcionario);
        

        if (!locacao.addFilme(f)) 
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
        if (!locacao.addFilme(f2)) 
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
      /*  if (!locacao2.addFilme(f))
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
        if (!locacao3.addFilme(f))
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
        */
        
        
        locacao.finalizarLocacao();
        

       
        
    }
}
