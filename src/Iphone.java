import music.ipod;
import navegador.internet;
import telefone.phone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------- Reprodutor Musical: ----------\n");

        ipod ipod = new ipod();
        ipod.pausar();
        ipod.selecionarMusica();
        ipod.tocar();

        System.out.println("\n------- Aparelho telefonico: ----------\n");

        phone phone = new phone();
        phone.atender();
        phone.iniciarCorreioVoz();
        phone.ligar();

        System.out.println("\n------- Navegador internet: ----------\n");

        internet internet = new internet();
        internet.adicionarPagina();
        internet.atualizarPagina();
        internet.exibirPagina();

    }
}
