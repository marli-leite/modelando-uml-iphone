package dispositivo;

import aparelho.Celular;
import internet.Navegador;
import reprodutor.Streaming;

public class Iphone implements Celular, Navegador, Streaming {

    @Override
    public void tocar(){
        System.out.println("Tocando");
        
    }

    @Override
    public void pausar(){
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando musica"); 
    }

    @Override
    public void exibirPagina(){
        System.out.println("Exibindo nova página");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando Página");
    }

    @Override
    public void ligar(){
        System.out.println("Ligando");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
    
}
