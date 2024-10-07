public class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = true;
    }

    public boolean habilitar() {
        this.estado = true;
        return this.estado;
    }

    public boolean deshabilitar() {
        this.estado = false;
        return !this.estado;
    }

    public int getOrden() {
        return orden;
    }
}