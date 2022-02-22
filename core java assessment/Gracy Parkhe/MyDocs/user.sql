CREATE TABLE `user`.`user` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`username`));


INSERT INTO `user`.`user` (`username`, `password`) VALUES ('Gracy', '123');
INSERT INTO `user`.`user` (`username`, `password`) VALUES ('Jack', '456');
INSERT INTO `user`.`user` (`username`, `password`) VALUES ('Lily', '987');
