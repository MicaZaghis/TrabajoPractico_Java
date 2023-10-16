package TrabajoPracticoJava;

public class Ejercicio9_8 {
    static class Mascota{
        public String nombre;
        public String edad;
        public String especie;

        public Mascota(String nombre, String edad, String especie){
            this.nombre = nombre;
            this.edad = edad;
            this.especie = especie;
    }

    public void datosMascota(){
        System.out.println("DATOS DE LA MASCOTA: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Especie: "+especie);
        System.out.println(" - ");
    }

    public void jugar(){
        System.out.println("La mascota "+nombre+" juega");
    }
    public void comer(){
        System.out.println("La mascota "+nombre+" comió");
    }    
    public void dormir(){
        System.out.println("La mascota "+nombre+" duerme");
    }
}

    public class Main{
        public static void main(String[] args) {
            Mascota mascota1 = new Mascota("Branca", "8", "Gato");
            
            mascota1.datosMascota();
            mascota1.jugar();
            mascota1.comer();
            mascota1.dormir();
        }
    }
}
