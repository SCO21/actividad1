import java.util.Scanner;

public class ejercicio3 {

  public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int edadj;
        System.out.println("Juan, por favor ingresa tu edad");
        edadj = entrada.nextInt();
        int alberto;
        alberto = edadj * 2/3;
        int ana;
        ana = edadj * 4/3;
        int mama;
        mama = edadj + alberto + ana;
        System.out.println("la edad de juan es: " + edadj);
        System.out.println("la edad de alberto es: " + alberto);
        System.out.println("la edad de ana es: " + ana);
        System.out.println("la edad de la madre de juan es: " + mama);
    }
    
}