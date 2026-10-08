import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        //ANGEL DAHIR HERNANDEZ ATILANO   1B-DSM
        System.out.print("Ingresa el promedio del alumno: ");
        double promedio= teclado.nextDouble();
        System.out.print("Ingresa el porcentaje de la asistencia: ");
        double asistencia= teclado.nextDouble();
        if (promedio < 7.0) {
            System.out.println("Reprobado por calificación");
        } else if (asistencia < 80) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }
    }
}