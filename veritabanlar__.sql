-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 01 Haz 2020, 20:10:30
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `veritabanları`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `izleme`
--

CREATE TABLE `izleme` (
  `kullaniciemail` varchar(50) NOT NULL,
  `progid` int(11) NOT NULL,
  `izlemetarih` date NOT NULL,
  `izlemesaat` int(11) NOT NULL,
  `izlemesn` int(11) NOT NULL,
  `izlemedk` int(11) NOT NULL,
  `izlemebolum` int(11) NOT NULL,
  `izlemepuan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `izleme`
--

INSERT INTO `izleme` (`kullaniciemail`, `progid`, `izlemetarih`, `izlemesaat`, `izlemesn`, `izlemedk`, `izlemebolum`, `izlemepuan`) VALUES
('asdf', 2, '2020-05-31', 2, 46, 30, 0, 8),
('asdf', 2, '2020-05-31', 2, 46, 30, 0, 8),
('asdf', 20, '2020-05-31', 0, 4, 0, 0, 4),
('asdf', 6, '2020-05-31', 0, 8, 0, 0, 5),
('asdf', 12, '2020-05-31', 0, 7, 0, 0, 3),
('asdf', 9, '2020-05-31', 0, 4, 0, 0, 4),
('asdf', 8, '2020-05-31', 0, 5, 0, 0, 6);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicitablo`
--

CREATE TABLE `kullanicitablo` (
  `kullaniciadi` varchar(50) NOT NULL,
  `sifre` varchar(50) NOT NULL,
  `kullaniciemail` varchar(50) NOT NULL,
  `dogumtarihi` date NOT NULL,
  `sevdigi1` varchar(50) NOT NULL,
  `sevdigi2` varchar(50) NOT NULL,
  `sevdigi3` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `kullanicitablo`
--

INSERT INTO `kullanicitablo` (`kullaniciadi`, `sifre`, `kullaniciemail`, `dogumtarihi`, `sevdigi1`, `sevdigi2`, `sevdigi3`) VALUES
('aybuke', '', '123', '1998-03-30', 'Komedi', 'Belgesel', 'Aksiyon ve Macera'),
('batu', 'ccc', '1234', '1998-03-29', 'Belgesel', 'Dram', 'Bilim ve Doğa'),
('evren', 'asd', '12345', '1999-11-20', 'Komedi', 'Aksiyon ve Macera', 'Romantik'),
('asd', '123', 'asdf', '1998-02-01', 'Komedi', 'Belgesel', 'Aksiyon ve Macera'),
('Aybuke', '12345', 'aybukeulutas@gmail.com', '1998-03-30', 'Belgesel', 'Dram', 'Bilim ve Doğa');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `program`
--

CREATE TABLE `program` (
  `progid` int(11) NOT NULL,
  `progadi` varchar(50) NOT NULL,
  `tipi` varchar(67) DEFAULT NULL,
  `turu` varchar(50) DEFAULT NULL,
  `puanlama` float NOT NULL,
  `bolumsayisi` int(56) NOT NULL,
  `uzunluk` time NOT NULL,
  `oylamasayisi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `program`
--

INSERT INTO `program` (`progid`, `progadi`, `tipi`, `turu`, `puanlama`, `bolumsayisi`, `uzunluk`, `oylamasayisi`) VALUES
(1, 'Recep İvedik 6', 'Aksiyon ve Macera', 'Film', 6.09205, 1, '00:00:00', 20),
(2, 'Assassın\'s Creed', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6.1829, 1, '00:00:00', 20),
(3, 'Alaca Karanlık', 'Aksiyon ve Macera, Romantik', 'Film', 10, 1, '00:00:00', 21),
(4, 'Yüzüklerin Efendisi İki Kule', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6.09205, 1, '00:00:00', 20),
(5, 'Maske', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 5.89755, 1, '00:00:00', 20),
(6, 'Kara Şövalye', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6.04005, 1, '00:00:00', 20),
(7, 'Sherlock Holmes', 'Aksiyon ve Macera', 'Film', 6.09205, 1, '00:00:00', 20),
(8, 'Yüzüklerin Efendisi kralın Dönüşü', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 5.9931, 1, '00:00:00', 21),
(9, 'Transformers Kayıp Çağ', 'Aksiyon ve Macera', 'Film', 5.47313, 1, '00:00:00', 21),
(10, 'Başlangıç', 'Aksiyon ve Macera', 'Film', 6.04005, 1, '00:00:00', 21),
(11, 'Interstellar', 'Aksiyon ve Macera, Drama', 'Film', 5.89755, 1, '00:00:00', 20),
(12, 'Harry Potter lüm Yadigarları', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar, Çocuk ve Aile', 'Film', 5.65502, 1, '00:00:00', 22),
(13, 'Jurassic World', 'Aksiyon ve Macera', 'Film', 6.09205, 1, '00:00:00', 20),
(14, 'Fantastik Canavarlar', 'Aksiyon ve Macera, Çocuk ve Aile', 'Film', 5.94481, 1, '00:00:00', 20),
(15, 'Ninja Kaplumbağalar', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6.09205, 1, '00:00:00', 20),
(16, 'Kuşlarla Dans', 'Belgesel', 'Film', 6.09205, 1, '00:00:00', 20),
(17, 'Mission Blue', 'Belgesel', 'Film', 6.09205, 1, '00:00:00', 20),
(18, 'Mercan Peşinde', 'Belgesel', 'Film', 5.86265, 1, '00:00:00', 22),
(19, 'Dream Big', 'Belgesel', 'Film', 6.09205, 1, '00:00:00', 20),
(20, 'Ay\'daki Son Adam', 'Belgesel', 'Film', 5.99243, 1, '00:00:00', 20),
(21, 'Plastik Okyanus', 'Belgesel', 'Film', 6.09205, 1, '00:00:00', 20),
(22, 'Rakamlarla Tahmin', 'Belgesel', 'Film', 6.09205, 1, '00:00:00', 20),
(23, 'Ben Efsaneyim', 'Bilim Kurgu ve Fantastik Yapımlar', 'Film', 6.09205, 1, '00:00:00', 20),
(24, 'Arif V 216', 'Bilim Kurgu ve Fantastik Yapımlar, Komedi', 'Film', 6.09205, 1, '00:00:00', 20),
(25, 'pk', 'Bilim Kurgu ve Fantastik Yapımlar, Romantik', 'Film', 6.09205, 1, '00:00:00', 20),
(26, 'Örümcek Adam', 'Aksiyon ve Macera, Bilim Kurgu ve Fantastik Yapımlar', 'Film', 5.99243, 1, '00:00:00', 21),
(27, 'Jurassıc Park', 'Bilim Kurgu ve Fantastik Yapımlar, Aksiyon', 'Film', 6.09205, 1, '00:00:00', 20),
(28, 'Frankestein', 'Bilim Kurgu ve Fantastik Yapımlar, Aksiyon, Korku', 'Film', 6.09205, 1, '00:00:00', 20),
(29, 'Gezegenimiz', 'Belgesel, Bilim ve Doğa', 'Film', 6.09205, 1, '00:00:00', 20),
(30, '72 sevimli hayvan', 'Belgesel, Bilim ve Doğa', 'Film', 6.04005, 1, '00:00:00', 20),
(31, 'Kuşçular', 'Belgesel, Bilim ve Doğa', 'Film', 6.09205, 1, '00:00:00', 20),
(32, 'Marsta Keşif', 'Belgesel, Bilim ve Doğa', 'Film', 6.09205, 1, '00:00:00', 20),
(33, 'Pandemic', 'Belgesel, Bilim ve Doğa', 'Film', 6.09205, 1, '00:00:00', 20),
(34, 'Pokemon', 'Çocuk ve Aile', 'Film', 6.04005, 1, '00:00:00', 20),
(35, 'Şirinler', 'Çocuk ve Aile, Komedi', 'Film', 6.09205, 1, '00:00:00', 20),
(36, 'Charlie\'nin Çikolata Fabrikası', 'Çocuk ve Aile, Komedi', 'Film', 6.09205, 1, '00:00:00', 20),
(37, 'Alvin ve Sincaplar', 'Çocuk ve Aile', 'Film', 6.09205, 1, '00:00:00', 20),
(38, 'Scooby-Doo', 'Çocuk ve Aile', 'Film', 6.09205, 1, '00:00:00', 20),
(39, 'Kung Fu Panda', 'Çocuk ve Aile, Aksiyon ve Macera', 'Film', 6.09205, 1, '00:00:00', 20),
(40, 'Mr. Bean Tatilde', 'Çocuk ve Aile', 'Film', 6.09205, 1, '00:00:00', 20),
(41, 'Shrek', 'Çocuk ve Aile, Komedi', 'Film', 6.09205, 1, '00:00:00', 20),
(42, 'Mega Zeka', 'Çocuk ve Aile, Komedi', 'Film', 6.09205, 1, '00:00:00', 20),
(43, 'Bizi Hatırla', 'Drama', 'Film', 6.09205, 1, '00:00:00', 20),
(44, 'Delibal', 'Drama, Romantik', 'Film', 6.09205, 1, '00:00:00', 20),
(45, 'Kardeşim Benim', 'Drama, Komedi', 'Film', 6.09205, 1, '00:00:00', 20),
(46, 'Dangal', 'Drama', 'Film', 6.09205, 1, '00:00:00', 20),
(47, 'Yerçekimi', 'Bilim Kurgu, Drama', 'Film', 6.09205, 1, '00:00:00', 20),
(48, 'Jaws', 'Gerilim', 'Film', 6.09205, 1, '00:00:00', 20),
(49, 'Da Vinci Şifresi', 'Gerilim', 'Film', 6.09205, 1, '00:00:00', 20),
(50, 'Marwel\' Iron Fist', 'Aksiyon ve Macera', 'Dizi', 6.09205, 5, '00:00:00', 20),
(51, 'Ejderhalar', 'Çocuk ve Aile, Aksiyon ve Macera', 'Dizi', 6.09205, 6, '00:00:00', 20),
(52, 'Diriliş Ertuğrul', 'Aksiyon ve Macera', 'Dizi', 6.09205, 7, '00:00:00', 20),
(53, 'Trol Avcıları: Arcadia Hikayeleri', 'Çocuk ve Aile, Aksiyon ve Macera', 'Dizi', 6.09205, 4, '00:00:00', 20),
(54, 'How I met your mother', 'Romantik', 'Dizi', 6.09205, 3, '00:00:00', 20),
(55, 'Leyla ile Mecnun', 'Romantik', 'Dizi', 6.09205, 7, '00:00:00', 20),
(56, 'Beni Böyle Sev', 'Drama, Romantik', 'Dizi', 6.09205, 8, '00:00:00', 20),
(57, 'Patron Bebek Yine İş başında', 'Çocuk ve Aile, Komedi', 'Dizi', 6.09205, 5, '00:00:00', 20),
(58, 'Atiye', 'Aksiyon ve Macera, Romantik', 'Dizi', 6.09205, 4, '00:00:00', 20),
(59, 'Maşa ve Koca Ayı', 'Çocuk ve Aile', 'Dizi', 6.09205, 7, '00:00:00', 20),
(60, 'Sünger Bob', 'Çocuk ve Aile, Komedi', 'Dizi', 6.09205, 6, '00:00:00', 20),
(61, 'Stranger Tings', 'Aksiyon ve Macera, Korku', 'Dizi', 6.09205, 5, '00:00:00', 20),
(62, 'The Originals', 'Drama, Korku', 'Dizi', 6.09205, 5, '00:00:00', 20),
(63, 'Angry Birds', 'Çocuk ve Aile, Komedi', 'Dizi', 6.09205, 4, '00:00:00', 20),
(64, 'Criminal', 'Gerilim', 'Dizi', 6.09205, 8, '00:00:00', 20),
(65, 'Beyblade', 'Anime, Çocuk ve Aile', 'Dizi', 6.09205, 8, '00:00:00', 20),
(66, 'Sonic X', 'Anime, Aksiyon ve Macera', 'Dizi', 6.09205, 4, '00:00:00', 20),
(67, 'Kung Fu Panda Muhteşem Sırlar', 'Aksiyon ve Macera', 'Dizi', 6.09205, 5, '00:00:00', 20),
(68, 'The Blacklist', 'Aksiyon ve Macera, Gerilim', 'Dizi', 6.09205, 6, '00:00:00', 20),
(69, 'Dünyanın En Sıra Dışı Evleri', 'Reality Program', 'DİZİ', 6.09205, 7, '00:00:00', 20),
(70, 'Car Masters', 'Reality Program', 'DİZİ', 6.09205, 4, '00:00:00', 20),
(71, 'Büyük Tasarımlar', 'Reality Program', 'DİZİ', 5.89755, 8, '00:00:00', 20),
(72, 'Basketball or Nothing', 'Reality Program', 'Tv Show', 6.09205, 8, '00:00:00', 20),
(73, 'The Big Family Cooking', 'Reality Program', 'Tv Show', 6.09205, 6, '00:00:00', 20),
(74, 'Sıradışı Kulübeler', 'Reality Program', 'Tv Show', 6.09205, 6, '00:00:00', 20);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `programturtablo`
--

CREATE TABLE `programturtablo` (
  `progid` int(11) NOT NULL,
  `turid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `programturtablo`
--

INSERT INTO `programturtablo` (`progid`, `turid`) VALUES
(1, 10),
(2, 10),
(2, 5),
(3, 10),
(3, 3),
(4, 10),
(4, 5),
(5, 10),
(5, 5),
(6, 10),
(6, 5),
(7, 10),
(8, 10),
(8, 5),
(9, 10),
(10, 10),
(11, 10),
(11, 2),
(12, 10),
(12, 5),
(12, 8),
(13, 10),
(14, 10),
(14, 8),
(15, 5),
(15, 10),
(16, 9),
(17, 9),
(18, 9),
(19, 9),
(20, 9),
(21, 9),
(22, 9),
(23, 5),
(24, 5),
(24, 1),
(25, 5),
(25, 3),
(26, 5),
(26, 10),
(27, 5),
(27, 10),
(28, 5),
(28, 10),
(28, 12),
(29, 9),
(29, 11),
(30, 9),
(30, 11),
(31, 9),
(31, 11),
(32, 9),
(32, 11),
(33, 11),
(33, 9),
(34, 8),
(35, 8),
(35, 1),
(36, 8),
(36, 1),
(37, 8),
(38, 8),
(39, 8),
(39, 10),
(40, 8),
(41, 1),
(41, 8),
(42, 1),
(42, 8),
(43, 2),
(44, 2),
(44, 3),
(45, 2),
(45, 1),
(46, 2),
(47, 4),
(47, 2),
(48, 6),
(49, 6),
(50, 10),
(51, 8),
(51, 10),
(52, 10),
(53, 8),
(53, 10),
(54, 3),
(55, 3),
(56, 3),
(56, 2),
(57, 8),
(57, 1),
(58, 10),
(58, 3),
(59, 8),
(60, 8),
(60, 1),
(61, 10),
(61, 12),
(62, 2),
(62, 12),
(63, 8),
(63, 1),
(64, 6),
(65, 7),
(65, 8),
(66, 7),
(66, 10),
(67, 10),
(68, 10),
(68, 6),
(69, 13),
(70, 13),
(71, 13),
(72, 13),
(73, 13),
(74, 13);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `turtab`
--

CREATE TABLE `turtab` (
  `turid` int(11) NOT NULL,
  `turad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `turtab`
--

INSERT INTO `turtab` (`turid`, `turad`) VALUES
(1, 'Komedi'),
(2, 'Dram'),
(3, 'Romantik'),
(4, 'Bilim Kurgu'),
(5, 'Bilim Kurgu ve Fantastik'),
(6, 'Gerilim'),
(7, 'Anime'),
(8, 'Çocuk ve Aile'),
(9, 'Belgesel'),
(10, 'Aksiyon ve Macera'),
(11, 'Bilim ve Doğa'),
(12, 'Korku'),
(13, 'Reality Program');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `izleme`
--
ALTER TABLE `izleme`
  ADD KEY `kullaniciemail` (`kullaniciemail`),
  ADD KEY `progid` (`progid`);

--
-- Tablo için indeksler `kullanicitablo`
--
ALTER TABLE `kullanicitablo`
  ADD UNIQUE KEY `kullaniciemail` (`kullaniciemail`);

--
-- Tablo için indeksler `program`
--
ALTER TABLE `program`
  ADD UNIQUE KEY `progid` (`progid`);

--
-- Tablo için indeksler `programturtablo`
--
ALTER TABLE `programturtablo`
  ADD KEY `turid` (`turid`),
  ADD KEY `progid` (`progid`);

--
-- Tablo için indeksler `turtab`
--
ALTER TABLE `turtab`
  ADD UNIQUE KEY `turid` (`turid`);

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `izleme`
--
ALTER TABLE `izleme`
  ADD CONSTRAINT `izleme_ibfk_1` FOREIGN KEY (`kullaniciemail`) REFERENCES `kullanicitablo` (`kullaniciemail`),
  ADD CONSTRAINT `izleme_ibfk_2` FOREIGN KEY (`kullaniciemail`) REFERENCES `kullanicitablo` (`kullaniciemail`),
  ADD CONSTRAINT `izleme_ibfk_3` FOREIGN KEY (`progid`) REFERENCES `program` (`progid`);

--
-- Tablo kısıtlamaları `program`
--
ALTER TABLE `program`
  ADD CONSTRAINT `program_ibfk_1` FOREIGN KEY (`progid`) REFERENCES `programturtablo` (`progid`);

--
-- Tablo kısıtlamaları `programturtablo`
--
ALTER TABLE `programturtablo`
  ADD CONSTRAINT `programturtablo_ibfk_2` FOREIGN KEY (`turid`) REFERENCES `turtab` (`turid`),
  ADD CONSTRAINT `programturtablo_ibfk_3` FOREIGN KEY (`progid`) REFERENCES `program` (`progid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
