/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_2015_1_08;

/**
 *
 * @author emmanuelsilvaxavier
 */
public class UsuarioSupervisor extends Usuario{
    
   
    
    public boolean autenticar(){
        if (this.getLogin().equals("999"))
            return true;
        else
            return false;
               
    }
}
