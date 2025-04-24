package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
public class Grade {
    final int pixel = 40;
    private int posX, posY;
   String [] Caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    String [] Numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public Grade(int x, int y){
        if (x < 0 || y < 0) {
            System.out.println("Coordenadas inválidas");
        }else{
            this.posX = x;
            this.posY = y;

        }
    }
    
    


    public void desenhar(Draw draw){
        
        for(int i = 1; i < 10; i++){
             draw.setPenColor(Color .RED);
            draw.text(posX + 25, 45 * i + posY + 5, Caracteres[i]);
            
            for (int j = 1; j < 10; j++) {
                 draw.setPenColor(Color .BLACK);
                 
                draw.square(i * pixel + 40 + this.posX, j * pixel + 45 + this.posY, pixel);
 
                draw.setPenColor(Color .RED);
                draw.text(46.5 * j + posX, posY + 25, Numbers[j]);
            }
        }
     }
 
}
