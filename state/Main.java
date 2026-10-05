package state;

public class Main {
    public static void main(String[] args) {
        Personaje pj = new Personaje();

        System.out.println("--- Prueba de Estado Inicial ---");
        pj.mover();

        System.out.println("\n--- Evento: Recibe Daño Físico ---");
        pj.setEstado(new EstadoHerido());
        pj.mover();

        System.out.println("\n--- Evento: Recibe Daño Tóxico ---");
        pj.setEstado(new EstadoEnvenenado());
        pj.mover();

        System.out.println("\n--- Acción: Curar (Intento 1) ---");
        pj.curar(); 
        pj.mover(); 
        
        System.out.println("\n--- Acción: Curar (Intento 2) ---");
        pj.curar(); 
        pj.mover();
    }
}