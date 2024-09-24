package ProyectoFinal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();


        Producto[] productos = {
                new ProductoHerramientas("Martillo", 8000, "Madera/Metal"),
                new ProductoHerramientas("Destornillador", 3000, "Acero/Plastico"),
                new ProductoHerramientasElectronicas("Pulidora", 300000, 24),
                new ProductoHerramientasElectronicas("Taladro", 800000, 12)
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
                break;
            }

            switch (opcion) {
                case 1:

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

                    carrito.mostrarProductos();
                    System.out.print("\nSelecciona el producto a quitar: ");
                    int quitar = scanner.nextInt();
                    carrito.quitarProducto(quitar - 1);
                    break;

                case 3:

                    carrito.mostrarProductos();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }


        System.out.println("\nResumen de la compra:");
        carrito.mostrarProductos();
        System.out.println("\nSubtotal: $" + carrito.calcularTotal());
        System.out.println("IVA (19%): $" + carrito.calcularIVA());
        System.out.println("Total con IVA: $" + carrito.totalConIVA());

        scanner.close();
    }
}
