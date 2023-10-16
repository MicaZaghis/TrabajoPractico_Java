package TrabajoPracticoJava;

public class Ejercicio9_2 {
    static class Persona{
        
        public String nombre;
        public String apellido;
        public int edad;
        public String genero;
        
        public Persona(String nombre,String apellido, int edad, String genero){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.genero = genero;
        }
        public void datos(){
            System.out.println("DATOS DE LA PERSONA:");
            System.out.println("Nombre: "+nombre);
            System.out.println("Apellido: "+apellido);
            System.out.println("Edad: "+edad);
            System.out.println("Genero: "+genero);
            System.out.println(" - ");
        }
        public void caminar(){
            System.out.println(nombre+" hoy camino 5 cuadras.");
        }
        public void hablar(){
            System.out.println(nombre+" esta hablando por telefono.");
        }
        public void correr(){
            System.out.println(nombre+" mañana sale a correr.");
        }
    }
    
    public class Main{
        public static void main(String[] args) {
        Persona persona1 = new Persona("Micaela","Zaghis",28,"F");
        
        persona1.datos();
        persona1.caminar();
        persona1.hablar();
        persona1.correr();
        }
    }
}
