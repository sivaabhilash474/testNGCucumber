CREATE TABLE IF NOT EXISTS TBL_PLAYERS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

 
CREATE TABLE IF NOT EXISTS CITY (  
City_code INT AUTO_INCREMENT  PRIMARY KEY,  
city_name VARCHAR(50) NOT NULL,  
city_pincode INT NOT NULL  
);  