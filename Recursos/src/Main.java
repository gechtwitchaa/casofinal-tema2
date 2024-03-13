import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Recurso {
    protected String nombre;
    protected int cantidad;

    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void reducirCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}

class Alimento extends Recurso {
    public Alimento(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
}

class Medicina extends Recurso {
    public Medicina(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
}

class Equipamiento extends Recurso {
    public Equipamiento(String nombre, int cantidad) {
        super(nombre, cantidad);
    }
}

class Pedido {
    private String recurso;
    private int cantidad;

    public Pedido(String recurso, int cantidad) {
        this.recurso = recurso;
        this.cantidad = cantidad;
    }

    public String getRecurso() {
        return recurso;
    }

    public int getCantidad() {
        return cantidad;
    }
}

class ManejoRecursos {
    private Map<String, Recurso> inventario;
    private List<Pedido> pedidos;
    private List<String> proveedores;

    public ManejoRecursos() {
        inventario = new HashMap<>();
        pedidos = new ArrayList<>();
        proveedores = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        inventario.put(recurso.nombre, recurso);
    }

    public void realizarPedido(String recurso, int cantidad, String proveedor) {
        pedidos.add(new Pedido(recurso, cantidad));
        proveedores.add(proveedor);
    }

    public void mostrarInventario() {
        System.out.println("Inventario del zoológico:");
        for (Map.Entry<String, Recurso> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getCantidad());
        }
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos pendientes:");
        for (Pedido pedido : pedidos) {
            System.out.println("Recurso: " + pedido.getRecurso() + ", Cantidad: " + pedido.getCantidad());
        }
    }

    public void mostrarProveedores() {
        System.out.println("Proveedores:");
        for (String proveedor : proveedores) {
            System.out.println(proveedor);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ManejoRecursos manejoRecursos = new ManejoRecursos();

        manejoRecursos.agregarRecurso(new Alimento("Carne", 100));
        manejoRecursos.agregarRecurso(new Medicina("Vacuna", 50));
        manejoRecursos.agregarRecurso(new Equipamiento("Jaula", 20));

        manejoRecursos.realizarPedido("Carne", 50, "ProveedorA");

        manejoRecursos.mostrarInventario();
        manejoRecursos.mostrarPedidos();
        manejoRecursos.mostrarProveedores();
    }
}
