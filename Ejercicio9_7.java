package TrabajoPracticoJava;

public class Ejercicio9_7 {
    static class Libro{

        public String titulo;
        public String autor;
        public String editorial;

        public Libro(String titulo, String autor, String editorial){
            
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
        }
        public void datosLibro(){
            System.out.println("DATOS DEL LIBRO: ");
            System.out.println("Titulo: "+titulo);
            System.out.println("Autor: "+autor);
            System.out.println("Editorial: "+editorial);
            System.out.println(" - ");
    }
        public void leer(){
        System.out.println("El libro "+titulo+" se lee");
    }
    
        public void prestar(){
        System.out.println("El libro "+titulo+" fue prestado");
    }
        public void devolver(){
            System.out.println("El libro "+titulo+" fue devuelto");
    }
}

    public class Main{
        public static void main(String[] args) {
            Libro libro1 = new Libro("Kentukis", "Samanta Schwemblin",
             "Literatura Random House");
            
            libro1.datosLibro();
            libro1.leer();
            libro1.prestar();
            libro1.devolver();
        }
    }
}
