create database if not exists ProyectoUnidadIII;

use ProyectoUnidadIII;

create table Vuelos(
	vueloId int not null auto_increment,
    numeroVuelo int not null,
    origen varchar(100),
    destino varchar(100),
    aerolinea varchar(100),
    primary key PK_vueloId(vueloId)
);

create table Pasajeros (
    pasajeroId int not null auto_increment,
    nombre varchar(100),
    apellido varchar(100),
    fechaNacimiento varchar(10),
    nacionalidad varchar(100),
    pasaporte varchar(50),
    contactoTelefono varchar(15),
    contactoEmail varchar(100),
    primary key (pasajeroId)
);

create table Reservas (
    reservaId int not null auto_increment,
    pasajeroId int not null,
    vueloId int not null,
    fechaReserva varchar(10),
    clase varchar(50),
    asiento varchar(10),
    estadoReserva varchar(50),
    primary key (reservaId)
);

create table Empleados (
    empleadoId int not null auto_increment,
    nombre varchar(100),
    apellido varchar(100),
    puesto varchar(100),
    fechaContratacion varchar(10),
    salario decimal(10, 2),
    contactoTelefono varchar(15),
    contactoEmail varchar(100),
    primary key (empleadoId)
);

create table Aviones (
    avionId int not null auto_increment,
    modelo varchar(100),
    capacidadPasajeros int,
    fechaFabricacion varchar(10),
    aerolineaPropietaria varchar(100),
    estadoAvion varchar(50),
    primary key (avionId)
);


select * from Vuelos;
select * from Pasajeros;
select * from Reservas;
select * from Empleados;
select * from Aviones;

Set global time_zone = '-6:00';
