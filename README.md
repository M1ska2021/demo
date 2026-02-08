# Cartoon API Project

## Project Description
This project is a RESTful API for managing cartoons, implemented using:
 Spring Boot  
 Spring Data JPA  
 PostgreSQL  
 Maven  

The application supports full CRUD operations:
 Create a cartoon  
 Get all cartoons  
 Get a cartoon by ID  
 Update a cartoon  
 Delete a cartoon  

## Project Structure
controller  to REST controllers  
service     to business logic  
repository  to database access (JPA)  
model       to entity classes  
patterns    to design patterns (Factory, Builder, etc.)  

Main launch class:  
DemoApplication.java

## Technologies Used
Spring Boot — application framework  
Spring Web — REST API development  
Spring Data JPA — database interaction  
PostgreSQL — data storage  
Maven — dependency management  

## Database Configuration
File:application.properties

Example configuration:
spring.datasource.url=jdbc:postgresql://localhost:5434/cartoon_db  
spring.datasource.username=postgres  
spring.datasource.password=postgres  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
Hibernate automatically creates tables when the application starts.

### Create Cartoon
POST `/api/cartoons`

Example JSON:
{
  "name": "Spider-man",
  "episodes": 200,
  "studio": "Marvel"
}

### Get All Cartoons
GET `/api/cartoons`

### Get Cartoon by ID
GET `/api/cartoons/{id}`

### Update Cartoon
PUT `/api/cartoons/{id}`

Example JSON:
{
  "name": "Stranger Things",
  "episodes": 60,
  "studio": "Netflix"
}

## Running the Project
1. Open the project in IntelliJ IDEA  
2. Make sure PostgreSQL is running  
3. Run the DemoApplication class  
After startup, the application will be available at:  
http://localhost:8080

## API Testing
You can test the API using:
 Postman  
 Hoppscotch  
 curl  
 Browser (for GET requests)  

## Implemented Principles
 SOLID principles  
 Layered architecture  
 RESTful API design  
 JPA ORM  
 Factory design pattern  
