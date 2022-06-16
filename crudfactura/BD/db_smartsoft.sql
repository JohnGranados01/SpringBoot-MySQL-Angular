-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 15-06-2022 a las 12:56:04
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_smartsoft`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` decimal(11,0) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(15) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `telefono` decimal(11,0) NOT NULL,
  `email` varchar(35) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `apellido`, `direccion`, `fecha_nacimiento`, `telefono`, `email`) VALUES
('4277687', 'milton', 'avella', 'cll 4 # 17 5', '1992-06-29', '3112367890', 'milton_avella@gmail.com'),
('1002558766', 'lina', 'ochoa', 'crr 17 # 15 4', '2002-05-20', '316876546', 'linagra@gmail.com'),
('1057619935', 'john', 'granados salamanca', 'cll 11 b # 17 1', '1999-10-24', '3112367890', 'jhongranadossalamanca@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

DROP TABLE IF EXISTS `detalle`;
CREATE TABLE IF NOT EXISTS `detalle` (
  `num_detalle` int NOT NULL AUTO_INCREMENT,
  `id_factura` int NOT NULL,
  `id_producto` int NOT NULL,
  `cantidad` int NOT NULL,
  `precio` int NOT NULL,
  PRIMARY KEY (`num_detalle`),
  KEY `id_producto` (`id_producto`),
  KEY `id_factura` (`id_factura`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`num_detalle`, `id_factura`, `id_producto`, `cantidad`, `precio`) VALUES
(1, 1, 3, 3, 8000),
(2, 1, 2, 2, 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE IF NOT EXISTS `factura` (
  `num_factura` int NOT NULL AUTO_INCREMENT,
  `id_cliente` decimal(11,0) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`num_factura`),
  KEY `id_cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`num_factura`, `id_cliente`, `fecha`) VALUES
(1, '1057619935', '2022-05-20'),
(2, '1002558766', '2022-06-10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `precio` int NOT NULL,
  `stock` int NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES
(1, 'jabon rey', 2500, 10),
(2, 'gel ego', 1000, 15),
(3, 'cafe aguila', 8000, 20);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `detalle_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`),
  ADD CONSTRAINT `detalle_ibfk_2` FOREIGN KEY (`id_factura`) REFERENCES `factura` (`num_factura`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
