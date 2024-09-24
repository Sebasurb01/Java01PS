package ProyectoFinal;

public enum CategoriaProducto {
    ROPA(1, "Ropa"),
    ELECTRONICA(2, "Electrónica");

    private final int id;
    private final String nombre;

    CategoriaProducto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static CategoriaProducto getForKey(int id) {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            if (c.id == id) {
                return c;
            }
        }
        throw new RuntimeException("Categoría no encontrada");
    }
}
