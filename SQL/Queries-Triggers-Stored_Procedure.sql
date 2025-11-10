/*--------------------------------------- Queries ---------------------------------------*/
select user.name as recruiter_name,user.surname as recruiter_surname,id,salary,count(applies.job_id) as applications from job
inner join recruiter on job.recruiter = recruiter.username
inner join user on recruiter.username = user.username
inner join applies on job.id = applies.job_id
where salary > 1900
group by job.id;

select username,certificates,count(has_degree.cand_usrname) as Ptyxia, avg(has_degree.grade) as M_O from candidate
inner join has_degree on candidate.username = has_degree.cand_usrname
inner join degree on has_degree.degr_title = degree.titlos
group by username
having Ptyxia > 1;


select username,count(applies.cand_usrname) as aitiseis ,avg(job.salary) as Salary_MO  from candidate
inner join applies on candidate.username = applies.cand_usrname
inner join job on applies.job_id = job.id
group by username
having Salary_MO > 1800;

select name as etaireia,job.position as perigrafi,requires.antikeim_title as antikeimeno from etaireia
inner join recruiter on etaireia.AFM = recruiter.firm
inner join job on recruiter.username = job.recruiter
inner join requires on job.id = requires.job_id
where requires.antikeim_title LIKE '%Program%' AND etaireia.city LIKE '%Patra%';

select job.recruiter as recruiters,count(job.recruiter) as jobs , count(interview.interviewID) as interviews,
avg(salary) as Salary_MO from job
inner join recruiter on job.recruiter = recruiter.username
inner join interview on recruiter.username = interview.recruiter_username
group by interview.interviewID
having count(jobs) > 2
order by Salary_MO DESC;

  
/*--------------------------------------- Triggers ---------------------------------------*/
 

set @beforeDelete=0;
set @beforeInseert=0;
SET @insertTime=NOW();

/*****************************************************************************//*for insert*/
/*****************************************************************************//* candidate */
DROP TRIGGER IF EXISTS beforeInsertCandidate;
DELIMITER $
CREATE TRIGGER beforeInsertCandidate BEFORE INSERT ON candidate
FOR EACH ROW
BEGIN 
  DECLARE lastUser varchar(12);
  SELECT COUNT(username) INTO @beforeInseert FROM candidate; /*count the rows of array -> @beforeInseert*/
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  SET @insertTime=NOW();
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'candidate','No','INSERT',@insertTime);
END$
DELIMITER ;   

DROP TRIGGER IF EXISTS historyInsertCandidate;
DELIMITER $
CREATE TRIGGER historyInsertCandidate AFTER INSERT ON candidate
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT COUNT(username) INTO AFT FROM candidate;   /*count the rows of array -> AFT*/

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  IF (AFT - @beforeInseert>0) THEN                                                       /*if insert == true*/
    UPDATE history set success =  'YES' WHERE event_date =@insertTime;
  END IF;

END$
DELIMITER ;

/*----------------------------------------------------------------------------*//* recruiter */

DROP TRIGGER IF EXISTS beforeInsertRecruiter;
DELIMITER $
CREATE TRIGGER beforeInsertRecruiter BEFORE INSERT ON recruiter
FOR EACH ROW
BEGIN 
  DECLARE lastUser varchar(12);
  SELECT COUNT(username) INTO @beforeInseert FROM recruiter; /*count the rows of array -> @beforeInseert*/
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  SET @insertTime=NOW();
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'recruiter','No','INSERT',@insertTime);
END$
DELIMITER ;   

DROP TRIGGER IF EXISTS historyInsertRecruiter;
DELIMITER $
CREATE TRIGGER historyInsertRecruiter AFTER INSERT ON recruiter
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT COUNT(username) INTO AFT FROM recruiter;   /*count the rows of array -> AFT*/

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  IF (AFT - @beforeInseert>0) THEN                                                       /*if insert == true*/
    UPDATE history set success =  'YES' WHERE event_date =@insertTime;
  END IF;

