import java.util.ArrayList;

public class ArregloRubro {
    private ArrayList<Rubro> rubros;
    private int indice;

    public ArregloRubro() {
        this.rubros = new ArrayList<>();
        this.indice = 0;
    }

    public boolean agregar(Rubro rubro) {
        rubros.add(rubro);
        indice++;
        return true;
    }

    public Rubro buscar(String nombre) {
        for (int i = 0; i < indice; i++) {
            if (rubros.get(i).getNombre().equals(nombre)) {
                return rubros.get(i);
            }
        }
        return null;
    }
}