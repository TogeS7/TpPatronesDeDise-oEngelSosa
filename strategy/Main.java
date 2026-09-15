package strategy;

public class Main {

    public static void main(String[] args) {

        Compra compra = new Compra();

        compra.setMetodoPago(new PagoEfectivo());
        compra.realizarPago(10000);

        compra.setMetodoPago(new PagoTarjeta());
        compra.realizarPago(15000);

        compra.setMetodoPago(new PagoTransferencia());
        compra.realizarPago(20000);
    }
}