package org.diegomonterroso.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Pasajeros")
@Entity

public class Pasajero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pasajeroId;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String pasaporte;
    private String contactoTelefono;
    private String contactoEmail;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String pasaporte, String contactoTelefono, String contactoEmail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.pasaporte = pasaporte;
        this.contactoTelefono = contactoTelefono;
        this.contactoEmail = contactoEmail;
    }

    public Pasajero(int pasajeroId, String nombre, String apellido, String fechaNacimiento, String nacionalidad, String pasaporte, String contactoTelefono, String contactoEmail) {
        this.pasajeroId = pasajeroId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.pasaporte = pasaporte;
        this.contactoTelefono = contactoTelefono;
        this.contactoEmail = contactoEmail;
    }

    public int getPasajeroId() {
        return pasajeroId;
    }

    public void setPasajeroId(int pasajeroId) {
        this.pasajeroId = pasajeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getContactoTelefono() {
        return contactoTelefono;
    }

    public void setContactoTelefono(String contactoTelefono) {
        this.contactoTelefono = contactoTelefono;
    }

    public String getContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(String contactoEmail) {
        this.contactoEmail = contactoEmail;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "pasajeroId=" + pasajeroId + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", pasaporte=" + pasaporte + ", contactoTelefono=" + contactoTelefono + ", contactoEmail=" + contactoEmail + '}';
    }
    
    
}
