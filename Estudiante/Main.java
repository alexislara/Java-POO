class Alumno {
    String nombre;
    int edad;

    void estudiar() {
        System.out.println(this.nombre + " esta estudiando");
    }

    public static void main(String[] args) {

    }

    void ver_edad() {
        System.out.println(" Y su edad es:" + this.edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();

        alumno1.nombre = "alexis";
        alumno1.edad = 22;

        alumno1.estudiar();
        alumno1.ver_edad();
    }
}
