package org.diegomonterroso.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.diegomonterroso.webapp.model.Clase;
import org.diegomonterroso.webapp.model.Empleado;
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
    public void agregarClase(Clase clase) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(clase);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }
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
