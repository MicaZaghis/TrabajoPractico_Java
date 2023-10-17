package TrabajoPracticoJava;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private double precio;

    public Mascota(String nombre, int edad, String raza, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }
}

class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}

class Venta {
    private Cliente cliente;
    private Mascota mascota;
    private Date fechaVenta;

    public Venta(Cliente cliente, Mascota mascota) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.fechaVenta = new Date();
    }

    public double calcularPrecioTotal() {
        return mascota.getPrecio();
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();
       
    }
}

class TiendaMascotas {
    private List<Mascota> mascotasDisponibles = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventasRealizadas = new ArrayList<>();

    public void agregarMascota(Mascota mascota) {
        mascotasDisponibles.add(mascota);
    }

    public void eliminarMascota(Mascota mascota) {
        mascotasDisponibles.remove(mascota);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarVenta(Cliente cliente, Mascota mascota) {
        if (mascotasDisponibles.contains(mascota)) {
            Venta venta = new Venta(cliente, mascota);
            ventasRealizadas.add(venta);
            eliminarMascota(mascota);
        }
    }

    public void mostrarEstadisticasVentas() {
        double precioTotal = 0;
        for (Venta venta : ventasRealizadas) {
            precioTotal += venta.calcularPrecioTotal();
        }
        System.out.println("El precio total de las ventas es: " + precioTotal);
    }
}


