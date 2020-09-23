package br.org.fundatec.lp3.jokenpo;

public class Jogo {

    private Resultado[][] results;

    public Jogo() {
        inicializaRegras();
    }

    public Resultado executar(Jogada move1, Jogada move2) {

        return this.results[move1.getValor()][move2.getValor()];
    }

    private void inicializaRegras() {

        this.results = new Resultado[3][3];

        this.results[Jogada.PEDRA.getValor()][Jogada.PEDRA.getValor()] = Resultado.EMPATE;
        this.results[Jogada.PEDRA.getValor()][Jogada.PAPEL.getValor()] = Resultado.DERROTA;
        this.results[Jogada.PEDRA.getValor()][Jogada.TESOURA.getValor()] = Resultado.VITORIA;
        this.results[Jogada.PAPEL.getValor()][Jogada.PEDRA.getValor()] = Resultado.VITORIA;
        this.results[Jogada.PAPEL.getValor()][Jogada.PAPEL.getValor()] = Resultado.EMPATE;
        this.results[Jogada.PAPEL.getValor()][Jogada.TESOURA.getValor()] = Resultado.DERROTA;
        this.results[Jogada.TESOURA.getValor()][Jogada.PEDRA.getValor()] = Resultado.DERROTA;
        this.results[Jogada.TESOURA.getValor()][Jogada.PAPEL.getValor()] = Resultado.VITORIA;
        this.results[Jogada.TESOURA.getValor()][Jogada.TESOURA.getValor()] = Resultado.EMPATE;

    }

}
