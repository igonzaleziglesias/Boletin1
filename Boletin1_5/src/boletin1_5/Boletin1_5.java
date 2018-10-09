
package boletin1_5;
import java.util.Scanner;
public class Boletin1_5 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float d=0.0f;
        final int CONST=1852;
        System.out.println("Introduce las millas marinas: ");
        d=ler.nextFloat();
        System.out.println(d+" millas marinas son = "+d*CONST+" m");
    }
    
}
