INSERT IGNORE INTO `spring`.`user` (`id`, `username`, `PASSWORD`, `ALGORITHM`)
VALUES ('1', 'john', '$2a$10$xn3LI/AjqicFYZFruSwve.681477XaVNaUQbr1gioaWPn4t1KsnmG', 'BCRYPT');
INSERT IGNORE INTO `spring`.`authority` (`id`, `NAME`, `USER`)
VALUES ('1', 'READ', '1');
INSERT IGNORE INTO `spring`.`authority` (`id`, `NAME`, `USER`)
VALUES ('2', 'WRITE', '1');
INSERT IGNORE INTO `spring`.`product` (`id`, `NAME`, `price`, `currency`)
VALUES ('1', 'Chocolate', '10', 'USD');