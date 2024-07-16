use ProyectoUnidadIII;

-- call sp_agregar();
-- call sp_listar();
-- call sp_eliminar();
-- call sp_buscar();
-- call sp_editar();

-- VUELOS --

Delimiter $$
create procedure sp_agregarVuelo(num int, ori varchar(100), des varchar(100), aer varchar(100))
Begin
	insert into Vuelos(numeroVuelo, origen, destino, aerolinea) values
		(num, ori, des, aer);
End $$
Delimiter ;

Delimiter $$
Create procedure sp_ListarVuelos()
Begin
	Select
		Vuelos.vueloId,
		Vuelos.numeroVuelo,
		Vuelos.origen,
		Vuelos.destino,
        Vuelos.aerolinea
			From Vuelos;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EliminarVuelo(In vueId int)
Begin
	Delete from Vuelos
		Where vueloId = vueId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_BuscarVuelo(In vueId int)
Begin
	Select
		Vuelos.vueloId,
		Vuelos.numeroVuelo,
		Vuelos.origen,
		Vuelos.destino,
        Vuelos.aerolinea
			From Vuelos
				Where vueloId = vueId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EditarVuelo(In vueId int, In num int, In ori varchar(100) , In des varchar(100), In aer varchar(100))
Begin
	Update Vuelos
		Set
			numeroVuelo = num,
			origen = ori,
			destino = des,
			aerolinea = aer
				Where vueloId = vueId;
End$$
Delimiter ;

-- PASAJEROS --

Delimiter $$
create procedure sp_agregarPasajero(nom varchar(100), ape varchar(100), fec varchar(10), nac varchar(100), pas varchar(50), conTel varchar(15), conEma varchar(100))
Begin
	insert into Pasajeros(nombre, apellido, fechaNacimiento, nacionalidad, pasaporte, contactoTelefono, contactoEmail) values
		(nom, ape, fec, nac, pas, conTel, conEma);
End $$
Delimiter ;

Delimiter $$
Create procedure sp_ListarPasajeros()
Begin
	Select
		Pasajeros.pasajeroId,
		Pasajeros.nombre,
		Pasajeros.apellido,
		Pasajeros.fechaNacimiento,
        Pasajeros.nacionalidad,
        Pasajeros.pasaporte,
        Pasajeros.contactoTelefono,
        Pasajeros.contactoEmail
			From Pasajeros;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EliminarPasajero(In pasId int)
Begin
	Delete from Pasajeros
		Where pasajeroId = pasId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_BuscarPasajero(In pasId int)
Begin
	Select
		Pasajeros.pasajeroId,
		Pasajeros.nombre,
		Pasajeros.apellido,
		Pasajeros.fechaNacimiento,
        Pasajeros.nacionalidad,
        Pasajeros.pasaporte,
        Pasajeros.contactoTelefono,
        Pasajeros.contactoEmail
			From Pasajeros
				Where pasajeroId = pasId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EditarPasajero(In pasId int, In nom varchar(100), In ape varchar(100), In fec varchar(10), In nac varchar(100), In pas varchar(50), In conTel varchar(15), In conEma varchar(100))
Begin
	Update Pasajeros
		Set
			nombre = nom,
			apellido = ape,
			fechaNacimiento = fec,
			nacionalidad = nac,
            pasaporte = pas,
            contactoTelefono = conTel,
            contactoEmail = conEma
				Where pasajeroId = pasId;
End$$
Delimiter ;

-- EMPLEADOS --

Delimiter $$
create procedure sp_agregarEmpleado(nom varchar(100), ape varchar(100), pue varchar(100), sal decimal(10, 2), conTel varchar(15), conEma varchar(100))
Begin
	insert into Empleados(nombre, apellido, puesto, salario, contactoTelefono, contactoEmail) values
		(nom, ape, pue, sal, conTel, conEma);
End $$
Delimiter ;

Delimiter $$
Create procedure sp_ListarEmpleados()
Begin
	Select
		Empleados.empleadoId,
		Empleados.nombre,
		Empleados.apellido,
		Empleados.puesto,
        Empleados.salario,
        Empleados.contactoTelefono,
        Empleados.contactoEmail
			From Empleados;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EliminarEmpleado(In empId int)
Begin
	Delete from Empleados
		Where empleadoId = empId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_BuscarEmpleado(In empId int)
Begin
	Select
		Empleados.empleadoId,
		Empleados.nombre,
		Empleados.apellido,
		Empleados.puesto,
        Empleados.salario,
        Empleados.contactoTelefono,
        Empleados.contactoEmail
			From Empleados
				Where empleadoId = empId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EditarEmpleado(In empId int, nom varchar(100), ape varchar(100), pue varchar(100), sal decimal(10, 2), conTel varchar(15), conEma varchar(100))
Begin
	Update Empleados
		Set
			nombre = num,
			apellido = ape,
			puesto = pue,
			salario = sal,
            contactoTelefono = conTel,
            contactoEmail = conEma
				Where empleadoId = empId;
End$$
Delimiter ;

-- CLASES --

Delimiter $$
create procedure sp_agregarClase(tip varchar(50), des varchar(200), cos decimal(10, 2))
Begin
	insert into Clases(tipoClase, descripcion, costo) values
		(tip, des, cos);
End $$
Delimiter ;

Delimiter $$
Create procedure sp_ListarClases()
Begin
	Select
		Clases.claseId,
		Clases.tipoClase,
		Clases.descripcion,
		Clases.costo
			From Clases;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EliminarClase(In claId int)
Begin
	Delete from Clases
		Where claseId = claId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_BuscarClase(In claId int)
Begin
	Select
		Clases.claseId,
		Clases.tipoClase,
		Clases.descripcion,
		Clases.costo
			From Clases
				Where claseId = claId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EditarClase(In claId int, tip varchar(50), des varchar(200), cos decimal(10, 2))
Begin
	Update Clases
		Set
			tipoClase = tip,
			descripcion = des,
			costo = cos
				Where claseId = claId;
End$$
Delimiter ;

-- AVIONES --

Delimiter $$
create procedure sp_agregarAvion(mo varchar(100), cap int, fec varchar(10), aer varchar(100), est varchar(50))
Begin
	insert into Aviones(modelo, capacidadPasajeros, fechaFabricacion, aerolineaPropietaria, estadoAvion) values
		(mo, cap, fec, aer, est);
End $$
Delimiter ;

Delimiter $$
Create procedure sp_ListarAviones()
Begin
	Select
		Aviones.avionId,
		Aviones.modelo,
		Aviones.capacidadPasajeros,
		Aviones.fechaFabricacion,
        Aviones.aerolineaPropietaria,
        Aviones. estadoAvion
			From Aviones;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EliminarAvion(In avId int)
Begin
	Delete from Aviones
		Where avionId = avId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_BuscarAvion(In avId int)
Begin
	Select
		Aviones.avionId,
		Aviones.modelo,
		Aviones.capacidadPasajeros,
		Aviones.fechaFabricacion,
        Aviones.aerolineaPropietaria,
        Aviones. estadoAvion
			From Aviones
				Where avionId = avId;
End$$
Delimiter ;

Delimiter $$
Create procedure sp_EditarAvion(In avId int, mo varchar(100), cap int, fec varchar(10), aer varchar(100), est varchar(50))
Begin
	Update Aviones
		Set
			modelo = mo,
			capacidadPasajeros = cap,
            fechaFabricacion = fec,
			aerolineaPropietaria = aer,
			estadoAvion = est
				Where avionId = avId;
End$$
Delimiter ;