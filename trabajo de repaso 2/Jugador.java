public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad invalida (" + cantidad + "): solo se permiten puntos positivos.");
            return;
        }
        this.puntos += cantidad;
    }

    public void subirNivel() {
        this.nivel++;
    }
}