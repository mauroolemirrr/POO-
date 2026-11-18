public class Auto extends Vehiculo {
    private int cant_Puertas;

    public Auto(String marca, String modelo, int cant_Puertas) {
        super(marca, modelo);
        this.cant_Puertas = cant_Puertas;
    }

    public int getCant_Puertas() { return cant_Puertas; }
    public void setCant_Puertas(int cant_Puertas) { this.cant_Puertas = cant_Puertas; }

    public void mostrarInfo() {
        System.out.println("El auto es de Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Puertas: " + cant_Puertas);
    }
}