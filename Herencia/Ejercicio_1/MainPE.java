public class MainPE {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Zlatna Vallejos", 25, 150000.0);

        System.out.println("--- Datos del Empleado ---");
        System.out.println("Nombre: " + emp.getNombre());
        System.out.println("Edad: " + emp.getEdad());
        System.out.println("Salario: $" + emp.getSalario());
    }
}