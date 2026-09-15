package singleton;
public class Configuracion {

    private static Configuracion instancia;

    private String nombreAplicacion;
    private String idioma;

    // Constructor privado para evitar crear objetos desde afuera
    private Configuracion() {
        nombreAplicacion = "Mi Aplicacion";
        idioma = "Español";
    }

    // Devuelve la única instancia de Configuracion
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }

        return instancia;
    }

    public void mostrarConfiguracion() {
        System.out.println("Aplicacion: " + nombreAplicacion);
        System.out.println("Idioma: " + idioma);
    }
}