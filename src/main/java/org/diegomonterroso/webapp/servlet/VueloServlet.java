package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author CarlosPriego
 */
@WebServlet("/vuelo-servlet")
@MultipartConfig
public class VueloServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        ArrayList<String> vuelo = new ArrayList<>();
        
        int numeroVuelo = Integer.parseInt(req.getParameter("numeroVuelo"));
        String origen = req.getParameter("origen");
        String destino = req.getParameter("destino");
        String aerolinea = req.getParameter("aerolinea");
        
        vuelo.add(Integer.toString(numeroVuelo));
        vuelo.add(origen);
        vuelo.add(destino);
        vuelo.add(aerolinea);
        
        req.setAttribute("vuelo", vuelo);
        getServletContext().getRequestDispatcher("/lista-vuelos/lista-vuelos.jsp").forward(req, resp);
        
    }
    
    
}
