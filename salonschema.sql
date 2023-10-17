-- -----------------------------------------------------
-- Schema full-stack-ecommerce
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `yulanies_salon`;


CREATE SCHEMA `yulanies_salon`;
ALTER DATABASE `yulaniessalondb`
CHARACTER SET utf8
COLLATE utf8_unicode_ci;

USE `yulanies_salon`;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`zipcodes`
-- -----------------------------------------------------
          
DROP TABLE IF EXISTS `yulanies_salon`.`Zipcodes`;

CREATE TABLE `yulanies_salon`.`Zipcodes` (
  `city` varchar(36) DEFAULT NULL,
  `state` varchar(4) DEFAULT NULL,
  `zipcode` varchar(12) NOT NULL,
  PRIMARY KEY (`zipcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
          
-- -----------------------------------------------------
-- Table `yulanies_salon`.`customer`
-- -----------------------------------------------------
          
DROP TABLE IF EXISTS `yulanies_salon`.`Customer`;

CREATE TABLE `yulanies_salon`.`Customer` (
  `CustomerID` varchar(10) NOT NULL,
  `FirstName` varchar(35) DEFAULT NULL,
  `LastName` varchar(35) DEFAULT NULL,
  `PhoneNumber` varchar(15) DEFAULT NULL,
  `Street` varchar(35) DEFAULT NULL,
  `City` varchar(36) DEFAULT NULL,
  `State` varchar(4) DEFAULT NULL,
  `ZipCode` varchar(12) DEFAULT NULL,
  `Gender` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`Appointment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `yulanies_salon`.`Appointment`;

CREATE TABLE `yulanies_salon`.`Appointment` (
  `AppointmentID` varchar(10) NOT NULL,
  `AppointmentDateTime` date DEFAULT NULL,
  `CustomerID` varchar(10) NOT NULL,
  PRIMARY KEY (`AppointmentID`)
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`SalonServices`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SalonServices`;

CREATE TABLE `yulanies_salon`.`SalonServices` (
  `ServiceID` varchar(10) NOT NULL,
  `ServiceName` varchar(35) DEFAULT NULL,
  `ServiceDuration` int(11) DEFAULT NULL,
  `ServicePrice` decimal(10,0) DEFAULT NULL,
  `ServiceMaterials` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ServiceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`Employees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Employees`;

CREATE TABLE `yulanies_salon`.`Employees` (
  `EmployeeID` varchar(10) NOT NULL,
  `FirstName` varchar(35) DEFAULT NULL,
  `LastName` varchar(25) DEFAULT NULL,
  `Street` varchar(45) DEFAULT NULL,
  `ZipCode` varchar(15) DEFAULT NULL,
  `City` varchar(25) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  `PayRate` int(11) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`ServicesRendered`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ServiceRendered`;

CREATE TABLE `yulanies_salon`.`ServiceRendered` (
  `AppointmentID` varchar(10) NOT NULL,
  `LineItemNumber` int(2) NOT NULL,
  `ServiceID` varchar(10) NOT NULL,
  `ServicePrice` int(4) NOT NULL,
  `EmployeeID` varchar(10) NOT NULL,
  PRIMARY KEY (`AppointmentID`,`LineItemNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS `SalonServices`;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`ServicesRendered`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SalonServices`;

CREATE TABLE `SalonServices` (
  `ServiceID` varchar(10) NOT NULL,
  `ServiceName` varchar(35) DEFAULT NULL,
  `ServiceDuration` int(11) DEFAULT NULL,
  `ServicePrice` decimal(10,0) DEFAULT NULL,
  `ServiceMaterials` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ServiceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `yulanies_salon`.`Customer`
   ADD CONSTRAINT fk_customer_zipcodes
     FOREIGN KEY (ZipCode) 
        REFERENCES Zipcodes (zipcode);
        
ALTER TABLE `yulanies_salon`.`Employees`
   ADD CONSTRAINT fk_employees_zipcodes
     FOREIGN KEY (ZipCode) 
        REFERENCES Zipcodes (zipcode);

ALTER TABLE `yulanies_salon`.`Appointment`
   ADD CONSTRAINT fk_customer_appointment
     FOREIGN KEY (CustomerID) 
        REFERENCES Customer (CustomerID);

ALTER TABLE `yulanies_salon`.`ServiceRendered`
   ADD CONSTRAINT fk_ServiceRendered_Service
     FOREIGN KEY (ServiceID) 
        REFERENCES SalonServices (ServiceID);

ALTER TABLE `yulanies_salon`.`ServiceRendered`
   ADD CONSTRAINT fk_ServiceRendered_Employee
     FOREIGN KEY (EmployeeID) 
        REFERENCES Employees (EmployeeID);

ALTER TABLE `yulanies_salon`.`ServiceRendered`
   ADD CONSTRAINT fk_ServiceRendered_Appointmentcity
     FOREIGN KEY (AppointmentID) 
        REFERENCES Appointment (AppointmentID);
        
