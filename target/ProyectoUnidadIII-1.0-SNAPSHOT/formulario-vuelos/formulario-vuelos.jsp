<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>formulario-vuelos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
    <h2>Formulario de Vuelos</h2>
    <form>
      <div class="form-group">
        <label for="inputNumeroVuelo">Número de Vuelo</label>
        <input name="NumeroDeVuelo" type="text" class="form-control" id="inputNumeroVuelo" placeholder="Número de vuelo" required>
      </div>
      <div class="form-group">
        <label for="inputOrigen">Origen</label>
        <input name="Origen" type="text" class="form-control" id="inputOrigen" placeholder="Ciudad de origen" required>
      </div>
      <div class="form-group">
        <label for="inputDestino">Destino</label>
        <input name="Destino" type="text" class="form-control" id="inputDestino" placeholder="Ciudad de destino" required>
      </div>
      <div class="form-group">
        <label for="inputDestino">Aerolinea</label>
        <input name="Aerolinea" type="text" class="form-control" id="inputDestino" placeholder="Ciudad de destino" required>
      </div>
        <div>
            <input class="btn btn-outline-sucess" type="submit" value="Agregar"
        </div>
    </form>
  </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
