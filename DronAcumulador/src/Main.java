import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        int pila;
        int minuto =1;
        System.out.print("Ingresa el porcentaje de bateria del dron: ");
        pila=teclado.nextInt();
        if (pila> 0 &&pila <=100) {
            while (pila >=7) {
                pila= pila-7;
                System.out.println("Minuto " +minuto +" bateria baja con " +pila +"%");
                minuto++;
            }
            System.out.println("La bateria se agoto!");
        }else{
            System.out.println("No se puede volar con 0 de bateria");
        }
    }
}