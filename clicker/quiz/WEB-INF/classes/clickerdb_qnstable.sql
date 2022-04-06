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
-- Table structure for table `qnstable`
--

DROP TABLE IF EXISTS `qnstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qnstable` (
  `qnsID` int NOT NULL AUTO_INCREMENT,
  `category` varchar(45) NOT NULL,
  `qns` varchar(200) NOT NULL DEFAULT 'Not Null',
  `choice1` varchar(45) NOT NULL,
  `choice2` varchar(45) NOT NULL,
  `choice3` varchar(45) NOT NULL,
  `choice4` varchar(45) NOT NULL,
  `answer` varchar(45) NOT NULL,
  PRIMARY KEY (`qnsID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qnstable`
--

LOCK TABLES `qnstable` WRITE;
/*!40000 ALTER TABLE `qnstable` DISABLE KEYS */;
INSERT INTO `qnstable` VALUES (1,'Math','Question 1. The average of first 50 natural numbers is: ','A. 25.30 ','B. 25.50','C. 25.00','D. 12.25','B. 25.50'),(2,'Math','Question 2. What is 1004 divided by 2? ','A. 522 ','B. 502','C. 520','D. 5002','B. 502'),(3,'Math','Question 3. A clock strikes once at 1 o’clock, twice at 2 o’clock, thrice at 3 o’clock and so on. How many times will it strike in 24 hours? ','A. 78 ','B. 136','C. 156','D. 5196','C. 156'),(4,'Math','Question 4. 106 × 106 – 94 × 94 = ? ','A. 2004 ','B. 2400','C. 1904','D. 1906','B. 2004'),(5,'Math','Question 5. Which of the following numbers gives 240 when added to its own square? ','A. 15 ','B. 16','C. 18','D. 20','A. 15'),(6,'Science','Question 1. Among Ferns, Mosses, Algae & Fungi , cholorophyll is found in?','A. Algae & Ferns ','B. Algae & Mosses','C. Algae, Ferns & Mosses','D. None of the above','C. Algae, Ferns & Mosses'),(7,'Science','Question 2. Which of the following is a micronutrient that helps in nitrogen metabolism of plants? ','A. Zinc ','B. Copper','C. Molybdenum','D. Sulphur','C. Molybdenum'),(8,'Science','Question 3. Which of the following is not a variety of mango? ','A. Banganapalle','B. Alphonso','C. Sindhoora','D. Red Dacca','D. Red Dacca'),(9,'Science','Question 4. Memory loss would most likely be due to a malfunction of which part of the brain?','A. Medulla','B. Cerebellum','C. Cerebrum','D. Pons','C. Cerebrum'),(10,'Science','Question 5. Which of the following diseases is spread by mosquitoes but is not a viral disease?','A. Meningitis','B. Dengue fever','C. Yellow fever','D. Filariasis','D. Filariasis');
/*!40000 ALTER TABLE `qnstable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-06 15:07:17
