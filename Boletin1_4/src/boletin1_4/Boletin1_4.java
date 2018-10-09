
package boletin1_4;
import java.util.Scanner;

public class Boletin1_4 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float a=0.0f,b=0.0f,suma=0.0f,resta=0.0f,multiplicacion=0.0f,division=0.0f;
        
        System.out.println("Introduce el primer numero:");
        a=ler.nextFloat();
        
        System.out.println("Introduce el segundo numero:");
        b=ler.nextFloat();
        
        suma=a+b;
        System.out.println("Suma= " +suma);
        resta=a-b;
        System.out.println("Resta= " +resta);
        multiplicacion=a*b;
        System.out.println("Multiplicacion " +multiplicacion);
        division=a/b;
        System.out.println("Division= " +division);
        
    }
    
}
