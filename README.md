<img width="1512" height="982" alt="Screenshot 2026-04-16 at 2 17 48 PM" src="https://github.com/user-attachments/assets/f956aa69-54ee-487f-b6e7-13298b43261e" />
<img width="1512" height="982" alt="Screenshot 2026-04-16 at 2 17 48 PM" src="https://github.com/user-attachments/assets/a2a41aee-33c5-4054-9e46-3d213d88297d" />

# exp_9
# 🔐 JWT Authentication Demo (Spring Boot)

This project is a simple **JWT (JSON Web Token) Authentication System** built using **Spring Boot**, **Spring Security**, and **MySQL**. It demonstrates how login authentication works using JWT tokens.

---

## 🚀 Features

* User login authentication
* JWT token generation
* Secure password handling using BCrypt
* REST APIs for authentication
* MySQL database integration using Spring Data JPA

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Security
* JWT (io.jsonwebtoken)
* MySQL
* JPA / Hibernate

---

## 📁 Project Structure

* `controller` → Handles API requests
* `service` → Business logic (AuthService) 
* `repository` → Database access layer 
* `model` → Entity classes (User) 
* `security` → JWT utility class 
* `config` → Security configuration 

---

## ⚙️ Configuration

Database configuration is defined in:
📄 `application.properties


## 🔑 API Endpoints

### 1. Login API

```
POST /api/login
```

**Parameters:**

* username
* password

**Response:**

* Returns JWT token if credentials are valid
* Otherwise: "Invalid Credentials"

---

### 2. Test API

```
GET /api/hello
```

**Response:**

```
Hello! JWT Authentication Successful
```

---

## 🔐 How JWT Works

1. User sends username & password
2. Server validates credentials using database
3. If valid → JWT token is generated using `JWTUtil` 
4. Token is sent back to client
5. Client uses token for future authentication

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/bedika-punshi/exp_9.git
```

2. Open project in IDE (IntelliJ / Eclipse)

3. Configure MySQL database

4. Run the application:

```
DemoJwtApplication.java
```

5. Test APIs using Postman

---

## ⚠️ Notes

* Currently, all endpoints are permitted (no strict security filter applied) 
* Passwords are stored as plain text (not recommended for production)
* JWT validation filter is not implemented yet

---

## 📌 Future Improvements

* Add JWT authentication filter
* Encrypt passwords before storing
* Role-based authorization
* Token validation middleware

---






