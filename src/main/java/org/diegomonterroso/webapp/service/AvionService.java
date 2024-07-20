package org.diegomonterroso.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.diegomonterroso.webapp.model.Avion;
import org.diegomonterroso.webapp.util.JpaUtil;

public class AvionService implements IAvionService{
    
    private EntityManager em;
    
    public AvionService(){
        this.em = JpaUtil.getEntityManager();
    }
    
    @Override
    public List<Avion> listarAviones() {
        return em.createQuery("SELECT a FROM Avion a", Avion.class).getResultList();
    }

    @Override
    public void agregarAvion(Avion avion) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(avion);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarAvion(int avionId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarAvionPorId(int avionId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarAvion(Avion avion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
