package ifsc.poo;
import java.awt.Color;

import edu.princeton.cs.algs4.Draw;
public class Grade {
    private int pixel; //Definindo um atributo de pixel
    private int posX, posY; //Posição de cada quadrado do tabuleiro
   String [] Caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}, Numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; //Legenda de cada tbauleiro

   //Método construtor para iniciar o tabuleiro no draw (considerei uma posição negativa como inválida)
    public Grade(int x, int y){
        if (x < 0 || y < 0) {
            System.out.println("Coordenadas inválidas");
            System.exit(1);
        }else{
            this.posX = x;
            this.posY = y;

        }
    }

    //Método para setar o pixel dos tabuleiros
    public void setPixel(int pixel){
        this.pixel = pixel;
    }
    
    //Imprime cada tabuleiro no draw
    public void desenhar(Draw draw) {

        //aqui é impresso primeiro os números para ajustar a formatação correta de cada tabuleiro, pois tanto o vetor de numeros quanto o de Strings possuem tamanho 10, mas o numero de linhas/colunas é 9
        draw.setPenColor(Color.RED);
        for (int j = 0; j < 10; j++) {
            draw.text(40 + j * pixel + posX, posY + 12, Numeros[j]);
        }

        //imprime o tabuleiro com os caracteres de A até J
        for (int i = 0; i < 10; i++) {
            draw.setPenColor(Color.RED);
            draw.text(posX + 12, 45 + i * pixel + posY, Caracteres[i]);
    
            for (int j = 0; j < 10; j++) {
                draw.setPenColor(Color.BLACK);
                draw.square(40 + j * pixel + posX, 45 + i * pixel + posY, pixel/2);
            }
        }
    }

    //Método que retorna a posição da grade em x
    public int getPosX(){
        return this.posX;
    }

    //Método que retorna a posição da grade em Y
    public int getPosY(){
        return this.posY;
    }

    //Retorna o pixel de cada grade
    public int getPixel(){
        return this.pixel;
    }    
 
}
