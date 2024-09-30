--program to continue the load even after some error occurs in between..

CREATE TABLE TEST (ID NUMBER PRIMARY KEY);

INSERT INTO TEST VALUES(5);


INSERT INTO TEST VALUES(15);


INSERT INTO TEST VALUES(25);


INSERT INTO TEST VALUES(65);

COMMIT;

--

begin

  for i in 1..100
  loop
begin
    insert into test
values(i);
dbms_output.put_line(i);
exception
   when DUP_VAL_ON_INDEX then
   dbms_output.put_line('no already exists');
end;
end loop;
end;
/



ASSIGNMENT:- Re-write above program using Stored Procedure and unit test the same for all scenarios.
------------ (Write a SP To return Ename for a given empno.. 
		Input => 7788, Output => Active-Scott
		Input => 7902, Output => In-active-FORD
		Input => 9999, Output => NF
		Don't Use DBMS_OUTPUT package..
	     )


create or replace PROCEDURE activeemp
(
  VENO  in E_ACTIVE.EMPNO%TYPE,
  VNAME out E_ACTIVE.ENAME%TYPE
  
) 
is
BEGIN
	SELECT ENAME
	INTO    VNAME
	FROM   E_ACTIVE
	WHERE  EMPNO = VENO;

	vname:=('  ACTIVE- '|| VNAME);

exception
  when no_data_found then
	begin
		SELECT ENAME
		INTO   VNAME
		FROM   E_INACTIVE
		WHERE  EMPNO = VENO;

		vname:=(' INACTIVE- '|| VNAME);
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			vname:=('NOT EXISTS');
	end;
end;

====================================================================================================
