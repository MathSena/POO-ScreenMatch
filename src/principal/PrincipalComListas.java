package principal;

import br.com.mathsena.screenmatch.model.Filme;
import br.com.mathsena.screenmatch.model.Serie;
import br.com.mathsena.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {
        System.out.println("Orientação a Objetos - JAVA!");

        Filme meuFilme = new Filme();
        meuFilme.setNome("Kill Bill");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(90);
        meuFilme.avaliar(10);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        meuFilme.avaliar(10);

        Filme maisUmFilme = new Filme();
        maisUmFilme.setNome("Bastardos Inglórios");
        maisUmFilme.setAnoDeLancamento(2009);
        maisUmFilme.setDuracaoEmMinutos(200);
        meuFilme.avaliar(10);

        Filme filmeComConstrutor = new Filme("Jogos Mortais");
        filmeComConstrutor.setAnoDeLancamento(2004);
        filmeComConstrutor.setDuracaoEmMinutos(200);
        meuFilme.avaliar(7);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsPorTemporada(10);
        lost.setMinPorEp(40);
        System.out.println("Duração total da Série: " + lost.getDuracaoEmMinutos());


        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(maisUmFilme);
        listaAssistidos.add(lost);

        System.out.println("FOREACH: ");

        for(Titulo item : listaAssistidos) {
            System.out.println("Nome: " +item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Sandra Bullock");
        buscaPorArtista.add("Kiefer Sutherland");
        System.out.println(buscaPorArtista);
        System.out.println("Ordenando lista com Collections");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);


        Collections.sort(listaAssistidos);
        System.out.println("Lista de títulos ordenados: " + listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Por ano de lançamento: " + listaAssistidos);

        System.out.println("Tamanho do Arraylist: " + listaAssistidos.size());
        System.out.println("Primeiro Filme: " + listaAssistidos.get(0).getNome());





    }
}
