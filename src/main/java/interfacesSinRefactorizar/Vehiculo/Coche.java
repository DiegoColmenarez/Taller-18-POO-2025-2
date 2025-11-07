package interfacesSinRefactorizar.Vehiculo;

public class Coche implements Vehiculo{
    @Override
    public void conducir() {
        System.out.println("estas conduciendo");
    }
    @Override
    public void tranportarMercancia() {}
}