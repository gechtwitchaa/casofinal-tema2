abstract class GuiaVirtual {
    public abstract void proporcionarTour();
}

class GuiaVirtualNinos extends GuiaVirtual {
    @Override
    public void proporcionarTour() {
        System.out.println("Bienvenidos niños, vamos a explorar el zoológico juntos.");
    }
}

class GuiaVirtualAves extends GuiaVirtual {
    @Override
    public void proporcionarTour() {
        System.out.println("¡Hola amantes de las aves! Comencemos nuestro tour por las áreas de aves.");
    }
}


class GuiaVirtualMamiferos extends GuiaVirtual {
    @Override
    public void proporcionarTour() {
        System.out.println("¡Hola amantes de los mamíferos! Prepárense para ver a nuestros amigos peludos.");
    }
}
class QuioscoInteractivo {
    public void mostrarInformacion(String informacion) {
        System.out.println("Bienvenido al quiosco interactivo.");
        System.out.println(informacion);
    }
}

public class Main {
    public static void main(String[] args) {

        GuiaVirtual guiaNinos = new GuiaVirtualNinos();
        GuiaVirtual guiaAves = new GuiaVirtualAves();
        GuiaVirtual guiaMamiferos = new GuiaVirtualMamiferos();

        guiaNinos.proporcionarTour();
        guiaAves.proporcionarTour();
        guiaMamiferos.proporcionarTour();

        QuioscoInteractivo quiosco = new QuioscoInteractivo();
        String informacionAnimales = "Aquí encontrarás información sobre los animales del zoológico.";
        quiosco.mostrarInformacion(informacionAnimales);
    }
}
