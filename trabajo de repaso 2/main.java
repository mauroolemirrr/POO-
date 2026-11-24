public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Sofi");
        Jugador j2 = new Jugador("Tomas");

        System.out.println("Estado inicial");
        System.out.println(j1.getNombre() + " Nivel: " + j1.getNivel() + " Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " Nivel: " + j2.getNivel() + " Puntos: " + j2.getPuntos());

        j1.ganarPuntos(120);
        j2.ganarPuntos(75);
        j1.ganarPuntos(-30); // debe rechazarse por ser negativo

        j1.subirNivel();

        System.out.println("Estado final");
        System.out.println(j1.getNombre() + " Nivel: " + j1.getNivel() + " Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " Nivel: " + j2.getNivel() + " Puntos: " + j2.getPuntos());
    }
}
    

