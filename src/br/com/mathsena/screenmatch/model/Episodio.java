package br.com.mathsena.screenmatch.model;

import calculos.Classificacao;

public class Episodio implements Classificacao {

    private int numero;
    private String nome;
    private Serie serie;

    public int getNumero() {
        return numero;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    private int visualizacoes;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(visualizacoes>100){
            return 4;
        }else{
            return 2;
        }

    }
}
