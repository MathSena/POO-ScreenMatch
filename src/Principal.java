import br.com.mathsena.screenmatch.model.Filme;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Orientação a Objetos - JAVA!");

        Filme meuFilme = new Filme();
        meuFilme.setNome("Kill Bill");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(90);


        meuFilme.exibeFichaTecnica();
        meuFilme.avaliar(10);
        System.out.println(meuFilme.getSomaAvaliacao());
        meuFilme.avaliar(7);
        System.out.println(meuFilme.getSomaAvaliacao());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());




    }
}