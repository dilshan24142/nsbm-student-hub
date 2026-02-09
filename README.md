# nsbm-student-hub
For Tute DEA I


NSBM Student Hub 🎓

NSBM Student Hub is a Spring Boot–based RESTful web application designed to manage student information securely and efficiently.
The system supports full CRUD operations, pagination, sorting, role-based authentication, and encrypted password handling.

🚀 Features

Spring Boot REST API

MySQL database integration using JPA & Hibernate

Student management (Create, Read, Update, Delete)

Pagination and sorting support

Role-based authentication (roles stored in database)

Encrypted passwords using BCrypt

Secure access using Spring Security

Clean layered architecture (Controller, Service, Repository)

🛠️ Technologies Used

Java 17

Spring Boot

Spring Data JPA

Spring Security

MySQL

Maven

Hibernate

📂 Project Structure
com.nsbm.studenthub
 ├── config        -> Security configuration
 ├── controller    -> REST controllers
 ├── entity        -> JPA entities (Student, User, Role)
 ├── repository    -> JPA repositories
 ├── service       -> Business logic interfaces
 ├── service.impl  -> Service implementations
 └── NsbmStudentHubApplication.java
