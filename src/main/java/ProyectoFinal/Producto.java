
package ProyectoFinal;

abstract class Producto implements Iproducto {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularPrecioConIva(double precio) {
        final double IVA = 0.19;
        return precio + (precio * IVA);
    }

    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio + " - Precio con IVA: $" + calcularPrecioConIva(precio);
    }
}
