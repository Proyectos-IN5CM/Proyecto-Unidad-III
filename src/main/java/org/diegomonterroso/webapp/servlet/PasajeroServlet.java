package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.diegomonterroso.webapp.model.Pasajero;
import org.diegomonterroso.webapp.service.PasajeroService;

@WebServlet("/pasajero-servlet")
@MultipartConfig

public class PasajeroServlet extends HttpServlet{
    
    private PasajeroService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new PasajeroService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pasajero> pasajeros = ps.listarPasajeros();
        req.setAttribute("pasajeros",pasajeros);
        req.getRequestDispatcher("/lista-pasajeros/lista-pasajeros.jsp").forward(req, resp);
    }
}
