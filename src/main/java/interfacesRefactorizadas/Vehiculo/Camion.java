package interfacesRefactorizadas.Vehiculo;

public class Camion implements TrasportarMercancia{
    @Override
    public void transportarMercancia() {
        System.out.println("El camion transporta mercancia");
    }
}