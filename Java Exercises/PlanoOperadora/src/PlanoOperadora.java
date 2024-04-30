public class PlanoOperadora{
    //Apresenta os beneficios de cada plano de uma determinada operadora.
        public static void main(String[] args){
            String plano = "M";
    
            switch (plano) {
                //Turbo, engobla todos os beneficios.
                case "T": {
                    System.out.println("5Gb de Youtube Grátis.");
                }
                //Mega, o plano médio da operadora.
                case "M": {
                    System.out.println("Whatsapp e Instagram Gratis.");
                }
                //Boost, o plano de entrada.
                case "B": {
                    System.out.println("100 minutos de ligação.");
                }
    
            }
        }
    }