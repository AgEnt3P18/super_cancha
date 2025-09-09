package com.cancha.bootcamp.models;

public class Pago {
    private int id_pago;
    private double monto;
    private String fecha_pago;
    private String metodo_pago;

    public int getId_pago() {
        return id_pago;
    }
    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getFecha_pago() {
        return fecha_pago;
    }
    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
    public String getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    public void procesar_pago(){};
    public void dividir_pago(){};    
}
