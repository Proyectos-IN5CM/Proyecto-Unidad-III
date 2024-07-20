package org.diegomonterroso.webapp.service;

import java.util.List;
import org.diegomonterroso.webapp.model.Avion;

public interface IAvionService {
    
    public List<Avion> listarAviones();
    
    public void agregarAvion(Avion avion);
    
    public void eliminarAvion(int avionId);
    
    public void buscarAvionPorId(int avionId);
    
    public void editarAvion(Avion avion);
}
