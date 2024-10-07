import java.util.Date;

public class Postulacion {
    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;
    private Oferta oferta;

    public Postulacion(Oferta oferta, Date fecha, String glosa) {
        this.oferta = oferta;
        this.fecha = fecha;
        this.anulado = false;
    }

    public void setAnulado(boolean anulado){
        this.anulado = anulado;
    }

    public void setFechaAnulacion(Date fechaAnulacion){
        this.fechaAnulacion = fechaAnulacion;
    }
}

