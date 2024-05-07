package jogo.batalha;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private char [][] tabuleiro;
    private List<Navio> navios;

    public Tabuleiro(int size) {
        this.tabuleiro = new char[size][size];
        this.navios = new ArrayList<>();

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){

            }
        }
        //ADICIONAR MÉTODOS PARA POSICIONAR NAVIOS, VERIFICAR ACERTOS, ETC.

    }
}
