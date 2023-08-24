create table patients(
	P_Id integer primary key auto_increment,
	P_name varchar(45) not null,
	P_age integer not null,
	P_sex varchar(1),
	P_dob date,
	P_address varchar(50)
);

CREATE TABLE doctors (
    D_Id INTEGER PRIMARY KEY AUTO_INCREMENT,
    D_name VARCHAR(45) NOT NULL,
    D_dob DATE NOT NULL,
    D_qualification VARCHAR(12) NOT NULL,
    P_Id INTEGER NOT NULL,
    FOREIGN KEY (P_Id) REFERENCES patients(P_Id) ON DELETE CASCADE
);