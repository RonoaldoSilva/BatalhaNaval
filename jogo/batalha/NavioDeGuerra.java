package jogo.batalha;

import java.util.Scanner;

public class NavioDeGuerra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //inicialize os tabuleiros e o jogo
        int tabuleiroTamanho = 15;
        Tabuleiro tabuleiro1 = new Tabuleiro(tabuleiroTamanho);
        Tabuleiro tabuleiro2 = new Tabuleiro(tabuleiroTamanho);
        Jogo jogo = new Jogo(tabuleiro1, tabuleiro2, scanner);

        jogo.comecar();
    }
}
