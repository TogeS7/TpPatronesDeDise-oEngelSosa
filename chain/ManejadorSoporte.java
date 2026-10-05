package chain;

// Clase abstracta que define la estructura de cada eslabón de la cadena
public abstract class ManejadorSoporte {
    protected ManejadorSoporte siguiente;

    public void setSiguiente(ManejadorSoporte siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarProblema(int nivelGravedad);
}