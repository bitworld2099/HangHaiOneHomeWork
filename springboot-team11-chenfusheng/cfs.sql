/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : cfs

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-01-02 11:09:11
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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('3', '汤姆', '1111@111.com', '男', '北京市', '篮球,编程');
INSERT INTO `tb_user` VALUES ('4', '杰瑞', '2222@222.com', '女', '河北省', '读书,弹琴');
INSERT INTO `tb_user` VALUES ('5', '张三', '123456@qq.com', '男', '河北省', '篮球,读书,插画');
INSERT INTO `tb_user` VALUES ('6', '李四', '123456@qq.com', '女', '河南省', '读书,插画');
INSERT INTO `tb_user` VALUES ('7', '王五', '123456', '男', '河南省', '篮球,编程,弹琴');
INSERT INTO `tb_user` VALUES ('9', '龙六', '123456@qq.com', '女', '重庆市', '读书,编程');
INSERT INTO `tb_user` VALUES ('12', 'cfs', '123456@qq.com', '男', '广东省', '读书,编程');
