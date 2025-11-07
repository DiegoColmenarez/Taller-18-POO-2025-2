package interfacesSinRefactorizar.Mantenimiento;

public class Main {
    public static void main(String[] args) {
      var concerje = new Concerje();
      var carpintero = new Carpintero();
      concerje.reparaciones();
      carpintero.limpieza();
    }
}