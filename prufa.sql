DROP TABLE IF EXISTS "FlightsTable";

CREATE TABLE "FlightsTable" (
  id SERIAL PRIMARY KEY,
  From varchar(255),
  To varchar(255),
  Date varchar(255),
  Price varchar(100) default NULL,
  FlightId TEXT default NULL,
  Arrive varchar(255),
  Departure varchar(255),
  CostumersId integer NULL,
  Airport varchar(255) default NULL
);

INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Reykjavík','Akureyri','2016-01-28 09:13:14','26.691kr.','tellus.','2016-07-09 00:30:56','2015-03-29 03:53:11',1,'Reykjavíkurflugvöllur'),('Höfn','Seyðisfjörður','2016-10-27 05:53:41','11.870kr.','accumsan','2016-09-12 21:41:23','2016-06-03 02:07:24',101,'Hafnarflugvöllur'),('Selfoss','Sauðárkrókur','2016-06-07 09:46:51','48.551kr.','purus','2016-06-07 10:10:26','2016-08-16 12:42:36',4001,'Selfossflugvöllur'),('Egilsstaðir','Höfn','2015-04-05 01:00:41','15.757kr.','odio.','2015-12-29 20:46:55','2015-09-19 07:14:31',7001,'Egilstaðaflugvöllur'),('Húsavík','Ólafsfjörður','2017-02-08 21:42:45','29.379kr.','ante.','2016-03-18 20:28:53','2016-03-04 23:23:43',401,'Húsvíkurflugvöllur'),
INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Akureyri','Reykjavík','2016-03-09 23:43:02','34.341kr.','magnis','2015-10-07 07:46:58','2016-11-14 09:46:22',1001,'Akureyrarflugvöllur'),('Seyðisfjörður','Höfn','2016-03-12 00:14:33','19.315kr.','sed','2015-08-13 17:14:30','2016-03-12 10:10:12',1101,'Seyðisfjarðarflugvöllur'),('Sauðárkrókur','Selfoss','2016-05-05 22:12:13','21.406kr.','neque','2015-04-23 14:02:56','2015-04-25 14:23:53',5001,'Sauðárkróksflugvöllur'),('Reykjavík','Vík','2015-03-27 02:45:59','5.268kr.','nunc.','2016-09-10 21:59:56','2016-10-15 20:27:08',8001,'Reykjavíkurflugvöllur'),('Ísafjörður','Húsavík','2016-07-05 10:23:14','26.321kr.','mus.','2016-05-18 00:39:44','2016-01-13 20:50:10',1401,'Isafjarðarflugvöllur),('Reykjavík','Siglufjörður','2016-08-30 04:01:56','13.427kr.','adipiscing,','2017-01-24 21:41:33','2016-06-12 11:51:17',1501,'P.O. Box 773, 891 Sem Rd.'),
INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Vestmannaeyjar','Neskaupsstaður','2015-08-28 06:55:05','19.431kr.','nibh','2015-12-02 08:00:21','2015-10-14 22:37:40',2001,'Vestmannaeyjaflugvöllur'),('Neskaupsstaður','Vestmannaeyjar','2015-11-12 21:46:39','16.876kr.','Quisque','2016-01-21 00:39:42','2015-12-10 04:20:09',3001,'Neskaupsstaðarflugvöllur'),('Höfn','Egilsstaðir','2015-08-14 21:49:34','21.304kr.','cursus','2016-07-16 13:41:29','2015-10-19 12:20:04',6001,'Hafnaflugvöllur'),('Vík','Reykjavík','2015-06-29 01:12:52','13.553kr.','lacus.','2016-12-31 16:43:24','2015-12-13 09:46:32',9001,'Víkurflugvöllur'),('Blönduós','Egilsstaðir','2016-07-27 07:05:59','18.615kr.','tellus','2016-08-26 10:19:38','2016-02-25 06:48:08',2401,'Blönduósflugvöllur'),('Siglufjörður','Ólafsfjörður','2016-08-21 12:37:28','8.117kr.','Integer','2016-11-22 20:50:44','2016-08-08 09:17:35',2501,'Siglufjarðarflugvöllur');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Neskaupsstaður','Vestmannaeyjar','2015-11-12 21:46:39','16.876kr.','Quisque','2016-01-21 00:39:42','2015-12-10 04:20:09',3001,'Neskaupsstaðarflugvöllur'),('Andalo','Santa Fiora','2015-05-01 15:51:24','24.284kr.','Proin','2016-08-25 19:33:14','2015-09-12 02:31:21',3101,'485-7049 Elementum Road'),('Aisemont','Moga','2015-11-24 03:37:16','20.713kr.','consectetuer','2016-04-06 06:05:59','2016-01-27 22:41:14',3201,'5920 Vulputate Av.'),('Zwijnaarde','Sesto Campano','2015-05-30 19:06:48','12.784kr.','lacinia','2015-10-19 13:10:42','2016-02-08 15:45:40',3301,'P.O. Box 442, 4521 Dignissim Road'),('Mont-de-Marsan','Sint-Pieters-Woluwe','2017-02-24 11:52:43','27.713kr.','neque.','2016-08-09 01:59:44','2016-06-25 07:47:31',3401,'P.O. Box 353, 1731 Commodo Av.'),('Korneuburg','Junagadh','2015-08-14 03:40:44','32.128kr.','cursus','2016-08-18 14:09:21','2016-03-07 16:57:50',3501,'Ap #108-5101 Nulla. Ave'),('María Elena','Argyle','2015-09-28 19:22:17','28.959kr.','magna.','2017-01-04 06:49:12','2015-07-11 14:26:44',3601,'Ap #810-5273 Elementum Ave'),('Pierrefonds','Wichita','2016-10-31 16:43:07','26.872kr.','cursus','2016-12-11 17:05:31','2017-02-14 13:35:01',3701,'P.O. Box 792, 8322 Aenean Road'),('Orsara di Puglia','Subiaco','2016-11-03 23:20:36','42.027kr.','ullamcorper','2015-04-13 00:10:33','2015-06-16 23:06:39',3801,'589-1003 Nibh Av.'),('Castelmarte','Hamilton','2016-01-29 10:14:54','48.473kr.','varius.','2015-10-25 11:41:55','2015-10-07 16:14:03',3901,'Ap #836-6287 Tincidunt St.');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Selfoss','Sauðárkrókur','2016-06-07 09:46:51','48.551kr.','purus','2016-06-07 10:10:26','2016-08-16 12:42:36',4001,'Selfossflugvöllur'),('Roosbeek','Deurne','2015-11-25 06:11:13','46.554kr.','Nunc','2017-01-27 16:39:53','2016-02-17 07:07:55',4101,'743-5066 Sagittis Av.'),('Merksem','Vucht','2015-09-06 16:33:02','25.203kr.','Duis','2015-03-12 20:43:44','2015-10-01 18:47:58',4201,'P.O. Box 571, 110 Imperdiet Rd.'),('Helena','Cardiff','2015-07-06 17:31:48','49.120kr.','Nunc','2015-11-18 10:59:40','2015-05-30 02:27:10',4301,'1149 Nec, Road'),('Port Alice','Juiz de Fora','2017-01-05 00:24:36','36.935kr.','amet,','2015-03-30 00:33:34','2016-05-13 00:56:38',4401,'Ap #785-5905 Tristique Road'),('Sibret','Dorval','2015-06-10 08:55:51','8.301kr.','Mauris','2016-03-21 17:36:29','2016-03-22 16:37:04',4501,'8388 Eu, St.'),('Santo Domingo','Whitchurch-Stouffville','2015-08-02 20:07:45','28.111kr.','at,','2015-09-28 03:07:01','2017-02-16 19:08:06',4601,'P.O. Box 577, 5902 Egestas. Avenue'),('Caledon','Pozo Almonte','2016-05-27 11:00:58','18.650kr.','a,','2015-08-27 01:25:09','2015-06-28 12:51:38',4701,'497-9536 Dolor Ave'),('Pike Creek','Mora','2015-12-02 18:55:12','35.598kr.','molestie','2016-01-23 17:29:31','2016-08-18 23:55:02',4801,'4140 Vestibulum Road'),('Bhuj','Suruç','2016-07-25 15:41:00','15.218kr.','ultrices.','2016-09-26 16:33:12','2016-05-07 00:15:36',4901,'285-3169 Eu, Street');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Sauðárkrókur','Selfoss','2016-05-05 22:12:13','21.406kr.','neque','2015-04-23 14:02:56','2015-04-25 14:23:53',5001,'Sauðárkróksflugvöllur'),('Bonavista','Berbroek','2015-10-21 08:18:12','6.626kr.','faucibus','2015-11-11 23:40:45','2016-10-01 13:50:38',5101,'P.O. Box 605, 6013 Nunc Ave'),('Grand Rapids','East Kilbride','2016-01-13 00:50:31','42.384kr.','nec,','2017-02-13 08:55:16','2015-10-30 23:49:08',5201,'9705 Ut Rd.'),('Filadelfia','Pointe-aux-Trembles','2016-02-15 22:59:02','27.709kr.','dolor','2016-04-10 06:55:50','2015-04-20 20:09:02',5301,'P.O. Box 532, 7267 Scelerisque Rd.'),('Edmundston','Matamata','2015-05-17 19:30:58','38.180kr.','Morbi','2015-07-08 22:42:41','2015-04-18 17:55:04',5401,'Ap #916-8398 Nulla Rd.'),('Agra','Saint Paul','2016-03-25 23:03:16','47.752kr.','nec,','2015-05-04 03:39:32','2015-03-12 05:09:15',5501,'P.O. Box 595, 4962 Penatibus Avenue'),('Saint-Jean-Geest','Aalst','2016-07-20 20:55:44','15.660kr.','vitae','2016-09-16 20:33:20','2017-02-20 04:05:55',5601,'Ap #897-1699 Blandit. St.'),('Bathurst','Candela','2016-08-05 01:27:21','35.468kr.','ligula.','2015-12-22 22:47:53','2015-11-03 20:21:06',5701,'P.O. Box 684, 7471 Torquent Rd.'),('Lakeshore','Klabbeek','2016-07-22 23:39:19','32.573kr.','mi','2017-02-02 15:44:04','2015-06-09 10:22:46',5801,'Ap #588-6820 Sapien, Street'),('Ribeirão das Neves','Curon Venosta/Graun im Vinschgau','2016-05-22 22:46:16','44.206kr.','egestas','2015-08-07 20:55:43','2016-05-25 18:40:24',5901,'624-5199 Ornare Avenue');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Höfn','Egilsstaðir','2015-08-14 21:49:34','21.304kr.','cursus','2016-07-16 13:41:29','2015-10-19 12:20:04',6001,'Hafnaflugvöllur'),('Laives/Leifers','Tropea','2016-10-14 13:15:53','30.406kr.','libero','2015-07-08 03:43:26','2015-07-26 16:54:55',6101,'280 Quam, Street'),('Jonesboro','Mount Pearl','2016-07-22 12:41:45','49.946kr.','non,','2016-02-24 13:56:36','2015-12-08 10:38:17',6201,'271-4385 Eu Rd.'),('Milestone','Camporotondo di Fiastrone','2016-12-26 15:12:42','18.808kr.','tellus','2015-10-16 16:40:44','2015-03-29 19:05:01',6301,'896-4568 Tellus Av.'),('Curon Venosta/Graun im Vinschgau','Montgomery','2015-12-06 19:13:38','49.675kr.','torquent','2016-02-24 14:17:29','2015-07-16 12:19:29',6401,'P.O. Box 998, 4657 Leo Avenue'),('Pictou','Kuşadası','2016-06-15 23:14:41','19.371kr.','Morbi','2017-02-05 21:27:00','2015-03-28 22:38:26',6501,'Ap #108-5531 Nunc Avenue'),('Birkenhead','Nakusp','2016-01-22 05:01:35','13.441kr.','tellus.','2015-05-17 16:29:07','2016-06-25 14:15:45',6601,'Ap #100-8426 Tincidunt, Road'),('Zwevegem','Warrnambool','2015-09-04 18:52:13','12.529kr.','sit','2016-07-08 17:17:12','2015-03-28 14:59:17',6701,'P.O. Box 261, 8653 Nec St.'),('New Maryland','Mödling','2016-11-21 22:27:24','11.530kr.','Fusce','2016-12-16 07:40:03','2016-06-27 07:10:21',6801,'P.O. Box 147, 4715 Senectus Ave'),('Carapicuíba','Pathankot','2017-03-04 11:54:19','40.764kr.','tincidunt,','2015-03-11 23:03:11','2017-01-29 05:00:56',6901,'Ap #288-6111 Massa Rd.');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Egilsstaðir','Höfn','2015-04-05 01:00:41','15.757kr.','odio.','2015-12-29 20:46:55','2015-09-19 07:14:31',7001,'Egilstaðaflugvöllur'),('Heppignies','Norrköping','2015-06-15 19:09:52','30.129kr.','semper,','2016-09-01 07:02:49','2015-05-15 01:10:41',7101,'466-9600 Vestibulum St.'),('Heredia','Haut-Ittre','2016-11-08 08:12:34','42.358kr.','vitae','2016-03-23 07:15:25','2016-05-05 11:51:13',7201,'832-9017 Lacus. Road'),('Naro','Estevan','2016-01-19 03:39:14','33.219kr.','a','2015-06-24 11:37:23','2016-06-01 18:51:44',7301,'3553 Tristique Rd.'),('Adoni','Cagnes-sur-Mer','2015-08-26 23:38:47','41.707kr.','eros','2015-09-13 10:41:49','2015-06-10 13:02:49',7401,'Ap #572-9155 Nulla Street'),('Chiusa/Klausen','Valcourt','2016-02-02 22:48:48','14.043kr.','Pellentesque','2015-05-09 03:58:15','2015-06-30 06:23:38',7501,'P.O. Box 447, 1746 Adipiscing, Road'),('Mal','Ettelgem','2015-06-17 04:11:10','7.601kr.','convallis','2015-06-26 02:57:32','2015-10-24 04:04:23',7601,'Ap #458-5077 Suspendisse Road'),('Colomiers','Cholchol','2017-01-18 08:42:37','37.246kr.','Cum','2016-10-07 18:13:52','2017-02-27 13:20:50',7701,'Ap #562-5458 Id, Av.'),('Redruth','Meise','2015-03-22 03:53:01','18.695kr.','mattis','2016-11-24 18:24:43','2017-02-04 23:57:59',7801,'P.O. Box 241, 8619 Lobortis Street'),('Genk','Cannes','2016-04-13 22:37:57','48.409kr.','amet,','2015-06-15 22:58:00','2016-11-01 05:43:40',7901,'Ap #718-2331 In Avenue');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Reykjavík','Vík','2015-03-27 02:45:59','5.268kr.','nunc.','2016-09-10 21:59:56','2016-10-15 20:27:08',8001,'Reykjavíkurflugvöllur'),('Millport','Aurillac','2016-11-03 14:31:31','10.139kr.','ligula','2016-09-28 22:02:10','2017-03-02 11:24:59',8101,'583-3070 Ut Ave'),('Edmundston','Nerem','2016-07-15 11:08:23','12.641kr.','facilisis','2015-07-20 16:16:01','2016-08-28 14:28:51',8201,'3629 Aliquet St.'),('San Pietro al Tanagro','Gibsons','2016-08-21 02:31:40','30.750kr.','facilisis','2016-03-26 21:47:42','2016-08-05 01:30:28',8301,'664-3642 Ipsum St.'),('Parndorf','Saint John','2015-08-10 08:06:21','18.037kr.','aliquet','2016-06-14 08:56:15','2016-11-30 05:33:28',8401,'5243 Mauris Av.'),('Sioux City','Nadiad','2016-12-09 02:30:23','33.617kr.','Pellentesque','2016-12-06 09:39:37','2015-07-17 01:36:11',8501,'P.O. Box 211, 3982 Non Rd.'),('Porto Cesareo','Vellore','2016-10-31 22:06:36','45.684kr.','pellentesque','2015-10-15 00:29:30','2016-02-29 04:32:33',8601,'Ap #468-3447 Pellentesque Road'),('Montignies-sur-Sambre','Vastogirardi','2016-10-02 08:36:23','41.685kr.','magna','2015-07-02 16:33:06','2016-09-22 18:41:03',8701,'9776 Orci Av.'),('Hoofddorp','Morinville','2016-03-13 21:51:32','48.869kr.','non','2016-02-27 08:56:01','2016-12-14 00:49:44',8801,'Ap #270-3579 Mollis Ave'),('Chiguayante','Merbes-le-Ch‰teau','2016-08-01 11:56:39','28.239kr.','Sed','2015-11-08 06:09:56','2015-09-03 13:16:25',8901,'420-619 Ad Street');
-- INSERT INTO "FlightsTable" (From,To,Date,Price,FlightId,Arrive,Departure,CostumersId,Airport) VALUES ('Vík','Reykjavík','2015-06-29 01:12:52','13.553kr.','lacus.','2016-12-31 16:43:24','2015-12-13 09:46:32',9001,'Víkurflugvöllur'),('Perquenco','LaSalle','2015-05-20 18:37:18','11.519kr.','faucibus.','2016-07-30 06:40:37','2015-03-18 17:04:56',9101,'5802 Non, Av.'),('Calama','Sahiwal','2015-12-13 08:06:04','14.375kr.','vitae','2016-01-07 04:41:54','2016-11-09 16:33:35',9201,'1903 Nunc Rd.'),('Terni','Sapele','2015-06-04 23:12:15','48.970kr.','tempus','2016-01-02 23:17:25','2016-08-11 14:30:45',9301,'P.O. Box 531, 7719 Aliquam Road'),('Newark','Ajax','2015-05-25 14:25:23','47.364kr.','diam.','2016-05-16 01:01:40','2015-06-17 20:06:32',9401,'369-9496 Imperdiet Road'),('Diano Arentino','Kamalia','2016-07-06 04:32:14','26.830kr.','nisi.','2016-12-24 19:49:30','2015-04-17 06:25:09',9501,'P.O. Box 841, 7929 Sed Rd.'),('San Sebastiano al Vesuvio','Northumberland','2016-03-20 12:37:11','44.288kr.','pede','2017-02-12 16:32:04','2017-02-25 00:42:31',9601,'P.O. Box 102, 5352 Tempus, St.'),('Meer','Beerzel','2016-07-02 05:55:29','33.772kr.','dictum','2017-03-03 13:30:13','2017-01-01 23:11:29',9701,'356-8163 Libero Rd.'),('Basirhat','Las Cabras','2016-09-15 00:51:47','28.866kr.','nec,','2015-07-15 07:07:07','2015-08-07 10:42:33',9801,'5993 Lorem. St.'),('Petrópolis','Neuville','2016-10-02 06:08:23','48.040kr.','Integer','2016-07-07 07:42:55','2015-12-30 13:17:47',9901,'P.O. Box 652, 8360 Mauris Rd.');


