use ops;
CREATE TABLE `ops`.`customer` (
  `customerId` INT NOT NULL,
  `customerName` VARCHAR(45) NULL,
  `birthDate` DATE NULL,
  `mobile` BIGINT(10) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`customerId`));
  
  CREATE TABLE `ops`. `product`(
  `productId` INT NOT NULL,
  `productName` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY(`productId`));
  
  CREATE TABLE `ops`.`order`(
  `orderId` INT NOT NULL,
  `customerId` INT NULL,
  `productId` INT NULL,
  `quantity` INT NULL,
  `orderAmount` DOUBLE NULL,
  PRIMARY KEY(`orderId`));
  
  select * from customer;
  select * from product;
  
  
  
  
  