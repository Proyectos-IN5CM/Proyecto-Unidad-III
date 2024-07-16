package org.diegomonterroso.webapp.service;

import java.util.List;
import org.diegomonterroso.webapp.model.Empleado;

public interface IEmpleadoService {
    
    public List<Empleado> listarEmpleados();
    
    public void agregarEmpleado();
    
    public void eliminarEmpleado(int empleadoId);
    
    public void buscarEmpleadoPorId(int empleadoId);
    
    public void editarEmpleado(Empleado empleado);
}
