/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-01-01 21:56:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tb_userinfo`;
CREATE TABLE `tb_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_userinfo
-- ----------------------------
INSERT INTO `tb_userinfo` VALUES ('1', '广东省', '32589@163.com', '打球', '女', 'zjj');
INSERT INTO `tb_userinfo` VALUES ('2', '河南省', '213@qq.com', '篮球', '男', '钟嘉杰');
INSERT INTO `tb_userinfo` VALUES ('4', '河南省', '123@qq.com', '读书', '女', 'aaadd');
