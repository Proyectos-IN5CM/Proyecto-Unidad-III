<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.util.List" %>
<%@page import ="org.diegomonterroso.webapp.model.Pasajero" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gestión de Pasajeros</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        </style>
    </head>
    <body class="bg-custom">
        <nav class="navbar bg-body-tertiary fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Lista de Pasajeros!</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Inicio</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="./index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="pasajero-servlet">Lista de Pasajeros</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./vuelo-servlet">Lista de Vuelos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./avion-servlet">Lista de Aviones</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./clase-servlet">Lista de Clases</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./empleado-servlet">Lista de Empleados</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container mt-5 w-75">
            <p class="fs-2 text-center text-white mt-5">Pasajeros</p>
            <div class="form-floating">
                <table class="table border border-warning border-5 border-success p-2 mb-2 border-opacity-75">
                    <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Apellido</th>
                            <th scope="col">Fecha De Nacimiento</th>
                            <th scope="col">Nacionalidad</th>
                            <th scope="col">Pasaporte</th>
                            <th scope="col">Contacto De Telefono</th>
                            <th scope="col">Contacto De Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <% List<Pasajero> pasajeros = (List)request.getAttribute("pasajeros"); %>
                            <% for(Pasajero pasajero:pasajeros){%>
                                <tr>
                                    <th scope="row"><%=pasajero.getPasajeroId()%></th>
                                    <td><%=pasajero.getNombre()%></td>
                                    <td><%=pasajero.getApellido()%></td>
                                    <td><%=pasajero.getFechaNacimiento()%></td>
                                    <td><%=pasajero.getNacionalidad()%></td>
                                    <td><%=pasajero.getPasaporte()%></td>
                                    <td><%=pasajero.getContactoTelefono()%></td>
                                    <td><%=pasajero.getContactoEmail()%></td>
                                </tr>
                                <%}
                            %>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
