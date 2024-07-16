package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.diegomonterroso.webapp.model.Vuelo;
import org.diegomonterroso.webapp.service.VueloService;

@WebServlet("/vuelo-servlet")
@MultipartConfig

public class VueloServlet extends HttpServlet{
    
    private VueloService vs;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.vs = new VueloService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Vuelo> vuelos = vs.listarVuelos();
        req.setAttribute("vuelos",vuelos);
        req.getRequestDispatcher("/lista-vuelos/lista-vuelos.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> vuelo = new ArrayList<>();
        
        int numeroVuelo = Integer.parseInt(req.getParameter("numeroVuelo"));
        String origen = req.getParameter("descripcionProducto");
        String destino= req.getParameter("marcaProducto");
        String aerolinea= req.getParameter("precioProducto");
        
        vuelo.add(Integer.toString(numeroVuelo));
        vuelo.add(origen);
        vuelo.add(destino);
        vuelo.add(aerolinea);
        
        req.setAttribute("vuelo", vuelo);
        getServletContext().getRequestDispatcher("/formulario-vuelos/formulario-vuelos.jsp").forward(req, resp);
    }
}
