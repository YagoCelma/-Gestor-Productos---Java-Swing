CREATE TYPE tipo_pago_enum AS ENUM ('Efectivo', 'Tarjeta', 'Transferencia');
CREATE TYPE estado_enum AS ENUM ('Pedido', 'Facturado', 'Anulado');
CREATE TYPE estadoProductos_enum AS ENUM ('Activo','Inactivo','Descatalogado');
CREATE TYPE iva_enum AS ENUM('0','4','10','21');


CREATE TABLE Empresa(
    id_Empresa SERIAL PRIMARY KEY,
    razon_Social VARCHAR(100) NOT NULL,
    nombre_Comercial VARCHAR(100) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    telefono VARCHAR(12) NOT NULL
);

CREATE TABLE Clientes (
    id_Cliente SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    razon_Comercial VARCHAR(100),
    nif VARCHAR(50) NOT NULL UNIQUE,
    correo VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(12) NOT NULL UNIQUE,
    tipo_Pago tipo_pago_enum NOT NULL DEFAULT 'Efectivo',
    direccion_Facturacion VARCHAR NOT NULL,
    direccion_Envio VARCHAR NOT NULL
);

--Tabla Productos
CREATE TABLE Productos(
    id_Producto SERIAL PRIMARY KEY,
    descripcion VARCHAR NOT NULL,
    marca VARCHAR(20) NOT NULL,
    precioUnitario DOUBLE PRECISION NOT NULL CHECK (precioUnitario > 0),
    codigo_Sku VARCHAR(100) NOT NULL UNIQUE,
    codigo_Barras VARCHAR(100) NOT NULL UNIQUE,
    estado estadoProductos_enum NOT NULL DEFAULT 'Activo',
    stock INT NOT NULL,
    stock_Max INT NOT NULL CHECK (stock_Max > 0),
    stock_Min INT NOT NULL CHECK (stock_Min > 0)
);

--Tabla Empleados
CREATE TABLE Empleados(
    Id_Empleado SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido1 VARCHAR(50) NOT NULL,
    apellido2 VARCHAR(50),
    dni VARCHAR(15),
    sueldo DOUBLE PRECISION NOT NULL CHECK (sueldo > 0),
    puesto VARCHAR(100) NOT NULL,
    calle VARCHAR(100) NOT NULL,
    codigo_Postal VARCHAR(20) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    provincia VARCHAR(50) NOT NULL,
    pais VARCHAR(50) NOT NULL,
    id_empresa INT NOT NULL REFERENCES Empresa(id_Empresa),
    correo VARCHAR(100) NOT NULL UNIQUE,
    iban VARCHAR(50) NOT NULL UNIQUE,
    fecha_Nacimiento DATE NOT NULL,
    departamento VARCHAR(50) NOT NULL,
    fecha_Contratacion DATE NOT NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE Ventas (
    Id_Ventas SERIAL PRIMARY KEY,
    Id_Cliente INT REFERENCES Clientes(Id_Cliente),
    fecha_Compra DATE NOT NULL,
    tipo_Pago tipo_pago_enum NOT NULL DEFAULT 'Efectivo',
    fecha_Entrega DATE,
    estado estado_enum NOT NULL DEFAULT 'Pedido'
);

--Tabla Detalles Ventas
CREATE TABLE DetallesVenta (
    Id_Venta INT REFERENCES Ventas(Id_Ventas),
    Id_Producto INT REFERENCES Productos(Id_Producto),
    cantidad INT NOT NULL,
    precio_Unitario_Venta DOUBLE PRECISION NOT NULL CHECK (precio_Unitario_Venta > 0),
    IVA NUMERIC(5,2) NOT NULL CHECK (IVA IN (0, 4, 10, 21)),
    descuento BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (Id_Venta, Id_Producto)
);