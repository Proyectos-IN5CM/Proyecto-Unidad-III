package org.diegomonterroso.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.diegomonterroso.webapp.model.Empleado;
import org.diegomonterroso.webapp.util.JpaUtil;

public class EmpleadoService implements IEmpleadoService{
    
    private EntityManager em;
    
    public EmpleadoService(){
        this.em = JpaUtil.getEntityManager();
    }
    
    @Override
    public List<Empleado> listarEmpleados() {
        return em.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();
    }

    @Override
    public void agregarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarEmpleado(int empleadoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarEmpleadoPorId(int empleadoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
