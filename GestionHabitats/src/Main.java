
abstract class Habitat {
    private String tipo;

    public Habitat(String tipo) {
        this.tipo = tipo;
    }

    public abstract void monitorearCondiciones();

    public String getTipo() {
        return tipo;
    }
}

// Clase para hábitats acuáticos
class HabitatAcuatico extends Habitat {
    public HabitatAcuatico() {
        super("Acuático");
    }

    @Override
    public void monitorearCondiciones() {

    }
}


class HabitatTerrestre extends Habitat {
    public HabitatTerrestre() {
        super("Terrestre");
    }

    @Override
    public void monitorearCondiciones() {

    }
}


class HabitatAviario extends Habitat {
    public HabitatAviario() {
        super("Aviario");
    }

    @Override
    public void monitorearCondiciones() {

    }
}


class SistemaMonitoreo {
    public void registrarHabitat(Habitat habitat) {

    }

    public void analizarCondiciones(Habitat habitat) {
    }
}

public class Main {
    public static void main(String[] args) {
        Habitat acuatico = new HabitatAcuatico();
        Habitat terrestre = new HabitatTerrestre();
        Habitat aviario = new HabitatAviario();

        SistemaMonitoreo sistemaMonitoreo = new SistemaMonitoreo();
        sistemaMonitoreo.registrarHabitat(acuatico);
        sistemaMonitoreo.registrarHabitat(terrestre);
        sistemaMonitoreo.registrarHabitat(aviario);

        sistemaMonitoreo.analizarCondiciones(acuatico);
        sistemaMonitoreo.analizarCondiciones(terrestre);
        sistemaMonitoreo.analizarCondiciones(aviario);
    }
}
