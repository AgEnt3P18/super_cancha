package com.cancha.bootcamp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cancha.bootcamp.models.Cancha;

@Repository
public class CanchaRepository {
    private ArrayList<Cancha> canchas = new ArrayList<>();
    
    public Cancha agregarCancha(Cancha cancha){
        canchas.add(cancha);
        return cancha;
    }
    
    public List<Cancha> mostrarCanchas() {
        return new ArrayList<>(canchas);
    }

    public boolean borrarCancha(int id) {
        for (int i = 0; i < canchas.size(); i++) {
            if (canchas.get(i).getId_cancha() == id) {
                canchas.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cancha actualizarCancha(int id, Cancha actualizarCancha) {
        for (int i = 0; i < canchas.size(); i++) {
            if (canchas.get(i).getId_cancha() == id) {
                canchas.set(i, actualizarCancha);
                return actualizarCancha;
            }
        }
        return null; // or throw an exception if preferred
    }

    public Cancha getCanchaById(int id) {
        for (Cancha cancha : canchas) {
            if (cancha.getId_cancha() == id) {
                return cancha;
            }
        }
        return null; 
    }

    public List<Cancha> getCanchasByTipo(String tipo) {
        ArrayList<Cancha> canchasFiltradas = new ArrayList<>();
        for (Cancha cancha : canchas) {
            if (cancha.getTipo().equalsIgnoreCase(tipo)) {
                canchasFiltradas.add(cancha);
            }
        }
        return canchasFiltradas;
    }

    public List<Cancha> getCanchasByUbicacion(String ubicacion) {
        ArrayList<Cancha> canchasFiltradas = new ArrayList<>();
        for (Cancha cancha : canchas) {
            if (cancha.getUbicacion().equalsIgnoreCase(ubicacion)) {
                canchasFiltradas.add(cancha);
            }
        }
        return canchasFiltradas;
    }
}
