public class LibroDigital extends MaterialDigital {
    public LibroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Titulo: " + getTitulo() + " - Se puede leer en pantalla");
    }
}