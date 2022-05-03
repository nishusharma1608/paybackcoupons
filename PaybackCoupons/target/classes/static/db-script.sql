CREATE DATABASE payback;

USE DATABASE payback;

CREATE TABLE `members` (
  `memberId` int AUTO_INCREMENT NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`memberId`)
);

CREATE TABLE `coupons` (
  `couponId` int AUTO_INCREMENT NOT NULL,
  `validFrom` date NOT NULL,
  `validUntil` date NOT NULL,
  `memberId` int NOT NULL,
  PRIMARY KEY (`couponId`)
);


INSERT INTO `payback`.`members`(`memberId`,`name`,`address`) VALUES(1,"Adam","123 Zurich");

INSERT INTO `payback`.`members`(`memberId`,`name`,`address`) VALUES(2,"Bruce","456 Munich");

INSERT INTO `payback`.`coupons` (`couponId`,`validFrom`,`validUntil`,`memberId`) VALUES (1,"2021-12-16","2022-12-16",1);

INSERT INTO `payback`.`coupons` (`couponId`,`validFrom`,`validUntil`,`memberId`) VALUES (2,"2020-12-16","2021-12-16",2);

INSERT INTO `payback`.`coupons` (`couponId`,`validFrom`,`validUntil`,`memberId`) VALUES (3,"2021-02-16","2022-02-16",1);

INSERT INTO `payback`.`coupons` (`couponId`,`validFrom`,`validUntil`,`memberId`) VALUES (4,"2022-03-05","2023-12-05",1);

INSERT INTO `payback`.`coupons` (`couponId`,`validFrom`,`validUntil`,`memberId`) VALUES (5,"2022-01-08","2022-12-09",2);

INSERT INTO `payback`.`coupons` (`couponId`,`validFrom`,`validUntil`,`memberId`) VALUES (6,"2021-02-16","2022-12-16",2);
