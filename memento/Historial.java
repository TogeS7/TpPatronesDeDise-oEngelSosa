package memento;

import java.util.Stack;

public class Historial {
    // Usamos una Pila (Stack) para el comportamiento "Deshacer" (Último en entrar, primero en salir)
    private Stack<Memento> historial = new Stack<>();

    public void guardar(Memento memento) {
        historial.push(memento);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}