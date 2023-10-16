package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio1 {
    
    private int nota1;
    private int nota2; 
    private int nota3;
    private int nota4;

    public Ejercicio1 (int nota1, int nota2, int nota3, int nota4){

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4; 
    }

    public double CalcularPromedio (){
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public void mostrarResultado (){
        double promedio = CalcularPromedio();

        System.out.println("El promedio es: "+ promedio);

        if (promedio < 40.0){
            System.out.println("Su condicion es LIBRE.");
        } else if (promedio < 70.0 && promedio > 40.0){
            System.err.println("Su condicion es REGULAR.");
        } else if (promedio > 70.0){
            System.err.println("Su condicion es PROMOCIONADO.");
        }
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la nota 1: ");
    int nota1 = scanner.nextInt();

    System.out.print("Ingrese la nota 2: ");
    int nota2 = scanner.nextInt();

    System.out.print("Ingrese la nota 3: ");
    int nota3 = scanner.nextInt();

    System.out.print("Ingrese la nota 4: ");
    int nota4 = scanner.nextInt();

    Ejercicio1 ejercicio = new Ejercicio1(nota1, nota2, nota3, nota4);
    ejercicio.mostrarResultado();

    scanner.close();
}

}