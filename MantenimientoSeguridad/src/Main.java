import java.util.Date;
class TareaMantenimiento {
    private String descripcion;
    private Date fechaProgramada;

    public TareaMantenimiento(String descripcion, Date fechaProgramada) {
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
    }

    public void ejecutar() {
        System.out.println("Realizando mantenimiento: " + descripcion);
        // Lógica para realizar la tarea de mantenimiento
    }
}


class SistemaMantenimiento {
    public void programarMantenimiento(TareaMantenimiento tarea) {
    }

    public void rastrearMantenimiento() {
    }
}
// Clase para representar un sensor de seguridad
class Sensor {
    private String tipo;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public void detectarMovimiento() {
        System.out.println("Se ha detectado movimiento por el sensor " + tipo);
        // Lógica para manejar el evento de detección de movimiento
    }
}

// Clase para representar una cámara de seguridad
class Camara {
    private String ubicacion;

    public Camara(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void grabar() {
        System.out.println("La cámara ubicada en " + ubicacion + " está grabando.");
        // Lógica para iniciar la grabación de la cámara
    }
}

class SistemaSeguridad {
    private Sensor sensor;
    private Camara camara;

    public SistemaSeguridad(Sensor sensor, Camara camara) {
        this.sensor = sensor;
        this.camara = camara;
    }

    public void activar() {
        System.out.println("El sistema de seguridad se ha activado.");
        sensor.detectarMovimiento();
        camara.grabar();
    }
}
public class Main {
    public static void main(String[] args) {

        TareaMantenimiento tarea1 = new TareaMantenimiento("Revisión de cercas", new Date());
        SistemaMantenimiento sistemaMantenimiento = new SistemaMantenimiento();
        sistemaMantenimiento.programarMantenimiento(tarea1);
        sistemaMantenimiento.rastrearMantenimiento();

        Sensor sensor1 = new Sensor("Principal");
        Camara camara1 = new Camara("Entrada principal");
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad(sensor1, camara1);
        sistemaSeguridad.activar();
    }
}
