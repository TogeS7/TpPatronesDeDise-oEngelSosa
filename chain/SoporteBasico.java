package chain;

public class SoporteBasico extends ManejadorSoporte {
    @Override
    public void manejarProblema(int nivelGravedad) {
        if (nivelGravedad == 1) {
            System.out.println("Soporte Básico: Problema resuelto (ej. reiniciar router).");
        } else if (siguiente != null) {
            System.out.println("Soporte Básico: Problema muy complejo, derivando al siguiente nivel...");
            siguiente.manejarProblema(nivelGravedad);
        }
    }
}