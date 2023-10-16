
package TrabajoPracticoJava;

public class Ejercicio9_5 {
    class Estudiante{
        
        public String nombreEstudiante;
        public int edadEstudiante;
        public float calificacionEstudiante;
        
        public Estudiante(String nombreEstudiantes, int edadEstudiantes, float calificacionEstudiantes)
        {
            this.nombreEstudiante = nombreEstudiantes;
            this.edadEstudiante = edadEstudiantes;
            this.calificacionEstudiante = calificacionEstudiantes;
        }
        public String getNombreEstudiante(){
            return nombreEstudiante;
        }
        public int getEdadEstudiante(){
            return edadEstudiante;
        }
        public float getCalificacionEstudiante(){
            return calificacionEstudiante;
        }
        public void setNombreEstudiante(String nombre){
            this.nombreEstudiante = nombre; 
        }
        public void setEdadEstudiante(int edad){
            this.edadEstudiante = edad;
        }
        public void setCalificacionEstudiante(float calificacion){
            this.calificacionEstudiante = calificacion;
        }
    }
    
    public class Main{
        public static void main(String[] args) {
            System.out.println("");
        }
    }
}
