
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("CONTROL DE ESTACIONAMIENTO");
        //ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        System.out.println();
        int horasEstacionadas=1;
        int AutosTot=0;
        int descuento=0;
        double pago;
        double acum=0;
        double prom;
        for (;horasEstacionadas!=0;) {
            System.out.print("Ingresa las horas que vas a durar estacionado: ");
            horasEstacionadas=teclado.nextInt();
            if (horasEstacionadas<0) {
                System.out.println("Horas ingresadas incorrectas");
            } else {
                if (horasEstacionadas !=0) {
                    pago=horasEstacionadas*15;
                    if (horasEstacionadas>5) {
                        pago=pago-10;
                        descuento++;
                    }
                    System.out.println("La cantidad a pagar del auto es: $"+pago);
                    acum=acum+pago;
                    AutosTot++;
                }
            }
        }
        System.out.println("El total de los automoviles atendidos son: "+AutosTot);
        System.out.println("El total de dinero recaudado es: $"+acum);
        System.out.println("La cantidad de automoviles que recibieron descuento son: "+descuento);
        if (AutosTot>0) {
            prom=acum/AutosTot;
            System.out.println("El promedio pagado por automovil es de: $"+prom);
        } else {
            System.out.println("No hubo automoviles estacionados");
        }
    }
}