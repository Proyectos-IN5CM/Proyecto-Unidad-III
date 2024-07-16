package org.diegomonterroso.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.diegomonterroso.webapp.model.Clase;
import org.diegomonterroso.webapp.util.JpaUtil;

public class ClaseService implements IClaseService{
    
    private EntityManager em;
    
    public ClaseService(){
        this.em = JpaUtil.getEntityManager();
    }
    
    @Override
    public List<Clase> listarClases() {
        return em.createQuery("SELECT c FROM Clase c", Clase.class).getResultList();
    }

    @Override
    public void agregarClase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarClase(int claseId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarClasePorId(int claseId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarClase(Clase clase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
