package org.diegomonterroso.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Clases")
@Entity

public class Clase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int claseId;
    private String tipoClase;
    private String descripcion;
    private double costo;

    public Clase() {
    }

    public Clase(String tipoClase, String descripcion, double costo) {
        this.tipoClase = tipoClase;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Clase(int claseId, String tipoClase, String descripcion, double costo) {
        this.claseId = claseId;
        this.tipoClase = tipoClase;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getClaseId() {
        return claseId;
    }

    public void setClaseId(int claseId) {
        this.claseId = claseId;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Clase{" + "claseId=" + claseId + ", tipoClase=" + tipoClase + ", descripcion=" + descripcion + ", costo=" + costo + '}';
    }
    
    
}
