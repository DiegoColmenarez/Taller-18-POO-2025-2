package interfacesSinRefactorizar.OperacionBancaria;

public interface OperacionBancaria {
    void retirar(double montoRetiro);
    void transferencia(int numCuentaDestino, double montoTransferencia);
    void pagarFacturas(String empresa, double montoFactura);
}