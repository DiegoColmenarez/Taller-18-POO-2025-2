package interfacesSinRefactorizar.OperacionBancaria;

public class CuentaAhorro implements OperacionBancaria {
    @Override
    public void retirar(double montoRetiro) {
        System.out.println("Retirados $" + montoRetiro + " de la cuenta de ahorro");
    }
    @Override
    public void transferencia(int numCuentaDestino, double montoTransferencia) {
        System.out.println("Transferidos $" + montoTransferencia + " a la cuenta " + numCuentaDestino);
    }
    @Override
    public void pagarFacturas(String empresa, double montoFactura) {
        System.out.println("Pago de factura de $" + montoFactura+ " a " + empresa + " desde la cuenta ahorro");
    }
}