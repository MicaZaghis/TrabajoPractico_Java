package TrabajoPracticoJava;
public class Ejercicio8 {
    
    public static class MiFecha {
        
        private int dia;
        private int mes;
        private int año;
        private String mes_txt;
        private boolean es_bisiesto;
    
        public  MiFecha(int dia, int mes, int año) {
            
            this.dia = dia;
            this.mes = mes;
            this.año = año;
            this.mes_txt = convertirMesATexto(mes);
            this.es_bisiesto = esBisiesto(año);
        }
    
        
        public int getDia() {
            return dia;
        }
        public void setDia(int dia) {
            this.dia = dia;
        }
    
        public int getMes() {
            return mes;
        }
        public void setMes(int mes) {
            this.mes = mes;
            this.mes_txt = convertirMesATexto(mes);
        }
    
        public int getAño() {
            return año;
        }
        public void setAño(int año) {
            this.año = año;
            this.es_bisiesto = esBisiesto(año);
        }
    
        public String getMes_txt() {
            return mes_txt;
        }
    
        public boolean esEs_bisiesto() {
            return es_bisiesto;
        }
    
        private String convertirMesATexto(int mes) {
            String[] nombresMeses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
            
            return nombresMeses[mes - 1];
        }
    
        //aca compruebo si es bisiesto
        private boolean esBisiesto(int año) {
            if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    
        public String mostrarFecha() {
            
            String resultado =  dia + " de " + mes_txt + " del " + año;
            if (es_bisiesto) {
                //aca el += sirve para juntar texto/cadena con otro(aca seria con el de arriba)
                resultado += " - Es Bisiesto";
            } else {
                resultado += " - No es bisiesto";
            }
            return resultado;
        }
    }
        public static void main(String[] args) {
            MiFecha fecha = new MiFecha(20, 5, 2017);//
            System.out.println(fecha.mostrarFecha());
    
            
            MiFecha fechaInvalida = new MiFecha(30, 2, 2023); // Fecha inválida, febrero no puede tener 30 días
            fechaInvalida.setMes(6); // Cambiando el mes a junio (válido)
            fechaInvalida.setAño(2020); // Cambiando el año a un año bisiesto
            System.out.println(fechaInvalida.mostrarFecha());
    }
}
