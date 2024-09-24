package ProyectoFinal;

public class ProductoRopa extends Producto {
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
