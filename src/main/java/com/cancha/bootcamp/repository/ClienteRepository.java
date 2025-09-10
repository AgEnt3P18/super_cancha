package com.cancha.bootcamp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cancha.bootcamp.models.Cliente;

@Repository
public class ClienteRepository {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public Cliente agregarCliente(Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }
    
    public List<Cliente> mostrarClientes() {
        return new ArrayList<>(clientes);
    }

    public boolean borrarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId_usuario() == id) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente actualizarCliente(int id, Cliente actualizarCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId_usuario() == id) {
                clientes.set(i, actualizarCliente);
                return actualizarCliente;
            }
        }
        return null; // or throw an exception if preferred
    }

    public Cliente getClienteById(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId_usuario() == id) {
                return cliente;
            }
        }
        return null; 
    }

    public Cliente getClienteByTelefono(String telefono) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefono().equals(telefono)) {
                return cliente;
            }
        }
        return null;
    }
}
