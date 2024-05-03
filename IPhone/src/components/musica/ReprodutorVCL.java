package components.musica;

public class ReprodutorVCL extends Reprodutor implements ReprodutorMusical{
    @Override
    public void tocar() {
        selecionarMusica();
        System.out.println("Tocar música com VCL");
    }

    @Override
    public void pausar() {
        selecionarMusica();
        System.out.println("Parar música com VCL");
    }
}