END$
DELIMITER ;

/*----------------------------------------------------------------------------*//* user */

DROP TRIGGER IF EXISTS beforeInsertUser;
DELIMITER $
CREATE TRIGGER beforeInsertUser BEFORE INSERT ON user
FOR EACH ROW
BEGIN 
  DECLARE lastUser varchar(12);
  SELECT COUNT(username) INTO @beforeInseert FROM user; /*count the rows of array -> @beforeInseert*/
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  SET @insertTime=NOW();
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'user','No','INSERT',@insertTime);
END$
DELIMITER ;   

DROP TRIGGER IF EXISTS historyInsertUser;
DELIMITER $
CREATE TRIGGER historyInsertUser AFTER INSERT ON user
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT COUNT(username) INTO AFT FROM user;   /*count the rows of array -> AFT*/

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  IF (AFT - @beforeInseert>0) THEN                                                       /*if insert == true*/
    UPDATE history set success =  'YES' WHERE event_date =@insertTime;
  END IF;

END$
DELIMITER ;

/*----------------------------------------------------------------------------*//* etaireia */

DROP TRIGGER IF EXISTS beforeInsertEtaireia;
DELIMITER $
CREATE TRIGGER beforeInsertEtaireia BEFORE INSERT ON etaireia
FOR EACH ROW
BEGIN 
  DECLARE lastUser varchar(12);
  SELECT COUNT(AFM) INTO @beforeInseert FROM etaireia; /*count the rows of array -> @beforeInseert*/
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  SET @insertTime=NOW();
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'etaireia','No','INSERT',@insertTime);
END$
DELIMITER ;   

DROP TRIGGER IF EXISTS historyInsertEtaireia;
DELIMITER $
CREATE TRIGGER historyInsertEtaireia AFTER INSERT ON etaireia
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT COUNT(AFM) INTO AFT FROM etaireia;   /*count the rows of array -> AFT*/

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  IF (AFT - @beforeInseert>0) THEN                                                       /*if insert == true*/
    UPDATE history set success =  'YES' WHERE event_date =@insertTime;
  END IF;

END$
DELIMITER ;

/*----------------------------------------------------------------------------*//* job */

DROP TRIGGER IF EXISTS beforeInsertJob;
DELIMITER $
CREATE TRIGGER beforeInsertJob BEFORE INSERT ON job
FOR EACH ROW
BEGIN 
  DECLARE lastUser varchar(12);
  SELECT COUNT(id) INTO @beforeInseert FROM job; /*count the rows of array -> @beforeInseert*/
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  SET @insertTime=NOW();
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'job','No','INSERT',@insertTime);
END$
DELIMITER ;   

DROP TRIGGER IF EXISTS historyInsertJob;
DELIMITER $
CREATE TRIGGER historyInsertJob AFTER INSERT ON job
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT COUNT(id) INTO AFT FROM job;   /*count the rows of array -> AFT*/

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  IF (AFT - @beforeInseert>0) THEN                                                       /*if insert == true*/
    UPDATE history set success =  'YES' WHERE event_date =@insertTime;
  END IF;

END$
DELIMITER ;

/*****************************************************************************//*for update*/
/*****************************************************************************//*candidate*/


DROP TRIGGER IF EXISTS historyUpdateCandidate;
DELIMITER $
CREATE TRIGGER historyUpdateCandidate AFTER UPDATE ON candidate
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  /*if old row == new row -> success=NO*/
  IF (OLD.username=NEW.username AND OLD.bio=NEW.bio AND OLD.sistatikes=NEW.sistatikes AND OLD.certificates=NEW.certificates) THEN /*if update == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'candidate','NO','UPDATE',NOW());
    ELSE
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'candidate','YES','UPDATE',NOW());
    END IF;
END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* recruiter */


