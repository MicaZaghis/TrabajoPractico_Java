package Programador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio18E {
    static class Programador {
        private String nombre;
        private String apellidos;

        public Programador(String nombre, String apellidos) {
            this.nombre = nombre;
            this.apellidos = apellidos;
        }

        public void imprimir() {
            System.out.println("Nombre del programador: " + nombre);
            System.out.println("Apellidos: " + apellidos);
        }
    }

    static class Equipo {
        private String nombreEquipo;
        private String universidad;
        private String lenguajeProgramacion;
        private int tamanoEquipo;
        private List<Programador> programadores = new ArrayList<>();

        public Equipo(String nombreEquipo, String universidad, String lenguajeProgramacion, int tamanoEquipo) {
            this.nombreEquipo = nombreEquipo;
            this.universidad = universidad;
            this.lenguajeProgramacion = lenguajeProgramacion;
            this.tamanoEquipo = tamanoEquipo;
        }

        public boolean estaCompleto() {
            return programadores.size() == tamanoEquipo;
        }

        public void anadirProgramador(Programador programador) {
            if (estaCompleto()) {
                throw new IllegalStateException("El equipo está lleno");
            }
            programadores.add(programador);
        }

        public void verDatos() {
            System.out.println("Nombre del equipo: " + nombreEquipo);
            System.out.println("Universidad: " + universidad);
            System.out.println("Lenguaje de programación: " + lenguajeProgramacion);
            System.out.println("Tamaño del equipo: " + tamanoEquipo);
            System.out.println("Programadores:");
            for (Programador programador : programadores) {
                programador.imprimir();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();
        System.out.println("Ingrese la universidad que está representando el equipo:");
        String universidad = scanner.nextLine();
        System.out.println("Ingrese el lenguaje de programación que va a utilizar el equipo en la competencia:");
        String lenguajeProgramacion = scanner.nextLine();
        System.out.println("Ingrese el tamaño del equipo:");
        int tamanoEquipo = scanner.nextInt();
        scanner.nextLine(); 

        Equipo equipo = new Equipo(nombreEquipo, universidad, lenguajeProgramacion, tamanoEquipo);

        for (int i = 0; i < tamanoEquipo; i++) {
            System.out.println("Ingrese el nombre del programador " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese los apellidos del programador " + (i + 1) + ":");
            String apellidos = scanner.nextLine();

            Programador programador = new Programador(nombre, apellidos);
            equipo.anadirProgramador(programador);
        }
        equipo.verDatos();
    }
}
