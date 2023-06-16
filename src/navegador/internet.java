package navegador;

public class internet implements adicionarPagina, atualizarPagina, exibirPagina {
    public void adicionarPagina() {
        System.out.println("Adicionando página!");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }
    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }
}
