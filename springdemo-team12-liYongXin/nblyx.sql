/*
Navicat MySQL Data Transfer

Source Server         : lyx
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : nblyx

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-01-02 18:08:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '黄骚佳', '666666QQ.com', '男', '广东省', '编程');
INSERT INTO `tb_user` VALUES ('2', '周杰伦广州分组组长', 'linkaifeng@QQ.com', '男', '广东省', '弹琴');
INSERT INTO `tb_user` VALUES ('3', '小全子', '11111@QQ.com', '男', '北京市', '篮球');
INSERT INTO `tb_user` VALUES ('4', '李维杰', '222222@QQ.com', '男', '北京市', '篮球,插画');
INSERT INTO `tb_user` VALUES ('5', '寂无夜', '88888888@QQ.com', '男', '广东省', '读书');
