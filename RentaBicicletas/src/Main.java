import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double tarifaPorHora= 0;
        String tipoBicicleta= "";
        //ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        System.out.println("Renta de las bicicletas:");
        System.out.println();
        System.out.println("1. Bicicleta urbana.");
        System.out.println("2. Bicicleta de montaña.");
        System.out.println("3. Bicicleta eléctrica.");
        System.out.print("Elige el tipo de bicicleta que quieres: ");
        int opcion=teclado.nextInt();
        switch (opcion) {
            case 1:
                tarifaPorHora= 40;
                tipoBicicleta="Bicicleta urbana";
                break;
            case 2:
                tarifaPorHora= 60;
                tipoBicicleta="Bicicleta de montaña";
                break;
            case 3:
                tarifaPorHora= 90;
                tipoBicicleta="Bicicleta eléctrica";
                break;
            default:
                System.out.println("¡Opción no válida!");
        }
        if (opcion>= 1 && opcion<=3) {
            System.out.print("Ingresa la cantidad de horas: ");
            int cantidadHoras= teclado.nextInt();
            if (cantidadHoras> 0) {
                System.out.print("¿Cuentas con alguna membresia? (true/false): ");
                boolean membresia= teclado.nextBoolean();
                double subtotal= tarifaPorHora*cantidadHoras;
                double descuento;
                if (membresia) {
                    descuento =subtotal*0.20;
                } else {
                    descuento= 0;
                }
                double total=subtotal-descuento;
                System.out.println("El tipo de bicicleta es: "+tipoBicicleta);
                System.out.println("El subtotal es: $"+subtotal);
                System.out.println("El descuento aplicado es: $"+descuento);
                System.out.println("El total a pagar es: $"+total);
            } else {
                System.out.println("¡Cantidad de horas inválidas!");
            }
        }
    }
}
