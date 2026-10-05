package memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historial historial = new Historial();

        // Escribimos y guardamos el primer estado
        editor.escribir("Versión 1: Hola");
        historial.guardar(editor.guardar());

        // Escribimos y guardamos el segundo estado
        editor.escribir("Versión 2: Hola Mundo");
        historial.guardar(editor.guardar());

        // Escribimos un tercer estado pero NO lo guardamos
        editor.escribir("Versión 3: Hola Mundo!!!");
        System.out.println("Texto actual: " + editor.getContenido());

        // Deshacer una vez
        editor.restaurar(historial.deshacer());
        System.out.println("Después del primer deshacer: " + editor.getContenido());

        // Deshacer otra vez
        editor.restaurar(historial.deshacer());
        System.out.println("Después del segundo deshacer: " + editor.getContenido());
    }
}