DROP TRIGGER IF EXISTS historyUpdateRecruiter;
DELIMITER $
CREATE TRIGGER historyUpdateRecruiter AFTER UPDATE ON recruiter
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
    /*if old row == new row -> success=NO*/
  IF (OLD.username=NEW.username AND OLD.exp_years=NEW.exp_years AND OLD.firm=NEW.firm) THEN /*if update == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'recruiter','NO','UPDATE',NOW());
    ELSE
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'recruiter','YES','UPDATE',NOW());
    END IF;
END$
DELIMITER ;


/*---------------------------------------------------------------------------*//* user */

DROP TRIGGER IF EXISTS historyUpdateUser;
DELIMITER $
CREATE TRIGGER historyUpdateUser AFTER UPDATE ON user
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
    /*if old row == new row -> success=NO*/ 
  IF (OLD.username=NEW.username AND OLD.password=NEW.password AND OLD.name=NEW.name AND OLD.surname=NEW.surname AND OLD.reg_date=NEW.reg_date AND OLD.email=NEW.email AND OLD.lastLogIn=NEW.lastLogIn) THEN /*if update == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'user','NO','UPDATE',NOW());
    ELSE
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'user','YES','UPDATE',NOW());
    END IF;
END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* etaireia */

DROP TRIGGER IF EXISTS beforeUpdateEtaireia;
DELIMITER $
CREATE TRIGGER beforeUpdateEtaireia BEFORE UPDATE ON etaireia
FOR EACH ROW
BEGIN
  IF(OLD.AFM<>NEW.AFM OR OLD.DOY<>NEW.DOY OR OLD.name<>NEW.name) THEN
  SET NEW.AFM=OLD.AFM;
  SET NEW.DOY=OLD.DOY;
  SET NEW.name=OLD.name;
  END IF;
END$
DELIMITER ;

DROP TRIGGER IF EXISTS historyUpdateEtaireia;
DELIMITER $
CREATE TRIGGER historyUpdateEtaireia AFTER UPDATE ON etaireia
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
     /*if old row == new row -> success=NO*/

  IF (OLD.AFM=NEW.AFM AND OLD.DOY=NEW.DOY AND OLD.name=NEW.name AND OLD.tel=NEW.tel AND OLD.street=NEW.street AND OLD.num=NEW.num AND OLD.city=NEW.city AND OLD.country=NEW.country) THEN /*if update == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'etaireia','NO','UPDATE',NOW());
    ELSE
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'etaireia','YES','UPDATE',NOW());
    END IF;
END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* Job */

DROP TRIGGER IF EXISTS historyUpdateJob;
DELIMITER $
CREATE TRIGGER historyUpdateJob AFTER UPDATE ON Job
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
     /*if old row == new row -> success=NO*/
  IF (OLD.start_date=NEW.start_date AND OLD.salary=NEW.salary AND OLD.position=NEW.position AND OLD.edra=NEW.edra AND OLD.recruiter=NEW.recruiter AND OLD.announce_date=NEW.announce_date AND OLD.submission_date=NEW.submission_date) THEN /*if update == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'Job','NO','DELETE',NOW());
    ELSE
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'Job','YES','UPDATE',NOW());
    END IF;
END$
DELIMITER ;

/*****************************************************************************//*for delete*/
/*****************************************************************************/
DROP TRIGGER IF EXISTS beforeDeleteCandidate;
CREATE TRIGGER beforeDeleteCandidate BEFORE DELETE ON candidate
FOR EACH ROW
SELECT COUNT(username) INTO @beforeDelete FROM candidate; /*count the rows of array -> @beforeInseert*/


