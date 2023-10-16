package TrabajoPracticoJava;
public class Ejercicio9_1 {
    
    static class Perro{
        public String nombre;
        public int edad;
        public String raza;
        public String color;
        
        public Perro (String nombres, int edades, String razas, String colores){
            this.nombre = nombres;
            this.edad = edades;
            this.raza = razas;
            this.color = colores;
        }
        public void datos(){
            System.out.println("DATOS DEL PERRO: ");
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Raza: "+raza);
            System.out.println("Color: "+color);
            System.out.println(" - ");
        }
        public void ladrar(){
            System.out.println("La perra "+nombre+" ladró");
        }
        public void caminar(){
            System.out.println("La perra "+nombre+" caminó");
        }
        public void comer(){
            System.out.println("La perra "+nombre+" comió");
        }
    }
    
    public class Main{
        public static void main(String[] args) {
            Perro perro1 = new Perro("Gamora", 2, "pichichu", "manchitas");
            
            perro1.datos();
            perro1.ladrar();
            perro1.caminar();
            perro1.comer();
        }
    } 
}
