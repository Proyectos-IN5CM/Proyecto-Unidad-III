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

public class ClaseServlet extends HttpServlet{
    
    private ClaseService cs;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.cs = new ClaseService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Clase> clases = cs.listarClases();
        req.setAttribute("clases",clases);
        req.getRequestDispatcher("/lista-clases/lista-clases.jsp").forward(req, resp);
    }
}
