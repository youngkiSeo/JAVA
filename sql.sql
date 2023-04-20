-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: university
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `user` varchar(45) DEFAULT NULL,
  `registration_date` varchar(45) DEFAULT NULL,
  `user_permission` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('1','1234','김모씨','2022-11-30','관리자'),('2','1234','서영기','2022-11-30','학생'),('3','1234','박교수','2022-11-30','교수'),('p101','1234','김하나','2022-12-01','교수'),('s101','1234','홍길동1','2022-12-01','학생');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attended`
--

DROP TABLE IF EXISTS `attended`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attended` (
  `indexno` int NOT NULL AUTO_INCREMENT,
  `std_code` varchar(20) NOT NULL,
  `prof_code` varchar(20) NOT NULL,
  `subj_code` varchar(20) NOT NULL,
  `year` varchar(20) NOT NULL,
  PRIMARY KEY (`indexno`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attended`
--

LOCK TABLES `attended` WRITE;
/*!40000 ALTER TABLE `attended` DISABLE KEYS */;
INSERT INTO `attended` VALUES (155,'s101','p101','001','2021'),(156,'s101','p101','002','2021'),(157,'s102','p103','003','2021'),(158,'s102','p103','004','2021');
/*!40000 ALTER TABLE `attended` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `dep_code` varchar(20) NOT NULL,
  `dep_name` varchar(20) NOT NULL,
  `major_name` varchar(20) NOT NULL,
  PRIMARY KEY (`dep_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('d001','컴퓨터공학','데이터베이스'),('d002','방사선','방사'),('d003','물리치료','물치'),('d004','사무자동화','OA'),('d005','간호1','간호');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `code` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `addr` varchar(45) NOT NULL,
  `juminno` varchar(15) NOT NULL,
  `mphone` varchar(25) NOT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `ent_year` varchar(10) NOT NULL,
  `degree` varchar(20) NOT NULL,
  `dept_code` varchar(20) NOT NULL,
  `lab_room` varchar(20) NOT NULL,
  `gender` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES ('p101','김하나','서울','123456-123456','010-1111-1111','053-1111-1111','1990','공학박사','d002','101호','남자'),('p103','김두리','대구광역시','234567-123456','010-3333-3333','053-3333-3333','1998','경영학박사','d001','103호','남자'),('p104','정교수','대구광역시','598265-256854','010-4444-4444','053-34444-4444','1998','박사','d002','301호','여자'),('p202','정교수','대구광역시','598265-256854','010-4444-4444','053-34444-4444','1980','박사','d002','301호','여자');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `results`
--

DROP TABLE IF EXISTS `results`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `results` (
  `indexno` int NOT NULL AUTO_INCREMENT,
  `prof_code` varchar(20) NOT NULL,
  `std_code` varchar(20) NOT NULL,
  `subj_code` varchar(20) NOT NULL,
  `year` varchar(20) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `term` varchar(20) DEFAULT NULL,
  `middle` int DEFAULT NULL,
  `fainal` int DEFAULT NULL,
  `report` int DEFAULT NULL,
  `attended` int DEFAULT NULL,
  `added` int DEFAULT NULL,
  `sum` int DEFAULT NULL,
  `grade_value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`indexno`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `results`
--

LOCK TABLES `results` WRITE;
/*!40000 ALTER TABLE `results` DISABLE KEYS */;
INSERT INTO `results` VALUES (1,'p101','s101','003','2021','1','1학기',0,0,0,0,0,0,'0'),(62,'p101','s101','002','2021','1학년','1학기',0,0,0,0,0,0,'0'),(63,'p101','s101','001','2021','1학년','1학기',10,10,10,10,10,40,'B+'),(64,'p101','s101','002','2021','1학년','1학기',0,0,0,0,0,0,'0'),(65,'p103','s102','003','2021','1학년','1학기',0,0,0,0,0,0,'0'),(66,'p103','s102','004','2021','1학년','1학기',0,0,0,0,0,0,'0');
/*!40000 ALTER TABLE `results` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `code` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `addr` varchar(45) NOT NULL,
  `juminno` varchar(20) NOT NULL,
  `mphone` varchar(20) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `uin_year` int NOT NULL,
  `hischool` varchar(20) NOT NULL,
  `end_year` int DEFAULT NULL,
  `dept_code` varchar(20) DEFAULT NULL,
  `prof_code` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('s101','홍길동1','서울','121212-1212121','010-1111-1111','(053)-568-8985',2015,'강북고',2015,'d001','p101','남자'),('s102','이순신','대구','121212-121212','010-1111-1111','(053)-568-8985',2015,'운암고',2015,'d002','p101','남자'),('s103','김하나','대구','121212-121212','010-1111-1111','(053)-568-8985',2015,'운암고',2015,'d003','p103','남자'),('s104','세종대황','대구','121212-121212','010-1111-1111','(053)-568-8985',2015,'대건고',2015,'d004','p202','남자'),('s105','세종대황','대구','121212-121212','010-1111-1111','(053)-568-8985',2015,'대건고',2015,'d003','p202','남자');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `code` varchar(20) NOT NULL,
  `subject` varchar(20) NOT NULL,
  `dept_code` varchar(20) NOT NULL,
  `year` varchar(20) NOT NULL,
  `grade` varchar(20) NOT NULL,
  `term` varchar(20) NOT NULL,
  `time` varchar(20) NOT NULL,
  `prof_code` varchar(20) NOT NULL,
  `credit` varchar(20) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('001','자바실무','d001','2021','1학년','1학기','1','p101','1'),('002','웹프로그래밍','d001','2021','1학년','1학기','2','p101','2'),('003','알고리즘','d002','2021','1학년','1학기','2','p103','2'),('004','컴퓨터구조','d002','2021','1학년','1학기','3','p103','3'),('005','인공지능','d003','2021','1학년','1학기','3','p104','3'),('006','자료구조','d003','2021','1학년','1학기','2','p104','2'),('007','데이터베이스','d004','2021','1학년','1학기','3','p202','3'),('008','네트워크','d004','2021','1학년','1학기','3','p202','4');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-07 17:32:42
