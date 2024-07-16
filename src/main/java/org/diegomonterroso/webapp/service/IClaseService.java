package org.diegomonterroso.webapp.service;

import java.util.List;
import org.diegomonterroso.webapp.model.Clase;

public interface IClaseService {
    
    public List<Clase> listarClases();
    
    public void agregarClase();
    
    public void eliminarClase(int claseId);
    
    public void buscarClasePorId(int claseId);
    
    public void editarClase(Clase clase);
}
