import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       double numero;
       System.out.println("ingrese un numero");
       numero = entrada.nextDouble();
       double cuadrado = 2;
       double res1;
       double cubo = 3;
       double res2;
       res1 = Math.pow(numero, cuadrado);
       res2 = Math.pow(numero, cubo);
       System.out.println("el cuadrado del numero es: " + res1);
       System.out.println("el cubo del numero es: " + res2);
        
    }
}
