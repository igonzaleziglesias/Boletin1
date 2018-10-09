
package boletin1_3;
import java.util.Scanner;

public class Boletin1_3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        float euros=0.0f,cambio=0.0f,dolares=0.0f;
        
        System.out.println("Introducir los euros: ");
        euros= ler.nextFloat();
        
        System.out.println("Introducir la equivalencia en dolares: ");
        cambio=ler.nextFloat();
        
        System.out.println(euros+" euros ="+(euros*cambio)+" dolares");
        
        
    }
    
}
