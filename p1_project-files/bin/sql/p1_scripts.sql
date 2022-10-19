DROP TABLE IF EXISTS staff;

CREATE TABLE staff (
	staff_id SERIAL PRIMARY KEY,
	staff_fname VARCHAR NOT NULL,
	staff_lname VARCHAR NOT NULL,
	available_reimbursement INTEGER DEFAULT 1000
);

INSERT INTO staff VALUES
(DEFAULT, 'Thema', 'Smith', 1000),
(DEFAULT, 'Oliver', 'Vallez', 1000),
(DEFAULT, 'Aurora', 'Banks', 1000);

SELECT * FROM staff;

--*************************************************************************************

DROP TABLE IF EXISTS reimbursement_type;

CREATE TABLE reimbursement_type (
	reimbursement_id SERIAL PRIMARY KEY,
	reimbursement_type VARCHAR NOT NULL,
	reimbursement_coverage INTEGER
);

INSERT INTO reimbursement_type VALUES
	(DEFAULT, 'University Course', 80),
	(DEFAULT, 'Seminar', 60),
	(DEFAULT, 'Certification Preperation Course', 75),
	(DEFAULT, 'Certification', 100),
	(DEFAULT, 'Technical Training', 90),
	(DEFAULT, 'Other', 30);

INSERT INTO reimbursement_type VALUES
	(DEFAULT, 'None', 0);

SELECT * FROM reimbursement_type;
--*************************************************************************************	
DROP TABLE IF EXISTS grading_format;

CREATE TABLE grading_format (
	gformat_id SERIAL PRIMARY KEY,
	gformat_name VARCHAR NOT NULL
);

INSERT INTO grading_format VALUES
	(DEFAULT, 'Pass/Fail'),
	(DEFAULT, 'Letter Grade'),
	(DEFAULT, 'Other');

SELECT * FROM grading_format;
--*************************************************************************************
DROP TABLE IF EXISTS employee_role;

CREATE TABLE employee_role(
	role_id SERIAL PRIMARY KEY,
	role_name VARCHAR NOT NULL
);

INSERT INTO employee_role VALUES
	(DEFAULT, 'Finance Manager'),
	(DEFAULT, 'Employee');

SELECT * FROM employee_role;
--*************************************************************************************	
DROP TABLE IF EXISTS login;

CREATE TABLE login (
	user_id SERIAL PRIMARY KEY,
	user_name VARCHAR NOT NULL,
	user_pass VARCHAR NOT NULL,
	user_role INTEGER REFERENCES employee_role (role_id),
	user_fname VARCHAR NOT NULL,
	user_lname VARCHAR NOT NULL
);

INSERT INTO login VALUES
	(DEFAULT, 'tsmith2842', 'hawaii100red', 1, 'Thema', 'Smith'),
	(DEFAULT, 'ovallez9452', 'alaska200blue', 2, 'Oliver', 'Vallez'),
	(DEFAULT, 'abanks9004', 'arizona300orange', 2, 'Aurora', 'Banks');

SELECT * FROM login;
	
--*************************************************************************************

DROP TABLE IF EXISTS tuition_reimbursement;

CREATE TABLE tuition_reimbursement (
	request_id SERIAL PRIMARY KEY,
	staff_id INTEGER REFERENCES staff (staff_id),
	request_date DATE,
	event_date DATE,
	event_time VARCHAR NOT NULL,
	event_location VARCHAR NOT NULL,
	event_description VARCHAR NOT NULL,
	event_cost NUMERIC (999,2),
	gformat_id INTEGER REFERENCES grading_format (gformat_id),
	request_type INTEGER REFERENCES reimbursement_type (reimbursement_id),
	justification VARCHAR NOT NULL,
	expected_missed_worktime VARCHAR NOT NULL,
	approvals_already_provided_file VARCHAR NOT NULL,
	approvals_already_provided_event_type INTEGER REFERENCES reimbursement_type (reimbursement_id)
);

INSERT INTO tuition_reimbursement VALUES
	(DEFAULT, 2, '2022-10-10', '2022-11-1', '10 weeks', 'online', 'ECornell Certificate for user experience design', 675.00, 3, 5, 'continuing education for user experience design', 'n/a',  'n/a', 7),
	(DEFAULT, 1, '2022-10-09', '2022-10-15', '7 months', 'online', 'Google Course and certificate on coursera', 399.00, 1, 5, 'continuing education Google UX Design Professional Certificate', 'n/a', 'n/a', 7),
	(DEFAULT, 2, '2022-10-10', '2022-12-18', '7 months', 'online', 'Google Certificate and course on coursera', 399.00, 1, 5, 'course and certifcate relating to UX Design', 'n/a', 'ECornell certificate registration image', 5);
	
SELECT * FROM tuition_reimbursement;