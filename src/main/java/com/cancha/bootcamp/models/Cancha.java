package com.cancha.bootcamp.models;

public class Cancha {
    private int Id_cancha;
    private String nombre;
    private String tipo;
    private String ubicacion;
    private double precio_hora;

    public int getId_cancha() {
        return Id_cancha;
    }
    public void setCancha(int Id_cancha) {
        this.Id_cancha = Id_cancha;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public double getPrecio_hora() {
        return precio_hora;
    }
    public void setPrecio_hora(double precio_hora) {
        this.precio_hora = precio_hora;
    }
    public void consultar_disponibilidad(){}
    public void actualizar_precio(){}
}
