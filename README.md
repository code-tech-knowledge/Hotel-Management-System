# Hotel Management System

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/) [![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/) [![NetBeans](https://img.shields.io/badge/NetBeans-IDE-blue?style=for-the-badge&logo=apache-netbeans-ide)](https://netbeans.apache.org/)

A modern, user-friendly Hotel Management System built with Java and Swing, designed to streamline hotel operations such as guest check-in, check-out, and room management. This project is ideal for learning, extending, or deploying in small to medium-sized hotels.

[GitHub Repository](https://github.com/code-tech-knowledge/Hotel-Management-System)

---

## 🚀 Demo

![Welcome Screen](src/icons/first.jpg)
![Login Screen](src/icons/second.jpg)

---

## ✨ Features
- Animated welcome screen
- Secure login functionality
- Room and guest management modules
- Modular, scalable codebase
- Easy to extend (add billing, booking, etc.)
- Clean, intuitive Swing-based GUI

---

## 📁 Project Structure
- `src/hotel/management/system/` — Main Java source files
- `src/icons/` — Image resources for the UI
- `nbproject/` — NetBeans project configuration
- `build.xml`, `manifest.mf` — Build and manifest files

---

## 🛠️ Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended)

### Setup Instructions
1. Clone this repository:
   ```
   git clone https://github.com/code-tech-knowledge/Hotel-Management-System.git
   ```
2. Open NetBeans IDE.
3. Go to `File > Open Project` and select the project directory.
4. Build the project to resolve dependencies and compile the code.
5. Run the project. The main entry point is `HotelManagementSystem.java`.

### Running from Command Line
1. Navigate to the `src` directory:
   ```
   cd src
   ```
2. Compile the Java files:
   ```
   javac hotel/management/system/*.java
   ```
3. Run the main class:
   ```
   java hotel.management.system.HotelManagementSystem
   ```

---

## 📦 Dependencies
- Java SE (Swing for GUI)
- Image resources in `src/icons/`

---

## 🖼️ Screenshots
| Welcome Screen | Login Screen | Room Management |
|:--------------:|:------------:|:---------------:|
| ![Welcome](src/icons/first.jpg) | ![Login](src/icons/second.jpg) | ![Room](src/icons/fourth.jpg) |

---

## 📚 Usage
- On launch, the application displays a welcome screen with animated text and a "Next" button.
- Clicking "Next" proceeds to the login screen (ensure the `Login` class is implemented).
- After login, access room and guest management features.
- Extend the system by adding modules for booking, billing, and more.

---

## 🤝 Contributing
Contributions are welcome! To contribute:
1. Fork the repository
2. Create a new branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

---

## ❓ FAQ
**Q: Can I use this project for commercial purposes?**
A: This project is for educational purposes. Please contact the owner for commercial licensing.

**Q: How do I add new features?**
A: Follow the modular structure in `src/hotel/management/system/` and refer to existing classes for guidance.

**Q: Where are the images/icons?**
A: All images are in the `src/icons/` directory.

---

## 📬 Contact
For questions, suggestions, or support, please open an issue on [GitHub](https://github.com/code-tech-knowledge/Hotel-Management-System/issues) or contact the project owner via the repository.

---

## 📝 License
This project is for educational purposes. For licensing details, please check with the project owner.

---

## 🙏 Acknowledgments
- Developed as a Java Swing project for hotel management.
- Images used are located in the `src/icons/` directory.
- Inspired by open-source hotel management solutions.
