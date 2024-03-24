
package com.mycompany.prograi;


public class Balsa extends Vehiculo {
    
    String tipo_navega;

    public Balsa() {
    }

    public Balsa(String tipo_navega, String tipo_transport, int anio) {
        super(tipo_transport, anio);
        this.tipo_navega = tipo_navega;
    }

    public String getTipo_navega() {
        return tipo_navega;
    }

    public void setTipo_navega(String tipo_navega) {
        this.tipo_navega = tipo_navega;
    }
    
    
    
}
