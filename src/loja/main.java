                                                                                                                                                                                                                                                                                                                                                      package loja;

import dispositivo.Iphone;

public class main {
      public static void main(String[] args){
            Iphone apple = new Iphone();

            System.out.println("Telefone");
            apple.ligar();
            apple.atender();
            apple.iniciarCorreioVoz();

            System.out.println("Spotify");
            apple.tocar();
            apple.pausar();
            apple.selecionarMusica();

            System.out.println("Explorer");
            apple.exibirPagina();
            apple.adicionarNovaAba();
            apple.atualizarPagina();

      }
}