package br.com.mathsena.screenmatch.model;

import calculos.Classificacao;

public class Serie extends Titulo  {

    private int temporadas;
    private boolean ativa;
    private int epsPorTemporada;

    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaAvaliacao, int totalDeAvaliacoes, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaAvaliacao, totalDeAvaliacoes, duracaoEmMinutos);
    }

    public Serie() {
        super();

    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    private int minPorEp;

    private int visualizacoes;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public int getMinPorEp() {
        return minPorEp;
    }

    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas*minPorEp;
    }

}
