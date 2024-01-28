# Catalog Service Project

Catalog Service Project is a Spring Boot application designed to manage and retrieve product information through RESTful APIs. It uses Spring Data JPA for data persistence and integrates with Eureka for service discovery.

## Functionality

### Product Entity
The application defines a `Product` entity with the following attributes:

- `ProductId`: Unique identifier for the product.
- `code`: Product code.
- `name`: Product name.
- `description`: Product description.
- `price`: Product price.

### DAO Layer
The data access layer is implemented using Spring Data JPA with the `ProductDao` interface. It provides methods to interact with the underlying database, such as retrieving all products and finding a product by its code.

### Service Layer
The service layer, implemented by `ProductServiceImpl`, contains business logic for handling product-related operations. It interfaces with the `ProductDao` to retrieve and process data.

### RESTful API
The application exposes RESTful APIs through the `ProductResource` class. These APIs include:

- `GET /products`: Retrieve a list of all products.
- `GET /products/code/{productCode}`: Retrieve a product by its code.

### Configuration
The application is configured to connect to a MySQL database with the provided datasource settings. Eureka client configuration is also included for service registration and discovery.

## Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/krishna-kusum/Catalog-Service-Project.git
   cd catalog-service
   ```

2. **Database Configuration:**
   Update the `application.properties` file with your MySQL database credentials.

3. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Open in Browser:**
   Visit http://localhost:8080 to access the Catalog Service APIs.

## Dependencies

- Spring Boot
- Spring Data JPA
- Eureka Client
- MySQL Database

Feel free to contribute, report issues, or suggest improvements. Happy cataloging!

