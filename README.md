
---

# Spring Boot Simple REST Example

## Overview

This project demonstrates a basic Spring Boot application that exposes a simple RESTful API for managing employee data. The application does not utilize a database; instead, it uses an in-memory list to store employee information.

## Features

* **GET `/employee/api/get`**: Retrieves a list of all employees.

## Technologies Used

* **Spring Boot 3.5.0**: Framework for building Java-based applications.
* **Java 17**: Programming language.
* **Maven**: Build automation tool.([dev.to][1])

## Prerequisites

* Java 17 or higher
* Maven([medium.com][2])

## Setup and Installation

1. Clone the repository:([youtube.com][3])

   ```bash
   git clone https://github.com/dinesh-veer/Spring-boot-Simple-rest-example.git
   ```

2. Navigate into the project directory:

   ```bash
   cd Spring-boot-Simple-rest-example
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

   The application will start on port 8080.

## API Endpoint

### Get All Employees

* **URL**: `/employee/api/get`
* **Method**: `GET`
* **Response**: JSON array of all employees.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---