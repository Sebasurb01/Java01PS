package ProyectoFinal;

public class ProductoHerramientas extends Producto {
    private String material;

    public ProductoHerramientas(String nombre, double precio, String material) {
        super(nombre, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " - material: " + material;
    }
}
