package interfacesRefactorizadas.Mantenimiento;

public class Main {
    public static void main(String[] args) {
        var conserje = new Conserje();
        conserje.limpieza();
        var carpintero = new Carpintero();
        carpintero.reparaciones();
    }
}