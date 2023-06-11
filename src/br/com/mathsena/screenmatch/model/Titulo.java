package br.com.mathsena.screenmatch.model;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaAvaliacao, int totalDeAvaliacoes, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaAvaliacao = somaAvaliacao;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Titulo() {

    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaAvaliacao(){
        return somaAvaliacao;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano: " + anoDeLancamento);
    }

    public void avaliar(double nota){
        this.somaAvaliacao += nota;
        totalDeAvaliacoes ++;
    }

    public double obterMedia(){
        return somaAvaliacao/totalDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