-- ('Donnas','Viesville','2017-02-24 17:25:22','28.914kr.','vel','2015-08-12 10:35:27','2015-09-02 17:33:18',2901,'Ap #251-7847 Eu Road');
-- ('Orroli','San Diego','2016-01-19 07:21:22','15.888kr.','purus','2016-03-03 17:34:15','2015-03-12 11:16:33',1901,'P.O. Box 257, 5884 Donec Ave');
-- ('Hines Creek','Overland Park','2015-06-14 02:11:57','27.750kr.','dolor','2017-01-31 16:51:11','2015-06-02 20:51:51',901,'Ap #607-9278 Tempus St.');
-- ('Vichte','Ovalle','2015-07-21 09:38:07','11.142kr.','Nullam','2015-03-15 07:03:21','2015-09-30 15:37:47',501,'Ap #142-9685 Ac, Rd.'),('Sitapur','Nieuwerkerken','2016-09-12 20:13:52','48.234kr.','Pellentesque','2015-11-10 05:56:37','2016-06-13 22:08:09',601,'4892 Proin Road'),('Durness','Bergama','2015-03-14 13:14:47','13.206kr.','venenatis','2015-07-22 16:29:06','2016-02-20 22:01:20',701,'P.O. Box 354, 2145 Elit, Rd.'),('Tiruvottiyur','Mont-Sainte-Genevive','2015-04-12 00:06:53','14.506kr.','Duis','2015-05-23 00:15:46','2016-05-20 12:10:02',801,'7852 Porttitor St.'),

-- ('Russell','Frankfurt am Main','2015-04-21 10:44:15','13.576kr.','iaculis','2015-06-16 06:19:46','2016-03-17 00:33:34',1601,'P.O. Box 336, 5324 Sed Av.'),('San Miguel','PiŽtrebais','2015-12-14 13:33:33','49.155kr.','dictum','2015-05-14 14:53:38','2016-07-16 05:38:45',1701,'587-7079 Semper. St.'),('Ligny','Bottidda','2016-08-06 12:59:57','21.653kr.','enim','2016-08-19 00:14:24','2016-01-11 23:51:55',1801,'Ap #906-7351 Dolor. Av.'),
-- ('Leernes','Épinal','2015-05-27 23:00:17','22.346kr.','dui.','2015-03-29 00:57:34','2016-03-04 21:07:51',2601,'Ap #331-7072 Erat St.'),('Bondo','Argenteuil','2016-09-11 02:48:20','13.235kr.','rutrum','2015-07-15 11:37:47','2016-07-04 20:10:31',2701,'508-9442 Ante Avenue'),('Montgomery','Timaru','2015-04-11 03:41:39','40.038kr.','purus','2016-10-16 12:28:49','2015-12-03 17:33:18',2801,'927-7387 Eleifend Rd.'),