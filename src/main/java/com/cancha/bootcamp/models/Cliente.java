package com.cancha.bootcamp.models;

public class Cliente extends Usuario {
    private String telefono;
    private float saldo;
    
    public void telefono(){}
    public void cancelar_reserva(){}
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
