import java.util.Scanner;
public class EmpresaEnvios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        final int base = 1200;
        final int exceso = 500;
        final int precioEspecial = 4500;
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        double costoEnvio;
        if (peso >= 10) {
            costoEnvio = precioEspecial;
        } else if (peso < 2) {
            costoEnvio = base;
        } else {
            costoEnvio = base + (exceso * (peso - 2));
        }
        System.out.println("El costo de envío para un paquete de " + peso + " kg es: $" + costoEnvio);
    }
    
}

// tarifa base hasta 2kg $ 1200
// exceso 2kg a 10kg $ 500 por cada kg 
// mas de 10kg $4500 precio especial 
