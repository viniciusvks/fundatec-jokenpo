package br.org.fundatec.lp3.jokenpo;

public class Jogo {

	public String executar(int jogada1, int jogada2)
	{
		
		boolean jogada1Valida = false;
        boolean jogada2Valida = false;
	
        if(jogada1 == 0 || jogada1 == 1 || jogada1 == 2) {
            jogada1Valida = true;
        }

        if(jogada2 == 0 || jogada2 == 1 || jogada2 == 2) {
            jogada2Valida = true;
        }
        
        String resultado = "Resultado Invalido";

        if(!jogada1Valida || !jogada2Valida) {

            return "Jogada invalida!";

        } else {

            String nomeJogada1 = getNomeJogada(jogada1);
            String nomeJogada2 = getNomeJogada(jogada2);
            

            if(nomeJogada1 == nomeJogada2) {
            	resultado = "Empate";
            } else if(nomeJogada1 == "PEDRA" && nomeJogada2 == "PAPEL") {
            	resultado = "Papel venceu!";
            }
             else if(nomeJogada1 == "PEDRA" && nomeJogada2 == "TESOURA") {
            	 resultado = "Pedra venceu!";
            }
             else if(nomeJogada1 == "PAPEL" && nomeJogada2 == "PEDRA") {
            	 resultado = "Papel venceu!";
            }
             else if(nomeJogada1 == "PAPEL" && nomeJogada2 == "TESOURA") {
            	 resultado = "Tesoura venceu!";
            }
             else if(nomeJogada1 == "TESOURA" && nomeJogada2 == "PEDRA") {
            	 resultado = "Pedra venceu!";
            }
             else if(nomeJogada1 == "TESOURA" && nomeJogada2 == "PAPEL") {
            	 resultado = "Tesoura venceu!";
            }
            
        }
        
		return resultado;
               
	}
        
    private String getNomeJogada(int jogada) {

        String nomeJogada = "Jogada invalida!";

        if(jogada == 0) {
            nomeJogada = "PEDRA";
        } else if(jogada == 1) {
            nomeJogada = "PAPEL";
        } else {
            nomeJogada = "TESOURA";
        }

        return nomeJogada;

    }
	
}
