## 📚 Online Bookstore – README

### **Project Overview**

The **Online Bookstore** is a full-stack web application built using **Spring Boot (Java)** for the backend and **Angular** for the frontend.
It enables users to browse, search, and purchase books online, while admins can manage inventory, categories, and orders.

---

### **Features**

#### **For Customers**

* Browse books by category
* Search books by title/author
* View book details with image and description
* Add books to shopping cart
* Checkout with order summary
* User registration & login

#### **For Admins**

* Manage book categories
* Add, edit, and delete books
* Track orders and inventory
* Upload book images

---

### **Tech Stack**

**Backend (Spring Boot)**

* Java 21
* Spring Boot 3.x (REST APIs)
* Spring Data JPA (MySQL integration)
* Hibernate ORM
* Spring Security (JWT authentication)
* Maven build tool

**Frontend (Angular)**

* Angular 16+
* TypeScript
* Bootstrap / Angular Material for styling
* RxJS & HTTPClient for API calls

**Database**

* MySQL

---

### **Project Structure**

```
bookstore/
│
├── backend/
│   ├── src/main/java/com/bookstore
│   │   ├── controller/      # REST controllers
│   │   ├── entity/          # JPA entities
│   │   ├── repository/      # Spring Data JPA repositories
│   │   ├── service/         # Business logic
│   │   ├── security/        # JWT and authentication
│   │   └── BookstoreApplication.java
│   └── src/main/resources/
│       ├── application.properties
│       └── data.sql (sample data)
│
└── frontend/
    ├── src/app/
    │   ├── components/      # Angular components
    │   ├── services/        # API service calls
    │   ├── models/          # TypeScript interfaces
    │   └── app.module.ts
    └── angular.json
```

---

### **Setup & Installation**

#### **Backend**

1. Navigate to the `backend` folder
2. Configure database in `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build & run:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

#### **Frontend**

1. Navigate to the `frontend` folder
2. Install dependencies:

   ```bash
   npm install
   ```
3. Run Angular development server:

   ```bash
   ng serve
   ```
4. Open in browser: `http://localhost:4200`

---

### **API Endpoints (Sample)**

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/api/books`      | Get all books       |
| GET    | `/api/books/{id}` | Get book by ID      |
| POST   | `/api/books`      | Add a new book      |
| PUT    | `/api/books/{id}` | Update book details |
| DELETE | `/api/books/{id}` | Delete a book       |

---

### **Troubleshooting**

* **404 errors in Angular**: Ensure `proxy.conf.json` is set up to forward `/api` calls to `http://localhost:8080`.
* **MySQL table not creating**: Set `spring.jpa.hibernate.ddl-auto=update` in `application.properties`.
* **CORS issues**: Enable CORS in Spring Boot by adding a CORS configuration bean.

---

### **Future Enhancements**

* Payment gateway integration
* Wishlist feature
* Book reviews and ratings
* User profile management

---



<img width="1920" height="1080" alt="Screenshot (47)" src="https://github.com/user-attachments/assets/09846e03-cde0-4c2c-b9d4-45c74297589e" />
<img width="1920" height="1080" alt="Screenshot (46)" src="https://github.com/user-attachments/assets/2e7076c6-49d8-42a1-aba5-78304c610767" />
<img width="1920" height="1080" alt="Screenshot (44)" src="https://github.com/user-attachments/assets/a457146f-01db-4574-9b90-3ec0a136d220" />
<img width="1920" height="1080" alt="Screenshot (43)" src="https://github.com/user-attachments/assets/1a6ecbb7-74da-432c-ae03-0cddef8ddd2b" />
