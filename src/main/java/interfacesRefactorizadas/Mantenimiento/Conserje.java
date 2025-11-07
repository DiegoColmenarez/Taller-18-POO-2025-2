package interfacesRefactorizadas.Mantenimiento;

public class Conserje implements MantenimientoConcerje{
    @Override
    public void limpieza() {
        System.out.println("El concerje limpia el piso.");
    }
}