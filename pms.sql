/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 10.1.34-MariaDB : Database - pms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pms` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pms`;

/*Table structure for table `proj_members` */

DROP TABLE IF EXISTS `proj_members`;

CREATE TABLE `proj_members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `proj_id` int(11) DEFAULT NULL,
  `staff_id` varchar(10) DEFAULT NULL,
  `pro_role` varchar(100) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `created_dt` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `proj_members` */

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` text,
  `start_dt` date DEFAULT NULL,
  `end_dt` date DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `created_dt` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=259 DEFAULT CHARSET=latin1;

/*Data for the table `project` */

insert  into `project`(`id`,`title`,`description`,`start_dt`,`end_dt`,`status`,`created_by`,`created_dt`) values 
(2,'ePhis555',' Sistem Perolehan KKM','2019-02-04','2019-02-20','S','saiful','2019-02-21'),
(3,'test',' bla..bla..',NULL,NULL,NULL,NULL,NULL),
(4,'percubaan 50','testing',NULL,NULL,NULL,NULL,NULL),
(5,'test lagi','hrmis',NULL,NULL,NULL,NULL,NULL),
(207,'test lagi 2','  hrmis 2',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staff_id` varchar(20) DEFAULT NULL,
  `pwd` varchar(100) DEFAULT NULL,
  `name` varchar(60) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`staff_id`,`pwd`,`name`,`role`,`gender`) values 
(1,'111111','1234','Saiful Bahari','ADM','L'),
(2,'222222','1234','Saiful Hasan','USR','L'),
(3,NULL,'1234','saiful','2','L');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
