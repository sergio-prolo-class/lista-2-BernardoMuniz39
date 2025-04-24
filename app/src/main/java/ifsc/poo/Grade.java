package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int x, y;
    final int pixel = 40;
    String [] Caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    String [] Numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


    public void desenhar(Draw draw){
       for(int i = 1; i <= 10; i++){
           draw.text(20, 47 * i, Caracteres[i - 1]);
           for (int j = 1; j <= 10; j++) {
               draw.square(i * pixel + 40, j * pixel + 40, pixel);
               draw.text(46 *j, 26, Numbers[j - 1]);
           }
       }
    }
}
