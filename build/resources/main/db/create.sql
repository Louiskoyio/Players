SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS heroes (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 age NUMBER,
 special_power VARCHAR,
 weakness VARCHAR,
 squad_id NUMBER,
 overall_rating NUMBER
 );

CREATE TABLE IF NOT EXISTS squads (
  id int PRIMARY KEY auto_increment,
  name VARCHAR,
  objective VARCHAR
);

INSERT INTO squads (name, objective) VALUES ('Messi-Griezmann-Suarez', 'Deliver the UEFA Champions League');
INSERT INTO squads (name, objective) VALUES ('Becker-Matip-Virgil', 'Defend the UEFA Champions League');