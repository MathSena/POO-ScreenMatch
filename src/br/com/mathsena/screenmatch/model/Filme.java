package br.com.mathsena.screenmatch.model;

import calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public Filme(){

    }

    public Filme(String nome) {
        this.setNome(nome);

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (getSomaAvaliacao()/2);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " ano de lançamento: " + this.getAnoDeLancamento();

    }
}
