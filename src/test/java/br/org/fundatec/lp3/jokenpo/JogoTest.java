package br.org.fundatec.lp3.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JogoTest {

    @Test
    public void jogoDeveRetornarEmpateParaPedraEPedra() {

        Jogo jogo = new Jogo();
        assertEquals(Resultado.EMPATE, jogo.executar(Jogada.PEDRA, Jogada.PEDRA));

    }

   @Test
   public void jogoDeveRetornarDerrotaParaPedraEPapel() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.DERROTA, jogo.executar(Jogada.PEDRA, Jogada.PAPEL));

   }

   @Test
   public void jogoDeveRetornarVitoriaParaPedraETesoura() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.VITORIA, jogo.executar(Jogada.PEDRA, Jogada.TESOURA));

   }

   @Test
   public void jogoDeveRetornarVitoriaParaPapelEPedra() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.VITORIA, jogo.executar(Jogada.PAPEL, Jogada.PEDRA));

   }

   @Test
   public void jogoDeveRetornarEmpateParaPapelEPapel() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.EMPATE, jogo.executar(Jogada.PAPEL, Jogada.PAPEL));

   }

   @Test
   public void jogoDeveRetornarDerrotaParaPapelETesoura() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.DERROTA, jogo.executar(Jogada.PAPEL, Jogada.TESOURA));

   }

   @Test
   public void jogoDeveRetornarDerrotaParaTesouraEPedra() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.DERROTA, jogo.executar(Jogada.TESOURA, Jogada.PEDRA));

   }

   @Test
   public void jogoDeveRetornarVitoriaParaTesouraEPapel() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.VITORIA, jogo.executar(Jogada.TESOURA, Jogada.PAPEL));

   }

   @Test
   public void jogoDeveRetornarEmpateParaTesouraETesoura() {

       Jogo jogo = new Jogo();
       assertEquals(Resultado.EMPATE, jogo.executar(Jogada.TESOURA, Jogada.TESOURA));

   }

}
