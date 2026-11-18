public class Auto {
    String marca;
    String modelo;
    String color;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.println("Tengo un " + marca + " modelo " + modelo + " de color " + color);
    }
}