DROP TRIGGER IF EXISTS historyDeleteCandidate;
DELIMITER $
CREATE TRIGGER historyDeleteCandidate AFTER DELETE ON candidate
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/

  SELECT COUNT(username) INTO AFT FROM candidate;  /*count the rows of array -> AFT*/
  
  IF (@beforeDelete-AFT>0) THEN /*if delete == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'candidate','YES','DELETE',NOW());
  ELSE
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'candidate','NO','DELETE',NOW());
  END IF;

END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* recruiter */
DROP TRIGGER IF EXISTS beforeDeleteRecruiter;
CREATE TRIGGER beforeDeleteRecruiter BEFORE DELETE ON recruiter
FOR EACH ROW
SELECT COUNT(username) INTO @beforeDelete FROM recruiter; /*count the rows of array -> @beforeInseert*/


DROP TRIGGER IF EXISTS historyDeleteRecruiter;
DELIMITER $
CREATE TRIGGER historyDeleteRecruiter AFTER DELETE ON recruiter
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/

  SELECT COUNT(username) INTO AFT FROM recruiter;  /*count the rows of array -> AFT*/
  
  IF (@beforeDelete-AFT>0) THEN /*if delete == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'recruiter','YES','DELETE',NOW());
  ELSE
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'recruiter','NO','DELETE',NOW());
  END IF;

END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* user */
DROP TRIGGER IF EXISTS beforeDeleteUser;
DELIMITER $

CREATE TRIGGER beforeDeleteUser BEFORE DELETE ON user
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE deleteUsername varchar(12);

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/
  SELECT OLD.username INTO deleteUsername FROM user;

  IF(lastUser=deleteUsername) THEN
  SIGNAL SQLSTATE VALUE '45000' SET MESSAGE_TEXT= 'You can not delete your account!';
  END IF;

  SELECT COUNT(username) INTO @beforeDelete FROM user; /*count the rows of array -> @beforeInseert*/

END$
DELIMITER ;

DROP TRIGGER IF EXISTS historyDeleteUser;
DELIMITER $
CREATE TRIGGER historyDeleteUser AFTER DELETE ON user
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/

  SELECT COUNT(username) INTO AFT FROM user;  /*count the rows of array -> AFT*/
  
  IF (@beforeDelete-AFT>0) THEN /*if delete == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'user','YES','DELETE',NOW());
  ELSE
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'user','NO','DELETE',NOW());
  END IF;

END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* etaireia */
DROP TRIGGER IF EXISTS beforeDeleteREtaireia;
CREATE TRIGGER beforeDeleteREtaireia BEFORE DELETE ON etaireia
FOR EACH ROW
SELECT COUNT(AFM) INTO @beforeDelete FROM etaireia; /*count the rows of array -> @beforeInseert*/


DROP TRIGGER IF EXISTS historyDeleteEtaireia;
DELIMITER $
CREATE TRIGGER historyDeleteEtaireia AFTER DELETE ON etaireia
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/

  SELECT COUNT(AFM) INTO AFT FROM etaireia;  /*count the rows of array -> AFT*/
  
  IF (@beforeDelete-AFT>0) THEN /*if delete == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'etaireia','YES','DELETE',NOW());
  ELSE
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'etaireia','NO','DELETE',NOW());
  END IF;

END$
DELIMITER ;

/*---------------------------------------------------------------------------*//* job */
DROP TRIGGER IF EXISTS beforeDeleteRJob;
CREATE TRIGGER beforeDeleteRJob BEFORE DELETE ON job
FOR EACH ROW
SELECT COUNT(id) INTO @beforeDelete FROM job; /*count the rows of array -> @beforeInseert*/


DROP TRIGGER IF EXISTS historyDeleteJob;
DELIMITER $
CREATE TRIGGER historyDeleteJob AFTER DELETE ON job
FOR EACH ROW
BEGIN
  DECLARE lastUser varchar(12);
  DECLARE AFT INT;

  SELECT username INTO lastUser FROM user ORDER BY lastLogin DESC LIMIT 0,1; /*select the last loged in user*/

  SELECT COUNT(id) INTO AFT FROM job;  /*count the rows of array -> AFT*/
  
  IF (@beforeDelete-AFT>0) THEN /*if delete == true*/
    INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'job','YES','DELETE',NOW());
  ELSE
  INSERT INTO history(user_username, table_name, success, eidos, event_date) VALUES
    (lastUser, 'job','NO','DELETE',NOW());
  END IF;

