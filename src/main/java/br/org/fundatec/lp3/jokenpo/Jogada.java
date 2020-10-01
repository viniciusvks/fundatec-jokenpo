package br.org.fundatec.lp3.jokenpo;

public enum Jogada {

	PEDRA(0),
	PAPEL(1),
	TESOURA(2);
	
	private int valor;
	
	Jogada(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public static Jogada comValor(int valor) {

		Jogada[] jogadas = values();
		
		for(Jogada jogada : jogadas) {

			if(jogada.getValor() == valor) {
				return jogada;
			}
		}
		
		return null;
		
	}
	
}
