-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2022 at 06:23 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinicmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `confirmpassword` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `firstname`, `lastname`, `password`, `confirmpassword`, `code`) VALUES
('admin', 'Jomari', 'Custodio', 'admin', 'admin', 'nurseJoms'),
('rnzdcn', 'Renzo Angelo', 'Decena', 'admin', 'admin', '00000');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(255) NOT NULL,
  `medicinename` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `daterecieved` date NOT NULL,
  `expirationdate` date NOT NULL,
  `description` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `medicinename`, `quantity`, `daterecieved`, `expirationdate`, `description`, `status`) VALUES
(1, 'Neozep (Forte)', 20, '2022-01-20', '2022-01-31', 'For relief of cold and all it\'s\nsymptoms.', 'Available'),
(2, 'Solmux (Advance)', 25, '2022-01-20', '2022-02-02', 'For relief of cough with phegm\nadded immunity', 'Available'),
(3, 'Decolgen (Forte)', 18, '2022-01-11', '2022-01-29', 'A powerful releif against cold\nand sinusitis', 'Available'),
(4, 'Ambroxol (Expel OD)', 25, '2022-01-14', '2022-02-28', 'For Cough with phlegm', 'Available'),
(5, 'Ambroxol (Myracof)', 50, '2022-01-17', '2022-03-30', 'For relief of cough with phlegm', 'Available'),
(6, 'Aztreonam (Aztreo)', 23, '2022-01-19', '2022-04-27', 'For releif of stomach aches', 'Available'),
(7, 'Buscopan', 69, '2022-01-20', '2022-02-01', 'Stomach aches pain reliever', 'Available'),
(8, 'Neozep (Forte)', 0, '2021-11-09', '2022-01-20', 'For relief of cold and all it\'s \nsymptoms', 'Not available'),
(9, 'Loperamide (imodium)', 97, '2022-01-20', '2022-01-29', 'Pain relief for diarrhea', 'Available'),
(10, 'Bismuth Subsalicylate (Pepto-Bismul)', 25, '2022-01-18', '2022-04-04', 'Pain relief for diarrhea', 'Available'),
(11, 'Ibuprofen (Advil)', 46, '2022-01-21', '2022-01-31', 'Pain reliever for head aches', 'Available'),
(12, 'Alerta (Loratadine)', 98, '2022-01-20', '2022-04-20', 'Stop recurrent sneezing, runny\nnose, cough and itching', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `studentid` int(250) NOT NULL,
  `firstname` varchar(250) NOT NULL,
  `lastname` varchar(250) NOT NULL,
  `middlename` varchar(250) NOT NULL,
  `age` int(250) NOT NULL,
  `gender` varchar(250) NOT NULL,
  `date` date NOT NULL,
  `contactnumber` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `bednumber` int(255) NOT NULL,
  `sick` varchar(250) NOT NULL,
  `guardiannumber` varchar(255) NOT NULL,
  `studcourse` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`studentid`, `firstname`, `lastname`, `middlename`, `age`, `gender`, `date`, `contactnumber`, `time`, `bednumber`, `sick`, `guardiannumber`, `studcourse`) VALUES
