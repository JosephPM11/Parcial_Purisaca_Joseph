public class Rubro {
    private String nombre;
    private boolean estado;

    public Rubro(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public boolean habilitar() {
        this.estado = true;
        return this.estado;
    }

    public boolean deshabilitar() {
        this.estado = false;
        return !this.estado;
    }

    public String getNombre() {
        return nombre;
    }
}