package br.org.fundatec.lp3.jokenpo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("|--jokenpo--|");
        int jogada1;
        int jogada2;
    
        String resultado;
        
        do {

            System.out.println("> ESCOLHA UMA JOGADA:");
            System.out.println(">| PEDRA - 0 | PAPEL - 1 | TESOURA - 2 |");
            System.out.print("> Jogador 1: ");
            jogada1 = scanner.nextInt();
            System.out.print("> Jogador 2: ");
            jogada2 = scanner.nextInt();
            
         	Jogo jogo = new Jogo();
         	resultado = jogo.executar(jogada1, jogada2);

            System.out.println(resultado);            

        } while(resultado == "Jogada invalida!");
        
        scanner.close();

    }

    
}
