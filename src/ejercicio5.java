public class ejercicio5 {

   
    public static void main(String[] args) {
        double SUMA;
        double X;
        double Y;
        double cuadrado = 2;
        X = 20;
        SUMA = 0;
        SUMA = SUMA + X;
        Y = 40;
        X = X + Math.pow(Y, cuadrado);
        SUMA = SUMA + X/Y;
        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA); 
    }
}