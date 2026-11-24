public class Preceptor extends Persona {
    private String cursoAsignado;

    public Preceptor(String nombre, int edad, String cursoAsignado) {
        super(nombre, edad);
        this.cursoAsignado = cursoAsignado;
    }

    public String getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(String cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    public void mostrarInformacion() {
        System.out.println("Preceptor Nombre: " + getNombre()+ "  Edad: " + getEdad()+ "  Curso asignado: " + cursoAsignado);
    }
}