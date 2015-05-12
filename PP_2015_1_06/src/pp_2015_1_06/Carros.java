package pp_2015_1_06;

import javax.swing.JOptionPane;

public class Carros extends Veiculos{
    
    @Override
    public void acelerar(){
        super.acelerar();
        JOptionPane.showMessageDialog(null, "Acelerar de carro");
    }
    
    public void acelerar(int velocidade){
        JOptionPane.showMessageDialog(null, "Acelerar até a velocidade "+ velocidade);
        
    }

    
    
    
}
