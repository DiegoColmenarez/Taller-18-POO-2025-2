package interfacesRefactorizadas.Vehiculo;

public class Main {
    public static void main(String[] args) {
        var toyota = new Coche();
        toyota.conducir();
        var camion = new Camion();
        camion.transportarMercancia();
    }
}