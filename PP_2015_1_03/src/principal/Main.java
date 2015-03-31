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

        

       
        
    }
}
