package org.diegomonterroso.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Aviones")
@Entity

public class Avion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int avionId;
    private String modelo;
    private String fechaFabricacion;
    private String aerolineaPropietaria;
    private String estadoAvion;

    public Avion() {
    }

    public Avion(String modelo, String fechaFabricacion, String aerolineaPropietaria, String estadoAvion) {
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.aerolineaPropietaria = aerolineaPropietaria;
        this.estadoAvion = estadoAvion;
    }

    public Avion(int avionId, String modelo, String fechaFabricacion, String aerolineaPropietaria, String estadoAvion) {
        this.avionId = avionId;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.aerolineaPropietaria = aerolineaPropietaria;
        this.estadoAvion = estadoAvion;
    }

    public Avion(String modelo, String capacidad, String fecha, String aerolinea, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAvionId() {
        return avionId;
    }

    public void setAvionId(int avionId) {
        this.avionId = avionId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricaion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getAerolineaPropietaria() {
        return aerolineaPropietaria;
    }

    public void setAerolineaPropietaria(String aerolineaPropietaria) {
        this.aerolineaPropietaria = aerolineaPropietaria;
    }

    public String getEstadoAvion() {
        return estadoAvion;
    }

    public void setEstadoAvion(String estadoAvion) {
        this.estadoAvion = estadoAvion;
    }

    @Override
    public String toString() {
        return "Avion{" + "avionId=" + avionId + ", modelo=" + modelo + ", fechaFabricacion=" + fechaFabricacion + ", aerolineaPropietaria=" + aerolineaPropietaria + ", estadoAvion=" + estadoAvion + '}';
    }
    
    
}
