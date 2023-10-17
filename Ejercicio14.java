package TrabajoPracticoJava;

public class Ejercicio14 {
    static class Empleado{
        private String apellido;
        private String DNI;
        private double sueldo;
        private String categoria; 

        public Empleado(String DNI, String categoria) {
            this.DNI = DNI;
            setCategoria(categoria);
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
        
        switch(categoria){
            case "A":
                setSueldo(180000);
                break;
                
            case "B":
                setSueldo(300000);
                break;
                
            case "C":
                setSueldo(500000);
                break;
            default:
                setCategoria("A");
                setSueldo(180000);
                break;
    }
}

public boolean equls(Object obj){
    if(this == obj)
    return true;
    if(obj == null || getClass()!= obj.getClass())
    return false;
    Empleado empleado = (Empleado) obj;
    return DNI.equals(empleado.DNI);
}

public String toString() {
    return DNI + " - " + categoria + " - " + sueldo;
}
 }
 public class Prueba{
    public static void main(String[] args) {
        
        Empleado [] empleados = new Empleado[5];
        
        empleados[0] = new Empleado("123456","A");
        empleados[1] = new Empleado("234567","B");
        empleados[2] = new Empleado("345678","C");
        empleados[3] = new Empleado("456789","A");
        empleados[4] = new Empleado("567890","B");


        for(Empleado empleado: empleados){
            if(empleado!= null){
                System.out.println(empleado);
            }
        }

        System.out.println("Los empleados "+ empleados [0] + " y " + empleados[1]
        + " son iguales? " + empleados[0].equals(empleados[1]));
  
    }   
}
}
