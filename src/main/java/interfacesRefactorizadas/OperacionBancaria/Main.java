package interfacesRefactorizadas.OperacionBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaAhorro ahorro = new CuentaAhorro();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito();
        CuentaCorriente corriente = new CuentaCorriente();
        System.out.println("=== Operaciones con Cuenta de Ahorro ===");
        ahorro.transferencia(558200, 12345);
        ahorro.retirar(200);
        System.out.println("\n=== Operaciones con Tarjeta de Crédito ===");
        tarjeta.pagarFacturas("Netflix", 15.99);
        System.out.println("\n=== Operaciones con Cuenta Corriente ===");
        corriente.transferencia(1000, 98721);
        corriente.retirar(300);
        corriente.pagarFacturas("Luz", 60.50);
    }
}