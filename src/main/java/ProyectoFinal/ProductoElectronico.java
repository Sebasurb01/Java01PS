package ProyectoFinal;
public class ProductoElectronico extends Producto {
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
