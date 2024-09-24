package ProyectoFinal;

public enum CategoriaProducto {
    MANUAL(1, "Manual"),
    ELECTRICO(2, "Eléctrico");

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
        throw new IllegalArgumentException("Categoría no encontrada");
    }
}
