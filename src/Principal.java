import br.com.mathsena.screenmatch.model.Filme;
import br.com.mathsena.screenmatch.model.Serie;
import calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Orientação a Objetos - JAVA!");

        Filme meuFilme = new Filme();
        meuFilme.setNome("Kill Bill");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(90);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        meuFilme.exibeFichaTecnica();
        meuFilme.avaliar(10);
        System.out.println(meuFilme.getSomaAvaliacao());
        meuFilme.avaliar(7);
        System.out.println(meuFilme.getSomaAvaliacao());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsPorTemporada(10);
        lost.setMinPorEp(40);
        System.out.println("Duração total da Série: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());




    }
}