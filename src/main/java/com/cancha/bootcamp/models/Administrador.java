package com.cancha.bootcamp.models;

public class Administrador extends  Usuario {
    private String cargo;
    private String area_responsable;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getArea_responsable() {
        return area_responsable;
    }
    public void setArea_responsable(String area_responsable) {
        this.area_responsable = area_responsable;
    }
    public void gestionar_cancha(){}
    public void aprobar_reserva(){} 
}
