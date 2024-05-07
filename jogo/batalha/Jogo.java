package jogo.batalha;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Random generate = new Random();

    public Jogo(Tabuleiro tabuleiro1, Tabuleiro tabuleiro2, Scanner scanner){
        this.jogador1 = new Jogador(tabuleiro1, scanner);
        this.jogador2 = new Jogador(tabuleiro2, scanner);
    }

    public Jogo() {

    }

    public  void comecar(){
        //ciclo de jogo
        int linha = generate.nextInt(15);
        int coluna = generate.nextInt(15);
        boolean cabr = false;

        ArrayList<Navio> navios = new ArrayList<>();

        navios.add(new Destroyer());
        navios.add(new Cruzador());
        navios.add(new Patrulha());
        navios.add(new Porta_Aviao());
        navios.add(new Submarino());


        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j ++){
                vetor[i][j] = 0;
            }
        }

        for(int cont = 0; cont < navios.size(); cont++){
            int contador = 0;
            while(navios.get(cont).getQtdDeNavios()> contador){
                int orientacao = generate.nextInt(2);
                boolean cabe = cabeNavio(linha, coluna, orientacao, navios.get(cont).getTamanhoNavio(), vetor);

                if(cabe == false){
                    while(cabe == false){
                        linha = generate.nextInt(15); // Linha
                        coluna = generate.nextInt(15); // Coluna
                        cabe = cabeNavio(linha, coluna, orientacao, navios.get(cont).getTamanhoNavio(), vetor);
                    }
                }
                if (orientacao == 0){
                    for (int i = 0; i < navios.get(cont).getTamanhoNavio(); i++){
                        vetor[linha][coluna] = 1;
                        linha++;
                    }
                }
                else if (orientacao == 1){
                    for (int i = 0; i < navios.get(cont).getTamanhoNavio(); i++){
                        vetor[linha][coluna] = 1;
                        coluna++;
                    }
                }
                contador++;
            }
        }

    }
    public boolean cabeNavio(int linha, int coluna, int orientacao, int tamanho, int[][] vetor){
        // Se a orientação for Vertical, trava a coluna e incrementa a linha
        if (orientacao == 0){
            if (linha > (9 - tamanho)){
                return false;
            }
            for (int row = 0; row < tamanho; row++){
                if (vetor[linha][coluna] == 0){
                    linha++;
                }
                else {
                    return false;
                }
            }
            return true;
        }

        // Se a orientação for Horizontal, trava a linha e incrementa a coluna
        if (orientacao == 1){
            if (coluna > (9 - tamanho)){
                return false;
            }
            for (int col = 0; col < tamanho; col++){
                if (vetor[linha][coluna] == 0){
                    coluna++;
                }
                else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
