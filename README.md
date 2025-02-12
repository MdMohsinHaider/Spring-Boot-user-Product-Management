# User Product Management API

## Project Information
This project is a simple CRUD application built using Spring Boot with SQL database integration. It provides RESTful APIs for managing user data, including creating, reading, updating, and deleting users.

### Technologies Used
- Spring Boot 3.4.2
- Spring Data JPA
- Spring Web
- H2 Database (for development)
- MySQL (for production)
- Lombok
- Maven
- Java 17

## Overview
This API manages user-related operations such as creating, retrieving, updating, and deleting user records.

## Base URL
```
http://localhost:8090/user
```

---

## Endpoints

### 1. Save a Single User
**Method:** `POST`

**Endpoint:**
```
/user/saveUser
```

**Request Body (JSON):**
```json
{
    "username": "devil",
    "email": "devil@mohsin.com",
    "phone": "1123344",
    "dob": "2002-10-10",
    "password": "123"
}
```

---

### 2. Save Multiple Users
**Method:** `POST`

**Endpoint:**
```
/user/saveMultipleUser
```

**Request Body (JSON):**
```json
[
  {
    "username": "jane_smith",
    "email": "jane.smith002@example.com",
    "phone": "9876543221",
    "dob": "1997-03-22",
    "password": "Jane@456"
  },
  {
    "username": "alex_johnson",
    "email": "alex.johnson003@example.com",
    "phone": "9876543222",
    "dob": "1992-11-05",
    "password": "Alex@789"
  },
  {
    "username": "emma_wilson",
    "email": "emma.wilson004@example.com",
    "phone": "9876543223",
    "dob": "1999-06-30",
    "password": "Emma@321"
  },
  {
    "username": "michael_brown",
    "email": "michael.brown005@example.com",
    "phone": "9876543224",
    "dob": "1990-01-15",
    "password": "Michael@654"
  }
]
```

---

### 3. Get All Users
**Method:** `GET`

**Endpoint:**
```
/user/allUser
```

---

### 4. Get User by ID
**Method:** `GET`

**Endpoint:**
```
/user/getUserById/{id}
```

---

### 5. Delete User by ID
**Method:** `DELETE`

**Endpoint:**
```
/user/deleteUserById/{id}
```

Example:
```
/user/deleteUserById/1
```

---

### 6. Update User by ID
**Method:** `PUT`

**Endpoint:**
```
/user/updateUserById/{id}
```

Example:
```
/user/updateUserById/2
```

**Request Body (JSON):**
```json
{
    "id": 2,
    "username": "Mohsin Haider",
    "email": "Devil@mohsin.com",
    "phone": "10192928",
    "dob": "2024-10-10",
    "password": "123mohsin"
}
```

---

## Notes
- All API requests should be sent with the `Content-Type: application/json` header.
- Replace `{id}` with the actual user ID.
- Ensure the server is running at `http://localhost:8090` before making requests.

---

## Author
**Md Mohsin Haider**
