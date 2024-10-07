import java.util.ArrayList;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    private ArrayList<Oferta> ofertas;
    private ArrayList<Contacto> contactos;

    public Cliente(String RUC, String nombre, String email, String telefono, String clave) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new ArrayList<>();
        this.contactos = new ArrayList<>();
    }

    public boolean agregarOferta(Oferta oferta) {
        return ofertas.add(oferta);
    }

    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    public boolean registrarContacto(Contacto contacto) {
        return contactos.add(contacto);
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    // Getters y Setters
    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
