package decorator;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorSMS(new NotificadorEmail());
        notificador.enviar("Alerta crítica en el sistema"); 
    }
}