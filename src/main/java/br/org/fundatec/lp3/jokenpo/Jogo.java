package br.org.fundatec.lp3.jokenpo;

public class Jogo {

	public String executar(int jogada1, int jogada2)
	{
        Jogada primeiraJogada = Jogada.comValor(jogada1);
        Jogada segundaJogada = Jogada.comValor(jogada2);
        
        String resultado = "Resultado Invalido";

        if(primeiraJogada == null || segundaJogada == null) {

            return "Jogada invalida!";

        } else {

            if(primeiraJogada == segundaJogada) {
            	resultado = "Empate";
            } else if(primeiraJogada == Jogada.PEDRA && segundaJogada == Jogada.PAPEL) {
            	resultado = "Papel venceu!";
            }
             else if(primeiraJogada == Jogada.PEDRA && segundaJogada == Jogada.TESOURA) {
            	 resultado = "Pedra venceu!";
            }
             else if(primeiraJogada == Jogada.PAPEL && segundaJogada == Jogada.PEDRA) {
            	 resultado = "Papel venceu!";
            }
             else if(primeiraJogada == Jogada.PAPEL && segundaJogada == Jogada.TESOURA) {
            	 resultado = "Tesoura venceu!";
            }
             else if(primeiraJogada == Jogada.TESOURA && segundaJogada == Jogada.PEDRA) {
            	 resultado = "Pedra venceu!";
            }
             else if(primeiraJogada == Jogada.TESOURA && segundaJogada == Jogada.PAPEL) {
            	 resultado = "Tesoura venceu!";
            }
            
        }
        
		return resultado;
               
	}
	
}
