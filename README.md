# Employee Management System

A secure **Employee Management System** developed using **Java, Spring Boot, Spring Security, JWT Authentication, Hibernate, JPA, and MySQL**.

This project provides secure REST APIs for user authentication and complete employee management operations with JWT-based authorization.

---

# 🚀 Features

## 🔐 Authentication & Security

* User Registration
* User Login
* JWT Token Generation
* JWT-based Authentication
* Secure REST APIs using Spring Security
* Password encryption using BCrypt
* Stateless session management

---

## 👨‍💼 Employee Management

* Create Employee
* View All Employees
* View Employee By ID
* Update Employee Details
* Delete Employee

---

# 🛠️ Tech Stack

## Backend

* Java
* Spring Boot
* Spring Security
* JWT Authentication
* Hibernate
* Spring Data JPA
* Maven

## Database

* MySQL

## Tools

* IntelliJ IDEA
* Postman
* Git & GitHub

---

# 🏷️ Project Topics

```
java
spring-boot
spring-security
jwt
hibernate
jpa
mysql
rest-api
backend-development
```

---

# 📂 Project Structure

```
employee-management-system

src/main/java/com/assignment/employeemanagement

├── config
│   └── SecurityConfig.java
│
├── controller
│   ├── AuthController.java
│   └── EmployeeController.java
│
├── dto
│   └── RegisterRequest.java
│
├── entity
│   ├── User.java
│   └── Employee.java
│
├── repository
│   ├── UserRepository.java
│   └── EmployeeRepository.java
│
├── security
│   ├── JwtAuthenticationFilter.java
│   ├── JwtUtil.java
│   └── CustomUserDetailsService.java
│
└── service
    └── UserService.java
```

---

# 🔗 API Documentation

## Authentication APIs

### 1. Register User

**Endpoint**

```
POST /auth/register
```

Request:

```json
{
    "username": "sakshi",
    "email": "sakshi@gmail.com",
    "password": "123456"
}
```

---

### 2. Login User

**Endpoint**

```
POST /auth/login
```

Response:

```json
{
    "token": "JWT_TOKEN"
}
```

The generated JWT token is used to access secured employee APIs.

---

# 👨‍💼 Employee APIs

All employee APIs require JWT authentication.

Add token in request header:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## Create Employee

```
POST /employees
```

Request:

```json
{
    "name": "Rahul Sharma",
    "email": "rahul@gmail.com",
    "department": "IT",
    "position": "Java Developer",
    "salary": 50000,
    "dateOfJoining": "2026-07-23"
}
```

---

## Get All Employees

```
GET /employees
```

---

## Get Employee By ID

```
GET /employees/{id}
```

---

## Update Employee

```
PUT /employees/{id}
```

---

## Delete Employee

```
DELETE /employees/{id}
```

---

# 📸 API Screenshots

## 1. User Registration API

Registration of a new user using authentication API.

```
POST /auth/register
```

![Register API](screenshots/register.png)

---

## 2. User Login & JWT Token Generation

Login API generates JWT token for secure API access.

```
POST /auth/login
```

![Login API](screenshots/login.png)

---

## 3. Create Employee API

Creating employee record using JWT authenticated request.

```
POST /employees
```

![Create Employee API](screenshots/create-employee.png)

---

## 4. Get All Employees API

Fetching employee records from MySQL database.

```
GET /employees
```

![Get Employees API](screenshots/get-employees.png)

---

# ⚙️ How To Run The Project

## 1. Clone Repository

```bash
git clone https://github.com/Dudhesakshi/employee-management-system.git
```

---

## 2. Configure Database

Update MySQL configuration in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## 3. Run Application

Using Maven:

```bash
mvn spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

---

# 🧪 Testing

APIs tested using:

* Postman
* JWT Bearer Authentication
* MySQL Database Verification

Verified:

✅ User Registration
✅ User Login
✅ JWT Authentication
✅ Employee CRUD Operations

---

# 👩‍💻 Author

**Sakshi Dudhe**

GitHub:

https://github.com/Dudhesakshi
