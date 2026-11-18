public class MainPA {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Mini bulldog", 11, "Mora");

        System.out.println("El tipo de perro es: " + miPerro.getNombre() + " | Edad: " + miPerro.getEdad() + " años | Raza: " + miPerro.getRaza());
        miPerro.ladrar();
    }
}