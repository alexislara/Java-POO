// 1. ABSTRACCIÓN: Plantilla base abstracta.
// Define la estructura básica que todo auto debe tener.
abstract class Auto {
    protected String marca;
    protected String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstracto: cada tipo de auto definirá su propia forma de acelerar
    public abstract void acelerar();

    public void mostrarInformacion() {
        System.out.println("\n--- Vehículo: " + marca + " " + modelo + " ---");
    }
}

// 2. CLASE CONCRETA PARA AUTOS COMUNES: Implementa una camioneta/auto estándar
class AutoComun extends Auto {

    public AutoComun(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("🛻 La " + marca + " " + modelo + " avanza con fuerza de trabajo: Rrrr... Rrrr...");
    }
}

// 3. HERENCIA Y POLIMORFISMO: Subclase para deportivos de alto rendimiento
class SuperAuto extends Auto {
    private int velocidadMaxima;

    public SuperAuto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void acelerar() {
        System.out.println("🔥 El " + marca + " " + modelo + " despega a toda velocidad. V-Max: " + velocidadMaxima + " km/h.");
    }

    public void activarNitro() {
        System.out.println("⚡ ¡SISTEMA NITRO ACTIVADO en el " + modelo + "!");
    }
}

// 4. EJECUCIÓN Y CREACIÓN DE OBJETOS
public class Main {
    public static void main(String[] args) {

        // --- INSTANCIACIÓN DE UN AUTO COMÚN ---
        // Creamos un objeto 'silverado' en la memoria a partir de la plantilla AutoComun
        AutoComun silverado = new AutoComun("Chevrolet", "Silverado 1500");
        silverado.mostrarInformacion();
        silverado.acelerar();

        // --- INSTANCIACIÓN DE SUPERAUTOS ---
        // Creamos dos objetos distintos de la clase SuperAuto
        SuperAuto corvetteC6 = new SuperAuto("Chevrolet", "Corvette C6", 306);
        SuperAuto lamborghini = new SuperAuto("Lamborghini", "Huracán", 325);

        // Uso del Corvette C6
        corvetteC6.mostrarInformacion();
        corvetteC6.acelerar();
        corvetteC6.activarNitro();

        // Uso del Lamborghini
        lamborghini.mostrarInformacion();
        lamborghini.acelerar();
        lamborghini.activarNitro();
    }
}
