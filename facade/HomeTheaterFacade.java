package facade;

public class HomeTheaterFacade {
    private Proyector proyector;
    private ReproductorDVD dvd;

    public HomeTheaterFacade() {
        this.proyector = new Proyector();
        this.dvd = new ReproductorDVD();
    }

    public void verPelicula(String pelicula) {
        System.out.println("Preparando sala...");
        proyector.encender();
        dvd.reproducir(pelicula);
    }
}