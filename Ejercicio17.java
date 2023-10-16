package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio17 {
   
    static final class Vendedor {
    private final String nombre;
    private final String apellidos;
    private final int edad;

    public Vendedor(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        verificarEdad(edad);
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
        }
        if (edad > 70) {
            throw new IllegalArgumentException("La edad no puede ser mayor a 70");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese los apellidos del vendedor:");
        String apellidos = scanner.nextLine();
        System.out.println("Ingrese la edad del vendedor:");
        int edad = scanner.nextInt();

        Vendedor vendedor = new Vendedor(nombre, apellidos, edad);
        vendedor.imprimir();
    }
}
}
