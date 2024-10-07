import java.util.ArrayList;
import java.util.Date;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private ArrayList<Requisito> requisitos;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.requisitos = new ArrayList<>();
    }

    public boolean agregarRequisito(int orden, String descripcion) {
        Requisito nuevoRequisito = new Requisito(orden, descripcion);
        requisitos.add(nuevoRequisito);
        return true;
    }

    public boolean eliminarRequisito(int orden) {
        for (int i = 0; i < requisitos.size(); i++) {
            if (requisitos.get(i).getOrden() == orden) {
                requisitos.remove(i);
                return true;
            }
        }
        return false;
    }
    

    public ArrayList<Requisito> getRequisitos() {
        return requisitos;
    }
}

