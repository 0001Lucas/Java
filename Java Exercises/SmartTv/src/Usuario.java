package SmartTv;
public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        //Testando todos os métodos criados:
        smartTv.ligar();

        smartTv.desligar();

        smartTv.ligar();

        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        smartTv.selecionarCanal(0);

        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

    }

}
