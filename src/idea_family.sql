/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : localhost:3306
 Source Schema         : idea_family

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : 65001

 Date: 08/05/2018 15:43:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for idea_comment
-- ----------------------------
DROP TABLE IF EXISTS `idea_comment`;
CREATE TABLE `idea_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eventId` int(11) NULL DEFAULT NULL,
  `commentId` int(11) NULL DEFAULT NULL,
  `content` varchar(2550) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `commentTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_comment
-- ----------------------------
INSERT INTO `idea_comment` VALUES (11, 1, 1, '这里是评论内容', '2018-03-10 00:00:00');
INSERT INTO `idea_comment` VALUES (29, 51, 1, '创意不错', '2018-03-10 08:00:00');
INSERT INTO `idea_comment` VALUES (31, 51, 1, '这个创意我比较支持', '2018-03-11 08:00:00');
INSERT INTO `idea_comment` VALUES (32, 51, 1, '莉莉真美！！', '2018-03-11 08:00:00');
INSERT INTO `idea_comment` VALUES (33, 51, 1, '1111', '2018-03-11 08:00:00');
INSERT INTO `idea_comment` VALUES (37, 79, 1, 'dddd', '2018-04-23 08:00:00');
INSERT INTO `idea_comment` VALUES (50, 86, 1, '测试餐饮项目的评价', '2018-04-26 08:00:00');
INSERT INTO `idea_comment` VALUES (51, 86, 1, '这个项目很好', '2018-04-26 08:00:00');
INSERT INTO `idea_comment` VALUES (53, 56, 1, '测试项目的评论', '2018-05-02 08:00:00');
INSERT INTO `idea_comment` VALUES (54, 79, 1, '@我的密码是你名字: cccc', '2018-05-02 08:00:00');

-- ----------------------------
-- Table structure for idea_event
-- ----------------------------
DROP TABLE IF EXISTS `idea_event`;
CREATE TABLE `idea_event`  (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `founderId` int(11) NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` int(11) NULL DEFAULT NULL,
  `photoName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `detailedDescription` varchar(2550) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  `stateId` int(11) NULL DEFAULT NULL,
  `instruction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `support` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_event
