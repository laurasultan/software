CREATE TABLE livraria 
( 
 cod_livro INT PRIMARY KEY AUTO_INCREMENT,  
 nome_livro VARCHAR(70) NOT NULL,  
 nome_autor VARCHAR(40) NOT NULL,  
 status VARCHAR(20) NOT NULL  
); 

CREATE TABLE usuario 
( 
 cod_usuario INT PRIMARY KEY AUTO_INCREMENT,  
 nome_usuario VARCHAR(40) NOT NULL,  
 email_usuario VARCHAR(40) NOT NULL UNIQUE,  
 senha VARCHAR(8) NOT NULL,  
 categoria VARCHAR(15),  
 cod_livraria INT
); 

ALTER TABLE usuario ADD FOREIGN KEY (cod_livraria) REFERENCES livraria (cod_livraria)
