package TrabajoPracticoJava;

public class Ejercicio9_9 {

    static class Empleado{
        public String nombre;
        public int salario;
        public String cargo;

        public Empleado(String nombre, int salario, String cargo){
            this.nombre = nombre;
            this.salario = salario;
            this.cargo = cargo;
        }

        public void datosEmpleado(){
            System.out.println("DATOS DEL EMPLEADO: ");
            System.out.println("Nombre: "+nombre);
            System.out.println("Salario: "+salario);
            System.out.println("Cargo: "+cargo);
            System.out.println(" - ");
    }

    public void trabajar(){
        System.out.println("El empleado "+nombre+" esta trabajando");
    }
    public void CobrarSalario(){
        System.out.println("El empleado "+nombre+" cobra un salario de "+salario);
    }
    public void cargo(){
        System.out.println("El empleado "+nombre+" tiene un cargo de "+cargo);
    }
}

    public class Main{
        public static void main(String[] args) {
            Empleado empleado1 = new Empleado("Juan", 100000, "Programador");
            
            empleado1.datosEmpleado();
            empleado1.trabajar();
            empleado1.CobrarSalario();
            empleado1.cargo();
        }
    }
}
