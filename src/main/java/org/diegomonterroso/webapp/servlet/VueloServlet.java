package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
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
}
