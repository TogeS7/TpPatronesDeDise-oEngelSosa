package state;

public class EstadoEnvenenado implements EstadoPersonaje {
    @Override
    public void mover() {
        System.out.println("Estado Envenenado: Movimiento crítico. Descontando puntos de salud (HP).");
    }

    @Override
    public void curar(Personaje personaje) {
        System.out.println("Estado Envenenado: Aplicando antídoto... Transición a EstadoHerido.");
        personaje.setEstado(new EstadoHerido());
    }
}