# Product CRUD API with Java Spring Boot & PostgreSQL

## 📌 Deskripsi Singkat
Proyek ini adalah RESTful API untuk **manajemen produk** dan **kategori** menggunakan **Java Spring Boot**. API ini mendukung operasi CRUD (Create, Read, Update, Delete) untuk **Produk** dan **Kategori**, dengan validasi serta auto-generate kode produk.

## 📑 Fitur Utama
✅ **Product API** (List, Create, Read, Update, Delete)  
✅ **Category API** (List, Create)  
✅ **Auto-generate kode produk** jika kosong, atau meningkatkan angka di belakang jika sudah ada  
✅ **Validasi data** untuk memastikan input benar  
✅ **Penyimpanan data dengan PostgreSQL**  
✅ **Swagger API Documentation**  
✅ **Dockerfile** untuk menjalankan di lingkungan **Docker**  

## 🛠️ Teknologi yang Digunakan
- **Java 21**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **PostgreSQL**  
- **Swagger (SpringFox)**  
- **Docker**  

## 🔧 Instalasi & Menjalankan Proyek

### **1️⃣ Clone Repository**
```sh
git clone https://github.com/your-username/product-crud.git
cd product-crud
```

### **2️⃣ Konfigurasi Database**  
Edit `application.properties` atau gunakan **environment variables**:  
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product_db
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### **3️⃣ Jalankan Aplikasi**  
Jalankan aplikasi dengan perintah:  
```sh
mvn spring-boot:run
```
atau  
```sh
./mvnw spring-boot:run
```

### **4️⃣ Akses API Documentation**  
Setelah aplikasi berjalan, buka Swagger UI:  
```
http://localhost:8080/swagger-ui/
```

## 📦 Menjalankan dengan Docker  
1. **Build Docker Image**  
   ```sh
   docker build -t product-crud .
   ```
2. **Jalankan Container**  
   ```sh
   docker run -p 8080:8080 product-crud
   ```

## 📬 API Endpoints

### **🔹 Product API**  
| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/products` | Get all products |
| `POST` | `/api/products` | Create new product |
| `GET` | `/api/products/{id}` | Get product by ID |
| `PUT` | `/api/products/{id}` | Update product |
| `DELETE` | `/api/products/{id}` | Delete product |

### **🔹 Category API**  
| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/categories` | Get all categories |
| `POST` | `/api/categories` | Create new category |

## 📜 Lisensi  
Proyek ini menggunakan lisensi **MIT**. Silakan gunakan dan kontribusi! 🚀

