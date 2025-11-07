package interfacesSinRefactorizar.Mantenimiento;

public class Carpintero implements Mantenimiento {
    @Override
    public void reparaciones() {
        System.out.println("Arreglar sillas.");
    }
    @Override
    public void limpieza() {

    }
}
