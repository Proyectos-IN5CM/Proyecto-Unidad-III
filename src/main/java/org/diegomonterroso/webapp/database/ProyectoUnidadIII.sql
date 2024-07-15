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

select * from Vuelos;

Set global time_zone = '-6:00';
