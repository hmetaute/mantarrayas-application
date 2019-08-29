CREATE TABLE club_members
(id uuid PRIMARY KEY,
 first_name VARCHAR(40),
 last_name VARCHAR(40),
 personal_id_type VARCHAR(10),
 personal_id_number VARCHAR(30),
 home_address VARCHAR(100),
 date_of_birth DATE,
 email VARCHAR(30),
 health_insurance_provider VARCHAR(30),   
 admin BOOLEAN,
 last_login TIMESTAMP,
 is_active BOOLEAN,
 pass VARCHAR(300));
--;;
CREATE TABLE training_sessions
(id uuid PRIMARY KEY,
session_start TIMESTAMP,
session_end TIMESTAMP,
duration INTEGER,
type VARCHAR(100),
observations TEXT);
--;;
CREATE TABLE session_attendance
(id uuid PRIMARY KEY,
member_id uuid references club_members(id),
session_id uuid references training_sessions(id),
observations TEXT);
