package SmartTv;
public class SmartTv {

    //Definindo os atributos da
    boolean ligada = true;
    int volume = 25;
    int canal = 1;

    //Realizando criação dos métodos da nossa smartTV:
    public void ligar() {
        ligada = true;
    }
    
    public void desligar() {
        ligada = false;
    }
        
    public void aumentarVolume() {
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void selecionarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal--;
    }

}
