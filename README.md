# 🛒 ProductAPI - A Simple REST API with Spring Boot

This is a basic REST API for managing products, built using **Spring Boot**. It supports full CRUD operations and connects to a **MySQL** database. Perfect for beginners learning backend development and REST principles!

---

## 🚀 Features

- Add new products
- View all products
- View product by ID
- Update existing products
- Delete products
- JSON-based REST API
- Connected to MySQL using Spring Data JPA

---

## 📦 Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## ⚙️ API Endpoints

| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| GET    | `/products`       | Get all products         |
| GET    | `/read/{id}`      | Get a single product     |
| POST   | `/create`         | Create a new product     |
| PUT    | `/update/{id}`    | Update product by ID     |
| DELETE | `/delete/{id}`    | Delete product by ID     |

---

## 🛠️ Getting Started

### 1. Clone the repo

```
git clone https://github.com/your-username/ProductAPI.git
cd ProductAPI
```

### 2. Configure the Database

# Create a MySQL database named 'productdb' (or any name you like)
# Then update src/main/resources/application.properties:
# Replace 'yourUsername' and 'yourPassword' accordingly

spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update


### 3. Run the App

# If using the included Maven wrapper
```
./mvnw spring-boot:run
```
# Or if you have Maven installed globally
```
mvn spring-boot:run
```

### 4. API is Live!

# The app should now be running at:

```
http://localhost:8080/
```

### 5. Test Your API

# You can use Postman or cURL to test
# Here's an example POST request body for /create endpoint:

```
{
  "stock": 50,
  "description": "Compact and fast USB drive",
  "category": "Electronics",
  "numberOfRatings": 120,
  "ratings": 4.6,
  "price": 19.99,
  "name": "USB Drive",
  "image": ["https://picsum.photos/200"]
}

```
