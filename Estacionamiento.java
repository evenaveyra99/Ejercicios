import java.util.Scanner;

public class Estacionamiento {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int tarifa = 500;
        final int tarifaExtra = 300;
        final int tarifaDia = 1500;
        int horas;
        int total = 0;  
        String patente; 
        System.out.print("Ingrese la patente del vehículo: ");
        patente = scanner.nextLine();   
        System.out.print("Ingrese la cantidad de horas que estuvo estacionado: ");
        horas = scanner.nextInt();
        if (horas >= 5) {
            total = tarifaDia;
        } else if (horas == 1 ) {
            total = tarifa; 
        } else {
            total = tarifa + (horas - 1) * tarifaExtra; 
        }
        System.out.println("El total a pagar por el vehículo con patente " + patente + " es: $" + total);

    }
    
}
