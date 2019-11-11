
--
-- Banco de dados: `dbbuscaemprego`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcurriculum`
--

CREATE TABLE `tbcurriculum` (
  `Id` int(11) NOT NULL,
  `FullName` varchar(70) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Celular` varchar(650) DEFAULT NULL,
  `Nacionalidade` varchar(650) DEFAULT NULL,
  `Presentation` varchar(650) NOT NULL,
  `Idade` int(11) NOT NULL,
  `Objetivo` varchar(650) DEFAULT NULL,
  `Qualifications` varchar(650) DEFAULT 'none'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbcurriculum`
--

INSERT INTO `tbcurriculum` (`Id`, `FullName`, `Email`, `Celular`, `Nacionalidade`, `Presentation`, `Idade`, `Objetivo`, `Qualifications`) VALUES
(21, 'fasd', 'fasd', 'fasd', 'Australiano', 'fasd', 0, 'fasd', 'Analista'),
(22, 'fasd', 'fasd', 'fsad', 'Argentino', 'asdfsadfasdf', 11, 'asdfasdfasdf', 'Analista,Programador'),
(23, 'galicia', 'falero', '123412341234', 'Brasileiro', 'sdfasdfasdf', 0, 'asdfasdfasdf', 'Analista');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbqualification`
--

CREATE TABLE `tbqualification` (
  `Id` int(11) NOT NULL,
  `QualificationName` varchar(5000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbqualification`
--

INSERT INTO `tbqualification` (`Id`, `QualificationName`) VALUES
(1, 'Programador'),
(2, 'Analista');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvaga`
--

CREATE TABLE `tbvaga` (
  `Id` int(11) NOT NULL,
  `Titulo` varchar(650) NOT NULL,
  `Descricao` varchar(1000) NOT NULL,
  `QualificacoesExigidas` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbvaga`
--

INSERT INTO `tbvaga` (`Id`, `Titulo`, `Descricao`, `QualificacoesExigidas`) VALUES
(3, 'gas', 'gasgasgas', 'Analista,Programador'),
(4, 'asdf', 'asdf', 'Programador');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbcurriculum`
--
ALTER TABLE `tbcurriculum`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `tbqualification`
--
ALTER TABLE `tbqualification`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `tbvaga`
--
ALTER TABLE `tbvaga`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbcurriculum`
--
ALTER TABLE `tbcurriculum`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `tbqualification`
--
ALTER TABLE `tbqualification`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `tbvaga`
--
ALTER TABLE `tbvaga`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
