package singleton;
public class Main {

    public static void main(String[] args) {

        Configuracion config1 = Configuracion.getInstancia();
        Configuracion config2 = Configuracion.getInstancia();

        config1.mostrarConfiguracion();

        System.out.println();

        if (config1 == config2) {
            System.out.println("Las dos variables apuntan a la misma instancia.");
        } else {
            System.out.println("Son instancias diferentes.");
        }
    }
}