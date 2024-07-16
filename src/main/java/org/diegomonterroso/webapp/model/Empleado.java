package org.diegomonterroso.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Empleados")
@Entity

public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empleadoId;
    private String nombre;
    private String apellido;
    private String puesto;
    private String salario;
    private String contactoTelefono;
    private String contactoEmail;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String puesto, String salario, String contactoTelefono, String contactoEmail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        this.contactoTelefono = contactoTelefono;
        this.contactoEmail = contactoEmail;
    }

    public Empleado(int empleadoId, String nombre, String apellido, String puesto, String salario, String contactoTelefono, String contactoEmail) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        this.contactoTelefono = contactoTelefono;
        this.contactoEmail = contactoEmail;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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
        return "Empleado{" + "empleadoId=" + empleadoId + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + ", salario=" + salario + ", contactoTelefono=" + contactoTelefono + ", contactoEmail=" + contactoEmail + '}';
    }
    
    
}
