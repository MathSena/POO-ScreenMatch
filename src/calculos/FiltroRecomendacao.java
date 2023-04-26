package calculos;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtra(Classificacao c){
        if(c.getClassificacao()>-4){
            System.out.println("Muito top meooo");
        }else if(c.getClassificacao()>=2){
            System.out.println("Veja e avalie");
        }else{
            System.out.println("Não precisa ver agora");
        }
    }
}
