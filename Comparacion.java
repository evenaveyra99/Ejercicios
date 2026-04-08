import java.util.Scanner;
public class Comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor;
        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print( "Ingrese un tercer número: ");
        int num3 = scanner.nextInt();
        if ((num1 > num2) && (num1 > num3)) {
            mayor = num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
    
    }
}
