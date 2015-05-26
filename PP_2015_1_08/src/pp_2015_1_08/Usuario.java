package pp_2015_1_08;

import javax.swing.JOptionPane;


public  class Usuario {
    private String login;
    private String senha;
    


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public boolean autenticar(){
        if (login.equals("123"))
            return true;
        else
            return false;
    }
    
}
