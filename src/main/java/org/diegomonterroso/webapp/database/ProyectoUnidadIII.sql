create database if not exists ProyectoUnidadIII;

-- drop database ProyectoUnidadIII;

use ProyectoUnidadIII;

create table Vuelos(
    vueloId int not null auto_increment,
    origen varchar(100) not null,
    destino varchar(100) not null,
    aerolinea varchar(100) not null,
    primary key PK_vueloId(vueloId)
);

create table Pasajeros (
    pasajeroId int not null auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    fechaNacimiento varchar(10) not null,
    nacionalidad varchar(100) not null,
    pasaporte varchar(50) not null,
    contactoTelefono varchar(15) not null,
    contactoEmail varchar(100) not null,
    primary key PK_pasajeroId(pasajeroId)
);

create table Empleados (
    empleadoId int not null auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    puesto varchar(100) not null,
    salario decimal(10, 2) not null,
    contactoTelefono varchar(15) not null,
    contactoEmail varchar(100) not null,
    primary key PK_empleadoId(empleadoId)
);

create table Clases (     
	claseId int not null auto_increment,
    tipoClase varchar(50) not null,
    descripcion varchar(200)not null,
    costo decimal(10, 2) not null,
    primary key claseId(claseId)
 );

create table Aviones (
    avionId int not null auto_increment,
    modelo varchar(100) not null,
    capacidadPasajeros int not null,
    fechaFabricacion varchar(10),
    aerolineaPropietaria varchar(100) not null,
    estadoAvion varchar(50) not null,
    primary key PK_avionId(avionId)
);


select * from Vuelos;
select * from Pasajeros;
select * from Empleados;
select * from Clases;
select * from Aviones;

Set global time_zone = '-6:00';
select * from Vuelos;