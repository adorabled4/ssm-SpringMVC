/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.29 : Database - ssm
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `ssm`;

/*Table structure for table `t_emp` */

DROP TABLE IF EXISTS `t_emp`;

CREATE TABLE `t_emp` (
  `emp_id` int NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `dept_id` int DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_emp` */

insert  into `t_emp`(`emp_id`,`emp_name`,`age`,`gender`,`dept_id`) values (1,'Miig',49,'男',1),(2,'Yhjo',79,'男',6),(3,'Rqhw',55,'男',8),(4,'Lyzp',27,'男',8),(5,'Nzed',52,'男',5),(6,'Awru',28,'男',8),(7,'Uzgj',46,'男',4),(8,'Eiit',25,'男',3),(9,'Owaf',99,'男',6),(10,'Belp',62,'男',4),(11,'Tczn',28,'男',9),(12,'Odfk',74,'男',6),(13,'Dukx',75,'男',2),(14,'Yqsi',32,'男',1),(15,'Vann',48,'男',8),(16,'Dabf',84,'男',3),(17,'Jmri',74,'男',3),(18,'Oric',82,'男',9),(19,'Rzgl',27,'男',9),(20,'Uwsj',3,'男',6),(21,'Bwjc',80,'男',5),(22,'Dwcm',64,'男',2),(23,'Sxbj',28,'男',0),(24,'Wgfd',81,'男',0),(25,'Lkbp',41,'男',2),(26,'Tejm',82,'男',0),(27,'Wqea',2,'男',8),(28,'Aeto',48,'男',8),(29,'Gngt',6,'男',2),(30,'Odjc',47,'男',3),(31,'Zyzg',18,'男',2),(32,'Rouc',52,'男',5),(33,'Hood',13,'男',1),(34,'Jmtq',95,'男',0),(35,'Uagp',32,'男',0),(36,'Yczb',4,'男',9),(37,'Somw',20,'男',3),(38,'Fpqc',51,'男',5),(39,'Mtld',51,'男',1),(40,'Zjcd',14,'男',1),(41,'Tqra',79,'男',4),(42,'Rboz',60,'男',2),(43,'Zvwi',74,'男',0),(44,'Swcc',6,'男',6),(45,'Gcqs',39,'男',7),(46,'Efnz',78,'男',0),(47,'Mflx',68,'男',2),(48,'Eqip',20,'男',9),(49,'Mcfd',75,'男',8),(50,'Jjea',12,'男',8),(51,'Xijh',48,'男',7),(52,'Rhbt',61,'男',1),(53,'Vcbq',86,'男',2),(54,'Wfyw',27,'男',8),(55,'Whou',2,'男',5),(56,'Tvea',66,'男',2),(57,'Wvyf',27,'男',8),(58,'Pnhq',96,'男',6),(59,'Axfo',85,'男',2),(60,'Tiam',7,'男',0),(61,'Tjel',57,'男',5),(62,'Zqor',52,'男',9),(63,'Nqun',43,'男',3),(64,'Zlhq',70,'男',0),(65,'Cyqt',72,'男',8),(66,'Weeh',74,'男',8),(67,'Sioc',45,'男',4),(68,'Sody',53,'男',8),(69,'Xzmj',4,'男',1),(70,'Vbak',83,'男',8),(71,'Hqls',93,'男',2),(72,'Mjog',43,'男',5),(73,'Ehxe',55,'男',9),(74,'Qask',41,'男',1),(75,'Txva',45,'男',9),(78,'dhx_',18,'男',3),(79,'Dgda',43,'女',2),(80,'Dgda',43,'女',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
