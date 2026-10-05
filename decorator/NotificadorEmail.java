package decorator;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}