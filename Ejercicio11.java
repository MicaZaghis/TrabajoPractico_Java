package TrabajoPracticoJava;

public class Ejercicio11 {
    static class abuelo {
        public String ojos = "azules";
        private String billeteraAbuelo = "abu111";
        protected int edad = 63;
    
        public void imprimaTodo() {
            System.out.println("Ojos del abuelo: " + ojos);
            System.out.println("Billetera del Abuelo: " + billeteraAbuelo);
            System.out.println("Edad del abuelo: " + edad);
        }
    }
    
    static class padre extends abuelo {
        public String ojos = "azules";
        private String billeteraPadre = "padre111";
    }
    
    public class Main {
        public static void main(String[] args) {
            abuelo abu = new abuelo();
            abu.imprimaTodo();
            padre pa = new padre();
            pa.ojos = "verdes";
            pa.billeteraPadre = "padre333";
        }
    }
    
    
}
