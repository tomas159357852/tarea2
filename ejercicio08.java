import java.util.Scanner;
public class ejercicio08 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio8(){
        int totalb10, totalb20, totalb50, totalm10, totalm5, totalm1;
        double totalmon=0;
        System.out.println("Bienvenido, ¿cuanto dinero tienes en el monedero?, averigualo colocando los siguientes datos:\n");
        System.out.println("Ingrese el total de billetes de 10 pesos");
        totalb10=teclado.nextInt();
        System.out.println("Ingrese el total de billetes de 20 pesos");
        totalb20=teclado.nextInt();
        System.out.println("Ingrese el total de billetes de 50 pesos");
        totalb50=teclado.nextInt();
        System.out.println("Ingrese el total de monedas de 10");
        totalm10=teclado.nextInt();
        System.out.println("Ingrese el total de monedas de 5");
        totalm5=teclado.nextInt();
        System.out.println("Ingrese el total de monedas de 1");
        totalm1=teclado.nextInt();
        if(totalb10>=1 && totalb20>=1 && totalb50>=1 && totalm1>=1 && totalm5>=1 && totalm10>=1){
            totalmon=(totalb10*10)+(totalb20*20)+(totalb50*50)+(totalm1*1)+(totalm10*2)+(totalm5*5);
            System.out.println("El total de dinero que tienes en el monedero es: "+totalmon);
        }
        else{
            System.out.println("Ha ingresado datos incorrectos o negativos");
        }
    }
    public static void main(String[] args) {
        ejercicio8();
        }
}

