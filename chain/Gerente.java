package chain;

public class Gerente extends ManejadorSoporte {
    @Override
    public void manejarProblema(int nivelGravedad) {
        // El gerente es el último eslabón, resuelve lo que llegue
        System.out.println("Gerente: Resolviendo problema crítico de nivel " + nivelGravedad + " (ej. caída de servidores).");
    }
}