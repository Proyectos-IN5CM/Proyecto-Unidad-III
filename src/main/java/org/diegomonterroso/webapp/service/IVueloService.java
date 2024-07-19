package org.diegomonterroso.webapp.service;

import java.util.List;
import org.diegomonterroso.webapp.model.Vuelo;

public interface IVueloService {
    
    public List<Vuelo> listarVuelos();
    
    public void agregarVuelo(Vuelo vuelo);
    
    public void eliminarVuelo(int vueloId);
    
    public void buscarVueloPorId(int vueloId);
    
    public void editarVuelo(Vuelo vuelo);
}
