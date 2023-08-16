package br.com.etecia.recyclerviewfilmes;

public class Jogadoras {
    private String Titulos;
    private String Times;
    private String Posição;
    private int imagem;

    //criar o construtor com parâmetros alt+insert

    public Jogadoras(String titulo, String descricao, String categoria, int imagem) {
        this.Titulos = titulo;
        this.Times = Times;
        this.Posição = Posição;
        this.imagem = imagem;
    }

    //criando os métodos de acesso get and setter
    public String getTitulo() {
        return Titulos;
    }

    public void setTitulo(String titulo) {
        this.Titulos = titulo;
    }

    public String getDescricao() {
        return Times;
    }

    public void setDescricao(String descricao) {
        this.Times = Times;
    }

    public String getCategoria() {
        return Posição;
    }

    public void setCategoria(String categoria) {
        this.Posição = Posição;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

