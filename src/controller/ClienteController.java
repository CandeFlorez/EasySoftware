package controller;

import java.util.ArrayList;
import model.Cliente;

public class ClienteController {

    private ArrayList<Cliente> clientes = new ArrayList();

    public void create(Cliente clien) {
        clientes.add(clien);
    }

    public ArrayList<String[]> read() {

        ArrayList<String[]> leer = new ArrayList();
        for (int i = 0; i < clientes.size(); i++) {

            leer.add(new String[]{clientes.get(i).getID(),
                clientes.get(i).getNombre(),
                clientes.get(i).getApellido(),
                clientes.get(i).getTelefono(),
                clientes.get(i).getDireccion()});

        }
        return leer;
    }

    public void update(int ID, Cliente c) {

    }

    public void delete(int in) {
        clientes.remove(in);
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }
}