-- ----------------------------
INSERT INTO `idea_event` VALUES (1, 1, '15分钟，珠江边上的这座院子带你完成一场小逃离', 1, 'minsu1.jpg', '广东', '广州', '离开城市的逼仄，聆听鸟叫船鸣，完成这样一场城市小逃离，只需15分钟。这个珠江边的“隐世度假酒店”，用一个旧船厂，带着老广州记忆的院子，让你捕捉有温度的时光。', '2018-01-10 16:18:01', 1, '离开城市的逼仄，聆听鸟叫船鸣，完成这样一场城市小逃离，只需15分钟。这个珠江边...', 211);
INSERT INTO `idea_event` VALUES (2, 1, '秀酒店进驻杭州，八位设计大咖携Each助力，十年一剑众星捧月', 1, 'minsu2.jpg', '浙江', '杭州', '秀酒店是一个轻奢品牌，因年轻而充满创新，满怀突破和打破规则的勇气，这也是我们来到杭州的原因。我们将为年轻新贵设计一个酒店，以有趣对抗无趣，它是个人秀场，是潮流合集。期待你的加入！', '2018-01-09 16:35:49', 1, '秀酒店进驻杭州，八位设计大咖携Each助力，十年一剑众星捧月', 431);
INSERT INTO `idea_event` VALUES (3, 1, '「海外探宿」来东京，和有一居共同开启轻酒店时代', 1, 'minsu3.jpg', '日本', '东京', 'THE· SPATIUM GINZA 项目是有一居推出的首个轻酒店，也标志着有一居正式进入品牌化轻酒店运营和投资开发市场。有一居，将从东京开始，把“轻酒店”的投资模式发展到全球各个发达的“旅客城”', '2018-01-08 16:43:55', 1, 'THE· SPATIUM GINZA 项目是有一居推出的首个轻酒店，也标志着有一...', 148);
INSERT INTO `idea_event` VALUES (4, 1, '在巴蜀山河和熊猫当邻居，今晚有张好床在等你', 1, 'minsu4.jpg', '四川', '雅安', '我们在城市里行走谋生，在风景里寻找安逸的生活，但这些都不及“虚度时光”重要。此时，在天府之国有一张好床等你来睡。', '2018-01-09 16:44:59', 1, '我们在城市里行走谋生，在风景里寻找安逸的生活，但这些都不及“虚度时光”重要。此时...', 148);
INSERT INTO `idea_event` VALUES (5, 1, '紫金山下，住进真正的民国老宅，松花酿酒，春水煎茶', 1, 'minsu5.jpg', '江苏', '南京', '老树院子，我们想做金陵最好玩的朋友圈，把每一个朴素的日子都过成良辰。', '2018-01-08 16:46:28', 1, '老树院子，我们想做金陵最好玩的朋友圈，把每一个朴素的日子都过成良辰。', 321);
INSERT INTO `idea_event` VALUES (6, 1, '藏在“民间故宫”的木艺世家，用双手建造了一座木屋', 1, 'minsu6.jpg', '四川', '龙岩', '培田古村由三十多幢高堂华屋、二十一座古祠、六家书院、二道跨街牌坊和一条千米古街构成了独特的古村风貌。「似续堂」坐落其中，由木艺世家倾力打造世界级木建筑民宿，在古村仰望漫天繁星，品一杯茶，等你缓缓归来。', '2018-01-07 16:49:01', 1, '培田古村由三十多幢高堂华屋、二十一座古祠、六家书院、二道跨街牌坊和一条千米古街构...', 176);
INSERT INTO `idea_event` VALUES (7, 1, '「海外探宿」打个飞的，去泰国普吉岛吹海风', 1, 'minsu7.jpg', '泰国', '普吉岛', '它是最让人上瘾的岛屿之一；它有纯白的海滩、如梦似幻的日落和蔚蓝的大海；它有丰富的热带水果和肥美的海鲜；它的大街小巷遍布突突车和SPA馆……深耕海外民宿6年，这一次，我们易民宿团队想带你畅游泰国普吉岛。', '2018-01-06 16:50:12', 1, '它是最让人上瘾的岛屿之一；它有纯白的海滩、如梦似幻的日落和蔚蓝的大海；它有丰富的...', 144);
INSERT INTO `idea_event` VALUES (8, 1, '山水间的白房子，藏着你我的理想生活', 1, 'minsu8.jpg', '北京', '千岛湖', '北漂十七年，在唯快不破的互联网行业打拼，研发过瑞星杀毒的小狮子，跟随李开复先生一起做投资，在百度带领1000多人的团队，现在我要在山水间造一座白房子，随缘而安，倾境浮生。', '2018-01-06 08:51:34', 1, '北漂十七年，在唯快不破的互联网行业打拼，研发过瑞星杀毒的小狮子，跟随李开复先生一...', 299);
INSERT INTO `idea_event` VALUES (9, 1, '当太平洋的第一道光和风，照拂我们的东极岛', 1, 'minsu9.jpg', '浙江', '舟山', '时光在翻腾的云海里燃烧，照红了大海，岛屿，和渔夫们布满褶皱的脸，我想把这静谧的时光给你安排得更长久一些。', '2018-01-06 14:52:51', 1, '时光在翻腾的云海里燃烧，照红了大海，岛屿，和渔夫们布满褶皱的脸，我想把这静谧的时...', 332);
INSERT INTO `idea_event` VALUES (10, 1, '山中乡村，既然来了就再也不想走了', 1, 'minsu10.jpg', '浙江', '桐庐', '我是余味，这一次带着我的云溪上走出莫干山，伙同大乐之野、过云山居，在桐庐圈下了一个长丘田村搞事情，大半个民宿圈的人都来为我们打call，民宿的下一个五年会在这里吗？', '2018-01-06 10:54:43', 1, '我是余味，这一次带着我的云溪上走出莫干山，伙同大乐之野、过云山居，在桐庐圈下了一...', 474);
INSERT INTO `idea_event` VALUES (11, 1, '泊悅汇再次出发，打造太湖东山的民宿聚落标杆', 1, 'minsu11.jpg', '江苏', '苏州', '太湖东山是纯天然的山水村落，我们打造的泊悅湾，既保留原有的苏式韵味，也融入了现代的生活方式。淳朴的旧，前卫的新，和谐并存。它将联合一期项目泊悅汇，共同打造太湖边上的民宿聚落标杆。', '2018-01-06 04:55:58', 1, '太湖东山是纯天然的山水村落，我们打造的泊悅湾，既保留原有的苏式韵味，也融入了现代...', 326);
INSERT INTO `idea_event` VALUES (12, 1, '滴滴优享：给自己一个安静不打扰的周末', 1, 'minsu12.jpg', '浙江', '杭州', '滴滴联合借宿，打造一间藏在风景里的神秘民宿：两天一夜，邀你来免费试睡，给自己一个安静、不打扰的周末。更有海量打车券、民宿抵扣券等你来领。', '2018-01-05 16:56:50', 1, '滴滴联合借宿，打造一间藏在风景里的神秘民宿：两天一夜，邀你来免费试睡，给自己一个...', 960);
INSERT INTO `idea_event` VALUES (13, 2, '新派徽菜攻占沪上市场空白，款款而行，皖约而来', 2, 'canyin1.jpg', '上海', '上海', '大众点评网徽菜品类前三、开业不久人气排名前五……我们一群餐饮老炮用十几年的行业经验打造徽菜品牌皖约，在短短2年内攻占沪上新派徽菜市场空白！', '2018-01-10 16:59:20', 1, '大众点评网徽菜品类前三、开业第一年人气排名前五……我们一群餐饮老炮用十几年的行业...', 82);
INSERT INTO `idea_event` VALUES (14, 2, '不到庐山辜负目，不到“道味”辜负腹', 2, 'canyin2.jpg', '天津', '天津', '曾出征世界厨王争霸赛，也曾出镜央视《一城一味》纪录片，我将25年厨师生涯的精华汇聚于此，打造了“道味”这家中式创意菜餐厅。', '2018-01-10 15:00:22', 1, '曾出征世界厨王争霸赛，也曾出镜央视《一城一味》纪录片，我将25年厨师生涯的精华汇...', 93);
INSERT INTO `idea_event` VALUES (15, 2, 'Gentle Marble，这间面包房藏着网红的生活美学', 2, 'canyin3.jpg', '浙江', '杭州', '我这家米其林星级工艺打造的面包房——Gentle Marble，藏着每个女孩心里的美梦，我想把它当作礼物送给每个热爱美好生活的姑娘。', '2018-01-10 10:01:24', 1, '我这家米其林星级工艺打造的面包房——Gentle Marble，藏着每个女孩心里...', 116);
INSERT INTO `idea_event` VALUES (16, 2, '如果煎饼没有理想，那和咸鱼有什么区别', 2, 'canyin4.jpg', '北京', '北京', '四年里只做一张饼。我们精选北纬45度国际公认的黄金产粮带食材，慢磨、细挑、缓煎、精卷，只为让每种食材都迸发出健康纯正的中国味道。', '2018-01-09 17:02:19', 1, '四年里只做一张饼。我们精选北纬45度国际公认的黄金产粮带食材，慢磨、细挑、缓煎、...', 41);
INSERT INTO `idea_event` VALUES (17, 2, '踏上美食大航海的旅程，有海的地方就有海鲜饭', 2, 'canyin5.jpg', '北京', '北京', '创立于2014年的硬货，一碗海鲜饭价格是传统海鲜饭的30%，但出品的效率却是传统海鲜饭的3倍。作为北京海鲜饭品前三名的餐厅，我们仅靠80多平米的店面，单月的营业额超过40万。', '2018-01-09 15:03:14', 1, '创立于2014年的硬货，一碗海鲜饭价格是传统海鲜饭的30%，但出品的效率却是传统...', 75);
INSERT INTO `idea_event` VALUES (18, 2, '增加生命的厚度，来一场咖啡馆与艺术空间的品质盛宴', 2, 'canyin6.jpg', '广东', '深圳', '深圳招商局引进项目，一个集艺术、设计、电影、咖啡和美食五位一体的社群空间。继创立了CAC、MANA和UP GALLERY等后，我率领团队倾力打造完整艺术生态圈。', '2018-01-09 09:04:12', 1, '继创立了CAC、MANA和UP GALLERY等后，我率领团队倾力打造了補時，为...', 69);
INSERT INTO `idea_event` VALUES (19, 2, '在北京CBD商场里，开一家属于你的咖啡店', 2, 'canyin7.jpg', '北京', '北京', '老朋友，我们又见面了！这一次，我带着「爱咖啡·合生汇店」向你发出邀请：入伙爱咖啡，成为永久合伙人。', '2018-01-08 17:05:23', 1, '老朋友，我们又见面了！这一次，我带着「爱咖啡·合生汇店」向你发出邀请：入伙爱咖啡，成为永久合伙人。', 107);
INSERT INTO `idea_event` VALUES (20, 2, '精酿就是要喝出属于自己的Free Style', 2, 'canyin8.jpg', '上海', '上海', 'Brew Bear传递了新颖，潮流，街头的啤酒文化，其不单单是一家酒吧，他更代表了时尚、年轻、自由的生活方式，同时我们也将在不远的将来把精酿文化带向本土化。\r\n\r\nBrew Bear传递了新颖，潮流，街头的啤酒文化，其不单单是一家酒吧，他更代表了时尚、年轻、自由的生活方式，同时我们也将在不远的将来把精酿文化带向本土化。\r\n\r\nBrew Bear传递了新颖，潮流，街头的啤酒文化，其不单单是一家酒吧，他更代表了时尚、年轻、自由的生活方式，同时我们也将在不远的将来把精酿文化带向本土化。\r\n\r\n', '2018-01-08 12:06:40', 1, 'Brew Bear传递了新颖，潮流，街头的啤酒文化，其不单单是一家酒吧，他更代表...', 174);
INSERT INTO `idea_event` VALUES (21, 2, 'ADAMI多功能进口酱料，让做饭变成一件简单快乐的事', 2, 'canyin9.jpg', '上海', '上海', 'ADAMI35年用心制酱，好吃、易煮、零添加，与肯德基、美珍香和TESCO乐购全球合作，并在国内成立线下合作美食体验馆。我们所做的只为让你在匆忙的都市里，走进厨房，用一勺酱，做一顿饭，把时光打慢。', '2018-01-08 07:07:37', 1, 'ADAMI35年用心制酱，好吃、易煮、零添加，与肯德基、美珍香和TESCO乐购全...', 671);
INSERT INTO `idea_event` VALUES (22, 2, '天人十二载——给最重要的人', 2, 'canyin10.jpg', '陕西', '西安', '“浊酒一杯诗趣妙，歪诗两句酒风狂”，快意！“酒诗文化数千年，携酒吟诗敢问天”，豪气！天人十二致力于打造一款好喝不贵的高端白酒，茅台镇古法秘制，耀州密匠心瓷器装酒，给最重要的人。', '2018-01-07 17:08:48', 1, '“浊酒一杯诗趣妙，歪诗两句酒风狂”，快意！“酒诗文化数千年，携酒吟诗敢问天”，豪...', 419);
INSERT INTO `idea_event` VALUES (23, 2, '365天空运活虾，用“师”的态度呈现美味！', 2, 'canyin11.jpg', '北京', '北京', '2014年我们的第一家店开业，3年时间开一家火一家，点评热度均为所在区域前茅。一年365天活虾供应、南派烧虾秘方、时尚的品牌跨界营销……「烧虾师」早已成为帝都超人气龙虾品牌。', '2018-01-07 14:09:41', 1, '2014年我们的第一家店开业，3年时间开一家火一家，点评热度均为所在区域前茅。一...', 202);
INSERT INTO `idea_event` VALUES (24, 2, '吃过这一餐，觉得人生的棋局尚有七分赢面', 2, 'canyin12.jpg', '北京', '北京', '2018 年 1 月12 日，我们向全国“最挑剔”的食客发出邀请，与大董、沈宏非、陈晓卿、董克平、徐建军等数位行业大咖齐聚北京，共赴一场川、鲁、粤、淮四大名厨首次联袂打造的美食晚宴。', '2018-01-07 08:10:42', 1, '2018 年 1 月12 日，我们向全国“最挑剔”的食客发出邀请，与大董、沈宏非...', 51);
INSERT INTO `idea_event` VALUES (25, 3, '梦里桃源，又见温柔乡', 3, 'nongye1.jpg', '浙江', '无锡', '千里走单骑首个田园度假综合体，在烟烟霞霞的桃林下，有氤氤氲氲的温泉水，一边是当代建筑，一边是田野院落，在看得见的桃花源，我们邀你一同前往。', '2018-01-10 18:14:15', 1, '千里走单骑首个田园度假综合体，在烟烟霞霞的桃林下，有氤氤氲氲的温泉水，一边是当代...', 247);
INSERT INTO `idea_event` VALUES (26, 3, '全球知名的榴莲果园，我们一起做件“泰”甜蜜的事', 3, 'nongye2.jpg', '泰国', '洛神府', '尖竹汶和洛坤府，位于泰国东部和南部，是全球知名的榴莲产地。我在这里包下了1750亩榴莲果园，每一颗榴莲，都是自然熟透，甜蜜悠长。妮果·泰国榴莲，做的就是这样一件甜蜜的事。', '2018-01-10 17:15:47', 1, '尖竹汶和洛坤府，位于泰国东部和南部，是全球知名的榴莲产地。我在这里包下了1750...', 1010);
INSERT INTO `idea_event` VALUES (27, 3, '崀山老树橙，40年橙意不负山丘', 3, 'nongye3.jpg', '浙江', '邵阳', '一方山水间，所有老橙树树龄40年以上。崀（làng）山老树橙源自世界自然遗产地，更受中国国家地理标志保护，通过有机转换认证的自然农法种植，呈现十足的橙味，「营养多、水分足、不留渣」。', '2018-01-10 12:17:50', 1, '一方山水间，所有老橙树树龄40年以上。崀（làng）山老树橙源自世界自然遗产地，...', 348);
INSERT INTO `idea_event` VALUES (28, 3, '我把郊区180000㎡的田地，变成了魔都人的私家菜园子', 3, 'nongye4.jpg', '上海', '上海', '在上海西郊一个百万级客流量的旅游小镇，我们的采摘综合体，集采摘、亲子、新农人聚集平台为一体，实现一二三产融合，引领农旅创业新模式。', '2018-01-09 16:19:14', 1, '在上海西郊一个百万级客流量的旅游小镇，我们的采摘综合体，集采摘、亲子、新农人聚集...', 215);
INSERT INTO `idea_event` VALUES (29, 3, '天山南麓的私家百果园，守着农人等着你', 3, 'nongye5.jpg', '新疆', '阿克苏', '在新疆，每年有大量天然健康的优质水果产出。瓜果的好滋味不计其数，农人的现实生活同样千滋百味。有甜，但更多的是难以言说的苦涩...', '2018-01-09 18:20:06', 1, '在新疆，每年有大量天然健康的优质水果产出。瓜果的好滋味不计其数，农人的现实生活同...', 810);
INSERT INTO `idea_event` VALUES (30, 3, '和马云做邻居，圆你一个法国酒庄梦', 3, 'nongye6.jpg', '法国', '波尔多', '在马云酒庄旁，我实现了个人梦想，但是按我性格，一个人独乐还不如一群人众乐。“共享”，是我在购买法国酒庄时的设想，让更多爱酒人士成为酒庄的主人，随时去自己的酒庄品酒、度假，岂不乐哉。', '2018-01-09 10:21:14', 1, '在马云酒庄旁，我实现了个人梦想，但是按我性格，一个人独乐还不如一群人众乐。“共享...', 643);
INSERT INTO `idea_event` VALUES (31, 3, '丑橘，撵塌果品界的橙色风暴', 3, 'nongye7.jpg', '四川', '成都', '四川丑橘—耙耙柑，北纬30°天府之国的味觉奇迹。生长在一片被山林与河流包围的沃土—蒲江。这里有世世代代耕耘的【蜀农】也有食不尽的甜蜜芬芳。我是陈远林，育好苗种好树采好果，一辈子只想做好一件事。', '2018-01-08 18:22:18', 1, '四川丑橘—耙耙柑，北纬30°天府之国的味觉奇迹。生长在一片被山林与河流包围的沃土...', 758);
INSERT INTO `idea_event` VALUES (32, 3, '饼干中的爱马仕也可以成为你的下午茶', 3, 'nongye8.jpg', '上海', '上海', '我们用出口级的松茸，经过20多次的配方调试，5000多人的试吃，最终才有了这块不甜腻的松茸饼干。', '2018-01-08 16:23:14', 1, '我们用出口级的松茸，经过20多次的配方调试，5000多人的试吃，最终才有了这块不...', 480);
INSERT INTO `idea_event` VALUES (33, 3, '这个让马云信服的新农人，把中国蔬菜远销迪拜', 3, 'nongye9.jpg', '山东', '青岛', '大家称呼我亚洲的“生菜大王”，因为我的基地生菜年产量30000吨，承包了中国结球生菜市场60％的份额。今年我也是湖畔大学唯一的农业企业家。我想向大家证明：在大时代的激流中，农民也是变革者。', '2018-01-08 07:24:54', 1, '大家称呼我亚洲的“生菜大王”，因为我的基地生菜年产量30000吨，承包了中国结球...', 726);
INSERT INTO `idea_event` VALUES (34, 3, '“沙漠人参”，丝绸之路上的百草之王', 3, 'nongye10.jpg', '新疆', '张掖', '荒漠肉苁蓉，被誉为“沙漠人参”，寄生在梭梭根部的名贵中药材。30年前被列入濒危植物种，如今，我们用科技将成活率提高到90%，发展到5000亩，300000株。', '2018-01-06 18:29:33', 1, '荒漠肉苁蓉，被誉为“沙漠人参”，寄生在梭梭根部的名贵中药材。30年前被列入濒危植...', 606);
INSERT INTO `idea_event` VALUES (35, 3, '华朴，中国猕猴桃上市第一股', 3, 'nongye11.jpg', '广西', '广元', '华朴农业打造26000亩标准化、智慧化种植基地，实现规模化全产业链融合发展，3年时间成就一颗估值9亿的红心猕猴桃，走出一条猕猴桃产业变革之路。', '2018-01-06 16:30:28', 1, '华朴农业打造26000亩标准化、智慧化种植基地，实现规模化全产业链融合发展，3年...', 1187);
INSERT INTO `idea_event` VALUES (36, 3, '天山脚下自然农耕，用酵素种苹果', 3, 'nongye12.jpg', '新疆', '阿克苏', '天山南麓、雪水灌溉、羊粪育土....这是一颗来自新疆、原汁原味的阿克苏冰糖心苹果，不仅种植上完全遵守自然农耕的法则，还用上了日本高科技——用酵素做栽培。这样的苹果，你不想尝尝吗？', '2018-01-06 18:31:28', 1, '天山南麓、雪水灌溉、羊粪育土....这是一颗来自新疆、原汁原味的阿克苏冰糖心苹果...', 788);
INSERT INTO `idea_event` VALUES (37, 4, '有茶出沫，开一家属于你自己的店', 4, 'xiuxian1.jpg', '浙江', '杭州', '很多人都有开一家店的梦想，有茶出沫通过五年的积累，打造了一个造梦体系，帮你实现创业梦想。', '2018-01-10 18:32:49', 1, '很多人都有开一家店的梦想，有茶出沫通过五年的积累，打造了一个造梦体系，帮你实现创...', 10);
INSERT INTO `idea_event` VALUES (38, 4, '她仅花两年时间，打造了一座上万孩子心中的童话城堡', 4, 'xiuxian2.jpg', '浙江', '温州', '释放孩子的天性也解放父母。我在城市繁华地带打造了一座童话城堡，它是装满潮服童品的宝宝衣橱，是上万孩子们梦想中的游戏王国。10000多位辣妈倾情推荐集购物、玩乐、生活服务于一体的一站式网红亲子综合空间。', '2018-01-10 15:33:46', 1, '释放孩子的天性也解放父母。我在城市繁华地带打造了一座童话城堡，它是装满潮服童品的...', 136);
INSERT INTO `idea_event` VALUES (39, 4, '如果你想，就能把目之所及的山川湖海，穿在身上', 4, 'xiuxian3.jpg', '浙江', '杭州', '我们的言茶女装品牌，创新的不仅是款式，更是面料。让你把飞鸟掠过湖海，雪山在阳光下消融的景色穿在身上。', '2018-01-10 09:34:42', 1, '我们的言茶女装品牌，创新的不仅是款式，更是面料。让你把飞鸟掠过湖海，雪山在阳光下...', 359);
INSERT INTO `idea_event` VALUES (40, 4, '56个主题空间，打开酷姿KTV的3D梦境', 4, 'xiuxian4.jpg', '山西', '太原', '全世界都在催你快点，酷姿希望你快乐一点。主题式品牌KTV，56个房间创新设计施工，酷姿用三维立体空间，在喧哗的都市打造一处梦境入口。', '2018-01-09 18:35:53', 1, '全世界都在催你快点，酷姿希望你快乐一点。主题式品牌KTV，56个房间创新设计施工...', 45);
INSERT INTO `idea_event` VALUES (41, 4, '美日SOOD，挑战24h法拉利红的速度激情！', 4, 'xiuxian5.jpg', '浙江', '宁波', '浙江美日集团旗下单城50家主题健身场馆，约当地80%市场占有率，近20万高粘度会员体系。这次SOOD品牌，带来全智能“便利店式”健身终端，邀你体验赛车摩擦跑道般的热量释放。', '2018-01-09 11:36:34', 1, '浙江美日集团旗下单城50家主题健身场馆，约当地80%市场占有率，近20万高粘度会...', 290);
INSERT INTO `idea_event` VALUES (42, 4, '厦门这家花房很好吃，以花入食，还获得国家专利', 4, 'xiuxian6.jpg', '福建', '厦门', '将鲜花结合美食，融入甜蜜的烘焙和饮品，变为花食。这事情想起来百般美好，做起来却无比艰辛。露斯玫瑰（ROSE&ROSE），有幸为生活增添多一点美好。', '2018-01-09 07:37:37', 1, '将鲜花结合美食，融入甜蜜的烘焙和饮品，变为花食。这事情想起来百般美好，做起来却无...', 508);
INSERT INTO `idea_event` VALUES (43, 4, '我们很清楚，如何帮你开好一家瑜伽馆', 4, 'xiuxian7.jpg', '浙江', '杭州', '静园瑜伽13年，一城内12家直营店，我们期待通过轻量级的城市合伙模式，完成2018年100家，2020年500家，将静园的品牌、经营、管理、师资、资讯、广告、销售、体系贡献给精彩变革中的瑜伽行业。', '2018-01-08 18:39:19', 1, '静园瑜伽13年，一城内12家直营店，我们期待通过轻量级的城市合伙模式，完成201..', 364);
INSERT INTO `idea_event` VALUES (44, 4, '厦门，每一片水泥花砖的诞生', 4, 'xiuxian8.jpg', '福建', '厦门', '见南花，来自厦门的手工水泥花砖品牌，研究并生产销售手工水泥花砖。过去五年里我们团队重建了传统手工水泥花砖的工艺，并持续探索更多的可能。每一片水泥花砖，都是我们用心呈现的美。', '2018-01-08 13:39:58', 1, '见南花，来自厦门的手工水泥花砖品牌，研究并生产销售手工水泥花砖。过去五年里我们团...', 748);
INSERT INTO `idea_event` VALUES (45, 4, '汲度补水护理，给你未来感护肤体验', 4, 'xiuxian9.jpg', '北京', '北京', '白色主调的空间，宛若置身于宁静的外太空，在获得全球空间设计奖项的未来感空间里，让皮肤喝一杯定制特调的“鸡尾酒”，来汲度补水护理中心，满足你对补水体验的最大想象。', '2018-01-08 06:40:36', 1, '白色主调的空间，宛若置身于宁静的外太空，在获得全球空间设计奖项的未来感空间里，让...', 354);
INSERT INTO `idea_event` VALUES (46, 4, '皮具设计的深度体验，一起做造物的国王', 4, 'xiuxian10.jpg', '上海', '上海', '7年，上海，核心商圈，城市匠心依靠无法复刻的设计与强大的课程输出，吸引着魔都每一位皮具体验者，与李宗盛、阿信的咖啡馆、保时捷、玛莎拉蒂、IWC、万科、星巴克等进行着深度合作。', '2018-01-06 18:41:26', 1, '7年，上海，核心商圈，城市匠心依靠无法复刻的设计与强大的课程输出，吸引着魔都每一...', 273);
INSERT INTO `idea_event` VALUES (47, 4, '厦门这家瑜伽馆，跟这个世界握了握手', 4, 'xiuxian11.jpg', '福建', '厦门', '纳达瑜伽，福建省首家全美瑜伽老师培训认证机构，向全国输出了几千名瑜伽专业老师。通过瑜伽修行，我们每个人都可以了解怎么跟自己相处，以及如何与世界握手。', '2018-01-06 14:42:03', 1, '纳达瑜伽，福建省首家全美瑜伽老师培训认证机构，向全国输出了几千名瑜伽专业老师。通...', 174);
INSERT INTO `idea_event` VALUES (48, 4, '颜匠，开启社区美甲店的新时代', 4, 'xiuxian12.jpg', '江苏', '南京', '好的体验，应该让更多的人有机会去尝试。所以，我们用智能颠覆传统的颜匠工场要将社区店开向全中国。', '2018-01-06 08:42:38', 1, '好的体验，应该让更多的人有机会去尝试。所以，我们用智能颠覆传统的颜匠工场要将社区...', 403);
INSERT INTO `idea_event` VALUES (49, 1, '测试项目', 2, 'canyin16.jpg', '南京', '江苏', NULL, '2018-01-10 08:00:00', NULL, '这里是对于测试项目的描述', 3);
INSERT INTO `idea_event` VALUES (50, 2, '用一瓶精酿觉醒，与所有庸碌为敌', 2, 'canyin15.jpg', '苏州', '江苏', NULL, '2018-01-10 10:00:00', NULL, '虽然我们都是小城青年，但是也想为自己发声，呼吁更多独立先锋的新事物来到我们身边。半闲精酿是来自于安徽黄山小城的第一款地方精酿', 5);
INSERT INTO `idea_event` VALUES (51, 3, '在厦门，亚太金奖设计师与不安分的地产商造了一家穿越时空的酒店', 1, 'minsu13.jpg', '厦门', '福建', NULL, '2018-01-11 08:00:00', NULL, '融合东方西方，穿越旧城老巷；蓝山越造就一份极致，只为等你。我希望她不仅是酒店，更是传达美学设计的平台，是一个有温度的舒适港湾。', 56);
INSERT INTO `idea_event` VALUES (52, 3, '测试项目餐饮17', 2, 'canyin17.jpg', '上海', '上海', NULL, '2018-03-10 08:00:00', NULL, '这里是测试项目17的项目描述', 5);
INSERT INTO `idea_event` VALUES (53, 2, '测试餐饮项目18', 2, 'canyin18.jpg', '南京', '江苏', NULL, '2018-03-10 08:00:00', NULL, '这里是测试餐饮项目18', 3);
INSERT INTO `idea_event` VALUES (55, 4, '测试项目餐饮11', 2, 'canyin11.jpg', '杭州', '浙江', NULL, '2018-03-10 08:00:00', NULL, '这里是对测试项目餐饮11的项目描述', 1);
INSERT INTO `idea_event` VALUES (56, 1, '测试项目农业12', 3, 'nongye12.jpg', '厦门', '福建', NULL, '2018-03-10 08:00:00', NULL, '这里是测试项目农业12的项目描述', 3);
INSERT INTO `idea_event` VALUES (79, 1, '餐饮项目19', 2, 'canyin19.jpg', '上海', '上海', NULL, '2018-03-25 08:00:00', NULL, '这里是对餐饮项目19的项目描述', 1);
INSERT INTO `idea_event` VALUES (82, 1, 'aaaa', 3, '20170814selected1@4x.png', NULL, '北京', NULL, '2018-04-22 08:00:00', NULL, 'sdssss', 1);
INSERT INTO `idea_event` VALUES (83, 1, '测试项目', 2, 'canyin7.jpg', '上海', '上海', NULL, '2018-04-22 08:00:00', NULL, '这是一个餐饮的测试项目', 4);
INSERT INTO `idea_event` VALUES (84, 1, '休闲项目测试', 4, '20170904initiaor2.png', '南京', '江苏', NULL, '2018-04-22 08:00:00', NULL, '这是一个休闲项目的测试', 2);
INSERT INTO `idea_event` VALUES (86, 1, '餐饮测试项目', 2, '20170904guarantee3.png', '南京', '江苏', NULL, '2018-04-22 08:00:00', NULL, '这里是餐饮测试项目dd', 3);

