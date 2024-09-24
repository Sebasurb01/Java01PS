package ProyectoFinal;

public class ProductoHerramientas extends Producto {
    private final String material;

    public ProductoHerramientas(String nombre, double precio, String material) {
        super(nombre, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + " - Material: " + material;
    }
}
