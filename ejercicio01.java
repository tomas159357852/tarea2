import java.util.Scanner;
public class ejercicio01 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio1() {
        double capital, interes=0.10, inversionf=0;
        int años;
        //ingreso de datos
        System.out.println("Ingresa el capital a depositar");
        capital=teclado.nextDouble();
        System.out.println("Ingrese los años de interes");
        años=teclado.nextInt();
        if(capital>0 && años>0){
            inversionf=(capital*interes)*años;
        }
        else{
            System.out.println("Los datos ingresados son incorrectos");
            }
        System.out.println("El interes que recibira es un total de:"+inversionf+" en un total de "+años+" años");
    }


    public static void main(String[] args) {
    ejercicio1();
    }
}
