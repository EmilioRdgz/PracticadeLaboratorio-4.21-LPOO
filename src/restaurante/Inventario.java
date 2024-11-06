package restaurante;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> stock;

    public Inventario() {
        stock = new HashMap<>();
    }

    // Verifica si hay stock suficiente (cohesión dentro de la clase)
    public boolean verificarStock(String elemento, int cantidad) {
        return stock.getOrDefault(elemento, 0) >= cantidad;
    }

    // Actualiza el stock después de un pedido (cohesión dentro de la clase)
    public void actualizarStock(String elemento, int cantidad) {
        stock.put(elemento, stock.getOrDefault(elemento, 0) - cantidad);
    }

    // Agrega stock de un nuevo elemento (cohesión dentro de la clase)
    public void agregarStock(String elemento, int cantidad) {
        stock.put(elemento, stock.getOrDefault(elemento, 0) + cantidad);
    }
}
