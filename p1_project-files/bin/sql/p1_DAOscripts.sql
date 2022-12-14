SELECT user_name, user_pass, user_role, user_fname, user_lname 
	FROM login l
	WHERE l.user_name = 'tsmith2842';

--*************************************************************************************

SELECT staff.staff_id, 
staff.staff_fname,
staff.staff_lname,
staff.available_reimbursement,
tuition_reimbursement.request_id,
tuition_reimbursement.request_date,
tuition_reimbursement.event_date,
tuition_reimbursement.event_time,
tuition_reimbursement.event_location,
tuition_reimbursement.event_description,
tuition_reimbursement.event_cost,
grading_format.gformat_id,
tuition_reimbursement.request_type,
tuition_reimbursement.justification,
tuition_reimbursement.expected_missed_worktime,
tuition_reimbursement.approvals_already_provided_file,	
tuition_reimbursement.approvals_already_provided_event_type
	FROM tuition_reimbursement
	JOIN staff
	ON tuition_reimbursement.staff_id = staff.staff_id
	JOIN grading_format
	ON tuition_reimbursement.gformat_id = grading_format.gformat_id
	JOIN reimbursement_type
	ON reimbursement_type.reimbursement_id = tuition_reimbursement.request_id
	WHERE tuition_reimbursement.staff_id = 2;
	
--*************************************************************************************	

SELECT staff.staff_id, 
staff.staff_fname,
staff.staff_lname,
staff.available_reimbursement,
tuition_reimbursement.request_id,
tuition_reimbursement.request_date,
tuition_reimbursement.event_date,
tuition_reimbursement.event_time,
tuition_reimbursement.event_location,
tuition_reimbursement.event_description,
tuition_reimbursement.event_cost,
grading_format.gformat_id,
tuition_reimbursement.request_type,
tuition_reimbursement.justification,
tuition_reimbursement.expected_missed_worktime,
tuition_reimbursement.approvals_already_provided_file,	
tuition_reimbursement.approvals_already_provided_event_type
	FROM tuition_reimbursement
	JOIN staff
	ON tuition_reimbursement.staff_id = staff.staff_id
	JOIN grading_format
	ON tuition_reimbursement.gformat_id = grading_format.gformat_id
	JOIN reimbursement_type
	ON reimbursement_type.reimbursement_id = tuition_reimbursement.request_id;
	
--*************************************************************************************

WITH new_request AS (INSERT INTO tuition_reimbursement VALUES ((DEFAULT, 2, '2022-10-18', '2022-12-21', '6 months', 'online', 'Google Certificate and course on coursera', 399.00, 1, 5, 'course and certifcate relating to UX', 'n/a', 'ECornell certificate registration image', 7) RETURNING *)