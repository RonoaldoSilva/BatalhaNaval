package jogo.batalha;

public class Destroyer implements Navio{
    private int qtdDeNavios = 1;
    private int tamanhoNavio = 5;
    private String nomeNavio;


    @Override
    public int getTamanhoNavio() {
        return tamanhoNavio;
    }

    @Override
    public int getQtdDeNavios() {
        return qtdDeNavios;
    }

    @Override
    public String gerNomeNavio() {
        return nomeNavio;
    }
}
