"# toy-java-react-sql-stack" 

# To Run 
Have a mysql server running that contains a databaese named testdb
- after logging into mysql server you will run `CREATE DATABASE testdb;`

In the backEnd folder
- In the `application.properties` file upate the properties that need updating
- Run `mvn spring-boot:run` - this sets up the local backend server at localhost:8080
- After running this, add 2 rows to the roles table
    -  `INSERT INTO roles(name) VALUES('ROLE_USER');`
    -  `INSERT INTO roles(name) VALUES('ROLE_ADMIN');`

In the frontEnd folder
- Start the react app (e.g.` npm install` then `npm start`)

backend built by following this tutorial: https://www.bezkoder.com/spring-boot-jwt-authentication/