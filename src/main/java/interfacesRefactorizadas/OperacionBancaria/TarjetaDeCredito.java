package interfacesRefactorizadas.OperacionBancaria;

public class TarjetaDeCredito implements PagarFacturas{
    @Override
    public void pagarFacturas(String empresa, double montoFactura) {
        System.out.println("Pago de factura de $" + montoFactura+ " a " + empresa + " desde la tarjeta de credito");
    }
}