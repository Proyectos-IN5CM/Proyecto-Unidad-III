package org.diegomonterroso.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.diegomonterroso.webapp.model.Empleado;
import org.diegomonterroso.webapp.service.EmpleadoService;

@WebServlet("/empleado-servlet")
@MultipartConfig

public class EmpleadoServlet extends HttpServlet{
    
    private EmpleadoService es;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.es = new EmpleadoService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Empleado> empleados = es.listarEmpleados();
        req.setAttribute("empleados",empleados);
        req.getRequestDispatcher("/lista-empleados/lista-empleados.jsp").forward(req, resp);
    }
}
