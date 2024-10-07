import java.util.ArrayList;

public class ArregloCliente {
    private int indice;
    private ArrayList<Cliente> clientes;

    public ArregloCliente() {
        this.indice = 0;
        this.clientes = new ArrayList<>();
    }

    public boolean agregar(Cliente cliente) {
        clientes.add(cliente);
        indice++;
        return true;
    }

    public Cliente buscar(String RUC) {
        for (int i = 0; i < indice; i++) {
            if (clientes.get(i).getRUC().equals(RUC)) {
                return clientes.get(i);
            }
        }
        return null;
     }
    
    public ArrayList<Cliente> buscarPorNombre(String nombre) {
        ArrayList<Cliente> resultados = new ArrayList<>();
        for (int i = 0; i < indice; i++) {
            if (clientes.get(i).getNombre().contains(nombre)) {
                resultados.add(clientes.get(i));
            }
        }
        return resultados;
    }
}

