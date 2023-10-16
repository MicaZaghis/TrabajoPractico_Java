package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio5 {
    public class EsPrimo {
        
        static boolean esPrimo (int par){
            
            int resto = 1;
            int n=2;
            while((n<par/2) && (resto!=0)){
            resto= (int) (par % n);
            n++;
            }
            if(resto!=0)
                return true;
            else
                return false;
                }
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        
        int BuscarPrimo = num - 1;
        
        while(BuscarPrimo >= 2) {
            
            if(esPrimo(BuscarPrimo)) {
                System.out.println("El numero primo inferior a "+ num +" es: "+ BuscarPrimo);
                break;
            }
            BuscarPrimo --;
        }
        
        if(BuscarPrimo < 2) {
            System.out.println("No se encontró numero primo inferior.");
        }
        
        scanner.close();
        }
    }
}