package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner miscanner=new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra: ");
        String frase = miscanner.nextLine();
        
        //repetir el juego hasta que el usuario ingrese un numero negativo
        while(true){
                //solicitar al usuario que ingrese la posicion a buscar
                System.out.println("Ingrese la posición a buscar (numero negativo para salir): ");
                int posicion = miscanner.nextInt ();
                
                //para saber si el numero es negativo (salir del juego)
                if(posicion < 0){
                    System.out.println("Gracias por jugar.");
                    break;
                }
                
                //para saber si el numero es positivo
                if(posicion >= frase.length()){
                    System.out.println("La posicion ingresada esta fuera de la cadena.");
                    continue;
                }
                
                //pedir al usuario que ingrese el caracter para bsucar
                System.out.print("ingrese el caracter que desea buscar: ");
                char caracter = miscanner.nextLine().charAt(0);
                
                //verificar si el caracter coincide con el de la cadena
                if(frase.charAt(posicion)== caracter){
                    System.out.println("El carcter coincide en la posición indicada!");
                }
                else{
                    System.out.println("Incorrecto! El caracter no coincide :( ");
               
                    }
                }  
        }
}

