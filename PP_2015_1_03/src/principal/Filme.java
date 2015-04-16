package principal;

import java.util.List;

public class Filme {
    private int codigo;
    private String titulo;
    private int genero;
    private int ano;
    private int qtdExemplares;
    private int qtdAlugado;
    private float valor;
    
    public Filme(){
        this.qtdAlugado = 0;
    }
    
      public boolean salvar(){
        //code
        return true;
    }
    
    public boolean alterar(){
        //code
        return true;
    }
    
    public boolean excluir(){
        //code
        return true;
    }
    
    public List<Filme> pesquisar(String titulo){
        return null;
    }
   
    public boolean locar(){
        if (verificarDisponibilidade()){
            this.qtdAlugado++;
            return true;
        }
        return false;
    }
    
    private boolean verificarDisponibilidade(){
        return this.qtdExemplares > this.qtdAlugado;
    }
    
    public void devolver(){
        this.qtdAlugado--;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdExemplares() {
        return qtdExemplares;
    }

    public void setQtdExemplares(int qtdExemplares) {
        this.qtdExemplares = qtdExemplares;
    }

    public int getQtdAlugado() {
        return qtdAlugado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
