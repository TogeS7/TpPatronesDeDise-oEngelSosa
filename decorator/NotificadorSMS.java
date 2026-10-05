package decorator;

public class NotificadorSMS extends DecoradorNotificador {
    public NotificadorSMS(Notificador envoltorio) {
        super(envoltorio);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje); 
        System.out.println("Enviando SMS adicional: " + mensaje); 
    }
}