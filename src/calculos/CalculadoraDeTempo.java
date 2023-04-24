package calculos;
import br.com.mathsena.screenmatch.model.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        System.out.println("Adicionando..." + t.getNome());
        this.tempoTotal += t.getDuracaoEmMinutos();
    }


}
