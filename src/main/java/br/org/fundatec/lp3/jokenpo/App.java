package br.org.fundatec.lp3.jokenpo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("|--jokenpo--|");
        
        Resultado resultado = null;
        
        do {

            System.out.println("> ESCOLHA UMA JOGADA:");
            System.out.println(">| PEDRA - 0 | PAPEL - 1 | TESOURA - 2 |");
            System.out.print("> Jogador 1: ");
            int jogada1 = scanner.nextInt();
            System.out.print("> Jogador 2: ");
            int jogada2 = scanner.nextInt();
            
            Jogada primeiraJogada = Jogada.comValor(jogada1);
            Jogada segundaJogada = Jogada.comValor(jogada2);
            
            if(primeiraJogada == null || segundaJogada == null) {
            	System.out.println("Jogada inválida!");
            	continue;
            }
                                  
         	Jogo jogo = new Jogo();
         	resultado = jogo.executar(primeiraJogada, segundaJogada);
         	
         	String mensagem = montaMensagem(resultado, primeiraJogada, segundaJogada);
         	System.out.println(mensagem);       
         	
        } while(resultado != null);
        
        scanner.close();

    }

	public static String montaMensagem(Resultado resultado, Jogada primeiraJogada, Jogada segundaJogada) {
		
		switch(resultado) {

	 		case EMPATE:
	 			return "Empate";
	 		case VITORIA:
	 			return primeiraJogada +" venceu!";
	 		case DERROTA:
	 			return segundaJogada+" venceu!";
	 		default:
	 			return "Resultado inválido!";

		}  
	}
	
    
}
