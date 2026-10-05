package adapter;

public class AdaptadorMotorElectrico implements Motor {
    private MotorElectrico motorElectrico;

    public AdaptadorMotorElectrico() {
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void encender() {
        motorElectrico.conectarBateria();
        motorElectrico.activar();
    }
}