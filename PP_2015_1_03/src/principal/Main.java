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

        Filme f = new Filme();
        f.setCodigo(1);
        f.setTitulo("Os vingadores");
        f.setGenero(1);
        f.setAno(2015);
        f.setQtdExemplares(2);
        f.setValor(100);
        
        Locacao locacao = new Locacao();
        locacao.locar(1, 1);
        
        Locacao locacao2 = new Locacao();
        locacao2.locar(2, 2);
        
        Locacao locacao3 = new Locacao();
        locacao3.locar(3, 3);
        

        if (!locacao.addFilme(f)) 
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
        if (!locacao2.addFilme(f))
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
        if (!locacao3.addFilme(f))
            JOptionPane.showMessageDialog(null, "Filme nao disposiivel");
        
        
        

       
        
    }
}
