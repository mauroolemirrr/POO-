public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("spiderman y venom", "stan lee", 1997);
        Libro libro2 = new Libro("avengers", "connors", 2015);

        System.out.println("El primer libro se llama " + libro1.titulo + " de " + libro1.autor + " (" + libro1.anio + ")");
        System.out.println("El Segundo libro se llama " + libro2.titulo + " de " + libro2.autor + " (" + libro2.anio + ")");
    }
}