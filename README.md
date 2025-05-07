# 🎓 NOULM Student Management Portal

A Java EE web application built using **JSP**, **Servlets**, and **MySQL** to manage student registration, login, profile management, and notice display. This portal is ideal for institutions offering open learning programs and provides an interactive interface for students.

---
---

## ✨ Features

- 🔐 **Student Login & Registration**
- 📋 **Student Profile View & Edit**
- 🗒️ **Notice Board**
- 📨 **Contact & About Pages**
- 📘 **Course Information Page**
- 🖼️ **Dynamic Profile Picture Handling**
- 🧩 **Admin and Student Panels (studentzone/adminzone)**
- 🎨 **Responsive UI using Bootstrap**

---

## 🛠️ Technologies Used

- **Java EE (JSP + Servlets)**
- **MySQL** (Backend Database)
- **JDBC** (Database Connectivity)
- **HTML/CSS/JavaScript/Bootstrap**
- **NetBeans IDE**

---

## 🔧 Database Configuration

1. Import the SQL dump (if provided) or manually create the `studentinfo` table with relevant fields such as:
   - `enrollmentno`
   - `name`
   - `contactno`
   - `emailaddress`
   - `address`
   - `profilepic`

2. Update your database connection details in `DbManager.java`:
   ```java
   public Connection getConnection() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/YOUR_DB", "root", "password");
           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
🧪 How to Run
Open the project in NetBeans IDE (or your preferred IDE).

Ensure MySQL and Apache Tomcat are installed and running.

Deploy the project using NetBeans (or export a WAR file and deploy via Tomcat Manager).

Access via: http://localhost:8080/NOULM-Student-Portal/

📸 Sample Page - Student Profile
Displays student profile details with editable options and profile picture:

jsp
Copy
Edit
<img src="<%=img%>" height="100px" width="100px" />
<%=rs.getString("name") %>
<%=rs.getString("contactno") %>
<%=rs.getString("emailaddress") %>
🙋‍♂️ Contributors
Bhawna Chauhan

📄 License
This project is for educational use only.
