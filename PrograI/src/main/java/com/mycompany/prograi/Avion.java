
package com.mycompany.prograi;


public class Avion extends Vehiculo{
    
    int cantPasajeros;

    public Avion() {
    }

    public Avion(int cantPasajeros, String tipo_transport, int anio) {
        super(tipo_transport, anio);
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    
    
    
    
    
}
