public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 8;

        if(nota > 7)
            System.out.println("Você foi aprovado!");

        else if(nota >= 5 && nota < 7)
            System.out.println("Você precisa fazer recuperação!");
        
        else 
            System.out.println("Você foi reprovado!");

    }

}
