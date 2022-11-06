drop database mcq_db;
create database mcq_db;

use mcq_db;

create table Questions(que_no int not null,question varchar(255),answer varchar(255),primary key(que_no));

create table Options( Que_No int  not null auto_increment,Option1 varchar (255),Option2 varchar (255), Option3 varchar (255), Option4 varchar (255),primary  key(Que_No),foreign key (Que_No) references Questions(Que_NO) );
insert into questions(que_no,question, answer)values(1,'Who invented Java Programming ?.','James Gosling');

insert into Options values(1,'Guido van Rossum','James Gosling','Dennis Ritchie','Bjarne Stroustrup');


insert into questions(que_no,question, answer)values(2,'Which component is used to compile, debug and execute the java programs ?.','JDK');
						
insert into Options values(2,'JRE','JIT','JDK','JVM');

insert into questions (que_no,question,answer)values(3,'What is the extension of java code files?.','.java');
insert into Options values (3,'.js', '.txt','.class','.java');
			
			
insert into questions (que_no,question,answer)values(4,'Which component is responsible to run java program?.','JRE');
			  
insert into Options values (4,'JIT', 'JDK','JVM','JRE');
			
insert into questions (que_no,question,answer)values(5,'Which of these is an incorrect array declaration?.','int arr[] = int [5] new');
			  
insert into Options values (5,'int arr[] = new int[5] ', 'int [] arr = new int[5]','int arr[] = new int[5]','int arr[] = int [5] new');
			
			
		    insert into questions (que_no,question,answer)values (6,'Which of these cannot be used for a variable name in Java?.','keyword');
			
			insert into Options values (6,'identifier & keyword', 'identifie','keyword','none of the mentioned');
			
			
			 insert into questions (que_no,question,answer)values (7,'Which of these keywords is used to define interfaces in Java?.','interface');
				
			insert into Options values (7,' intf', 'Intf ','interface','Interface');
				
				

		     insert into questions (que_no,question,answer)values (8,'Which of the following is a superclass of every class in Java?.','Object class');
					
		    insert into Options values (8,'ArrayList', 'Abstract class ','Object class','String');
					

		     insert into questions (que_no,question,answer)values (9,'compareTo() returns.','An int value');
					
		    insert into Options values (9,'True', 'False ','An int value','None');
					

		     insert into questions (que_no,question,answer)values (10,'When is the finaluze() method calles?.','Object class');
					
		    insert into Options values (10,'Before garbage collection', 'Before an object goes out of scope ','Before a variable goes out of scope','None');
            create table Student(id int ,name varchar(255),score int,class varchar(255));
					
		


							
			
			


							
			
			