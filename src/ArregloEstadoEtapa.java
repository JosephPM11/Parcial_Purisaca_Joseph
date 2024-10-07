import java.util.ArrayList;

public class ArregloEstadoEtapa {
    private int indice;
    private ArrayList<EstadoEtapa> estadosEtapa;

    public ArregloEstadoEtapa() {
        this.indice = 0;
        this.estadosEtapa = new ArrayList<>();
    }

    public boolean agregar(EstadoEtapa estado) {
        estadosEtapa.add(estado);
        indice++;
        return true;
    }
}
