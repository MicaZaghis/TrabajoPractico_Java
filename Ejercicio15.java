package TrabajoPracticoJava;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {
    
    public abstract class Contacto{
        protected String nombre;

        public Contacto(String nombre) {
            this.nombre = nombre.toUpperCase();
        }
        public abstract void mostrarContacto();
    }

    public static class Persona extends Contacto{
        public Persona(String nombre) {
            super(nombre);
        }
        public void mostrarContacto(){
            System.out.println("Persona: " + this.nombre);
        }

    }

    public static class Empresa extends Contacto{
        public Empresa(String nombre) {
            super(nombre);
        }
        public void mostrarContacto(){
            System.out.println("Empresa: " + this.nombre);
        }
    }

    public static class Agenda{
        private Contacto[] contactos;
        private int indice;

        public Agenda(int capacidad) {
            this.contactos = new Contacto[capacidad];
            this.indice = 0;
        }
        
        public void agregarContacto(Contacto contacto){
            if(indice < contactos.length){ 
            this.contactos[indice] = contacto;
            indice++;
        } else {
            System.out.println("No se pueden agregar mas contactos");
        }
    }
    public void mostrarContacto(int id){
        if(id >= 0 && id < indice){
            contactos[id].mostrarContacto();
        }else{
            System.out.println("No existe ese contacto");
        }
    }

    public void editarContacto(int id, String nombre){
        if(id >= 0 && id < indice){
            contactos[id].nombre = nombre.toUpperCase();
        }else{
            System.out.println("No existe ese contacto");
    }
    }

    public void mostrarAgenda(){
        for(int i = 0; i < indice; i++){
            contactos[i].mostrarContacto();
        }
    }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(100);

        while (true) {
            System.out.println("1. Agregar Contacto\n2. Mostrar contacto por ID\n3. Editar contacto por ID\n4. Ver libreta completa\n5. Salir");
            int opcion = 0;
            while (true) {
                try {
                    opcion = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next(); // consumir la entrada no válida
                }
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese 1 para Persona, 2 para Empresa.");
                    int tipo = scanner.nextInt();
                    System.out.println("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    if (tipo == 1) {
                        agenda.agregarContacto(new Persona(nombre));
                    } else if (tipo == 2) {
                        agenda.agregarContacto(new Empresa(nombre));
                    }
                    break;
                
                case 2:
                    System.out.println("Ingrese el ID del contacto: ");
                    int id = scanner.nextInt();
                    agenda.mostrarContacto(id);
                    break;
                
                case 3:
                    System.out.println("Ingrese el ID del contacto:");
                    int idEdit = scanner.nextInt();
                    System.out.println("Ingrese el nuevo nombre: ");
                    String nombreEdit = scanner.next();
                    agenda.editarContacto(idEdit, nombreEdit);
                    break;
                
                case 4:
                    agenda.mostrarAgenda();
                    break;
                
                case 5:
                    System.exit(0);
                
                default:
                    System.out.println("Opción incorrecta. Por favor, intente de nuevo.");
            }
        }
    }
}

