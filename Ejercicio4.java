package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio4 {
    public static class Persona{

        private String nombre; 
        private String apellido; 
        private int dni; 
        private int edad;

        public Persona(String nomnre, String apellido, int dni, int edad){

            this.nombre = nombre; 
            this.apellido = apellido;
            this.dni = dni; 
            this.edad = edad;
        }

        public void setNombre(String nombreDeLaPersona){
            this.nombre = nombreDeLaPersona;
        }
        public String getNombre(){
            return nombre;
        }
        public void setApellido(String apellidoDeLaPersona){
            this.apellido=apellidoDeLaPersona;
        }
        public String getApellido(){
            return apellido;
        }
        
        public void setDni(int dniDeLaPersona){
            this.dni=dniDeLaPersona;
        }
        public int getDni(){
            return dni;
        }
        public void setEdad(int EdadDeLaPersona){
            this.edad=EdadDeLaPersona;
        }
        public int getEdad(){
            return edad;
        }
    }

    public static class Paciente extends Persona{
        private float altura;
        private float peso;
        private String sexo;
        
        public Paciente(String nombre,String apellido,int dni,int edad,float altura,float peso,String sexo){
        super(nombre,apellido,dni,edad); //añade los atributos de persona
        this.altura=altura;
        this.peso=peso;
        this.sexo=sexo;
        }
        
        public void setAltura(float alturaDeLaPersona){
        this.altura=alturaDeLaPersona;
        }
        public float getAltura() {
            return altura;
        }
        public void setPeso(float pesoDeLaPersona){
        this.peso=pesoDeLaPersona;
        }
        public float getPeso() {
            return peso;
        }
        public void setSexo(String sexoDeLaPersona){
        this.sexo=sexoDeLaPersona;
        }
        public String getSexo() {
            return sexo;
        }

        public float calcularIMC() {
            float estatura_enMetros = altura / 100;
            //convierte la altura de centimetros a metros
            return (float) (peso / Math.pow(estatura_enMetros,2)); 
            //funcion que calcula la potencia de un numero (base, exponente)
        }
        //obtener condicion de composicion corporal basada en IMC
        public String obtenerCondicionIMC(){
            float imc = calcularIMC();
            
            if (imc < 18.5) {
                return "Bajo de Peso";
            } else if(imc >= 18.5 && imc < 25)
            {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30)
            {
                return "Sobrepeso";
            } else {
                return "Obesidad";
            }   
        }
    }

    static class Medico extends Persona {
        private String especialidad;
        private String matriculaProfesional;

        public Medico(String nombre, String apellido, int dni, int edad, String especialidad, String matriculaProfesional) {
            super(nombre, apellido, dni, edad);
            this.especialidad = especialidad;
            this.matriculaProfesional = matriculaProfesional;
        }

        // Getters
       public void setespecialidad(String especialidadDelMedico){
        this.especialidad=especialidadDelMedico;
        }
        public String getespecialidad() {
            return especialidad;
        }
        public void setmatriculaprofecional(String Matricula){
        this.matriculaProfesional=Matricula;
        }
        public String getmatriculaprofesional() {
            return matriculaProfesional;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //solicitar los datos del paciente
        
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese apellido del paciente: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingrese dni del paciente: ");
        int dni = scanner.nextInt();
        
        System.out.print("Ingrese edad del paciente: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese el peso del paciente (en kg): ");
        float peso = scanner.nextFloat();
        
        System.out.print("Ingrese la altura del paciente (en cm): ");
        float altura = scanner.nextFloat();
        
        System.out.print("Ingrese el sexo del paciente: ");
        String sexo = scanner.next();
        
//crear objeto Paciente con los datos que se ingresaron
        
        Paciente paciente = new Paciente(nombre, apellido, dni, edad, peso, altura, sexo);
        
//mostrar ficha completa del paciente
        System.out.println("\nFicha del paciente:");
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Apellido: " + paciente.getApellido());
        System.out.println("DNI: " + paciente.getDni());
        System.out.println("Edad: " + paciente.getEdad() + " años");
        System.out.println("Peso: " + paciente.getPeso() + " kg");
        System.out.println("Altura: " + paciente.getAltura() + " cm");
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("IMC: " + paciente.calcularIMC());
        System.out.println("Condición de composición corporal: " + paciente.obtenerCondicionIMC());
     
     // Solicitar los datos del médico por teclado

        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("\nIngrese el nombre del médico: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del médico: ");
        apellido = scanner.nextLine();

        System.out.print("Ingrese el dni del médico: ");
        dni = scanner.nextInt();

        System.out.print("Ingrese la edad del médico: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese la especialidad del médico: ");
        String especialidad = scanner.next();

        System.out.print("Ingrese la matrícula profesional del médico: ");
        String matriculaprofesional = scanner.next();

        // Crear objeto Medico con los datos ingresados
        Medico medico = new Medico(nombre, apellido, dni, edad, especialidad, matriculaprofesional);

        // Mostrar ficha completa del médico
        System.out.println("\nFicha del médico:");
        System.out.println("Nombre: " + medico.getNombre());
        System.out.println("Apellido: " + medico.getApellido());
        System.out.println("DNI: " + medico.getDni());
        System.out.println("Edad: " + medico.getEdad() + " años");
        System.out.println("Especialidad: " + medico.getespecialidad());
        System.out.println("Matrícula Profesional: " + medico.getmatriculaprofesional());
    }
}