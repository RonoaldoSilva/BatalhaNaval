package jogo.batalha;

public class Cruzador implements Navio{
    private int qtdDeNavios = 3;
    private int tamanhoNavio = 3;
    private String nomeNavio = "Cruzador";


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
