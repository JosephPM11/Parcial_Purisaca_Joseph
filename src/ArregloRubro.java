import java.util.ArrayList;

public class ArregloRubro {
    private ArrayList<Rubro> rubros;

    public ArregloRubro() {
        this.rubros = new ArrayList<>();
    }

    public boolean agregar(Rubro rubro) {
        rubros.add(rubro);
        return true;
    }

    public Rubro buscar(String nombre) {
        for (int i = 0; i < rubros.size(); i++) {
            if (rubros.get(i).getNombre().equals(nombre)) {
                return rubros.get(i);
            }
        }
        return null;
    }
}
