/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : db_huangshaojia

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-12-28 21:35:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('2', '2', '篮球,编程,弹琴', '辽宁省', '男', '2');
INSERT INTO `tb_user` VALUES ('3', '1111@126.com', '篮球,编程', '辽宁省', '男', 'tom');
INSERT INTO `tb_user` VALUES ('4', '146182@qq.com', '篮球,插画,编程', '河北省', '女', 'jack');
INSERT INTO `tb_user` VALUES ('5', '123456@qq.com', '篮球,读书,插画', '河北省', '男', '张三');
INSERT INTO `tb_user` VALUES ('6', '123456@qq.com', '读书,插画', '河南省', '女', '李四');
INSERT INTO `tb_user` VALUES ('7', '123456', '篮球,编程,弹琴', '河南省', '男', 'qqq');
INSERT INTO `tb_user` VALUES ('8', '123456@qq.com', '篮球,弹琴', '河北省', '未知', 'www');
INSERT INTO `tb_user` VALUES ('9', '123456@qq.com', '篮球,读书', '重庆市', '女', 'eee');
INSERT INTO `tb_user` VALUES ('10', '123456@qq.com', '篮球,弹琴', '河北省', '女', 'rrrr');
INSERT INTO `tb_user` VALUES ('11', '123456@qq.com', '篮球,弹琴', '重庆市', '女', 'ttt');
INSERT INTO `tb_user` VALUES ('12', '123456@qq.com', '篮球,读书', '广东省', '女', 'yyy');
INSERT INTO `tb_user` VALUES ('13', '123456@qq.com', '篮球,弹琴', '河南省', '女', 'uuu');
