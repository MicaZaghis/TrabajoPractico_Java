package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int cont = 2;
        int num;
        int suma1 = 0;
        int suma2 = 1;
        int suma;

        System.out.println("Ingrese la cantidad de numeros que desea ver: ");
        num = scanner.nextInt();

        System.out.print(suma1 + "-" +suma2);

        while (cont < num){
            suma = suma1 + suma2;
            System.out.print("-" +suma);
            suma1 = suma2;
            suma2 = suma;
            cont ++; 
        }
    }
}