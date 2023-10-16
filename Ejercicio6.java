package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio6 {
    public static float calcularSuperficie(float radio){
        
        return ((float) (4*Math.PI*Math.pow(radio, 2))); //añade PI
        }
        
        public static float calcularVolumen(float radio){
        return ((float) (4*Math.PI*Math.pow(radio, 3)/3));
         }
        
        public static void main(String[] args){
        //aca pedir radio     
        System.out.println("Ingrese el radio: ");
        Scanner miscanner= new Scanner(System.in);//System.in lee el sistema
        
        float radio=miscanner.nextFloat();//aca asigna a la variable radio lo que ento x teclado
        
        System.out.println("La superficie de la esfera es: "+ calcularSuperficie(radio));//aca estoy llamando la funcion y devuelve un valor
        System.out.println("El volumen de la esfera es: "+ calcularVolumen(radio));//aca estoy llamando la funcion y devuelve un valor
    
        }
}