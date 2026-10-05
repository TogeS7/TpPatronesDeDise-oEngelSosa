package prototype;

public class Main {
    public static void main(String[] args) {
        Orco prototipo = new Orco("Hacha Pesada"); 
        
        Enemigo clon1 = prototipo.clonar();
        Enemigo clon2 = prototipo.clonar();
        
        clon1.mostrar();
        clon2.mostrar();
    }
}