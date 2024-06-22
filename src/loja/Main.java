package loja;
import dispositivo.Iphone;

public class Main {
      public static void main(String[] args) {
            Iphone apple = new Iphone();
            Iphone streaming = new Iphone();
            Iphone explorer = new Iphone();

            System.out.println("Telefone");
            apple.ligar();
            apple.atender();
            apple.iniciarCorreioVoz();

            System.out.println("Spotify");
            streaming.tocar();
            streaming.pausar();
            streaming.selecionarMusica();

            System.out.println("Explorer");
            explorer.exibirPagina();
            explorer.adicionarNovaAba();
            explorer.atualizarPagina();
      
      }
}