import java.util.Date;

abstract class Animal {
    protected String nombre;
    protected String especie;
    protected String alimentacion;
    protected String salud;
    protected String comportamiento;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.alimentacion = "";
        this.salud = "";
        this.comportamiento = "";
    }

    public void registrarAlimentacion(String comida) {
        this.alimentacion = comida;
        System.out.println("El animal " + nombre + " ha sido alimentado con " + comida);
    }

    public void registrarSalud(String estado) {
        this.salud = estado;
        System.out.println("La salud de " + nombre + " es: " + estado);
    }

    public void registrarComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
        System.out.println("El animal " + nombre + " ha exhibido el comportamiento: " + comportamiento);
    }

    public abstract void acciones();
}

class Leon extends Animal {
    public Leon(String nombre) {
        super(nombre, "León");
    }

    @Override
    public void acciones() {
        System.out.println("El león " + nombre + " ruge fuertemente.");
    }
}

class Tigre extends Animal {
    public Tigre(String nombre) {
        super(nombre, "Tigre");
    }

    @Override
    public void acciones() {
        System.out.println("El tigre " + nombre + " acecha a su presa.");
    }
}

class Oso extends Animal {
    public Oso(String nombre) {
        super(nombre, "Oso");
    }

    @Override
    public void acciones() {
        System.out.println("El oso " + nombre + " pesca salmones en el río.");
    }
}

public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon("Simba");
        Tigre tigre = new Tigre("Shere Khan");
        Oso oso = new Oso("Baloo");

        // Registrar acciones de los animales
        leon.registrarAlimentacion("carne");
        leon.registrarSalud("excelente");
        leon.registrarComportamiento("rugido");
        leon.acciones();

        tigre.registrarAlimentacion("carne");
        tigre.registrarSalud("bien");
        tigre.registrarComportamiento("acecho");
        tigre.acciones();

        oso.registrarAlimentacion("pescado");
        oso.registrarSalud("saludable");
        oso.registrarComportamiento("pesca");
        oso.acciones();
    }
}
