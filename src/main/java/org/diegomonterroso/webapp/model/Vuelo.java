package org.diegomonterroso.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Vuelos")
@Entity

public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vueloId;
    private String origen;
    private String destino;
    private String aerolinea;
    
    public Vuelo() {
    }

    public Vuelo(String origen, String destino, String aerolinea) {
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
    }

    public Vuelo(int vueloId, String origen, String destino, String aerolinea) {
        this.vueloId = vueloId;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
    }

    public int getVueloId() {
        return vueloId;
    }

    public void setVueloId(int vueloId) {
        this.vueloId = vueloId;
    }
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "vueloId=" + vueloId + ", origen=" + origen + ", destino=" + destino + ", aerolinea=" + aerolinea + '}';
    }
    
    
}
