import java.util.Scanner;
public class ejercicio07 {
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio7(){
        int tiempot=0, deposito=1500;
        double interes=0.15, años=2021, tpasado=1961, interesf=0; 
        System.out.println("Interes total en la cuenta de ahorros por la venta de las tierras del abuelo");
        if(tiempot>=0){
            interesf=(double)Math.pow(deposito*(1+interes), años-tpasado);
        }
        System.out.println("El interes total en la cuenta de ahorros: "+interesf);
    
    }
    public static void main(String[] args) {
        ejercicio7();
    }
}
