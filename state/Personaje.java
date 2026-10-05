package state;

public class Personaje {
    private EstadoPersonaje estado;

    public Personaje() {
        this.estado = new EstadoSano();
    }

    public void setEstado(EstadoPersonaje estado) {
        this.estado = estado;
    }

    public void mover() {
        estado.mover();
    }

    public void curar() {
        estado.curar(this);
    }
}