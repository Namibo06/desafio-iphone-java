package visual;

import components.agenda.Telefone;
import components.internet.NavegadorChrome;
import components.internet.NavegadorFirefox;
import components.internet.NavegadorSafari;
import components.musica.ReprodutorAppleMusic;
import components.musica.ReprodutorVCL;

public class UsuarioInterface {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        boolean recebendoLigacao=false;
        if(recebendoLigacao==true){
            telefone.atender();
        }else{
            telefone.ligar();
        }

        String navegador = "firefox";
        try{
            switch (navegador){
                case "firefox":
                    NavegadorFirefox firefox = new NavegadorFirefox();
                    firefox.adicionarNovaAba();
                    firefox.exibirPagina();

                case "safari":
                    NavegadorSafari safari = new NavegadorSafari();
                    safari.adicionarNovaAba();
                    safari.exibirPagina();

                case "chrome":
                    NavegadorChrome chrome = new NavegadorChrome();
                    chrome.adicionarNovaAba();
                    chrome.exibirPagina();

                default:
                    System.out.println("Nenhum Escolhido");
            }

        }catch (Exception e){
            System.out.println("Seu erro recebido: "+e);
        }

        ReprodutorVCL vcl = new ReprodutorVCL();
        boolean tocandoVCL=false;
        if(tocandoVCL==false){
            vcl.tocar();
        }else{
            vcl.pausar();
        }

        ReprodutorAppleMusic appleMusic = new ReprodutorAppleMusic();
        boolean tocandoAppleMusic=true;
        if(tocandoAppleMusic==false){
            appleMusic.tocar();
        }else{
            appleMusic.pausar();
        }
    }
}
