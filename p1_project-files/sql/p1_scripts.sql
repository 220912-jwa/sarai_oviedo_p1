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