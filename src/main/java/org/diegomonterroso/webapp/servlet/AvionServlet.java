package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.diegomonterroso.webapp.model.Avion;
import org.diegomonterroso.webapp.service.AvionService;

@WebServlet("/avion-servlet")
@MultipartConfig

public class AvionServlet extends HttpServlet{
    
    private AvionService as;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.as = new AvionService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Avion> aviones = as.listarAviones();
        req.setAttribute("aviones",aviones);
        req.getRequestDispatcher("/lista-aviones/lista-aviones.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getContextPath();
        
        if(path == null || path.equals("/")){
            agregarAvion(req, resp);
        }
    }
    
    public void agregarAvion(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String modelo = req.getParameter("modelo");
        String capacidad = req.getParameter("capacidad");
        String fecha = req.getParameter("fecha");
        String aerolinea = req.getParameter("propiedad");
        String estado = req.getParameter("estado");
        
        as.agregarAvion(new Avion(modelo, capacidad, fecha, aerolinea, estado));
        
        resp.sendRedirect("/ProyectoUnidadIII/index.jsp");
    }
    
}
