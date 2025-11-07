package interfacesSinRefactorizar.Mantenimiento;

public class Concerje implements Mantenimiento {
    @Override
    public void limpieza() {
        System.out.println("Limpiar ventanas.");
    }
    @Override
    public void reparaciones() {

    }
}
