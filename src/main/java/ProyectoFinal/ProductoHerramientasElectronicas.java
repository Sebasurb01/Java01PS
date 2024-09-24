package ProyectoFinal;

public class ProductoHerramientasElectronicas extends Producto {
    private int garantia;

    public ProductoHerramientasElectronicas(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.toString() + " - Garantía: " + garantia + " meses";
    }
}
