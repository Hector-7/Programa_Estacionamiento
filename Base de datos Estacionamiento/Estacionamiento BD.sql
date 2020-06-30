-- MariaDB dump 10.17  Distrib 10.4.11-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: estacionamiento
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acomodadores`
--

DROP TABLE IF EXISTS `acomodadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `acomodadores` (
  `idAcomodador` int(10) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `Puesto` varchar(15) DEFAULT NULL,
  `Nivel` int(11) DEFAULT NULL,
  `Sueldo` float DEFAULT NULL,
  `Direccion` varchar(30) DEFAULT NULL,
  `Contraseña` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idAcomodador`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acomodadores`
--

LOCK TABLES `acomodadores` WRITE;
/*!40000 ALTER TABLE `acomodadores` DISABLE KEYS */;
INSERT INTO `acomodadores` VALUES (1,'Hector Rodriguez','Acomodador',1,214,'Colonia Saragoza 424','123'),(5,'Issac Damasco','Acomodador',3,214,'Colonia Torilana 6764','123'),(6,'Daniela Salazar','Acomodador',4,214,'Colonia Moltecalvo 8888','1122'),(7,'Maria Nuñez','Acomodador',3,214,'Colonia Torres Altas 4424','123'),(8,'Jenny Sanchez','Acomodador',4,214,'Solares Girasoles 8845','2289');
/*!40000 ALTER TABLE `acomodadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculos` (
  `NoBoleto` int(11) NOT NULL AUTO_INCREMENT,
  `idAcomodador` int(10) NOT NULL,
  `Marca` varchar(15) DEFAULT NULL,
  `Modelo` varchar(20) DEFAULT NULL,
  `Color` varchar(15) DEFAULT NULL,
  `Placas` varchar(10) DEFAULT NULL,
  `Observaciones` varchar(60) DEFAULT NULL,
  `Nivel` int(11) NOT NULL,
  `Cajon` int(11) NOT NULL,
  `HoraEntrada` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `HoraSalida` timestamp NULL DEFAULT NULL,
  `Estatus` int(11) DEFAULT NULL,
  `Pago` int(11) DEFAULT NULL,
  PRIMARY KEY (`NoBoleto`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES (3,6,'Ferrari','Diablo 3','Rojo','FR666','En estado nuevo',1,7,'2020-05-13 17:59:04','2020-05-08 20:18:06',2,NULL),(4,4,'Toyota','Sedan','Gris','HF5211','Sucio pero completo',4,4,'2020-05-09 01:49:45','2020-05-09 01:51:42',2,NULL),(6,5,'Nissan','Navara','Verde','NNS9989','Limpio, condiciones buenas',2,1,'2020-05-14 17:31:22',NULL,1,NULL),(8,8,'Toyota','Sedan','Rosa','HHJJ6666','Nuevo y limpio',4,4,'2020-05-14 02:33:32','2020-05-14 02:33:56',2,NULL),(9,1,'Honda','Accord','Negro','UIJ8723','Sucio con un golpe lado izquierdo',2,5,'2020-06-01 21:03:23','2020-06-01 21:30:50',2,45),(10,6,'Chevrolet','Lobo','Arena','CHU4422','Doble remolque',3,6,'2020-05-28 21:46:10','2020-06-02 18:46:48',2,40);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-02 14:17:36
