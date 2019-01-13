== Spring Boot Liquibase Sample

This sample demonstrates the liquibase auto-configuration support.

You can look at `http://localhost:8080/actuator/liquibase` to review the list of
scripts.

This sample also enables the H2 console :
1. `http://localhost:8080/h2-console`
2. set jdbc url is `jdbc:h2:mem:testdb`.
3. review the state of the database by using:

SELECT * FROM PERSON;
SELECT * FROM user;
SELECT * FROM DATABASECHANGELOG ;
SELECT * FROM DATABASECHANGELOGLOCK ;
