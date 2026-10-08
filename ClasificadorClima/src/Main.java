import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        //ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        System.out.print("Ingresa la temperatura en grados: ");
        int temperatura = teclado.nextInt();
        if (temperatura<10) {
            System.out.println("Frío extremo");
        } else if (temperatura<21) {
            System.out.println("Clima fresco");
        } else if (temperatura<=30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }
    }
}