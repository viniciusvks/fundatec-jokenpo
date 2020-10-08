package br.org.fundatec.lp3.jokenpo;

public class Jogo {
	
	private Resultado[][] resultados;
	
	public Jogo() {
		inicializaRegras();
	}
	
	public static void exemplo() {}

	public Resultado executar(Jogada primeiraJogada, Jogada segundaJogada) {

        if(primeiraJogada == null || segundaJogada == null) {

            return null;

        } else {

            if(primeiraJogada == segundaJogada) {            	
            	return Resultado.EMPATE;
            } else {
            	return resultados[primeiraJogada.getValor()][segundaJogada.getValor()];
            }
            
        }
               
	}
	
	private void inicializaRegras() {
		
		resultados = new Resultado[3][3];
		
		resultados[Jogada.PEDRA.getValor()][Jogada.PAPEL.getValor()] = Resultado.DERROTA;
        resultados[Jogada.PEDRA.getValor()][Jogada.TESOURA.getValor()] = Resultado.VITORIA;
        resultados[Jogada.PAPEL.getValor()][Jogada.PEDRA.getValor()] = Resultado.VITORIA;
        resultados[Jogada.PAPEL.getValor()][Jogada.TESOURA.getValor()] = Resultado.DERROTA;
        resultados[Jogada.TESOURA.getValor()][Jogada.PEDRA.getValor()] = Resultado.DERROTA;
        resultados[Jogada.TESOURA.getValor()][Jogada.PAPEL.getValor()] = Resultado.VITORIA;
		
	}
	
}
