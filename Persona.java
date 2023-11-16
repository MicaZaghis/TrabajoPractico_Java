package Ejercicio16;
import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    String nombre, apellido; int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    abstract public class Jugador extends Persona{
        boolean esTitular;

        public boolean isEsTitular() {
            return esTitular;
        }

        public void setEsTitular(boolean esTitular) {
            this.esTitular = esTitular;
        }

        Jugador(String nombre, String apellido, int edad, boolean esTitular){
            super(nombre, apellido, edad);
            this.esTitular = esTitular;
        }
    }
    public class Arquero extends Jugador {
        int golesRecibidos;

        public Arquero(String nombre, String apellido, int edad, boolean esTitular, int golesRecibidos) {
            super(nombre, apellido, edad, esTitular);
            this.golesRecibidos = golesRecibidos;
        }


        public String toString() {
            return "Nombre -" + nombre + ",Apellido -" + apellido + " Edad = " + edad + ", Goles recibidos " + golesRecibidos;

        }
    }

    public class Delantero extends Jugador {
        int golesAnotados;

        public Delantero(String nombre, String apellido, int edad, boolean esTitular, int golesAnotados) {
            super(nombre, apellido, edad, esTitular);
            this.golesAnotados = golesAnotados;
        }

        public String toString() {
            return "Nombre -" + nombre + ",Apellido -" + apellido + " Edad = " + edad + ", Goles anotados " + golesAnotados;
        }
    }
    public class Mediocampista extends Jugador{
        int numAsistencias;
        public Mediocampista(String nombre, String apellido, int edad, boolean esTitular, int numAsistencias){
            super(nombre, apellido, edad, esTitular);
            this.numAsistencias = numAsistencias;
        }
        public String toString() {
            return "Nombre -" + nombre + ",Apellido -" + apellido + " Edad = " + edad + ", Numero de asistencias: " + numAsistencias;
        }
    }
    public class Defensor extends Jugador{
        int ataquesAnotados, golesAnotados;
        public Defensor(String nombre, String apellido, int edad, boolean esTitular, int ataquesAnotados, int golesAnotados){
            super(nombre, apellido, edad, esTitular);
            this.ataquesAnotados = ataquesAnotados;
            this.golesAnotados = golesAnotados;
        }
        public String toString(){
            return "Nombre - " + nombre + " ,Apellido -" + apellido + " ,Edad = " + edad + " ,Ataques anotados: " + ataquesAnotados + " ,Goles anotados: "+golesAnotados;
        }
    }
    abstract public class Tecnico extends Persona{
        int anioExp; boolean nacional, extranjero;
        Tecnico(String nombre, String apellido, int edad, int anioExp, boolean nacional, boolean extranjero){
            super(nombre, apellido, edad);
            this.anioExp = anioExp;
            this.nacional = nacional;
            this.extranjero = extranjero;
        }
    }

    public static void main(String[] args){
        String nombre, apell, nombEquipo, pais; int edad, golesRecibidos, golesAnot, numAsistencias, ataquesAnotados, golesAnotados;
                    boolean esTitular;
                    Ejercicio16.Persona.Arquero arquero;
                    List<Ejercicio16.Persona.Mediocampista> mediocampistas = new ArrayList<>();
                    List<Ejercicio16.Persona.Delantero> delanteros = new ArrayList<>();
                    List<Ejercicio16.Persona.Defensor> defensores = new ArrayList<>();
        
                    Scanner lectu = new Scanner(System.in);
        
                    while(true){
                        System.out.println("Conformación de equipo de futbol");
                        int optio;
                        System.out.println(" 1. Agregar personas\n 2. Mostrar equipo");
                        optio = lectu.nextInt();
                        lectu.nextLine();
        
                        switch (optio){
                            case 1:
                                System.out.println("PERSONAS");
                                try {
                                    System.out.println("Ingrese el nombre:");
                                    nombre = lectu.nextLine();
                                    System.out.println("Ingrese el apellido:");
                                    apell = lectu.nextLine();
                                    System.out.println("Ingrese la edad:");
                                    edad = lectu.nextInt();
                                    lectu.nextLine();
                                    System.out.println(" 1. Jugador\n 2. Tecnico");
                                    int cho = lectu.nextInt();
                                    lectu.nextLine();
        
                                    if(cho == 1){
                                        System.out.println("ARQUERO");
                                        System.out.println("1. Titular | 2. No titular)");
                                        esTitular = (lectu.nextInt() == 1);
                                        lectu.nextLine();
                                        System.out.println("Goles recibidos:");
                                        golesRecibidos = lectu.nextInt();
                                        lectu.nextLine();
        
        
        
                                    } else if (cho == 2) {
                                        System.out.println("DEFENSOR");
                                        System.out.println("Ataques anotados:");
                                        ataquesAnotados = lectu.nextInt();
                                        System.out.println("Goles anotados:");
                                        golesAnotados = lectu.nextInt();
                                        lectu.nextLine();
        
                                    } else {
                                        System.out.println("Opción no válida.");
                                    }
        
        
                                }catch (java.util.InputMismatchException e){
                                    System.out.println("Entrada incorrecta");
                                }
                        }
                    }
        }

}