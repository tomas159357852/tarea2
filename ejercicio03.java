import java.util.Scanner;
public class ejercicio03 {
    static Scanner teclado=new Scanner(System.in);

    public static void ejercicio1() {
        //Variables
        int numeros, ceros=0, menores0=0, mayores0=0;
        double numerost;
        //Entrada
        System.out.println("Ingrese la cantidad de numeros totales:");
        numeros=teclado.nextInt();
        //Proceso
        for (int numero=1; numero<=numeros; numero++) {
            System.out.print("Ingrese el numero "+numero+":");
            numerost=teclado.nextDouble();
            if (numerost<0) {menores0++;} 
            if (numerost>0) {mayores0=mayores0+1;} 
            if (numerost==0) {ceros+=1;}             
        }
        System.out.println("Del total de numeros:\n"+ceros+" son cero"+
        "\n"+menores0+" son mayores de cero"+
        "\n"+mayores0+" son menores de cero");
        }
        public static void main(String[] args) {
            ejercicio1();
        }
    }