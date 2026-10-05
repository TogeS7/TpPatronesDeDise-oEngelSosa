package chain;

public class SoporteAvanzado extends ManejadorSoporte {
    @Override
    public void manejarProblema(int nivelGravedad) {
        if (nivelGravedad == 2) {
            System.out.println("Soporte Avanzado: Problema resuelto (ej. configurar base de datos).");
        } else if (siguiente != null) {
            System.out.println("Soporte Avanzado: Problema crítico, derivando al gerente...");
            siguiente.manejarProblema(nivelGravedad);
        }
    }
}