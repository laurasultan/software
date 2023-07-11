-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Tempo de geração: 11-Jul-2023 às 17:01
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db_presentes`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categorias_tb`
--

CREATE TABLE `categorias_tb` (
  `cod_categoria` int(11) NOT NULL,
  `categoria` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `categorias_tb`
--

INSERT INTO `categorias_tb` (`cod_categoria`, `categoria`) VALUES
(1, 'Eletrodoméstico'),
(2, 'Cama, mesa e banho'),
(3, 'Roupas'),
(4, 'Armas'),
(5, 'Jogos'),
(6, 'Animais');

-- --------------------------------------------------------

--
-- Estrutura da tabela `presentes_tb`
--

CREATE TABLE `presentes_tb` (
  `cod_presente` int(11) NOT NULL,
  `presente` varchar(30) NOT NULL,
  `valor` decimal(8,2) NOT NULL,
  `cor` varchar(15) DEFAULT NULL,
  `medidas` varchar(20) DEFAULT NULL,
  `confirmacao` tinyint(1) DEFAULT NULL,
  `cod_categoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `presentes_tb`
--

INSERT INTO `presentes_tb` (`cod_presente`, `presente`, `valor`, `cor`, `medidas`, `confirmacao`, `cod_categoria`) VALUES
(1, 'Lençol de malha', '24.90', 'Bege', 'King Size', 0, 2),
(2, 'Torradeira', '54.50', 'Prata', '', 0, 1),
(3, 'Refrigerador', '789.89', 'Branco', '2.10m x 0.6m', 0, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categorias_tb`
--
ALTER TABLE `categorias_tb`
  ADD PRIMARY KEY (`cod_categoria`);

--
-- Índices para tabela `presentes_tb`
--
ALTER TABLE `presentes_tb`
  ADD PRIMARY KEY (`cod_presente`),
  ADD KEY `cod_categoria` (`cod_categoria`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categorias_tb`
--
ALTER TABLE `categorias_tb`
  MODIFY `cod_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `presentes_tb`
--
ALTER TABLE `presentes_tb`
  MODIFY `cod_presente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `presentes_tb`
--
ALTER TABLE `presentes_tb`
  ADD CONSTRAINT `presentes_tb_ibfk_1` FOREIGN KEY (`cod_categoria`) REFERENCES `categorias_tb` (`cod_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
