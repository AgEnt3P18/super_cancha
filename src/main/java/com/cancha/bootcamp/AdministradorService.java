package com.cancha.bootcamp;

import org.springframework.stereotype.Service;
import java.util.List;
import com.cancha.bootcamp.models.Administrador;
import com.cancha.bootcamp.repository.AdministradorRepository;

@Service
public class AdministradorService {

    private final AdministradorRepository administradorRepository;

    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    // Obtener todos los administradores
    public List<Administrador> obtenerAdministradores() {
        return administradorRepository.mostrarAdministradores();
    }

    // Guardar un nuevo administrador
    public Administrador guardarAdministrador(Administrador administrador) {
        return administradorRepository.agregarAdministrador(administrador);
    }

    // Obtener administrador por ID
    public Administrador obtenerAdministradorPorId(int id) {
        return administradorRepository.getAdministradorById(id);
    }

    // Actualizar administrador
    public Administrador actualizarAdministrador(int id, Administrador administrador) {
        return administradorRepository.actualizarAdministrador(id, administrador);
    }

    // Eliminar administrador
    public boolean eliminarAdministrador(int id) {
        return administradorRepository.borrarAdministrador(id);
    }
}
    