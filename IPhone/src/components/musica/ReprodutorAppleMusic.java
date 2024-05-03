package components.musica;

public class ReprodutorAppleMusic extends Reprodutor implements ReprodutorMusical {

    @Override
    public void tocar() {
        selecionarMusica();
        System.out.println("Tocar música com Apple Music");
    }

    @Override
    public void pausar() {
        selecionarMusica();
        System.out.println("Parar música com Apple Music");
    }
}
