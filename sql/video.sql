CREATE TABLE `video` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `v_name` varchar(128) NOT NULL COMMENT '电影名字',
  `v_picture` varchar(256) NOT NULL COMMENT '电影剧照',
  `v_time` int(11) DEFAULT NULL COMMENT '上映时间',
  `v_actors` varchar(256) DEFAULT NULL COMMENT '演员',
  `v_type` varchar(16) DEFAULT NULL COMMENT '电影的分类',
  `v_good_percent` varchar(5) DEFAULT '0' COMMENT '好评百分比',
  `v_bad_percent` varchar(5) DEFAULT '0' COMMENT '差评百分比',
  `v_evaluate` varchar(256) DEFAULT NULL COMMENT '电影评价信息存储',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table `video` modify column `v_time` varchar(16) default null COMMENT '上映时间';
alter table `video` drop column `v_picture`;
alter table `video` add column `v_picture_path` varchar(256) NOT NULL COMMENT '电影剧照存储本地路径';
alter table `video` add column `add_time` VARCHAR (16) not null;
alter table `video` add column `modification_time` TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ;

# 增加url
alter table `video` add column `v_url` varchar(128) not null COMMENT '电影的url';

# 增加电影简介
 alter table `video` add column `v_detail` varchar(1024) default null COMMENT '电影简介';