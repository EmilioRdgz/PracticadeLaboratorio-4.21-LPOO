package restaurante;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Inventario inventario = new Inventario();
        Pago pago = new Pago();

        // Agregar stock en inventario
        inventario.agregarStock("Pizza", 10);
        inventario.agregarStock("Hamburguesa", 5);

        // Agregar elementos al pedido, verificando stock (cohesión y acoplamiento entre clases)
        String item = "Pizza";
        int cantidad = 2;
        double precio = 12.50;

        if (pedido.verificarStock(item, cantidad, inventario)) {
            pedido.agregarElemento(item, cantidad, precio);
            inventario.actualizarStock(item, cantidad);
        }

        // Aplicar descuento al pedido (cohesión dentro de Pedido)
        pedido.aplicarDescuento(5.00);

        // Procesar pago del pedido (acoplamiento con la clase Pago)
        pedido.procesarPago(pago);

        // Mostrar el total del pedido
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
}

