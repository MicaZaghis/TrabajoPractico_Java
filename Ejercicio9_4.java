package TrabajoPracticoJava;
import java.util.Scanner;

public class Ejercicio9_4 {
    
    static class cuentaBancaria{
    public String titularCuenta;
    public int numeroCuenta;
    public double saldoCuenta;
    public cuentaBancaria(String titularCuentas,int numeroCuentas, double saldoCuentas){
        this.titularCuenta = titularCuentas;
        this.numeroCuenta = numeroCuentas;
        this.saldoCuenta = saldoCuentas;
    }
    
    public String getTitularCuenta(){
        return titularCuenta;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldoCuenta(){
        return saldoCuenta;
    }
    public void setTitularCuenta(String titular){
        this.titularCuenta = titular;
    }
    public void setNumeroCuenta(int nCuenta){
        this.numeroCuenta = nCuenta;
    }
    public void setSaldoCuenta(double saldo){
        this.saldoCuenta = saldo;
    }
    
    public void retiroSaldo(double retiroSaldo){
        if (saldoCuenta < retiroSaldo){
            
            System.out.println("No puede retirar: $"+retiroSaldo+" es mayor al saldo en su cuenta.");
            System.out.println("Saldo actual: "+saldoCuenta);
        }
        else{
            
            System.out.println("Gracias por extraer: $"+retiroSaldo+", vuelva pronto.");
            saldoCuenta = saldoCuenta-retiroSaldo;
            System.out.println("Saldo actual: $"+saldoCuenta);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cuentaBancaria persona1 = new cuentaBancaria("",0,0.00);
        int nCuenta = 0, opcion= 0;
        double saldo = 0, retiroSaldo = 0;
        String titular = "";
        System.out.println("Bienvenido Usuario, aqui debajo deberá ingresar sus datos.");
        System.out.println("Nombre del Titular de la Cuenta: ");
        titular = sc.nextLine();
        persona1.setTitularCuenta(titular);
        System.out.println("N° de cuenta: ");
        nCuenta = sc.nextInt();
        sc.nextLine();
        persona1.setNumeroCuenta(nCuenta);
        System.out.println("Deberá hacer un deposito para habilitar su cuenta.");
        System.out.flush();
        do{
            System.out.println("\nElija una opcion.\n---------\n1)Deposito\n2)Retirar\n3)Consulta\n4)Salir\n--------\nOpcion:");
            opcion = sc.nextInt();
            switch (opcion){
            case 1:
                System.out.flush();
                System.out.println("---Deposite Dinero---");
                System.out.print("Ingrese monto: $");
                saldo = sc.nextDouble();
                persona1.setSaldoCuenta(saldo);
                System.out.println("---------------------");
                System.out.println("Depositó $"+saldo);
                break;
            case 2:
                System.out.flush();
                System.out.println("---Retirar Dinero---");
                System.out.print("Ingrese monto: $");
                retiroSaldo = sc.nextDouble();
                System.out.println("Saldo en cuenta: $"+persona1.getSaldoCuenta());
                persona1.retiroSaldo(retiroSaldo);
                System.out.println("--------------------");
                break;
            case 3:
                System.out.flush();
                System.out.println("---Consultar Saldo---");
                System.out.println("Titular: "+persona1.getTitularCuenta());
                System.out.println("N° Cuenta: "+persona1.getNumeroCuenta());
                System.out.println("$"+persona1.getSaldoCuenta());
                System.out.println("---------------------");
                System.out.println("***Imprimiendo ticket***");
                break;
            case 4:
                System.out.println("Gracias por su uso, vuelva pronto.");break;
            default:
                System.out.println("Opcion incorrecta."); break;
            }
        } while(opcion!= 4);
    }
}
}
