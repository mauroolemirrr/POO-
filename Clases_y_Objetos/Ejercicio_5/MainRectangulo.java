public class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo triangulo = new Rectangulo();
        
        triangulo.setBase(6.0);
        triangulo.setAltura(4.0);

        System.out.println("El área calculada es de: " + triangulo.calcularArea());
    }
}