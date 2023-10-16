package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio2 {
    
    private int numero;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cont = 0; 

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("El programa finalizó.");
        } else {
            while (numero >=0){
                suma += numero;
                cont ++;

                System.out.println("Ingrese otro numero: ");
                numero = scanner.nextInt();
            }

            float promedio = (float) suma/cont;
            System.out.println("la suma de todos los numeros es: "+ suma);
            System.err.println("El promedio de la suma de todos los numeros es: "+ promedio);
        }
    }
}