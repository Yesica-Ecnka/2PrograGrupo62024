
package com.mycompany.prograi;


public class Carro extends Vehiculo {
    
    String tipo_gasolina;

    public Carro() {
    }

    public Carro(String tipo_gasolina, String tipo_transport, int anio) {
        super(tipo_transport, anio);
        this.tipo_gasolina = tipo_gasolina;
    }

    public String getTipo_gasolina() {
        return tipo_gasolina;
    }

    public void setTipo_gasolina(String tipo_gasolina) {
        this.tipo_gasolina = tipo_gasolina;
    }
    
    
    
    
    
}
