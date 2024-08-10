-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Jun 2022 pada 12.29
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
-- Database: `dbdatasenin`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbdatasenin`
--

CREATE TABLE `tbdatasenin` (
  `Id` int(30) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Telepon` varchar(50) NOT NULL,
  `Handphone` varchar(50) NOT NULL,
  `Prodi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbdatasenin`
--

INSERT INTO `tbdatasenin` (`Id`, `Nama`, `Alamat`, `Telepon`, `Handphone`, `Prodi`) VALUES
(1, 'SANDI', 'JAKARTA', '087798798', '076788567', 'SI'),
(2, 'ANDRI T', 'JAKARTA', '067987876', '088776585', 'SI'),
(3, 'SISIL', 'SURABAYA', '08798689876898', '0986989769878', 'SIPIL');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblogin`
--

CREATE TABLE `tblogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblogin`
--

INSERT INTO `tblogin` (`username`, `password`, `nama`) VALUES
('Andhika', '12345', 'Andhika'),
('dhani', 'griya', 'dhani'),
('sandi', '12345', 'sandi');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbdatasenin`
--
ALTER TABLE `tbdatasenin`
  ADD PRIMARY KEY (`Id`);

--
-- Indeks untuk tabel `tblogin`
--
ALTER TABLE `tblogin`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbdatasenin`
--
ALTER TABLE `tbdatasenin`
  MODIFY `Id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
