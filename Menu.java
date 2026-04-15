import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido! Elija la opcion que desea: ");
        System.out.println("1. Sumar dos numeros");
        System.out.println("2. Restar dos numeros");
        System.out.println("3. Ver cantidad de operaciones realizadas");
        System.out.println("0. Salir");

        int opcion = scanner.nextInt();
        int contador = 0;

        while ((opcion != 0) && (opcion <= 3)) {
                if (opcion == 1) {
                    System.out.print("Ingrese un numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese otro numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    contador++;
                 }   else if (opcion == 2) {
                    System.out.print("Ingrese un numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese otro numero: ");
                    int num2 = scanner.nextInt();
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    contador++;
                    } else if (opcion == 3) {
                    System.out.println("Cantidad de operaciones realizadas: " + contador);
                    }

            System.out.println("\nElija la opcion que desea: ");
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Ver cantidad de operaciones realizadas");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
        }

        System.out.println("Ha salido exitosamente!");

    }
    
}
