public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // método para ligar a TV
    public void ligar(){
        ligada = true;
    }

    // método para desligar a TV
    public void desligar(){
        ligada = false;
    }

    // método que aumenta o volume e imprime o estado atual
    public void aumentarVolume() {
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }

    // método que diminui o volume e imprime o estado atual
    public void diminuirVolume() {
        System.out.println("Dimuindo o volume para: " + volume);
        volume--;
    }

    // método que aumenta o canal e imprime o estado atual
    public void aumentarCanal() {
        canal++;
        System.out.println("Você está assistindo o canal: " + canal);
    }

    // método que diminui o volume e imprime o canal atual
    public void diminuirCanal() {
        canal--;
        System.out.println("Você está assistindo o canal: " + canal);
    }

    // método que muda para um canal informado e informado o canal atual
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Você está assistindo o canal: " + canal);
    }


}
