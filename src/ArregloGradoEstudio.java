import java.util.ArrayList;

public class ArregloGradoEstudio {
    private int indice;
    private ArrayList<GradoEstudio> gradosEstudio;

    public ArregloGradoEstudio() {
        this.indice = 0;
        this.gradosEstudio = new ArrayList<>();
    }

    public boolean agregar(GradoEstudio grado) {
        gradosEstudio.add(grado);
        indice++;
        return true;
    }

    public GradoEstudio buscar(String descripcion) {
        for (int i = 0; i < indice; i++) {
            if (gradosEstudio.get(i).getDescripcion().equals(descripcion)) {
                return gradosEstudio.get(i);
            }
        }
        return null;
    }

    public GradoEstudio getGradoEstudio(String descripcion) {
        GradoEstudio grado = buscar(descripcion);
        if (grado != null) {
            return grado;
        } else {
            System.out.println("No se encontró un grado de estudio con esa descripción.");
            return null;
        }
    }
}
