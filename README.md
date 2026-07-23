# Employee Management System

A Spring Boot based Employee Management System with JWT Authentication and Role-based security.

## Features

- User Registration
- User Login with JWT Authentication
- Secure REST APIs
- Create Employee
- View All Employees
- View Employee By ID
- Update Employee
- Delete Employee
- MySQL Database Integration

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Security
- JWT Authentication
- Hibernate / JPA
- Maven

### Database
- MySQL

### Tools
- IntelliJ IDEA / Eclipse
- Postman
- Git & GitHub

## API Endpoints

### Authentication

POST
/auth/register


POST

/auth/login


### Employee APIs

GET

/employees


GET

/employees/{id}


POST

/employees


PUT

/employees/{id}


DELETE

/employees/{id}


## Project Structure


controller
entity
repository
service
security
config
dto


## How to Run

1. Clone the repository

2. Configure MySQL database in:


application.properties


3. Run the application:


mvn spring-boot:run


4. Test APIs using Postman.

## Author

Sakshi Dudhe