package ifsc.poo;
import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Navio {
   
    public void desenhar(int linha, int coluna, int quantidade, String orientacao, Grade grade, Draw draw){
        draw.setPenColor(Color .RED);


        if(orientacao.equals("Horizontal")){

          
            for(int i =0; i < quantidade; i++){
                int x = 40 + coluna * grade.getPixel() + grade.getPosX();
                int y = 45 + linha * grade.getPixel() + grade.getPosY();
                draw.filledSquare(x, y, grade.getPixel()/2);
                coluna++;
            }
        
        }else if(orientacao.equals("Vertical")){

            

            for(int i =0; i < quantidade; i++){
                int x = 40 + coluna * grade.getPixel() + grade.getPosX();
                int y = 45 + linha * grade.getPixel() + grade.getPosY();
                draw.filledSquare(x, y, grade.getPixel()/2);
                linha++;
            }

        }else{
            System.out.println("Orientação inválida!");
        }
            
    
    
        }
      
        
    }

