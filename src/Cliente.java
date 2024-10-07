import java.util.ArrayList;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    private ArrayList<Oferta> ofertas;
    private Contacto contacto;

    public Cliente(String RUC, String nombre, String email, String telefono, String clave) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new ArrayList<>();
        this.contacto = null;
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
        if (this.contacto == null) {
            this.contacto = contacto;
            return true;
        }
        return false; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getRUC(){
        return RUC;
    }
}
