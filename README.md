# Hotel Management System

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/) [![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/) [![NetBeans](https://img.shields.io/badge/NetBeans-IDE-blue?style=for-the-badge&logo=apache-netbeans-ide)](https://netbeans.apache.org/) [![MySQL](https://img.shields.io/badge/MySQL-DB-blue?style=for-the-badge&logo=mysql)](https://www.mysql.com/)

A modern, user-friendly Hotel Management System built with Java and Swing, designed to streamline hotel operations such as guest check-in, check-out, room booking, and food ordering. This project also integrates a MySQL database for storing hotel-related data.

[GitHub Repository](https://github.com/code-tech-knowledge/Hotel-Management-System)

---

## 🚀 Demo

![Welcome Screen](src/icons/first.jpg)
![Login Screen](src/icons/second.jpg)

---

## ✨ Features
- Animated welcome screen
- Secure login functionality
- Room, guest, and food order management
- Java + MySQL database integration
- Modular, scalable codebase
- Clean, intuitive Swing-based GUI

---

## 📁 Project Structure
- `src/hotel/management/system/` — Main Java source files
- `src/icons/` — Image resources for the UI
- `nbproject/` — NetBeans project configuration
- `build.xml`, `manifest.mf` — Build and manifest files
- `Hotel management project all sql code.sql` — SQL file containing all DB schemas

---

## 🛠️ Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended)
- MySQL Server (Workbench or CLI)

### Setup Instructions

#### 1. Clone the repository
```bash
git clone https://github.com/code-tech-knowledge/Hotel-Management-System.git
```

#### 2. Setup the MySQL Database
- Open **MySQL Workbench** or any MySQL client
- Run the provided SQL file:
  ```
  Hotel management project all sql code.sql
  ```
  This creates necessary tables such as:
  - `admin_login`
  - `rooms`
  - `guests`
  - `food_orders`
  - and others used in the application

- Update your database connection credentials in the Java code (usually in a `DBConnection` or similar class).

#### 3. Open the Project in NetBeans
- Launch NetBeans IDE
- Go to `File > Open Project` and select the project directory
- Clean and Build the project to compile all Java files

#### 4. Run the Project
- Main entry point: `HotelManagementSystem.java`

### Running from Command Line
```bash
cd src
javac hotel/management/system/*.java
java hotel.management.system.HotelManagementSystem
```

---

## 📦 Dependencies
- Java SE (Swing for GUI)
- MySQL (for data storage)
- JDBC Driver for MySQL (included in the project lib or manually added)

---

## 🖼️ Screenshots
| Welcome Screen | Login Screen | Room Management |
|:--------------:|:------------:|:---------------:|
| ![Welcome](src/icons/first.jpg) | ![Login](src/icons/second.jpg) | ![Room](src/icons/fourth.jpg) |

---

## 📚 Usage
- Launch the app and login with valid admin credentials
- View and manage room bookings
- Add or update guest check-ins and check-outs
- Manage food orders
- Extend with billing, calendar booking, reports, etc.

---

## 🤝 Contributing
We welcome contributions!  
**Steps:**
1. Fork the repo  
2. Create a branch: `git checkout -b feature/MyFeature`  
3. Commit: `git commit -m "Add feature"`  
4. Push: `git push origin feature/MyFeature`  
5. Open a pull request  

---

## ❓ FAQ

**Q: How do I change the database connection?**  
A: Locate the database connection class and update the JDBC URL, username, and password.

**Q: What if the images/icons are not loading?**  
A: Ensure the path to the `src/icons/` folder is correct and images are not renamed.

**Q: Can I use this project for college or learning?**  
A: Yes! This is ideal for academic and personal learning use.

---

## 📬 Contact
Raise an issue on the [GitHub issues page](https://github.com/code-tech-knowledge/Hotel-Management-System/issues)  
or connect with the project author via GitHub.

---

## 📝 License
This project is intended for educational purposes only. For commercial use, please contact the author for permission.

---

## 🙏 Acknowledgments
- Java Swing for GUI development  
- MySQL for robust data storage  
- Open-source inspiration and community support
