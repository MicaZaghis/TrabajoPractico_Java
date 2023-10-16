package Programador;

public class Ejercicio18P {
    public  class Programador {
    private  String nombre;
    private  String apellidos;

    public Programador(String nombre, String apellidos) {
        validarNombreApellidos(nombre, apellidos);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void validarNombreApellidos(String nombre, String apellidos) {
        if (!nombre.matches("[a-zA-Z]+") || !apellidos.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("El nombre y los apellidos deben ser solo texto");
        }
        if (nombre.length() >= 20 || apellidos.length() >= 20) {
            throw new IllegalArgumentException("Los campos String no pueden tener una longitud igual o superior a 20 caracteres");
        }
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
    }
}
}
