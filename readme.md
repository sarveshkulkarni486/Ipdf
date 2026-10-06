# 📄 iPDF — Dynamic PDF Generator

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/iText-PDF%20Generation-red?style=for-the-badge" alt="iText"/>
  <img src="https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven"/>
  <img src="https://img.shields.io/badge/REST%20API-Backend-6DB33F?style=for-the-badge" alt="REST API"/>
</p>

<p align="center">
  <b>🚀 A Spring Boot based application for generating professional, dynamic and highly formatted PDF documents using iText.</b>
</p>

---

## 🌟 Overview

**iPDF** is a backend application built with **Java and Spring Boot** that generates professional PDF documents dynamically from data received through a REST API.

The application uses **iText** to create and format PDF documents with:

- 📑 Custom document layouts
- 🎨 Styled headers and footers
- 📊 Dynamic tables
- 🖋️ Custom fonts and font sizes
- 🌈 Background colors and text styling
- 📐 Custom margins and spacing
- 🔢 Page numbering
- 📋 Dynamic request-based data
- 🧩 Reusable PDF components

The goal of the project is to provide a flexible foundation for applications that need to generate **invoices, reports, statements, certificates, forms and other business documents** programmatically.

---

## ✨ Features

| Feature | Description |
|---|---|
| 📄 PDF Generation | Generate PDFs dynamically using iText |
| 🎨 Styling | Customize colors, fonts, sizes and layouts |
| 📊 Dynamic Tables | Create tables from request data |
| 🧾 Header & Footer | Add reusable headers and footers |
| 🔢 Page Numbers | Automatically display page numbers |
| 📐 Layout Control | Configure margins, spacing and alignment |
| 🌐 REST API | Generate PDFs through HTTP requests |
| 📦 Maven | Dependency and project management |
| 🔄 Dynamic Content | PDF content is generated from API request data |

---

## 🏗️ Project Architecture

```text
                    ┌──────────────────────┐
                    │      Frontend        │
                    │   Web Application    │
                    └──────────┬───────────┘
                               │
                               │ HTTP Request
                               ▼
                    ┌──────────────────────┐
                    │    REST Controller   │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │     PDF Service      │
                    │                      │
                    │  Business Logic      │
                    │  PDF Formatting      │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │        iText         │
                    │   PDF Generation     │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │     Generated PDF    │
                    └──────────────────────┘
```

---

## 🛠️ Technology Stack

### Backend

- ☕ **Java 21**
- 🌱 **Spring Boot**
- 🌐 **Spring Web / REST API**
- 📄 **iText**
- 📦 **Maven**

### Development Tools

- 💻 **Visual Studio Code**
- 🔧 **Git**
- 🐙 **GitHub**
- 🧪 **Postman**

---

## 📁 Project Structure

```text
Ipdf/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
├── .gitignore
└── README.md
```

> The exact package structure may vary depending on the implementation.

---

## 🔄 Application Flow

```text
Client
  │
  │ POST PDF Request
  ▼
REST Controller
  │
  │ Validate Request
  ▼
PDF Service
  │
  ├── Create Document
  │
  ├── Configure Page Size
  │
  ├── Add Header
  │
  ├── Add Details
  │
  ├── Create Dynamic Table
  │
  ├── Apply Styling
  │
  ├── Add Footer
  │
  └── Add Page Number
  │
  ▼
iText PDF Engine
  │
  ▼
Generated PDF 📄
```

---

## 📡 API

### Generate PDF

```http
POST /api/pdf/generate
```

### Request

Example request:

```json
{
  "title": "Employee Report",
  "employeeName": "John Doe",
  "employeeId": "EMP001",
  "department": "Software Development",
  "email": "john@example.com"
}
```

### Response

The API generates a PDF document containing the supplied information and returns the generated PDF to the client.

---

## 🎨 PDF Design

The generated PDF can contain multiple professionally styled sections:

### Header

```text
┌─────────────────────────────────────────────┐
│                  iPDF                       │
│             PDF GENERATION                  │
└─────────────────────────────────────────────┘
```

