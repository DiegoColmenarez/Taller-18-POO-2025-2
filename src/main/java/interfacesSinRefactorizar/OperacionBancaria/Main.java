package interfacesSinRefactorizar.OperacionBancaria;

public class Main {
    public static void main(String[] args) {
        var cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.retirar(8795.8);
        cuentaAhorro.pagarFacturas("AFINIA", 1.0);
        cuentaAhorro.transferencia(58887019, 96.69);
    }
}