
package ProyectoFinal;
import java.util.ArrayList;


public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
    private double total = 0;
    private final double IVA = 0.19;

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public void quitarProducto(int indice) {
        if (indice >= 0 && indice < productos.size()) {
            Producto producto = productos.remove(indice);
            total -= producto.getPrecio();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("\nProductos en el carrito:");
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
        }
    }

    public double calcularTotal() {
        return total;
    }

    public double calcularIVA() {
        return total * IVA;
    }

    public double totalConIVA() {
        return total + calcularIVA();
    }
}
