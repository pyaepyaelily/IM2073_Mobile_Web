-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: clickerdb
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `responsetable`
--

DROP TABLE IF EXISTS `responsetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `responsetable` (
  `responseID` int NOT NULL AUTO_INCREMENT,
  `qnsID` int DEFAULT NULL,
  `response` varchar(5) DEFAULT NULL,
  `studentID` int DEFAULT NULL,
  PRIMARY KEY (`responseID`),
  KEY `qnsID` (`qnsID`),
  KEY `studentID` (`studentID`),
  CONSTRAINT `responsetable_ibfk_1` FOREIGN KEY (`qnsID`) REFERENCES `qnstable` (`qnsID`),
  CONSTRAINT `responsetable_ibfk_2` FOREIGN KEY (`studentID`) REFERENCES `studenttable` (`studentID`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `responsetable`
--

LOCK TABLES `responsetable` WRITE;
/*!40000 ALTER TABLE `responsetable` DISABLE KEYS */;
INSERT INTO `responsetable` VALUES (1,1,'A',1),(2,1,'B',1),(3,1,'B',1),(4,1,'A',1),(5,1,'B',1),(6,1,'B',1),(7,1,'D',1),(8,1,'C',1),(9,1,'D',1),(10,1,'B',1),(11,1,'C',1),(12,1,'A',1),(13,1,'B',1),(14,1,'A',1),(17,1,'C',1),(19,1,'A',1),(20,2,'B',1),(21,1,'A',1),(22,2,'B',1),(23,3,'C',1),(25,1,'A',1),(26,2,'B',1),(27,3,'C',1),(28,4,'D',1),(29,5,'A',1),(30,NULL,'A',1),(31,1,'A',1),(32,2,'C',1),(33,1,'C',1),(34,1,'D',1),(35,1,'D',1),(36,1,'C',1),(37,2,'B',1),(38,3,'D',1),(39,1,'D',1),(40,1,'D',1),(41,2,'A',1),(42,1,'C',1),(43,1,'C',1),(44,1,'D',1),(45,1,'B',1),(46,2,'C',1),(47,1,'D',1),(48,1,'C',1),(49,3,'C',1),(50,4,'A',1),(51,5,'D',1),(52,1,'A',1),(53,2,'B',1),(54,3,'D',1),(55,1,'A',1),(56,2,'B',1),(57,1,'A',1),(58,2,'B',1),(59,3,'C',1),(60,4,'D',1),(61,5,'D',1),(62,1,'A',1),(63,2,'B',1),(64,3,'C',1),(65,4,'B',1),(66,5,'D',1),(67,1,'A',1),(68,2,'B',1),(69,3,'D',1),(70,4,'C',1),(71,5,'A',1),(72,1,'B',1),(73,2,'B',1),(74,3,'D',1),(75,4,'C',1),(76,5,'A',1),(77,1,'B',1),(78,2,'C',1),(79,3,'D',1),(80,4,'A',1),(81,5,'B',1),(82,1,'B',1),(83,2,'A',1),(84,3,'C',1),(85,4,'A',1),(86,5,'D',1),(87,1,'B',1),(88,2,'B',1),(89,3,'C',1),(90,4,'A',1),(91,5,'D',1),(92,1,'B',1),(93,2,'B',1),(94,3,'C',1),(95,4,'D',1),(96,5,'A',1),(97,1,'B',1),(98,2,'B',1),(99,3,'C',1),(100,4,'A',1),(101,5,'D',1),(102,1,'B',1),(103,2,'B',1),(104,3,'A',1),(105,4,'C',1),(106,5,'D',1),(107,1,'B',1),(108,2,'B',1),(109,3,'C',1),(110,4,'A',1),(111,5,'D',1),(112,1,'B',1),(113,2,'A',1),(114,3,'C',1),(115,4,'D',1),(116,5,'A',1),(117,1,'B',1),(118,2,'B',1),(119,3,'C',1),(120,4,'D',1),(121,5,'A',1),(122,1,'B',1),(123,2,'B',1),(124,3,'C',1),(125,4,'D',1),(126,5,'A',1),(127,1,'D',1),(128,2,'B',1),(129,3,'A',1),(130,4,'B',1),(131,5,'C',1),(132,1,'B',1),(133,2,'A',1),(134,3,'C',1),(135,4,'D',1),(136,5,'A',1),(137,1,'B',1),(138,2,'C',1),(139,3,'A',1),(140,4,'D',1),(141,5,'B',1),(142,5,'B',1),(143,1,'B',1),(144,2,'B',1),(145,3,'C',1),(146,4,'A',1),(147,5,'D',1),(148,1,'B',1),(149,2,'C',1),(150,3,'A',1),(151,1,'B',1),(152,2,'B',1),(153,3,'C',1),(154,4,'D',1),(155,5,'A',1);
/*!40000 ALTER TABLE `responsetable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-06 15:07:16
