# 👨‍💼 Employee Management System

A secure Employee Management System developed using **Java, Spring Boot, Spring Security, JWT Authentication, Hibernate, JPA, and MySQL**.

This project provides secure REST APIs for user authentication and complete employee management operations with JWT-based authorization, CRUD functionality, pagination, and sorting.

---

# 🚀 Features

## 🔐 Authentication & Security

- User Registration
- User Login
- JWT Token Generation
- JWT-based Authentication
- Secure REST APIs using Spring Security
- Password Encryption using BCrypt
- Stateless Session Management

---

## 👨‍💼 Employee Management

- Create Employee
- View All Employees
- View Employee By ID
- Update Employee Details
- Delete Employee

---

## 📄 Pagination & Sorting

Implemented pagination and sorting using Spring Data Pageable.

Examples:

### Pagination


GET /employees?page=0&size=5


### Sorting


GET /employees?sortBy=salary


### Pagination + Sorting


GET /employees?page=0&size=10&sortBy=name


---

# 🛠️ Tech Stack

## Backend

- Java
- Spring Boot
- Spring Security
- JWT Authentication
- Hibernate
- Spring Data JPA
- Maven

## Database

- MySQL 8

## Tools

- IntelliJ IDEA
- Postman
- Git & GitHub
- JUnit

---

# 📂 Project Structure


src/main/java/com/assignment/employeemanagement

├── config
│ └── SecurityConfig.java
│
├── controller
│ ├── AuthController.java
│ └── EmployeeController.java
│
├── dto
│ └── RegisterRequest.java
│
├── entity
│ ├── User.java
│ └── Employee.java
│
├── repository
│ ├── UserRepository.java
│ └── EmployeeRepository.java
│
├── security
│ ├── JwtAuthenticationFilter.java
│ ├── JwtUtil.java
│ └── CustomUserDetailsService.java
│
└── service
├── UserService.java
└── EmployeeService.java


---

# 🔗 API Documentation

## Authentication APIs

### Register User


POST /auth/register


Request:

```json
{
    "username": "sakshi",
    "email": "sakshi@gmail.com",
    "password": "123456"
}
Login User
POST /auth/login

Response:

{
    "token": "JWT_TOKEN"
}

Use the generated JWT token for accessing employee APIs.

👨‍💼 Employee APIs

All employee APIs require JWT Bearer Authentication.

Header:

Authorization: Bearer <JWT_TOKEN>
Create Employee
POST /employees
Get All Employees
GET /employees

Supports pagination and sorting.

Example:

GET /employees?page=0&size=5&sortBy=name
Get Employee By ID
GET /employees/{id}
Update Employee
PUT /employees/{id}
Delete Employee
DELETE /employees/{id}
🧪 Testing

Implemented and verified:

✅ User Registration
✅ User Login
✅ JWT Authentication
✅ Employee CRUD Operations
✅ Pagination
✅ Sorting
✅ MySQL Database Integration
✅ REST API Testing using Postman
✅ Unit Testing using JUnit

📦 Postman Collection

Postman collection contains:

Authentication APIs
JWT Token Testing
Employee CRUD APIs
Pagination and Sorting APIs

Location:

postman/
 └── Employee-Management-System.postman_collection.json
⚙️ How To Run The Project
Clone Repository
git clone https://github.com/Dudhesakshi/employee-management-system.git
Configure Database

Update:

src/main/resources/application.properties

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db
spring.datasource.username=root
spring.datasource.password=your_password
Run Application

Using Maven:

mvn spring-boot:run

Application runs on:

http://localhost:8080


---
📸 Screenshots

Included API screenshots:

User Registration
User Login with JWT Token
Create Employee
Get Employees
Pagination and Sorting Response


👩‍💻 Author

Sakshi Dudhe

GitHub:
https://github.com/Dudhesakshi
