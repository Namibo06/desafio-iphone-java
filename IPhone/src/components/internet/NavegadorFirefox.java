package components.internet;

public class NavegadorFirefox implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Firefox");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Firefox");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Firefox");
    }
}
