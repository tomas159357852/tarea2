import java.util.Scanner;
public class ejercicio05 {
    static Scanner teclado=new Scanner(System.in);

    public static void ejercicio5() {
        //Variables
        int alumnost, aprobados=0, desaprobados=0, total;
        //Entrada
        System.out.println("Ingrese la cantidad de alumnos en total:");
        alumnost=teclado.nextInt();
        //Proceso
        for (int alumno=1; alumno<=alumnost; alumno++) {
            System.out.print("Ingrese la nota del estudiante numero "+alumno+":");
            total=teclado.nextInt();
            if (total<=10) {desaprobados++;} 
            if (total>10) {aprobados=aprobados+1;}          
        }
        System.out.println("Del total de estudiantes:\n"+aprobados+" fueron aprobados"+
        "\n"+desaprobados+" fueron desaprobados");
        }
        public static void main(String[] args) {
            ejercicio5();
        }
    }


