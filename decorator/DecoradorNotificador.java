package decorator;

public abstract class DecoradorNotificador implements Notificador {
    protected Notificador envoltorio;

    public DecoradorNotificador(Notificador envoltorio) {
        this.envoltorio = envoltorio;
    }

    @Override
    public void enviar(String mensaje) {
        envoltorio.enviar(mensaje);
    }
}