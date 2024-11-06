package restaurante;

public class Pago {
    // Procesa el pago de un pedido (cohesión dentro de la clase)
    public boolean procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago procesado por: $" + monto);
            return true;
        } else {
            System.out.println("Monto inválido para procesar el pago.");
            return false;
        }
    }
}