END$
DELIMITER ;

/*------------------------------------------------------------------------------------------*/

DROP TRIGGER IF EXISTS historyDeleteJob;
DELIMITER $
CREATE TRIGGER historyDeleteJob BEFORE DELETE ON applies
FOR EACH ROW
BEGIN
  DECLARE deleteJobID INT(4);
  DECLARE userSubDay DATE;
  DECLARE jobSubDay DATE;

  set deleteJobID = OLD.job_id;
  set userSubDay = OLD.user_submission;
    /*SELECT OLD.job_id INTO deleteJobID FROM applies;*/
   /* SELECT OLD.user_submission INTO userSubDay FROM applies;*/

  SELECT submission_date INTO jobSubDay from job where id=deleteJobID;

  IF(userSubDay >=jobSubDay) THEN
  SIGNAL SQLSTATE VALUE '45000' SET MESSAGE_TEXT='Sorry, you can not delete this apply';
  END IF;

END$
DELIMITER ;



/*---------------------------Stored Procedure---------------------------------*/


DROP PROCEDURE IF EXISTS evaluate;
DELIMITER $
CREATE PROCEDURE evaluate (IN IDjob INT)
BEGIN

    
	DECLARE personality FLOAT;
    DECLARE education FLOAT DEFAULT 1;
	DECLARE experience FLOAT;
    DECLARE result FLOAT;
    DECLARE interviews INT;
    DECLARE applicant VARCHAR(12);
    DECLARE job INT(4);
    DECLARE finishedFlag INT;
    
 
    
    DECLARE appliesCursor CURSOR FOR 
		SELECT cand_usrname,job_id FROM applies
        WHERE job_id = IDjob;
        
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET finishedFlag=1;
	
    OPEN appliesCursor;
    SET finishedFlag=0;
    FETCH appliesCursor INTO applicant,job;
    
	WHILE(finishedFlag=0) DO
    
		SELECT count(interview.interviewID) INTO interviews FROM interview
        WHERE interview.candidate_username = applicant ;
    
		SELECT avg(interview.score) INTO personality FROM interview /* personality = average score of interviews */
        WHERE interview.candidate_username = applicant ;
        
		SELECT COUNT(project.candid) INTO experience FROM project /* experience = number of projects */
        WHERE project.candid = applicant;
        
        SELECT COUNT(has_degree.cand_usrname) INTO education FROM has_degree /*education = number of degrees */
		WHERE has_degree.cand_usrname = applicant;
        
        
        
	        
        IF personality = 1  THEN /*lowest score for personality is 1*/
			INSERT INTO Failed(applicant, reason) VALUES
			(applicant, 'failed the interview');
        ELSEIF education = 0  THEN
			INSERT INTO Failed(applicant, reason) VALUES
			(applicant, 'inadequate education');
		ELSEIF experience = 0 THEN
			INSERT INTO Failed(applicant, reason) VALUES
			(applicant,'no prior experience');
        ELSE
			SET result = education + personality + experience;
            INSERT INTO Evaluation(applicant, job, result, interviews,personality,education,experience) VALUES
            (applicant, job, result, interviews, personality, education, experience);
        END IF;
        
		
        FETCH appliesCursor INTO applicant,job;
    END WHILE;
    CLOSE appliesCursor;
    
	select * from Evaluation order by result  desc;
    select * from Failed ;
    
    delete from Failed;
    delete from Evaluation;
    
    update job
    set evaluated = 'evaluated'
    where id = IDjob;
    
END$ 

DELIMITER ;



/*------------------------------END-------------------------*/

  
  