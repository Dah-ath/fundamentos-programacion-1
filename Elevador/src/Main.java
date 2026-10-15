import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        System.out.println("ELEVADOR");
        int piso;
        int numero;
        System.out.print("En que piso estoy: ");
        piso=teclado.nextInt();
        System.out.print("Quiero ir al piso:");
        numero = teclado.nextInt();
        if (piso<=0 || numero<=0) {
            System.out.println("No existen los pisos 0");
        } else if (piso<numero) {
            while (piso<numero) {
                piso++;
                System.out.println("Estoy en el piso: "+piso);
            }
            System.out.println("LLegue al piso: "+piso);
        } else if (piso>numero) {
            while (piso>numero) {
                piso--;
                System.out.println("Estoy en el piso: "+piso);
            }
            System.out.println("LLegue al piso: "+piso);
        }
    }
}
