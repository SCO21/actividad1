public class ejercicio2 {

    
    public static void main(String[] args) {
        int horas = 48;
        int diario = 5000;
        int bruto;
        bruto = horas * diario;
        double retencion = 0.125 ;
        double retencion2;
        retencion2 = bruto * retencion;
        int neto;
        neto = (int)bruto - (int)retencion2;
        System.out.println("el salario bruto es: " + bruto );
        System.out.println("la retencion de fuente es: " + retencion2);
        System.out.println("el salario neto es: " + neto);
    }
    
}