### Details Section

```text
Employee Information

Name        : John Doe
Employee ID : EMP001
Department  : Software Development
Email       : john@example.com
```

### Dynamic Table

```text
┌────────────┬──────────────┬──────────────┐
│ ID         │ Description  │ Amount       │
├────────────┼──────────────┼──────────────┤
│ 001        │ Service A    │ ₹10,000      │
│ 002        │ Service B    │ ₹15,000      │
│ 003        │ Service C    │ ₹12,000      │
└────────────┴──────────────┴──────────────┘
```

### Footer

```text
Generated by iPDF                         Page 1
```

---

## 🚀 Getting Started

### Prerequisites

Make sure the following are installed:

- ☕ Java 21 or compatible JDK
- 📦 Maven
- 💻 Visual Studio Code / IntelliJ IDEA / Eclipse
- 🐙 Git
- 🧪 Postman (optional)

Verify Java:

```bash
java -version
```

Verify Maven:

```bash
mvn -version
```

---

## 📥 Clone the Repository

```bash
git clone https://github.com/sarveshkulkarni486/Ipdf.git
```

Move into the project:

```bash
cd Ipdf
```

---

## ▶️ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or build the project:

```bash
mvn clean package
```

Then run the generated JAR:

```bash
java -jar target/Ipdf-*.jar
```

The application will normally start on:

```text
http://localhost:8080
```

---

## 🧪 Testing with Postman

You can test the PDF generation API using **Postman**.

### Request

```text
POST http://localhost:8080/api/pdf/generate
```

Select:

```text
Body → raw → JSON
```

Then provide the required PDF request data.

Example:

```json
{
  "title": "Monthly Report",
  "employeeName": "Sarvesh Kulkarni",
  "employeeId": "EMP001",
  "department": "Software Development"
}
```

Click:

```text
Send 🚀
```

The API will generate the PDF.

---

## 🧩 Future Enhancements

The project can be extended with:

- 🖥️ Frontend PDF generation interface
- 📤 PDF download functionality
- 👁️ PDF preview
- 📧 Email generated PDFs
- ☁️ Cloud storage integration
- 🗂️ PDF template management
- 🖼️ Logo/image support
- 🔐 Authentication and authorization
- 📊 Advanced report generation
- 📑 Multiple PDF templates
- 💾 Database-driven PDF templates
- 🧾 Invoice generation
- 📈 Business report generation

---

## 🔐 Security Considerations

When deploying this application in a production environment:

- Never commit passwords or secrets.
- Never commit API keys.
- Use environment variables for sensitive configuration.
- Add authentication and authorization where required.
- Validate incoming request data.
- Restrict access to generated documents.
- Avoid storing sensitive PDF data unnecessarily.

---

## 🤝 Contributing

Contributions are welcome! 🎉

### 1. Fork the repository

```bash
git clone https://github.com/sarveshkulkarni486/Ipdf.git
```

### 2. Create a branch

```bash
git checkout -b feature/new-feature
```

### 3. Make your changes

```bash
git add .
```

### 4. Commit

```bash
git commit -m "Added new PDF feature"
```

### 5. Push

```bash
git push origin feature/new-feature
```

Then create a Pull Request on GitHub.

---

## 📜 License

This project is currently intended for learning and development purposes.

A suitable open-source license can be added in the future depending on the project's usage and distribution requirements.

---

## 👨‍💻 Author

### Sarvesh Kulkarni

💻 Java Developer | Spring Boot Developer | Backend Developer

<p>
  <a href="https://github.com/sarveshkulkarni486">
    <img src="https://img.shields.io/badge/GitHub-Sarvesh%20Kulkarni-black?style=for-the-badge&logo=github" alt="GitHub"/>
  </a>
</p>

---

## ⭐ Support

If you find this project useful, consider giving it a ⭐ on GitHub!

<p align="center">
  <b>Built with ❤️ using Java, Spring Boot & iText</b>
</p>
