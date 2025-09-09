package com.cancha.bootcamp.models;

public class Reserva {
    private int id_reserva;
    private String date;
    private String hora_inicio;
    private String hora_fin;
    private String estado;

    public int getId_reserva() {
        return id_reserva;
    }
    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHora_inicio() {
        return hora_inicio;
    }
    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
    public String getHora_fin() {
        return hora_fin;
    }
    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void confirmar_entrega(){}
    public void cancelar_reserva(){}
}
