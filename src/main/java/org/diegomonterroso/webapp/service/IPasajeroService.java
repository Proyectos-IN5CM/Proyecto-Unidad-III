package org.diegomonterroso.webapp.service;

import java.util.List;
import org.diegomonterroso.webapp.model.Pasajero;

public interface IPasajeroService {
    
    public List<Pasajero> listarPasajeros();
    
    public void agregarPasajero();
    
    public void eliminarPasajero(int pasajeroId);
    
    public void buscarPasajeroPorId(int pasajeroId);
    
    public void editarPasajero(Pasajero pasajero);
}
