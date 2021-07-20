DROP TABLE IF EXISTS candidato;

CREATE TABLE candidato (
  nome VARCHAR(256) PRIMARY KEY,
  telefone VARCHAR(10) NOT NULL,
  email VARCHAR(20) NOT NULL,
  idade int NOT NULL,
  cidade VARCHAR(20) NOT NULL
);