-- ----------------------------
-- Table structure for idea_eventtype
-- ----------------------------
DROP TABLE IF EXISTS `idea_eventtype`;
CREATE TABLE `idea_eventtype`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeContent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_eventtype
-- ----------------------------
INSERT INTO `idea_eventtype` VALUES (1, '民宿');
INSERT INTO `idea_eventtype` VALUES (2, '餐饮');
INSERT INTO `idea_eventtype` VALUES (3, '农业');
INSERT INTO `idea_eventtype` VALUES (4, '休闲');

-- ----------------------------
-- Table structure for idea_great
-- ----------------------------
DROP TABLE IF EXISTS `idea_great`;
CREATE TABLE `idea_great`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eventId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_great
-- ----------------------------
INSERT INTO `idea_great` VALUES (51, 1, 1);
INSERT INTO `idea_great` VALUES (52, 86, 1);
INSERT INTO `idea_great` VALUES (55, 84, 1);

-- ----------------------------
-- Table structure for idea_hobby
-- ----------------------------
DROP TABLE IF EXISTS `idea_hobby`;
CREATE TABLE `idea_hobby`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `hobbyContent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '兴趣内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for idea_message
-- ----------------------------
DROP TABLE IF EXISTS `idea_message`;
CREATE TABLE `idea_message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `receiverId` int(11) NULL DEFAULT NULL,
  `sensId` int(11) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sendTime` datetime(0) NULL DEFAULT NULL,
  `stateId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for idea_permission
