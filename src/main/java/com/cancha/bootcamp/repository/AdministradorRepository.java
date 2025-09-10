package com.cancha.bootcamp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cancha.bootcamp.models.Administrador;

@Repository
public class AdministradorRepository {
    private ArrayList<Administrador> administradores = new ArrayList<>();
    
    public Administrador agregarAdministrador(Administrador administrador){
        administradores.add(administrador);
        return administrador;

    }
    
    public boolean borrarAdministrador(int id) {
        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getId_usuario() == id) {
                administradores.remove(i);
                return true;
            }
        }
        return false;
    }

    public Administrador actualizarAdministrador (int id, Administrador actualizarAdministrador) {
        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getId_usuario() == id) {
                administradores.set(i, actualizarAdministrador);
                return actualizarAdministrador;
            }
        }
        return null; // or throw an exception if preferred
    }

    public Administrador getAdministradorById(int id) {
        for (Administrador administrador : administradores) {
            if (administrador.getId_usuario() == id) {
                return administrador;
            }
        }
        return null; 
    }

    public List<Administrador> mostrarAdministradores() {
        return new ArrayList<>(administradores);
    }
}
