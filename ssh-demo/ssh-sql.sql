DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
                           `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
                           `username` varchar(200) COLLATE utf8_bin DEFAULT NULL,
                           `password` varchar(200) COLLATE utf8_bin DEFAULT NULL,
                           `account` varchar(200) COLLATE utf8_bin DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;