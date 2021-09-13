select * from smartbatchjobui.create_batch_job;
select * from smartbatchjobui.create_batch_job_parameter;

drop table smartbatchjobui.create_batch_job;
drop table smartbatchjobui.create_batch_job_parameter;

create table smartbatchjobui.create_batch_job(
			id int AUTO_increment,
            Batch_Job_Name varchar(25),
            Batch_Job_Description varchar(25),
            Batch_Job_Type varchar(25),
            audit_create_date DATETIME,
			audit_update_date DATETIME,
            primary key (id)
            );

create table smartbatchjobui.create_batch_job_parameter(
			id int AUTO_increment,
            Parameter_Name varchar(50),
			Parameter_Description varchar(25),
			Parameter_Type  varchar(25),
			Parameter_Format  varchar(25),
			Mandatory_Flag Boolean,
			Visible_Flag Boolean,
			Default_Value varchar(25),
			Regex_for_Validation varchar(25),
            audit_create_date DATETIME,
		    audit_update_date DATETIME,
            primary key (id)
            );
            
            