package pp_2015_1_02;

public class PP_2015_1_02 {


    public static void main(String[] args) {
        
        //instanciando
       Pessoa pessoa = new Pessoa();
       
       //setando valores aos atributos
       pessoa.codigo = 1;
       pessoa.nome= "Emmanuel";
       
       //invocar os métdos do objeto.
       pessoa.cadastrar();
       
       pessoa = new Pessoa();
       pessoa = new Pessoa();
       Pessoa pessoa2 = new Pessoa();
    }
}
