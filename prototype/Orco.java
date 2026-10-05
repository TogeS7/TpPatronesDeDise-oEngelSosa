package prototype;
public class Orco implements Enemigo {
    private String arma;

    public Orco(String arma) {
        this.arma = arma; // Simulando carga
    }

    @Override
    public Enemigo clonar() {
        try {
            return (Orco) super.clone(); 
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Orco armado con: " + arma);
    }
}