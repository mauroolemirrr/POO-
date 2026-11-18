public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", "Rojo");
        Auto auto2 = new Auto("Ford", "Fiesta", "Azul");
        Auto auto3 = new Auto("Chevrolet", "Cruze", "Blanco");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}