package control;
import java.util.Scanner;
public class Orden3 {
    Scanner scanner = new Scanner(System.in);

    public void mayor() {
        System.out.println("Introduzca el primer número");
        int num = scanner.nextInt();
        System.out.println("Introduzca el segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Introduzca el tercer número");
        int num3 = scanner.nextInt();
    
        if(num>num2 && num>num3 && num2>num3) {
            System.out.println("El orden es: " + num + " "+ num2 + " "+num3);
        }else if(num>num2 && num>num3 && num2<num3) {
            System.out.println("El orden es: " + num + " "+ num3 + " "+num2);
        }else if(num2>num && num2>num3 && num>num3) {
            System.out.println("El orden es: " + num2 + " "+ num + " "+num3);
        }else if(num2>num && num2>num3 && num<num3) {
            System.out.println("El orden es: " + num2 + " "+ num3 + " "+num);
        }else if(num3>num && num3>num2 && num>num2) {
            System.out.println("El orden es: " + num3 + " "+ num + " "+num2);
        }else if(num3 == num && num3 == num2){
            System.out.println("Todos son iguales");
        }else {
            System.out.println("El orden es: " + num3 + " "+ num2 + " "+num);
        }
    }
}