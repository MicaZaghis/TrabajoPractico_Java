package TrabajoPracticoJava;

public class Ejercicio13 {
    static class Vehiculo {
        public String marca;
        public String color;
        public String patente;
    
        public Vehiculo(String marca, String color, String patente) {
            this.marca = marca;
            this.color = color;
            this.patente = patente;
        }

        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public String getColor() {
            return color;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public String getPatente() {
            return patente;
        }
    
        public void setPatente(String patente) {
            this.patente = patente;
        }
    }
    
    static class Moto extends Vehiculo {
        private int cilindrada;
    
        public Moto(String marca, String color, String patente, int cilindrada) {
            super(marca, color, patente);
            this.cilindrada = cilindrada;
        }

        public int getCilindrada() {
            return cilindrada;
        }
    
        public void setCilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
        }
    }
    
    static class Auto extends Vehiculo {
        private int cantidadAsientos;
    
        public Auto(String marca, String color, String patente, int cantidadAsientos) {
            super(marca, color, patente);
            this.cantidadAsientos = cantidadAsientos;
        }
    
        public int getCantidadAsientos() {
            return cantidadAsientos;
        }
    
        public void setCantidadAsientos(int cantidadAsientos) {
            this.cantidadAsientos = cantidadAsientos;
        }
    }
    
    static class Camion extends Vehiculo {
        private int capacidadCarga;
    
        public Camion(String marca, String color, String patente, int capacidadCarga) {
            super(marca, color, patente);
            this.capacidadCarga = capacidadCarga;
        }
    
        public int getCapacidadCarga() {
            return capacidadCarga;
        }
    
        public void setCapacidadCarga(int capacidadCarga) {
            this.capacidadCarga = capacidadCarga;
        }
    }
    
    static class Cliente {
        private String apellido;
        private String nombre;
        private String dni;
        private String telefono;
    
        public Cliente(String apellido, String nombre, String dni, String telefono) {
            this.apellido = apellido;
            this.nombre = nombre;
            this.dni = dni;
            this.telefono = telefono;
        }
    
        public String getApellido() {
            return apellido;
        }
    
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getDni() {
            return dni;
        }
    
        public void setDni(String dni) {
            this.dni = dni;
        }
    
        public String getTelefono() {
            return telefono;
        }
    
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
    
        public static void main(String[] args) {

            Moto moto = new Moto("Honda", "Roja", "XYZ123", 250);
            Auto auto = new Auto("Toyota", "Azul", "ABC456", 5);
            Camion camion = new Camion("Ford", "Blanco", "DEF789", 5000);
            Cliente cliente = new Cliente("Gonzales", "Pedro", "12345678", "1112223334");
    
            System.out.println("Moto: " + moto.getMarca() + ", Cilindrada: " + moto.getCilindrada());
            System.out.println("Auto: " + auto.getMarca() + ", Asientos: " + auto.getCantidadAsientos());
            System.out.println("Camión: " + camion.getMarca() + ", Capacidad de Carga: " + camion.getCapacidadCarga());
            System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        }
    }
    
