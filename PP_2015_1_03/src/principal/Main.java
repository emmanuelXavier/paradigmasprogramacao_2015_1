package principal;

import java.awt.FlowLayout;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
                
        Cliente cliente = new Cliente("Emmanuel", new Date());
        cliente = null;              
        System.gc();
        cliente = new Cliente("Emnsdfdf", new Date());
        
        
    }
}
