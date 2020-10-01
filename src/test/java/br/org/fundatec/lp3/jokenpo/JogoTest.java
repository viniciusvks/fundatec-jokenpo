package br.org.fundatec.lp3.jokenpo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JogoTest {

	@Test
	public void jogoDeveRetornarErroParaJogadaInvalida() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 8;
		int jogada2 = 1;
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Jogada invalida!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarEmpateParaJogadasIguais() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 1;
		int jogada2 = 1;
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Empate";
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarPapelVenceParaPedraContraPapel() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 0; //Pedra
		int jogada2 = 1; //Papel
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Papel venceu!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarPedraVenceParaPedraContraTesoura() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 0; //Pedra
		int jogada2 = 2; //Tesoura
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Pedra venceu!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarPapelVenceParaPapelContraPedra() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 1; //papel
		int jogada2 = 0; //Pedra
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Papel venceu!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarTesouraVenceParaPapelContraTesoura() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 1; //Papel
		int jogada2 = 2; //Tesoura
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Tesoura venceu!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}

	@Test
	public void jogoDeveRetornarPedraVenceParaTesouraContraPedra() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 2; //Tesoura
		int jogada2 = 0; //Pedra
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Pedra venceu!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarTesouraVenceParaTesouraContraPapel() {
		
		//Cenario
		Jogo jogo = new Jogo();
		int jogada1 = 2; //Tesoura
		int jogada2 = 1; //Papel
     	
		//Execucao
		String resultado = jogo.executar(jogada1, jogada2);
				
		//Validacao
		String resultadoEsperado = "Tesoura venceu!";
     	assertEquals(resultadoEsperado, resultado);
     	
	}

}
