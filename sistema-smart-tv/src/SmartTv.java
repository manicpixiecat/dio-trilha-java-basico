public class SmartTv {
    // Atributos com valores iniciais
    boolean ligada = false;
    int canal = 01;
    int volume = 25;

      // Método para mudarCanal
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    // Método para ligar a TV
    public void ligar() {
        ligada = true;
    }

    // Métodos para controle de volume
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para" + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);
    }

    public void desligar() {
        ligada = false;
    }
}