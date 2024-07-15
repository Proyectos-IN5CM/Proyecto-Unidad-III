package org.diegomonterroso.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.diegomonterroso.webapp.model.Vuelo;
import org.diegomonterroso.webapp.util.JpaUtil;

public class VueloService implements IVueloService{
    
    private EntityManager em;
    
    public VueloService(){
        this.em = JpaUtil.getEntityManager();
    }
    
    @Override
    public List<Vuelo> listarVuelos() {
        return em.createQuery("SELECT v FROM Vuelo v", Vuelo.class).getResultList();
    }

    @Override
    public void agregarVuelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarVuelo(int vueloId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarVueloPorId(int vueloId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarVuelo(Vuelo vuelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
