package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.diegomonterroso.webapp.model.Clase;
import org.diegomonterroso.webapp.service.ClaseService;

@WebServlet("/clase-servlet")
@MultipartConfig
public class ClaseServlet extends HttpServlet {
    
    private ClaseService ss;
    
    @Override
    public void init() throws ServletException {
        super.init();
        this.ss = new ClaseService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Clase> clases = ss.listarClases();
        req.setAttribute("clases", clases);
        req.getRequestDispatcher("/lista-clases/lista-clases.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        agregarClase(req, resp);
    }
    
    private void agregarClase(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tipoClase = req.getParameter("tipoClase");  // Ajuste aquí para coincidir con los nombres de los campos en el formulario
        String descripcion = req.getParameter("descripcion");
        Double costo = Double.parseDouble(req.getParameter("costo"));
        
        ss.agregarClase(new Clase(tipoClase, descripcion, costo));
        
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
