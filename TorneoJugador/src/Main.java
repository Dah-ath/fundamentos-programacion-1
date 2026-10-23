import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PARTIDAS DE UN JUGADOR");
        //ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        System.out.println();
        int acumulacion=0;
        int puntos;
        int PuntosMayor=0;
        int PuntosMenor=0;
        double promedio;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Ingresa los puntos obtenidos: ");
            puntos= teclado.nextInt();
            acumulacion =acumulacion+puntos;
            if (puntos>1000) {
                PuntosMayor++;
            } else {
                PuntosMenor++;
            }
        }
        promedio=acumulacion/7.0;
        System.out.println("Tus puntos acumulados son: "+acumulacion);
        System.out.println("El promedio de puntuacion es: "+promedio);
        System.out.println("Las partidas con mas de 1000 puntos obtenidos son: "+PuntosMayor);
        System.out.println("Las partidas con 1000 puntos y menos puntos que se obtuvieron son: "+PuntosMenor);
    }
}