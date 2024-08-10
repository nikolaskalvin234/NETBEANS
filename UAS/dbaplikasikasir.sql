-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Jun 2022 pada 04.51
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbaplikasikasir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbregistrasi`
--

CREATE TABLE `tbregistrasi` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbregistrasi`
--

INSERT INTO `tbregistrasi` (`username`, `password`, `nama`) VALUES
('alinda', 'sandi', 'alinda'),
('dgshdg', '123', 'dgshdgf'),
('fandi', '12345', 'fandi'),
('gilang', 'sandi', 'gilang w'),
('handika', 'griya', 'handi'),
('sdggfh', '123', 'sdggfhs');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_kasir`
--

CREATE TABLE `tb_kasir` (
  `Id` int(30) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Namabarang` varchar(50) NOT NULL,
  `Hargabarang` varchar(50) NOT NULL,
  `Jumlahbeli` varchar(50) NOT NULL,
  `Jumlahharga` varchar(50) NOT NULL,
  `Jumlahbayar` varchar(50) NOT NULL,
  `Jumlahkembalian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_kasir`
--

INSERT INTO `tb_kasir` (`Id`, `Nama`, `Namabarang`, `Hargabarang`, `Jumlahbeli`, `Jumlahharga`, `Jumlahbayar`, `Jumlahkembalian`) VALUES
(1, 'Ari', 'Flashdisk', '200000.0', '2', '400000.0', '500000', '100000.0'),
(3, 'Gian', 'Mouse', '300000.0', '1', '300000.0', '300000', '0.0'),
(4, 'Dian', 'Keyboard', '350000.0', '1', '350000.0', '390000.0', '40000.0'),
(5, 'Jason', 'Mouse', '300000.0', '1', '300000.0', '400000', '100000.0'),
(6, 'Mouse', 'Hanis', '300000.0', '1', '300000.0', '500000.0', '200000.0'),
(7, 'Modem', 'Andri', '250000.0', '1', '250000.0', '400000.0', '150000.0'),
(9, 'Music Box', 'Handi', '400000.0', '1', '400000.0', '600000', '200000.0');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbregistrasi`
--
ALTER TABLE `tbregistrasi`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `tb_kasir`
--
ALTER TABLE `tb_kasir`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_kasir`
--
ALTER TABLE `tb_kasir`
  MODIFY `Id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
