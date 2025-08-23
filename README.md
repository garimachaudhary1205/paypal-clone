# 💳 PayPal Clone – Spring Boot Project

A **PayPal Clone** built with **Spring Boot** that demonstrates secure authentication and role-based access control using **JWT (JSON Web Tokens)**.  
The project includes **signup & login functionality, DTOs for clean payloads, and role-based endpoint protection**.

---

## 🚀 Features
- **User Authentication with JWT**
  - Signup & Login APIs  
  - Password encryption using BCrypt  
- **Role-Based Access Control (RBAC)**
  - `ROLE_USER` and `ROLE_ADMIN` authorization  
  - Restrict access to APIs based on roles  
- **DTO (Data Transfer Objects)**
  - Structured request/response handling  
- **Spring Security Integration**
  - JWT authentication filter & custom security config  
- **Database Integration**
  - Persistent user and role management with MySQL/PostgreSQL  

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, Spring Security, JWT  
- **Database:** MySQL (or PostgreSQL)  
- **Build Tool:** Maven  
- **Testing Tool:** Postman  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
paypal-clone/
├── src/main/java/com/paypalclone
│ ├── controller # REST controllers
│ ├── service # Business logic
│ ├── dto # Data Transfer Objects
│ ├── security # JWT & Security config
│ ├── model # Entities (User, Role)
│ ├── repository # JPA repositories
├── src/main/resources
│ ├── application.properties
└── pom.xml
