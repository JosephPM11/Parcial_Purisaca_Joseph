public class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = true; // Habilitado por defecto
    }

    public boolean habilitar() {
        this.estado = true;
        return this.estado;
    }

    public boolean deshabilitar() {
        this.estado = false;
        return !this.estado;
    }

    // Getters y Setters
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return estado;
    }
}
