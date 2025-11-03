-- select train_id,train_name 
-- from train_details
-- where train_from="PUNE"
-- and train_to LIKE "M%";

-- select e.empid,l.leave_type,l.total_leave from 
-- employee_info as e 
-- join leave_info as l 
-- on e.empid=l.empid
-- where l.total_leave>10 and 
-- (l.leave_type='Casual_Leave' or l.leave_type='Medical_leave');

select empid,concat(first_name,' ',last_name)
from employee;