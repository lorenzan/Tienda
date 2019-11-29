create database Tienda;

use Tienda;

create table Usuarios(
idUsuario int not null auto_increment,
nombre varchar(100) not null,
numeroTelefono varchar(13) not null,
email varchar(100) not null,
pass varchar(100) not null,
primary key(idUsuario)
);

create table Categorias(
idCategoria int not null auto_increment,
nombre varchar(50) not null,
primary key(idCategoria)
)engine=innoDB;

create table subCategorias(
idsubCategoria int not null auto_increment,
nombre varchar(100) not null,
idCategoria int not null,
primary key(idSubCategoria),
foreign key(idCategoria)
references Categorias(idCategoria)
)engine=innoDB;

create table Productos(
idProducto int not null auto_increment,
nombre varchar(100) not null,
precio decimal(10,2) not null,
idSubCategoria int not null,
Descripcion varchar(1000) not null,
Img varchar(10000),
primary key(idProducto),
foreign key(idSubCategoria)
references SubCategorias(idsubCategoria)
)engine = innoDB;

insert into Productos(nombre,precio,idSubCategoria,Descripcion,Img)
values ('Motorola One',750.25,12,'64 gb de memoria interna, traido desde Japon','https://cdn1.coppel.com/images/catalog/pm/2029563-1.jpg');

insert into Productos(nombre,precio,idSubCategoria,Descripcion,Img)
values ('Honor 10s Lite',250.00,12,'Novedoso Dispositivo','https://media.aws.alkosto.com/media/catalog/product/cache/6/image/69ace863370f34bdf190e4e164b6e123/i/m/img_3742.jpg');

insert into Productos(nombre,precio,idSubCategoria,Descripcion,Img)
values ('GTX 745',85.00,15,'Usada en buen estado, marca Nvidia','https://images-na.ssl-images-amazon.com/images/I/61dpubDQ9uL._SX355_.jpg');

select * from Usuarios;
select * from Categorias;
select * from subcategorias where idCategoria = 1;

select * from Productos;