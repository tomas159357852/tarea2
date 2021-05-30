import java.util.Scanner;
public class ejercicio02 {
    static Scanner teclado=new Scanner(System.in);

    public static void ejercicio2(){
    int estudiantest, estudiantess=1, edadE;
    double promedioA=0;
    System.out.println("Averigua la edad promedio de los estudiantes de tu salon");
    System.out.println("Ingrese cuantos estudiantes son en el salon:");
    estudiantest=teclado.nextInt();
    while (estudiantess<=estudiantest) {
        System.out.println("Ingrese la edad del estudiante "+estudiantess+":");
        edadE=teclado.nextInt();
        promedioA=promedioA+edadE;
        estudiantess++;
    }
    
    System.out.println("El promedio de los estudiantes es:"+promedioA/estudiantest);
    }
    public static void main(String[] args) {
    ejercicio2();

}
}

