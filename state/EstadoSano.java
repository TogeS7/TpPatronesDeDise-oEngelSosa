package state;

public class EstadoSano implements EstadoPersonaje {
    @Override
    public void mover() {
        System.out.println("Estado Sano: Movimiento a velocidad normal.");
    }

    @Override
    public void curar(Personaje personaje) {
        System.out.println("Estado Sano: Salud al máximo. Ignorando curación.");
    }
}