(2015011188, 'Jhon Carlos', 'Carle', 'Costuna', 25, 'MALE', '2022-01-20', '09956847536', '10:51:19 PM', 1, 'Allergy', '09357896541', 'BSIT'),
(201701612, 'Angelica', 'Eyon', 'Roa', 24, 'FEMALE', '2022-01-20', '09364521862', '10:52:48 PM', 2, 'Flu', '09147563269', 'BSIT'),
(201602033, 'Reuel Lean Bert', 'Santos', 'Silverio', 23, 'MALE', '2022-01-20', '09456123884', '10:54:15 PM', 2, 'Flu', '09324556999', 'BSCS'),
(201701554, 'Ronaline', 'Lorenzo', 'Punzalan', 23, 'FEMALE', '2022-01-20', '09556887452', '10:57:22 PM', 1, 'Cold', '09785564899', 'BSIT'),
(201701335, 'Tom Russell', 'Cruz', 'Ford', 23, 'MALE', '2022-01-20', '09666529994', '11:00:57 PM', 2, 'Headache', '09123456987', 'BSBM'),
(201602088, 'Rama Krsna Dasi', 'Yu', 'Pantoja', 22, 'FEMALE', '2022-01-20', '09458657236', '11:02:33 PM', 1, 'Stomachache', '09789456321', 'BSIT'),
(201501223, 'Adrian Nyel', 'Manreza', 'Alberto', 24, 'MALE', '2022-01-20', '09654998751', '11:03:56 PM', 2, 'Headache', '09123365554', 'BSIT'),
(201701608, 'Jhonafe', 'Macaspac', 'Tanjusay', 24, 'FEMALE', '2022-01-20', '09369854425', '11:05:30 PM', 1, 'Diarrhea', '09784569885', 'BSTM'),
(201701618, 'Decierenze', 'Aguilo', 'Sixto', 23, 'MALE', '2022-01-20', '09195667589', '11:08:39 PM', 2, 'Flu', '09657859445', 'BSE'),
(201702045, 'Darius', 'Chua', 'Santos', 23, 'MALE', '2022-01-20', '09759458613', '11:10:01 PM', 1, 'Allergy', '09756954812', 'BSIT'),
(201601525, 'John Roman ', 'Del Rosario', 'Rondo', 23, 'MALE', '2022-01-20', '09956324556', '11:52:03 PM', 2, 'Flu', '09224569985', 'BECE'),
(201701683, 'John Ronmar', 'Toledo', 'Sarmiento', 24, 'MALE', '2022-01-20', '09756636895', '11:53:10 PM', 1, 'Stomachache', '09685745693', 'BSTM'),
(201701061, 'Maria Joshua', 'Melendrez', 'Paglinawan', 24, 'FEMALE', '2022-01-20', '09368569954', '11:54:32 PM', 1, 'Cold', '09768645671', 'BSBM'),
(1009799, 'Jerome', 'Tulisana', 'Salamanca', 23, 'MALE', '2022-01-20', '09658756425', '11:55:37 PM', 1, 'Cold', '09876559481', 'Visitor'),
(201701607, 'Zeus Jandel', 'Macaspac', 'Montes', 25, 'MALE', '2022-01-20', '09456987123', '11:59:46 PM', 1, 'Diarrhea', '09876594814', 'BSIT'),
(201701539, 'Francis', 'Cariño', 'Enfanta', 24, 'MALE', '2022-01-21', '09123665879', '12:03:18 AM', 1, 'Flu', '09758896543', 'BSBM'),
(201901555, 'Adrian Philip', 'Cortez', 'Mike', 32, 'MALE', '2022-01-21', '09785663652', '12:05:06 AM', 2, 'Allergy', '09356875456', 'Employee'),
(201702003, 'Rajesh Kumar', 'Cholia', 'General', 24, 'MALE', '2022-01-21', '09658654256', '12:06:53 AM', 2, 'Headache', '09635244589', 'BSCS'),
(201701603, 'Ciara Rose', 'Dela Masa', 'Dapitan', 23, 'FEMALE', '2022-01-21', '09653584563', '12:09:11 AM', 1, 'Headache', '09785665458', 'BSIT'),
(201602086, 'Jan Allan', 'Bacongan', 'Aquino', 25, 'MALE', '2022-01-21', '09758966351', '12:12:16 AM', 2, 'Flu', '09785596535', 'BSTM'),
(201701514, 'Ariane', 'Dela Rosa', 'Atayde', 23, 'FEMALE', '2022-01-21', '09856636954', '12:13:35 AM', 2, 'Cold', '09755698563', 'BSCS'),
(201701381, 'Princess Diana', 'Galgadot', 'Love', 25, 'FEMALE', '2022-01-21', '09758655954', '12:15:01 AM', 1, 'Headache', '09755945481', 'BSIT');

-- --------------------------------------------------------

--
-- Table structure for table `studentmedicine`
--

CREATE TABLE `studentmedicine` (
  `studreportno` int(11) NOT NULL,
  `studentid` int(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(255) NOT NULL,
  `medicine` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentmedicine`
--

INSERT INTO `studentmedicine` (`studreportno`, `studentid`, `firstname`, `lastname`, `date`, `time`, `medicine`, `description`, `quantity`) VALUES
(1, 2015011188, 'Jhon Carlos', 'Carle', '2022-01-20', '10:44:18 PM', 'Alerta (Loratadine)', 'Allergy	', 2),
(2, 201701784, 'Jayson', 'Baluyot', '2022-01-21', '12:21:01 AM', 'Neozep (Forte)', 'Have cold', 1),
(3, 201502183, 'Ronald Alan', 'Garcia', '2022-01-21', '12:27:21 AM', 'Aztreonam (Aztreo)', 'Have  stomachache	', 2),
(4, 201701517, 'Mark', 'Talon', '2022-01-21', '12:36:08 AM', 'Loperamide (imodium)', 'Suffering from diarrhea', 3),
(5, 201701165, 'Dyesebel', 'Jardin', '2022-01-21', '12:42:16 AM', 'Ibuprofen (Advil)', 'Have headache	', 4),
(6, 201701206, 'Caspil', 'Zeus', '2022-01-21', '12:45:50 AM', 'Decolgen (Forte)', 'Have cold	', 2),
(7, 201602445, 'Airon Paul', 'Murillo', '2022-01-21', '12:49:45 AM', 'Buscopan', 'Pain reliever for stomachache', 6);

-- --------------------------------------------------------

--
-- Table structure for table `zeroquantity`
--

CREATE TABLE `zeroquantity` (
  `id` int(255) NOT NULL,
  `medicinename` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `daterecieved` date NOT NULL,
  `expirationdate` date NOT NULL,
  `description` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `zeroquantity`
--
ALTER TABLE `zeroquantity`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
