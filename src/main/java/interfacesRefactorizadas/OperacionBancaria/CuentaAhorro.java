package interfacesRefactorizadas.OperacionBancaria;

public class CuentaAhorro implements Transferencia, Retirar{
    @Override
    public void transferencia(int numCuentaDestino, double montoTransferencia) {
        System.out.println("Transferidos $" + montoTransferencia + " a la cuenta " + numCuentaDestino);
    }
    @Override
    public void retirar(double montoRetiro) {
        System.out.println("Retirados $" + montoRetiro + " de la cuenta de ahorro");
    }
}