-- ----------------------------
DROP TABLE IF EXISTS `idea_permission`;
CREATE TABLE `idea_permission`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `permission` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_permission
-- ----------------------------
INSERT INTO `idea_permission` VALUES (1, '09a4280b887b48cb97ff6fcaeb17d599', '/index/readme');
INSERT INTO `idea_permission` VALUES (2, '09a4280b887b48cb97ff6fcaeb17d599', '/index/personalInfo');
INSERT INTO `idea_permission` VALUES (3, '09a4280b887b48cb97ff6fcaeb17d599', '/event/eventList');
INSERT INTO `idea_permission` VALUES (4, '09a4280b887b48cb97ff6fcaeb17d599', '/errorpage/401');
INSERT INTO `idea_permission` VALUES (5, '09a4280b887b48cb97ff6fcaeb17d599', '/errorpage/404');
INSERT INTO `idea_permission` VALUES (6, '09a4280b887b48cb97ff6fcaeb17d599', '/systemSet/permissionsManage');
INSERT INTO `idea_permission` VALUES (7, '09a4280b887b48cb97ff6fcaeb17d599', '/systemSet/loginLog');
INSERT INTO `idea_permission` VALUES (8, '09a4280b887b48cb97ff6fcaeb17d599', '/teamManage/teamList');
INSERT INTO `idea_permission` VALUES (9, '09a4280b887b48cb97ff6fcaeb17d599', '/teamManage/teammateList');
INSERT INTO `idea_permission` VALUES (10, '09a4280b887b48cb97ff6fcaeb17d599', '/news/newsList');
INSERT INTO `idea_permission` VALUES (11, '09a4280b887b48cb97ff6fcaeb17d599', '/comment/commentList');

