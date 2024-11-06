package restaurante;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<String, Integer> items;
    private double total;

    public Pedido() {
        items = new HashMap<>();
        total = 0;
    }

    // Agrega un elemento al pedido (cohesión dentro de la clase)
    public void agregarElemento(String elemento, int cantidad, double precio) {
        items.put(elemento, cantidad);
        total += precio * cantidad;
    }

    // Elimina un elemento del pedido (cohesión dentro de la clase)
    public void eliminarElemento(String elemento, double precio) {
        if (items.containsKey(elemento)) {
            int cantidad = items.get(elemento);
            total -= precio * cantidad;
            items.remove(elemento);
        }
    }

    // Calcula el total del pedido (cohesión dentro de la clase)
    public double calcularTotal() {
        return total;
    }

    // Aplica un descuento al total del pedido (cohesión dentro de la clase)
    public void aplicarDescuento(double descuento) {
        total -= descuento;
    }

    // Dependencia en Inventario para verificar stock (acoplamiento entre clases)
    public boolean verificarStock(String elemento, int cantidad, Inventario inventario) {
        return inventario.verificarStock(elemento, cantidad);
    }

    // Dependencia en Pago para procesar el pago del pedido (acoplamiento entre clases)
    public boolean procesarPago(Pago pago) {
        return pago.procesarPago(total);
    }
}
