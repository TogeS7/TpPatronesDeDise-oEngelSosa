package strategy;

public class PagoTransferencia implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pago por transferencia: $" + monto);
    }
}