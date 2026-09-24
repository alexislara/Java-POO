package core;

public class CuentaBancaria {
    // Propiedades
    private String titular;
    private final String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado con exito. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado con exito. Nuevo saldo: " + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta es: " + saldo);
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
