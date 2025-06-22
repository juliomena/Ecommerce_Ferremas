#CREACION DE BASE DE DATOS
CREATE DATABASE ferremas_db;
USE ferremas_db;

#CREACION DE TABLAS
CREATE TABLE Cliente (
    Id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Email VARCHAR(75),
    Direccion VARCHAR(100),
    Telefono VARCHAR(15),
    Password VARCHAR(150) NOT NULL,
    Username VARCHAR(100) NOT NULL
);

CREATE TABLE Carrito (
    Id_carrito INTEGER PRIMARY KEY AUTO_INCREMENT,
    Fecha_creacion DATE,
    Cliente_id_cliente INTEGER,
    FOREIGN KEY (Cliente_id_cliente) REFERENCES Cliente(Id_cliente)
);

CREATE TABLE Pedido (
    Id_pedido INTEGER PRIMARY KEY AUTO_INCREMENT,
    Fecha_pedido DATE,
    Total INTEGER,
    Cliente_id_cliente INTEGER,
    FOREIGN KEY (Cliente_id_cliente) REFERENCES Cliente(Id_cliente)
);

CREATE TABLE Envio (
    Id_envio INTEGER PRIMARY KEY AUTO_INCREMENT,
    Direccion_entrega VARCHAR(200),
    Fecha_envio DATE,
    Estado_envio INTEGER,
    Pedido_id_pedido INTEGER,
    FOREIGN KEY (Pedido_id_pedido) REFERENCES Pedido(Id_pedido)
);

CREATE TABLE Pago (
    Id_pago INTEGER PRIMARY KEY AUTO_INCREMENT,
    Fecha_pago DATE,
    Monto INTEGER,
    Metodo_pago INTEGER,
    Pedido_id_pedido INTEGER,
    FOREIGN KEY (Pedido_id_pedido) REFERENCES Pedido(Id_pedido)
);

CREATE TABLE Producto (
    Id_producto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(100),
    Descripcion VARCHAR(100),
    Precio INTEGER,
    Stock INTEGER
);

CREATE TABLE Categoria (
    Id_categoria INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(100),
    Descripcion VARCHAR(100),
    Producto_id_producto INTEGER,
    FOREIGN KEY (Producto_id_producto) REFERENCES Producto(Id_producto)
);

#POBLANDO LAS TABLAS
INSERT INTO Cliente (Nombre, Apellido, Email, Direccion, Telefono, Password, Username) VALUES
('Julio', 'Pérez', 'julio@example.com', 'Av. Independencia 123', 987654321, 'Ju4nP3r3z@2025', 'JulioP'),
('Ana', 'Gómez', 'ana@example.com', 'Calle Los Olivos 456', 912345678, 'M@r1aG0m3z!', 'AnaG'),
('Carlos', 'Mendoza', 'carlos@example.com', 'Pasaje La Luna 789', 923456789, 'C4rl0sS@nc#ez', 'CarlosM');

INSERT INTO Carrito (Fecha_creacion, Cliente_id_cliente) VALUES
('2025-05-24', 1),
('2025-05-23', 2),
('2025-05-22', 3);

INSERT INTO Producto (Nombre, Descripcion, Precio, Stock) VALUES
('Taladro', 'Taladro Percutor Inalámbrico 13 mm bateria 18 V ', 150000, 10),
('Pala', 'Pala punta recta de jardin', 12000, 15),
('Sierra', 'Sierra circular eléctrica 7 1/4" 1300W', 45000, 20),
('Disco de sierra', 'Disco de sierra circular 7 1/4" 60 dientes" 1300W', 22000, 40);

INSERT INTO Categoria (Nombre, Descripcion, Producto_id_producto) VALUES
('Electrónica', 'Productos electrónicos de última generación', 1),
('Telefonía', 'Celulares y accesorios de comunicación', 2),
('Accesorios', 'Complementos y accesorios tecnológicos', 3);

INSERT INTO Pedido (Fecha_pedido, Total, Cliente_id_cliente) VALUES
('2025-05-24', 2050000, 1),
('2025-05-23', 850000, 2),
('2025-05-22', 1200000, 3);

INSERT INTO Envio (Direccion_entrega, Fecha_envio, Estado_envio, Pedido_id_pedido) VALUES
('Av. Independencia 123', '2025-05-25', 1, 1),
('Calle Los Olivos 456', '2025-05-24', 2, 2),
('Pasaje La Luna 789', '2025-05-23', 3, 3);

INSERT INTO Pago (Fecha_pago, Monto, Metodo_pago, Pedido_id_pedido) VALUES
('2025-05-24', 2050000, 1, 1),
('2025-05-23', 850000, 2, 2),
('2025-05-22', 1200000, 1, 3);

#REVISAR TABLAS
SELECT * FROM cliente;
SELECT * FROM carrito;
SELECT * FROM categoria;
SELECT * FROM envio;
SELECT * FROM pago;
SELECT * FROM pedido;
SELECT * FROM producto;
