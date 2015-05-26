/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_2015_1_10;

/**
 *
 * @author emmanuelsilvaxavier
 */
/*HERANCA reutilização estática de código
public class Desenho extends Quadrado{
    
    
    public void desenhar(){
        super.desenhar();
    }
            
}
*/
public class Desenho {
    private Figura figura = new Circulo();
    
    public void alterarFigura(Figura figura){
        this.figura = figura;
    }
    
    public void desenhar(){
        figura.desenhar();
    }
            
}
