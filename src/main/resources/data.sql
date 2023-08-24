
insert into `patients`(`p_id`,`p_name`,`p_age`,`p_sex`,`p_dob`, `p_address`)
values (1,'Prithish', 22, 'M', curdate(), 'skjfklsjk');

insert into `doctors`(`d_id`,`d_name`,`d_dob`,`d_qualification`,`p_id`)
values (1, 'Raju', curdate(), 'Cardiology', 1);