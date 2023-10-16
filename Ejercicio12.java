package TrabajoPracticoJava;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("El formato del número es erróneo");
            System.out.println(ime.getMessage());
        } finally {
            System.out.println("Esta línea siempre se imprimirá");
        }
        
        scanner.close(); 
    }
}