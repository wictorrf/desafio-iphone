package music;

public class ipod implements pausar, selecionarMusica, tocar {
    public void pausar() {
        System.out.println("Pausando a musica!");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando a musica!");
    }
    public void tocar() {
        System.out.println("Tocando a musica!");
    }
}
