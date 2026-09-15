package observer;

import java.util.ArrayList;
import java.util.List;

public class Canal {

    private List<Observador> usuarios = new ArrayList<>();

    public void suscribir(Observador usuario) {
        usuarios.add(usuario);
    }

    public void publicar(String mensaje) {
        System.out.println("El canal publicó: " + mensaje);

        for (Observador usuario : usuarios) {
            usuario.actualizar(mensaje);
        }
    }
}