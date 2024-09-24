import java.util.ArrayList;
import java.util.Scanner;

// Clase base Producto
abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

// Clases derivadas especializando productos
class ProductoRopa extends Producto {
    private String talla;

    public ProductoRopa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        return super.toString() + " - Talla: " + talla;
    }
}

class ProductoElectronico extends Producto {
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia; // En meses
    }

    public int getGarantia() {
        return garantia;
    }

    @Override
    public String toString() {
        return super.toString() + " - Garantía: " + garantia + " meses";
    }
}

// Clase Carrito para gestionar la compra (Abstracción)
class Carrito {
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();

        // Menú de productos
        Producto[] productos = {
                new ProductoRopa("Camiseta", 20.0, "M"),
                new ProductoRopa("Pantalón", 30.0, "L"),
                new ProductoElectronico("Teléfono", 300.0, 24),
                new ProductoElectronico("Portátil", 800.0, 12)
        };

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Quitar producto");
            System.out.println("3. Ver carrito");
            System.out.println("4. Finalizar compra");

            System.out.print("\nSelecciona una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                break;  // Finaliza la compra
            }

            switch (opcion) {
                case 1:
                    // Agregar producto al carrito
                    System.out.println("\nMenú de productos:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i]);
                    }

                    System.out.print("\nSelecciona un producto: ");
                    int seleccion = scanner.nextInt();
                    if (seleccion >= 1 && seleccion <= productos.length) {
                        Producto productoSeleccionado = productos[seleccion - 1];
                        carrito.agregarProducto(productoSeleccionado);
                        System.out.println(productoSeleccionado.getNombre() + " agregado al carrito.");
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 2:
                    // Quitar producto del carrito
                    carrito.mostrarProductos();
                    System.out.print("\nSelecciona el producto a quitar: ");
                    int quitar = scanner.nextInt();
                    carrito.quitarProducto(quitar - 1);
                    break;

                case 3:
                    // Ver productos seleccionados en el carrito
                    carrito.mostrarProductos();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        // Mostrar resumen de la compra
        System.out.println("\nResumen de la compra:");
        carrito.mostrarProductos();
        System.out.println("\nSubtotal: $" + carrito.calcularTotal());
        System.out.println("IVA (19%): $" + carrito.calcularIVA());
        System.out.println("Total con IVA: $" + carrito.totalConIVA());

        scanner.close();
    }
}