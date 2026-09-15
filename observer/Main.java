package observer;

public class Main {

    public static void main(String[] args) {

        Canal canal = new Canal();

        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Pedro");
        Usuario usuario3 = new Usuario("Maria");

        canal.suscribir(usuario1);
        canal.suscribir(usuario2);
        canal.suscribir(usuario3);

        canal.publicar("Nuevo video disponible!");
    }
}