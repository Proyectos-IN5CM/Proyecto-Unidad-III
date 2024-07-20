<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gestión de Pasajeros</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar bg-body-tertiary fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Agregar Pasajeros!</a>
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
                                <a class="nav-link active" aria-current="page" href="../index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="formulario-empleados.jsp">Formulario de Empleados</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../empleado-servlet">Lista de Empleados</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../formulario-vuelos/formulario-vuelos.jsp">Formulario de Vuelos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../vuelo-servlet">Lista de Vuelos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../formulario-aviones/formulario-aviones.jsp">Formulario de Aviones</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../avion-servlet">Lista de Aviones</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../formulario-clases/formulario-clases.jsp">Formulario de Clases</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../clase-servlet">Lista de Clases</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../formulario-pasajeros/formulario-pasajeros.jsp">Formulario de Pasajeros</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../pasajero-servlet">Lista de Pasajeros</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <br>
        <br>
        <div>
            <% ArrayList<String> pasajeros = (ArrayList) request.getAttribute("pasajero"); %>
            <ul>
                <% if (pasajeros != null) { %>
                <p style="text-align: center" class="text-success display-5">Se agregó con éxito!</p>
                <br>
                <% for (String emp : pasajeros) {%>
                <li style="text-align: center" class="mt-1";><%= emp%></li>
                    <% } %>
                    <% }%>
            </ul>
        </div>
        <div class="container mt-5 w-75">
            <form action="/ProyectoUnidadIII/empleado-servlet" method="post" enctype="multipart/form-data">
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="nombre" name="nombre" type=text placeholder="">
                    <label for="nombre">Nombre de Pasajero</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="apellido" name="apellido"type=text placeholder="">
                    <label for="apellido">Apellido del Pasajero</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="FechaNacimiento" name="FechaNacimiento" type=text placeholder="">
                    <label for="FechaNacimiento">Fecha de Nacimiento del Pasajero</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="nacionalidad" name="nacionalidad" type=text placeholder="">
                    <label for="nacionalidad">nacionalidad del Pasajero</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="pasaporte" name="pasaporte" type=text placeholder="">
                    <label for="pasaporte">pasaporte del Pasajero</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="contactoTelefono" name="contactoTelefono" type=text placeholder="">
                    <label for="contactoTelefono">contacto Telefonico del Pasajero</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="form-control bg-info-subtle text-info-emphasis" id="contactoEmail" name="contactoEmail" type=text placeholder="">
                    <label for="contactoEmail">Contacto Email del Empleado</label>
                </div>
                <div class="form-floating mt-4">
                    <input class="btn btn-success" type="submit" value="Agregar">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"crossorigin="anonymous"></script>
    </body>
</html>