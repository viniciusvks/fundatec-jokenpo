package br.org.fundatec.lp3.jokenpo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("|--jokenpo--|");
        
        Jogada primeraJogada;
        Jogada segundaJogada;

        Jogo jogo = new Jogo();

        do {

            System.out.println("> ESCOLHA UMA JOGADA:");
            System.out.println(">| PEDRA - 0 | PAPEL - 1 | TESOURA - 2 |");
            
            System.out.print("> Jogador 1: ");            
            primeraJogada = Jogada.comValor(scanner.nextInt());
            System.out.print("> Jogador 2: ");
            segundaJogada = Jogada.comValor(scanner.nextInt());

            if(jogadaEhValida(primeraJogada) && jogadaEhValida(segundaJogada)) {
            	
            	Resultado resultado = jogo.executar(primeraJogada, segundaJogada);
            	System.out.println(buildMessage(resultado, primeraJogada, segundaJogada));
            	
            } else {
            	
            	System.out.println("Jogada inválida!");
            	
            }

        } while(!jogadaEhValida(primeraJogada) || !jogadaEhValida(segundaJogada));
        
        scanner.close();

    }

    private static boolean jogadaEhValida(Jogada jogada) {

        return jogada != null;

    }

    private static String buildMessage(Resultado resultado, Jogada primeiraJogada, Jogada segundaJogada) {

        String message = "Undefined";

        switch (resultado) {

            case VITORIA:
                message = primeiraJogada+" venceu";
                break;
            case DERROTA:
                message = segundaJogada+" venceu";
                break;
            case EMPATE:
                message = "Empate";
                break;
        }

        return message;

    }
}
