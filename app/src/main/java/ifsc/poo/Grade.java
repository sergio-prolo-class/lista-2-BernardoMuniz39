package ifsc.poo;
import java.awt.Color;

import edu.princeton.cs.algs4.Draw;
public class Grade {
    final int pixel = 40;
    private int posX, posY;
   String [] Caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}, Numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public Grade(int x, int y){
        if (x < 0 || y < 0) {
            System.out.println("Coordenadas inválidas");
            System.exit(1);
        }else{
            this.posX = x;
            this.posY = y;

        }
    }
    
    


    public void desenhar(Draw draw) {
        draw.setPenColor(Color.RED);
        for (int j = 0; j < 10; j++) {
            draw.text(40 + j * pixel + posX, posY + 10, Numbers[j]);
        }

        for (int i = 0; i < 10; i++) {
            draw.setPenColor(Color.RED);
            draw.text(posX + 10, 45 + i * pixel + posY, Caracteres[i]);
    
            for (int j = 0; j < 10; j++) {
                draw.setPenColor(Color.BLACK);
                draw.square(40 + j * pixel + posX, 45 + i * pixel + posY, pixel/2);
            }
        }
    }

    public int getPosX(){
        return this.posX;
    }

    public int getPosY(){
        return this.posY;
    }

    public int getPixel(){
        return this.pixel;
    }    
 
}
