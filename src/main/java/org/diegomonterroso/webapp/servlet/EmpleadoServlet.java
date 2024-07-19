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
    
    // Agregar, eliminar, editar
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarEmpleado(req, resp);
        }
    }
    
    public void agregarEmpleado(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String puesto = req.getParameter("puesto");
        Double salario = Double.parseDouble(req.getParameter("salario"));
        String contactoTelefono = req.getParameter("contactoTelefono");
        String contactoEmail = req.getParameter("contactoEmail");
        
        es.agregarEmpleado(new Empleado(nombre, apellido, puesto, salario, contactoTelefono, contactoEmail));
        
        // Otra manera
        // resp.sendRedirect("/SGBDProductos/index.jsp");
        
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
