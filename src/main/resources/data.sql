DROP TABLE IF EXISTS posts;
-- Criando a tabela
CREATE TABLE posts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    title VARCHAR (255),
    body VARCHAR (1000)
);