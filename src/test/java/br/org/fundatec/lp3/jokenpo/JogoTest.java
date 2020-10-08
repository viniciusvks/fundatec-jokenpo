package br.org.fundatec.lp3.jokenpo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JogoTest {

	@Test
	public void jogoDeveRetornarErroParaJogadaInvalida() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(null, null);
				
		//Validacao
     	assertNull(resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarEmpateParaJogadasIguais() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.PEDRA, Jogada.PEDRA);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.EMPATE;
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarPapelVenceParaPedraContraPapel() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.PEDRA, Jogada.PAPEL);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.DERROTA;
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarPedraVenceParaPedraContraTesoura() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.PEDRA, Jogada.TESOURA);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.VITORIA;
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarPapelVenceParaPapelContraPedra() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.PAPEL, Jogada.PEDRA);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.VITORIA;
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarTesouraVenceParaPapelContraTesoura() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.PAPEL, Jogada.TESOURA);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.DERROTA;
     	assertEquals(resultadoEsperado, resultado);
     	
	}

	@Test
	public void jogoDeveRetornarPedraVenceParaTesouraContraPedra() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.TESOURA, Jogada.PEDRA);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.DERROTA;
     	assertEquals(resultadoEsperado, resultado);
     	
	}
	
	@Test
	public void jogoDeveRetornarTesouraVenceParaTesouraContraPapel() {
		
		//Cenario
		Jogo jogo = new Jogo();
     	
		//Execucao
		Resultado resultado = jogo.executar(Jogada.TESOURA, Jogada.PAPEL);
				
		//Validacao
		Resultado resultadoEsperado = Resultado.VITORIA;
     	assertEquals(resultadoEsperado, resultado);
     	
	}

}
