public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Martin", 38, "Base de Datos");
        Preceptor preceptor = new Preceptor("Valeria", 31, "4°2");

        System.out.println("Datos iniciales");
        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        docente.setEdad(39);
        docente.setEdad(-4); 

        System.out.println(" Datos luego de modificar edad ");
        docente.mostrarInformacion();
        preceptor.mostrarInformacion();
    }
}