package org.diegomonterroso.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.diegomonterroso.webapp.model.Pasajero;
import org.diegomonterroso.webapp.util.JpaUtil;

public class PasajeroService implements IPasajeroService{
    
    private EntityManager em;
    
    public PasajeroService(){
        this.em = JpaUtil.getEntityManager();
    }
    
    @Override
    public List<Pasajero> listarPasajeros() {
        return em.createQuery("SELECT p FROM Pasajero p", Pasajero.class).getResultList();
    }

    @Override
    public void agregarPasajero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarPasajero(int pasajeroId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarPasajeroPorId(int pasajeroId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarPasajero(Pasajero pasajero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
