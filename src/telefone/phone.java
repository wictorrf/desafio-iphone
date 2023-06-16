package telefone;

public class phone implements atender, iniciarCorreioVoz, ligar {
    public void atender() {
        System.out.println("Atendendo o telefone!");
    }
    public void ligar() {
        System.out.println("Ligando para alguem");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }
}
