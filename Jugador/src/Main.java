import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //ANGEL DAHIR HERNANDEZ ATILANO 1B-DSM
        System.out.println("PUNTOS GANADOS POR EL JUGADOR: ");
        int opc;
        int puntos=100;
        do{
        System.out.println();
        System.out.println("1. Ganar 20 puntos. ");
        System.out.println("2. Gastar 15 puntos. ");
        System.out.println("3. Consultar puntos. ");
        System.out.println("4. Salir. ");
        System.out.print("Selecciona una opcion para el jugador: ");
        opc=teclado.nextInt();
        switch (opc){
            case 1:
                puntos= puntos+20;
                System.out.println("Ganaste 20 puntos");
                System.out.println("Tus puntos ahora son: "+puntos);
                break;
            case 2:
                if (puntos>=15) {
                    puntos =puntos-15;
                    System.out.println("Perdiste 15 puntos");
                    System.out.println("Tus puntos ahora son: " +puntos);
                } else {
                    System.out.println("No cuentas con tantos puntos");
                }
                break;
            case 3:
                System.out.println("Tus puntos obtenidos son: "+puntos);
                break;
            case 4:
                System.out.print("Fin de la ejecucion del programa");
                break;
            default:
                System.out.print("¡Opcion invalida, elige otra ves!");
        }
        }while (opc!=4);
        System.out.println("Puntos que te quedaron: " +puntos);
    }
}