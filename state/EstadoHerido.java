package state;

public class EstadoHerido implements EstadoPersonaje {
    @Override
    public void mover() {
        System.out.println("Estado Herido: Movimiento reducido. Salto bloqueado.");
    }

    @Override
    public void curar(Personaje personaje) {
        System.out.println("Estado Herido: Aplicando curación... Transición a EstadoSano.");
        personaje.setEstado(new EstadoSano());
    }
}