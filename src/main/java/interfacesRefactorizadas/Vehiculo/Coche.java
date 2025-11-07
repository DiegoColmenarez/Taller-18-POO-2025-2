package interfacesRefactorizadas.Vehiculo;

public class Coche implements Conducir{
    @Override
    public void conducir() {
        System.out.println("Estas conduciendo un auto.");
    }
}
