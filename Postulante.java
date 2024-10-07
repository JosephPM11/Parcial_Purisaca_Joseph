import java.util.ArrayList;
import java.util.Date;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;
    private ArrayList<Postulacion> postulaciones;
    private GradoEstudio gradoEstudio;

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, Date nacimiento, String clave) {
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.clave = clave;
        this.postulaciones = new ArrayList<>();
        this.gradoEstudio = null;
    }

    public void asignarGradoEstudio(String nuevaDescripcion) {
        if (gradoEstudio != null) {
            gradoEstudio.setDescripcion(nuevaDescripcion);
        } else {
            gradoEstudio = new GradoEstudio(nuevaDescripcion); 
        }
    }   

    public boolean postular(Oferta oferta, String glosa) {
        Postulacion nuevaPostulacion = new Postulacion(oferta, new Date(), glosa);
        postulaciones.add(nuevaPostulacion);
        return true;
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        postulacion.setAnulado(true);
        postulacion.setFechaAnulacion(new Date());
        return true;
    }

    public ArrayList<Postulacion> getPostulaciones() {
        return postulaciones;
    }

