class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void hacerSonido() {
        System.out.println("Hacer cualquier sonido");
    }
}

class Perro extends Animal {
    public Perro(String name) {
        super(name);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getName() + " el perro dice wau....");
    }
}

class Gato extends Animal {
    public Gato(String name) {
        super(name);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getName() + " dice miau....");
    }
}

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Michi");
        Perro perro = new Perro("Max");

        System.out.println("perro");
        perro.hacerSonido();
        System.out.println("Gato");
        gato.hacerSonido();
    }
}
