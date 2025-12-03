# 🎓 Spring Boot Student CRUD API

![Spring Boot Student CRUD API Banner](./Screenshots/banner.png)


A clean and lightweight **Student Management REST API** built with Spring Boot, supporting full CRUD operations for managing student records.

---

## 🚀 Tech Stack
![Java](https://img.shields.io/badge/Java-25-007396)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-6DB33F)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-ORM-6DB33F)
![H2 Database](https://img.shields.io/badge/Database-H2%20In--Memory-4479A1)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36)

---

## 📁 Project Structure
- **Controller** – REST endpoints  
- **Service** – Business logic  
- **Repository** – JPA data access  
- **Entity** – Student entity  
- **Resources** – Configurations  
- **Screenshots** – Postman results  

---

## 🌐 API Summary
**Base URL:** `http://localhost:8080/api/student`

API Operations:
- Health check  
- Create student  
- Retrieve all students  
- Retrieve student by ID  
- Update student  
- Delete student  
- Error handling (404)  

---

## 📸 Postman Screenshots

All testing screenshots are stored in the `screenshots/` folder:

- **Home Endpoint**  
  ![Home Endpoint](./Screenshots/home.png)

- **Create Student**  
  ![Create Student](./Screenshots/create.png)

- **Get All Students**  
  ![Get All Students](./Screenshots/getall.png)

- **Get all visualisazi**
  ![Get All Students](./Screenshots/getallv.png)

- **Get Student by ID**  
  ![Get Student by ID](./Screenshots/byID.png)



- **Delete Student**  
  ![Delete Student](./Screenshots/delete.png)

  - **After Delete Student**  
  ![Delete Student](./Screenshots/after-del.png)


---

## ▶️ Running the App
1. Install Java 25 + Maven  
2. Build the project  
3. Run the Spring Boot application  
4. Access the API at **http://localhost:8080/api/student**

---

## 🗄️ Database
- Uses **H2 in-memory database**  
- Auto-creates tables  
- Data resets on restart  
- H2 console: `/h2-console`  

---

## 🧪 Postman Collection
A Postman collection is included for quick testing of all API endpoints.

---

## 🛠️ Troubleshooting
- Verify Java & Maven versions  
- Ensure port **8080** is free  
- Check H2 database settings  
- Confirm endpoint paths  

---





