package com.cancha.bootcamp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cancha.bootcamp.models.Pago;

@Repository
public class PagoRepository {
    private ArrayList<Pago> pagos = new ArrayList<>();
    
    public Pago agregarPago(Pago pago){
        pagos.add(pago);
        return pago;
    }
    
    public List<Pago> mostrarPagos() {
        return new ArrayList<>(pagos);
    }

    public boolean borrarPago(int id) {
        for (int i = 0; i < pagos.size(); i++) {
            if (pagos.get(i).getId_pago() == id) {
                pagos.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pago actualizarPago(int id, Pago actualizarPago) {
        for (int i = 0; i < pagos.size(); i++) {
            if (pagos.get(i).getId_pago() == id) {
                pagos.set(i, actualizarPago);
                return actualizarPago;
            }
        }
        return null; // or throw an exception if preferred
    }

    public Pago getPagoById(int id) {
        for (Pago pago : pagos) {
            if (pago.getId_pago() == id) {
                return pago;
            }
        }
        return null; 
    }

    public List<Pago> getPagosByFecha(String fecha) {
        ArrayList<Pago> pagosFiltrados = new ArrayList<>();
        for (Pago pago : pagos) {
            if (pago.getFecha_pago().equals(fecha)) {
                pagosFiltrados.add(pago);
            }
        }
        return pagosFiltrados;
    }

    public List<Pago> getPagosByMetodo(String metodoPago) {
        ArrayList<Pago> pagosFiltrados = new ArrayList<>();
        for (Pago pago : pagos) {
            if (pago.getMetodo_pago().equalsIgnoreCase(metodoPago)) {
                pagosFiltrados.add(pago);
            }
        }
        return pagosFiltrados;
    }

    public double getTotalPagosByFecha(String fecha) {
        double total = 0.0;
        for (Pago pago : pagos) {
            if (pago.getFecha_pago().equals(fecha)) {
                total += pago.getMonto();
            }
        }
        return total;
    }
}
