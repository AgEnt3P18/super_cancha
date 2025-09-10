package com.cancha.bootcamp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cancha.bootcamp.models.Reserva;

@Repository
public class ReservaRepository {
    private ArrayList<Reserva> reservas = new ArrayList<>();
    
    public Reserva agregarReserva(Reserva reserva){
        reservas.add(reserva);
        return reserva;
    }
    
    public List<Reserva> mostrarReservas() {
        return new ArrayList<>(reservas);
    }

    public boolean borrarReserva(int id) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId_reserva() == id) {
                reservas.remove(i);
                return true;
            }
        }
        return false;
    }

    public Reserva actualizarReserva(int id, Reserva actualizarReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId_reserva() == id) {
                reservas.set(i, actualizarReserva);
                return actualizarReserva;
            }
        }
        return null; // or throw an exception if preferred
    }

    public Reserva getReservaById(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId_reserva() == id) {
                return reserva;
            }
        }
        return null; 
    }

    public List<Reserva> getReservasByDate(String fecha) {
        ArrayList<Reserva> reservasFiltradas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getDate().equals(fecha)) {
                reservasFiltradas.add(reserva);
            }
        }
        return reservasFiltradas;
    }

    public List<Reserva> getReservasByEstado(String estado) {
        ArrayList<Reserva> reservasFiltradas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getEstado().equalsIgnoreCase(estado)) {
                reservasFiltradas.add(reserva);
            }
        }
        return reservasFiltradas;
    }
}
