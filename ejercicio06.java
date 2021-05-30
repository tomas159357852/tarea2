import java.util.Scanner;
public class ejercicio06 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio6(){
        int totala;
        double precioa, categoria1=0, categorias;
        System.out.println("Ingrese cuantos vehículos posee actualmente:");
        totala=teclado.nextInt();
        for (int coches=1; coches<=totala; coches++, categoria1++){
            System.out.println("Ingrese el precio del vehículo "+coches+":");
            precioa=teclado.nextInt();
            precioa++;
            System.out.println("Ingrese a que categoria pertenece:");
            categorias=teclado.nextInt();
            if  (categorias==1) {categoria1=precioa*0.10-1;}
            if  (categorias==2) {categoria1=precioa*0.07;}
        }
        System.out.println("El total de categoria 1 es: "+categoria1+"");
    }
    public static void main(String[] args) {
        ejercicio6();
    }
}