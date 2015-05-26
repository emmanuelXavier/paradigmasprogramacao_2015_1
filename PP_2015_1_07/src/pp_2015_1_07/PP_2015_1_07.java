package pp_2015_1_07;

import java.util.List;

public class PP_2015_1_07 {

   
    public static void main(String[] args) {
            Semaforo<Processo> semaforo = new Semaforo();
            semaforo.setRegiaoCritica(new Processo());
            
            Semaforo<Arquivo> semaforoArquivo = new Semaforo();
            semaforoArquivo.setRegiaoCritica(new Arquivo());
            
            Semaforo semaforoGenerico = new Semaforo();
            semaforoGenerico.setRegiaoCritica(new Arquivo());
    }
    
}
