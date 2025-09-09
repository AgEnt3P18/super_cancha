package com.cancha.bootcamp.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cancha.bootcamp.models.Administrador;

@Repository
public class AdministradorRepository {
    private ArrayList<Administrador> administradores = new ArrayList<>();
    
    public Administrador agregar_administrador(Administrador administrador){
        administradores.add(administrador);
        return administrador;

    }
    
    public ArrayList<Administrador> mostrar_administradores(ArrayList<Administrador> administradores) {
        administradores.addAll(administradores);
        return administradores;
    }

    public boolean borrar_administrador(int id) {
        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getId_usuario() == id) {
                administradores.remove(i);
                return true;
            }
        }
        return false;
    }

    public Administrador actualizar_Administrador (int id, Administrador actualizar_Administrador) {
        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getId_usuario() == id) {
                administradores.set(i, actualizar_Administrador);
                return actualizar_Administrador;
            }
        }
        return null; // or throw an exception if preferred
    }

    public Administrador getAcademyTutorById(int id) {
        for (Administrador administrador : administradores) {
            if (administrador.getId_usuario() == id) {
                return administrador;
            }
        }
        return null; // or throw an exception if preferred
    }

    public ArrayList<Administrador> getAllAcademyTutors() {
        return administradores;
    }
    

}
