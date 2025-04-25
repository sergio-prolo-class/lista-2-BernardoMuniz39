package ifsc.poo;
import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    
    public void desenhar(int coluna, int linha, int quantidade, String orientacao, Grade grade, Draw draw){
        draw.setPenColor(Color .RED);

        
        //Verificação básica para não ter quadrados fora do tabuleiro
        if(quantidade + coluna > 10 || quantidade + linha > 10){
            System.out.println("Posição inválida!");
            System.exit(1);
        }

        switch(orientacao){
            case "Horizontal"->{

                //Pinta os quadrados na horizontal imcrementando o numero de colunas

                for(int i =0; i < quantidade; i++){
                    int x = 40 + coluna * grade.getPixel() + grade.getPosX();
                    int y = 45 + linha * grade.getPixel() + grade.getPosY();
                    draw.filledSquare(x, y, grade.getPixel()/2);
                    coluna++;
                }
            }

            
            case "Vertical"->{

                //Pinta os quadrados na vertical imcrementando o numero de linhas
                for(int i =0; i < quantidade; i++){
                    int x = 40 + coluna * grade.getPixel() + grade.getPosX();
                    int y = 45 + linha * grade.getPixel() + grade.getPosY();
                    draw.filledSquare(x, y, grade.getPixel()/2);
                    linha++;
                }
            }
            default->{
                System.out.println("Orientação inválida!");
                System.exit(1);
            }
        }
    }
      
        
    }

