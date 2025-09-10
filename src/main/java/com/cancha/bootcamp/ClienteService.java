package com.cancha.bootcamp;

import org.springframework.stereotype.Service;
import java.util.List;
import com.cancha.bootcamp.models.Cliente;
import com.cancha.bootcamp.repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Obtener todos los clientes
    public List<Cliente> obtenerClientes() {
        return clienteRepository.mostrarClientes();
    }

    // Guardar un nuevo cliente
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.agregarCliente(cliente);
    }

    // Obtener cliente por ID
    public Cliente obtenerClientePorId(int id) {
        return clienteRepository.getClienteById(id);
    }

    // Actualizar cliente
    public Cliente actualizarCliente(int id, Cliente cliente) {
        return clienteRepository.actualizarCliente(id, cliente);
    }

    // Eliminar cliente
    public boolean eliminarCliente(int id) {
        return clienteRepository.borrarCliente(id);
    }
}
