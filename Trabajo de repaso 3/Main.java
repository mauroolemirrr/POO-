public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("Fundamentos de Java");
        Audiolibro audiolibro = new Audiolibro("El principito");

        libro.mostrarDescripcion();
        audiolibro.mostrarDescripcion();
    }
}