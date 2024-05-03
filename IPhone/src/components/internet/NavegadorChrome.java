package components.internet;

public class NavegadorChrome implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Chrome");
    }
}
