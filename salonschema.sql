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
          
DROP TABLE IF EXISTS `yulanies_salon`.`zipcode`;

CREATE TABLE `yulanies_salon`.`zipcode` (
  `city` varchar(36) DEFAULT NULL,
  `state` varchar(4) DEFAULT NULL,
  `zip_code` integer(12) NOT NULL,
  PRIMARY KEY (`zip_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
          
-- -----------------------------------------------------
-- Table `yulanies_salon`.`customer`
-- -----------------------------------------------------
          
DROP TABLE IF EXISTS `yulanies_salon`.`customer`;

CREATE TABLE `yulanies_salon`.`customer` (
  `customer_ID` integer(10) NOT NULL,
  `first_name` varchar(35) DEFAULT NULL,
  `last_name` varchar(35) DEFAULT NULL,
  `phone_number` varchar(15) DEFAULT NULL,
  `street` varchar(35) DEFAULT NULL,
  `city` varchar(36) DEFAULT NULL,
  `state` varchar(4) DEFAULT NULL,
  `zip_code` integer(12) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`customer_ID`),
  FOREIGN KEY (`zip_code`) REFERENCES zipcode(`zip_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`Appointment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `yulanies_salon`.`appointment`;

CREATE TABLE `yulanies_salon`.`appointment` (
  `appointment_ID` int(10) NOT NULL,
  `appointment_date_time` date DEFAULT NULL,
  `customer_ID` int(10) NOT NULL,
  PRIMARY KEY (`appointment_ID`),
  FOREIGN KEY (`customer_ID`) REFERENCES customer(`customer_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`salon_services`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `salon_services`;

CREATE TABLE `yulanies_salon`.`salon_services` (
  `service_ID` int(10) NOT NULL,
  `service_name` varchar(35) DEFAULT NULL,
  `service_duration` int(11) DEFAULT NULL,
  `service_price` decimal(10,0) DEFAULT NULL,
  `service_materials` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`service_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`Employees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `employee`;

CREATE TABLE `yulanies_salon`.`employee` (
  `employee_ID` int(10) NOT NULL,
  `first_name` varchar(35) DEFAULT NULL,
  `last_name` varchar(25) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `zip_code` varchar(15) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `pay_rate` int(11) DEFAULT NULL,
  PRIMARY KEY (`employee_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- -----------------------------------------------------
-- Table `yulanies_salon`.`ServicesRendered`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `service_rendered`;

CREATE TABLE `yulanies_salon`.`service_rendered` (
  `appointment_ID` int(10) NOT NULL,
  `line_item_number` int(2) NOT NULL,
  `service_ID` varchar(10) NOT NULL,
  `service_price` int(4) NOT NULL,
  `employee_ID` int(10) NOT NULL,
  PRIMARY KEY (`appointment_ID`,`line_item_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `yulanies_salon`.`customer`
   ADD CONSTRAINT fk_customer_zipcode
     FOREIGN KEY (zip_code) 
        REFERENCES zipcode (zip_code);
        
ALTER TABLE `yulanies_salon`.`employee`
   ADD CONSTRAINT fk_employee_zipcode
     FOREIGN KEY (zip_code) 
        REFERENCES zipcode (zip_code);

ALTER TABLE `yulanies_salon`.`appointment`
   ADD CONSTRAINT fk_customer_appointment
     FOREIGN KEY (customer_ID) 
        REFERENCES customer(customer_ID);

ALTER TABLE `yulanies_salon`.`service_rendered`
   ADD CONSTRAINT fk_service_rendered_service
     FOREIGN KEY (service_ID) 
        REFERENCES salon_services (service_ID);

ALTER TABLE `yulanies_salon`.`service_rendered`
   ADD CONSTRAINT fk_service_rendered_employee
     FOREIGN KEY (employee_ID) 
        REFERENCES employee (employee_ID);

ALTER TABLE `yulanies_salon`.`service_rendered`
   ADD CONSTRAINT fk_service_rendered_appointment
     FOREIGN KEY (appointment_ID) 
        REFERENCES appointment (appointment_ID);
        
