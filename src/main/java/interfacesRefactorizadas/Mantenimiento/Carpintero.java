package interfacesRefactorizadas.Mantenimiento;

public class Carpintero implements MantenimientoCarpintero {
    @Override
    public void reparaciones() {
        System.out.println("El carpintero repara sillas");
    }
}