-- ----------------------------
-- Table structure for idea_question
-- ----------------------------
DROP TABLE IF EXISTS `idea_question`;
CREATE TABLE `idea_question`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teamId` int(11) NULL DEFAULT NULL,
  `questionerId` int(11) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_question
-- ----------------------------
INSERT INTO `idea_question` VALUES (1, 1, 1, '项目什么时候结束', '2018-03-25 09:18:01');
INSERT INTO `idea_question` VALUES (2, 23, 1, '暂无问题', '2018-03-27 10:08:53');
INSERT INTO `idea_question` VALUES (17, 23, 13, 'sssFFFF', '2018-05-03 08:00:00');

-- ----------------------------
-- Table structure for idea_reply
-- ----------------------------
DROP TABLE IF EXISTS `idea_reply`;
CREATE TABLE `idea_reply`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commentId` int(11) NULL DEFAULT NULL,
  `commenterId` int(11) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `commentTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_reply
-- ----------------------------
INSERT INTO `idea_reply` VALUES (1, 11, 13, '这条评论真的好', '2018-05-04 09:05:32');
INSERT INTO `idea_reply` VALUES (3, 11, 13, 'd', '2018-05-04 10:42:52');

-- ----------------------------
-- Table structure for idea_schedule
-- ----------------------------
DROP TABLE IF EXISTS `idea_schedule`;
CREATE TABLE `idea_schedule`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teamId` int(11) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  `workTime` datetime(0) NULL DEFAULT NULL,
  `isSendEmail` tinyint(4) NULL DEFAULT NULL,
  `isSend` tinyint(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_schedule
-- ----------------------------
INSERT INTO `idea_schedule` VALUES (1, 1, '创建了该小组', '2018-03-24 08:16:00', '2018-03-25 09:17:42', 0, 0);
INSERT INTO `idea_schedule` VALUES (2, 23, '小组创建成功', '2018-05-01 10:09:12', '2018-05-04 09:09:16', 0, 0);
INSERT INTO `idea_schedule` VALUES (4, 23, '完成一半任务', '2018-05-04 14:14:01', '2018-05-06 14:14:03', 1, 1);

-- ----------------------------
-- Table structure for idea_team
-- ----------------------------
DROP TABLE IF EXISTS `idea_team`;
CREATE TABLE `idea_team`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `founderId` int(11) NULL DEFAULT NULL,
  `eventId` int(11) NULL DEFAULT NULL,
  `teamName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teammateNumber` int(11) NULL DEFAULT NULL,
  `maxTeammateNumber` int(11) NULL DEFAULT NULL,
  `notice` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  `photoName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_team
-- ----------------------------
INSERT INTO `idea_team` VALUES (1, 1, 1, '15分钟，珠江边上的这座院子带你完成一场小逃离', 1, 10, '这是一个公告', '2018-03-22 10:29:16', 'header2.jpg', NULL);
INSERT INTO `idea_team` VALUES (2, 2, 2, '秀酒店进驻杭州，八位设计大咖携Each助力，十年一剑众星捧月', 1, 10, '这是一个公告', '2018-03-24 08:00:00', 'header2.jpg', '这是秀酒店进驻杭州，八位设计大咖携Each助力，十年一剑众星捧月项目的小组描述');
INSERT INTO `idea_team` VALUES (23, 2, 79, '餐饮项目19', 1, 10, '公告更新完成', '2018-03-25 08:00:00', 'canyin19.jpg', '这里是对餐饮项目19的项目描述');
INSERT INTO `idea_team` VALUES (24, 1, 84, '休闲项目测试', 1, 10, '这是一个公告', '2018-04-22 08:00:00', '20170904initiaor2.png', '这是一个休闲项目的测试');
INSERT INTO `idea_team` VALUES (25, 1, 85, '测试农业项目', 1, 10, '这是一个公告', '2018-04-22 08:00:00', '20170904guarantee2.png', '这是对于农业项目的测试');
INSERT INTO `idea_team` VALUES (26, 1, 86, '餐饮测试项目', 1, 10, '这是一个公告', '2018-04-22 08:00:00', '20170904guarantee3.png', '这里是餐饮测试项目dd');

-- ----------------------------
-- Table structure for idea_teammate
-- ----------------------------
DROP TABLE IF EXISTS `idea_teammate`;
CREATE TABLE `idea_teammate`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teamId` int(11) NOT NULL,
  `teammateId` int(11) NULL DEFAULT NULL,
  `authority` int(11) NULL DEFAULT NULL,
  `duty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_teammate
-- ----------------------------
INSERT INTO `idea_teammate` VALUES (1, 1, 1, 1, '组长');
INSERT INTO `idea_teammate` VALUES (2, 23, 1, 1, '组长');
INSERT INTO `idea_teammate` VALUES (3, 23, 13, 0, '组员');
INSERT INTO `idea_teammate` VALUES (4, 23, 15, 0, '组员');
INSERT INTO `idea_teammate` VALUES (7, 1, 4, 0, '组员');

-- ----------------------------
-- Table structure for idea_user
-- ----------------------------
DROP TABLE IF EXISTS `idea_user`;
CREATE TABLE `idea_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `userToken` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户token',
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email_state_id` int(11) NULL DEFAULT NULL COMMENT '邮箱状态 0-未激活 1-已激活',
  `nike_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `head_photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `area` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在地',
  `specialty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '特长',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人介绍',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea_user
-- ----------------------------
INSERT INTO `idea_user` VALUES (1, 'ebcd0dd2f5cd49c58a488bc5fb1a5be6', '09a4280b887b48cb97ff6fcaeb17d599', '18895356968', '1563274504@qq.com', '12345678', 1, '我的密码是你名字', 22, 'header2.jpg', '上海', '看书', '我来自上海，是一名程序员');
INSERT INTO `idea_user` VALUES (13, 'b97acbbca14846f6913d1c3f607af55a', '81429767274f44d184e2ef25a14774b8', '17621538763', '156327452qq.com', '1234566', 0, '未已', NULL, 'header2.jpg', '杭州', '跑步', '我是一名大学生，即将踏入社会');
INSERT INTO `idea_user` VALUES (15, 'df8f24c92cf64cdaa4fd5063bc27cd51', '154a08f4c8964bc5b46f6a1941306399', '18965784524', '12365478@qq.com', 'admin', 0, 'admin', NULL, 'header2.jpg', '杭州', '跑步', 'ddddd');

SET FOREIGN_KEY_CHECKS = 1;
