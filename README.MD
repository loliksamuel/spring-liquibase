== Spring Boot Liquibase Sample

This sample demonstrates the liquibase auto-configuration support.

You can look at `http://localhost:8080/actuator/liquibase` to review the list of
scripts.

This sample also enables the H2 console :
1. set application.properties: spring.profiles.active=h2
2. run app
3. http://localhost:8080/h2-console
4. set jdbc url is `jdbc:h2:mem:testdb`.
5. set user = sa, password=sa
6. review the state of the database by using:

SELECT * FROM PERSON;
SELECT * FROM user;
SELECT * FROM DATABASECHANGELOG ;
SELECT * FROM DATABASECHANGELOGLOCK ;


note: sometimes if the update application is abruptly stopped, then the lock remains stuck.

Then running

UPDATE DATABASECHANGELOGLOCK SET LOCKED=FALSE, LOCKGRANTED=null, LOCKEDBY=null where ID=1;