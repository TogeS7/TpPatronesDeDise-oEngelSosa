package chain;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos los eslabones
        ManejadorSoporte basico = new SoporteBasico();
        ManejadorSoporte avanzado = new SoporteAvanzado();
        ManejadorSoporte gerente = new Gerente();

        // 2. Armamos la cadena: Básico -> Avanzado -> Gerente
        basico.setSiguiente(avanzado);
        avanzado.setSiguiente(gerente);

        // 3. Simulamos peticiones (Siempre entran por el nivel básico)
        System.out.println("--- Reportando problema Nivel 1 ---");
        basico.manejarProblema(1);

        System.out.println("\n--- Reportando problema Nivel 2 ---");
        basico.manejarProblema(2);

        System.out.println("\n--- Reportando problema Nivel 3 ---");
        basico.manejarProblema(3);
    }
}