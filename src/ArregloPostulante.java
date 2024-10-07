import java.util.ArrayList;

public class ArregloPostulante {
    private int indice;
    private ArrayList<Postulante> postulantes;

    public ArregloPostulante() {
        this.indice = 0;
        this.postulantes = new ArrayList<>();
    }

    public boolean agregar(Postulante postulante) {
        postulantes.add(postulante);
        indice++;
        return true;
    }

    public Postulante buscar(String DNI) {
        for (int i = 0; i < indice; i++) {
            if (postulantes.get(i).getDNI().equals(DNI)) {
                return postulantes.get(i);
            }
        }
        return null; 
    }
}
