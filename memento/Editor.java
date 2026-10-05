package memento;

public class Editor {
    private String contenido;

    public void escribir(String texto) {
        this.contenido = texto;
    }

    public String getContenido() {
        return contenido;
    }

    // Crea un memento con el estado actual
    public Memento guardar() {
        return new Memento(contenido);
    }

    // Restaura el estado a partir de un memento
    public void restaurar(Memento memento) {
        if (memento != null) {
            this.contenido = memento.getContenido();
        }
    }
}