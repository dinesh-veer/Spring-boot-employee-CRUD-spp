

```markdown
# 🧑‍💼 Employee CRUD Application with Spring Boot & H2

This is a simple **CRUD REST API** for managing employee records built using **Spring Boot**, **Spring Data JPA**, and an **H2 in-memory database**.

---

## 🚀 Features

- Create, Read, Update, Delete (CRUD) employee records
- RESTful API with JSON request/response
- In-memory H2 database (no setup required)
- Accessible H2 Console for debugging

---

## 📦 Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven or Gradle

---

## 📁 Project Structure



src/
├── main/
│   ├── java/
│   │   └── com/example/employee/
│   │       ├── controller/         # REST API controller
│   │       ├── entity/             # JPA Entity
│   │       ├── repository/         # Spring Data JPA repository
│   │       ├── service/            # Service layer
│   │       └── EmployeeCrudApplication.java
│   └── resources/
│       ├── application.properties  # H2 config and JPA settings
│       └── data.sql (optional)     # Initial data if needed

````

---

## 🔧 Configuration (`application.properties`)

```properties
# H2 Console Config
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# DataSource Config
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA & Hibernate
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
````

---

## 📡 REST API Endpoints

| Method | Endpoint              | Description           |
| ------ | --------------------- | --------------------- |
| GET    | `/api/employees`      | Get all employees     |
| GET    | `/api/employees/{id}` | Get employee by ID    |
| POST   | `/api/employees`      | Create new employee   |
| PUT    | `/api/employees/{id}` | Update employee by ID |
| DELETE | `/api/employees/{id}` | Delete employee by ID |

---

## 📝 Sample JSON

### ➕ Create Employee (POST)

```json
{
   "name": "John Doe",
   "email": "john.doe@example.com",
   "department": "Engineering",
   "salary": 75000.0
}
```

### 🔄 Update Employee (PUT)

```json
{
   "id": 1,
   "name": "John Doe Updated",
   "email": "john.updated@example.com",
   "department": "Research & Development",
   "salary": 85000.0
}
```

> 💡 `id` in the PUT body is optional; the actual ID is taken from the URL path.

---

## ▶️ Run the Application

### Using Maven

```bash
./mvnw spring-boot:run
```

### Using Gradle

```bash
./gradlew bootRun
```

Then open: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

* **JDBC URL:** `jdbc:h2:mem:testdb`
* **Username:** `sa`
* **Password:** *(leave empty)*

---

## 📖 API Documentation (Swagger)

Interactive API docs are available using Swagger UI:

- URL: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

You can use the interface to:
- Explore all endpoints
- Test API requests directly
- View request/response schemas
---

## 🧪 Testing

You can use **Postman**, **curl**, or any HTTP client.

### Example (Create)

```bash
curl -X POST http://localhost:8080/api/employees \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Alice",
    "email": "alice@example.com",
    "department": "HR",
    "salary": 62000.0
  }'
```

---

## 📝 License

This project is licensed under the [MIT License](LICENSE).

```

---

Let me know if you'd like to include Swagger for API docs or split the entity into DTOs for cleaner design!
```
