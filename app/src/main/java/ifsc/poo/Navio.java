package ifsc.poo;
import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    final int tamLinhasColunas = 10;
    private int quantidade, linha, coluna;
    private String orientacao;

    private void verificaLinhasColunas(int coluna, int linha){
        if (linha >= 0 && coluna >= 0){
            this.linha = linha;
            this.coluna = coluna;
        }else{
            System.out.println("Linha ou coluna inválida!");
            System.exit(1);
        }
    }

    private void verificaQuantidade(int qtd){
        if (qtd > 0){
            this.quantidade = qtd;
        }else{
            System.out.println("Quantidade de navios inválida!");
            System.exit(1);
        }
    }

    private void verificaOrientacao(String orientacao){
        orientacao = orientacao.toLowerCase(); //ignora letras maiúsculas
        if (orientacao.equals("vertical") || orientacao.equals("horizontal")){
            this.orientacao = orientacao;
        }else{
           System.out.println("Orientação inválida!");
           System.exit(1);
        }
    }

    
    public void desenhar(int coluna, int linha, int quantidade, String orientacao, Grade grade, Draw draw){
        draw.setPenColor(Draw .BOOK_RED);

        //Verifica cada parâmetro do navio
        verificaLinhasColunas(coluna, linha);
        verificaQuantidade(quantidade);
        verificaOrientacao(orientacao);

        //Verificação básica para não ter quadrados fora do tabuleiro
        if(quantidade + coluna > tamLinhasColunas || quantidade + linha > tamLinhasColunas){
            System.out.println("Posição inválida!");
            System.exit(1);
        }

        switch(this.orientacao){
            case "horizontal"->{

                //Pinta os quadrados na horizontal imcrementando o numero de colunas

                for(int i =0; i < quantidade; i++){
                    int x = 40 + coluna * grade.getPixel() + grade.getPosX();
                    int y = 45 + linha * grade.getPixel() + grade.getPosY();
                    draw.filledSquare(x, y, (double) grade.getPixel()/2);
                    coluna++;

                }
            }

            
            case "vertical"-> {

                //Pinta os quadrados na vertical imcrementando o numero de linhas
                for (int i = 0; i < quantidade; i++) {
                    int x = 40 + coluna * grade.getPixel() + grade.getPosX();
                    int y = 45 + linha * grade.getPixel() + grade.getPosY();
                    draw.filledSquare(x, y, (double)grade.getPixel() / 2);
                    linha++;

                }
            }
        }
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public String getOrientacao(){
        return this.orientacao;
    }


        
    }

