package adapter;

public class Main {
    public static void main(String[] args) {
        Motor motor = new AdaptadorMotorElectrico();
        motor.encender(); 
    }
}