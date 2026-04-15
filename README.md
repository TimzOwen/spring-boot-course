# Student Management System

A Spring Boot RESTful API for managing student records. This project demonstrates basic CRUD operations using Spring Data JPA and MySQL.

## Features

- **Create**: Add a single student or multiple students at once.
- **Read**: Retrieve a student by ID or list all students.
- **Update**: Modify existing student details.
- **Delete**: Remove a specific student by ID or clear the entire database.

## Technologies Used

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL 8**
- **Lombok**
- **Docker** (for MySQL containerization)
- **Gradle**

## Prerequisites

- Java 17 or higher
- Docker and Docker Compose (optional, for running MySQL)
- MySQL Server (if not using Docker)

## Getting Started

### 1. Database Setup

You can use the provided `docker-compose.yml` to spin up a MySQL instance:

```bash
docker-compose up -d
```

The database will be available at `localhost:3306` with the name `mydb`.

### 2. Configuration

Update `src/main/resources/application.properties` if you need to change the database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=root
```

### 3. Build and Run

Run the application using Gradle:

```bash
./gradlew bootRun
```

The API will be accessible at `http://localhost:8080`.

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/v1/students/save` | Save a new student |
| POST | `/api/v1/students/saveAll` | Save a list of students |
| GET | `/api/v1/students/get/{id}` | Get student by ID |
| GET | `/api/v1/students/getAll` | Get all students |
| PUT | `/api/v1/students/update/{id}` | Update an existing student |
| DELETE | `/api/v1/students/delete/{id}` | Delete a student by ID |
| DELETE | `/api/v1/students/deleteAll` | Delete all students |

### Sample JSON Request (Save Student)

```json
{
  "name": "John Doe",
  "grade": "A"
}
```

## Project Structure

- `model`: Entity class representing the `Student`.
- `repository`: Data access layer using Spring Data JPA.
- `service`: Business logic layer.
- `controller`: REST endpoints for API interaction.
