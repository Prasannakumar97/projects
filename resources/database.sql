CREATE DATABASE IF NOT EXISTS student_db;

USE student_db;

CREATE TABLE IF NOT EXISTS students (
                                        id INT PRIMARY KEY,
                                        name VARCHAR(50),
    age INT,
    grade DOUBLE
    );
