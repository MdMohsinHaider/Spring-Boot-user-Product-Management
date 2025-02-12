# Spring Boot Simple CRUD with SQL

## Overview
This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. The project uses Spring Data JPA for database interactions and supports both MySQL and H2 databases.

## Features
- Create, Read, Update, and Delete operations for an entity.
- Uses Spring Boot 3.4.2 with Java 17.
- Integrated with MySQL and H2 for database operations.
- Lombok for reducing boilerplate code.
- REST API endpoints for performing CRUD operations.

## Technologies Used
- Java 17
- Spring Boot 3.4.2
- Spring Data JPA
- Spring Web
- MySQL
- H2 Database (for testing)
- Lombok
- Maven

## Project Setup
### Prerequisites
- JDK 17 or later
- Maven
- MySQL (if using MySQL as the database)

### Clone the Repository
```sh
git clone https://github.com/your-repo/spring_boot_simple_crud_with_sql.git
cd user_product
```

### Configure the Database
Modify `src/main/resources/application.properties` based on your database preference.
#### For MySQL
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
#### For H2 (In-Memory Database)
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/entities` | Get all entities |
| GET | `/api/entities/{id}` | Get entity by ID |
| POST | `/api/entities` | Create a new entity |
| PUT | `/api/entities/{id}` | Update an entity |
| DELETE | `/api/entities/{id}` | Delete an entity |

## Dependencies
This project uses the following dependencies:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
```

## Contributing
Feel free to fork this repository and submit pull requests for improvements.

## License
This project is licensed under the MIT License.

## Contact
For any queries, contact Md Mohsin haider at mdmohsinhaider6@gmail.com
On Linkedin, contact Md-Mohsin-haider at https://www.linkedin.com/in/md-mohsin-haider

