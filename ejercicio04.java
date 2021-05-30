import java.util.Scanner;
public class ejercicio04 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio4(){
        int totalb10, totalb20, totalb30, totalb50, totalb100, totalm1, totalm2, totalm5;
        double totalcaja=0;
        System.out.println("Bienvenido, averigua cuanto dinero tienes en tu caja, colocando los siguientes datos:\n");
        System.out.println("Ingrese el total de billetes de 10");
        totalb10=teclado.nextInt();
        System.out.println("Ingrese el total de billetes de 20");
        totalb20=teclado.nextInt();
        System.out.println("Ingrese el total de billetes de 30");
        totalb30=teclado.nextInt();
        System.out.println("Ingrese el total de billetes de 50");
        totalb50=teclado.nextInt();
        System.out.println("Ingrese el total de billetes de 100");
        totalb100=teclado.nextInt();
        System.out.println("Ingrese el total de monedas de 1");
        totalm1=teclado.nextInt();
        System.out.println("Ingrese el total de monedas de 2");
        totalm2=teclado.nextInt();
        System.out.println("Ingrese el total de monedas de 5");
        totalm5=teclado.nextInt();
        if(totalb10>=1 && totalb20>=1 && totalb30>=1 && totalb50>=1 && totalb100>=1 && totalm1>=1 && totalm2>=1 && totalm5>=1){
            totalcaja=(totalb10*10)+(totalb20*20)+(totalb30*30)+(totalb50*50)+(totalb100*100)+(totalm1*1)+(totalm2*2)+(totalm5*5);
            System.out.println("El total de dinero que tienes en tu caja es de: "+totalcaja);
        }
        else{
            System.out.println("Ha ingresado datos incorrectos o negativos");
        }
    }
    public static void main(String[] args) {
        ejercicio4();
        }
}
