import core.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "001-123456", 1000.0);

        cuenta.mostrarInformacion();
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.consultarSaldo();
    }
}
