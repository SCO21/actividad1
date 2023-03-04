import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el radio del circulo");
        double cuadrado = 2;
        double radio;
        radio = entrada.nextDouble();
        double area;
        area = Math.PI * Math.pow(radio, cuadrado);
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.println("el area del circulo es: " + area);
        System.out.println("la longitud de la circunferencia es: " + perimetro);                      
    }   
}
