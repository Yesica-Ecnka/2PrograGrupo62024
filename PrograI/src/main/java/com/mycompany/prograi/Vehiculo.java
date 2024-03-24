
package com.mycompany.prograi;


public class Vehiculo {
    
    String tipo_transport;
    int anio;

    public Vehiculo() {
    }

    public Vehiculo(String tipo_transport, int anio) {
        this.tipo_transport = tipo_transport;
        this.anio = anio;
    }

    public String getTipo_transport() {
        return tipo_transport;
    }

    public void setTipo_transport(String tipo_transport) {
        this.tipo_transport = tipo_transport;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
}
