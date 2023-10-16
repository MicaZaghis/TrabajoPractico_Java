package TrabajoPracticoJava;

public class Ejercicio9_6 {
    static class Vehiculo{
        
        public String marca;
        public String modelo;
        public int año;

        public Vehiculo(String marca, String modelo, int año){
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }
        public void datosVehiculo(){
            System.out.println("DATOS DEL VEHICULO: ");
            System.out.println("Marca: "+marca);
            System.out.println("Modelo: "+modelo);
            System.out.println("Año: "+año);
            System.out.println(" - ");
        }

        public void acelerar(){
            System.out.println("El vehiculo "+marca+" aceleró");
        }
        public void frear(){
            System.out.println("El vehiculo "+marca+" freó");
        }
        public void encender(){
            System.out.println("El vehiculo "+marca+" encendió");
        }
    }
        public class main{
            public static void main(String[] args) {
                Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2015);
                
                vehiculo1.datosVehiculo();
                vehiculo1.acelerar();
                vehiculo1.frear();
                vehiculo1.encender();

        }
    }
    
}
