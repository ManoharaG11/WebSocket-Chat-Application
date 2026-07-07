# WebSocket Chat Application (Spring Boot)

## 🚀 Overview

A real-time chat application built using **Spring Boot**, **WebSocket**, **STOMP**, and **SockJS**. The application enables multiple users to communicate instantly through a browser-based interface with live message broadcasting.

## ✨ Features

- 💬 Real-time messaging
- 👥 Multi-user chat support
- 🔌 WebSocket communication
- ⚡ STOMP messaging protocol
- 🌐 SockJS fallback support
- 🎨 Responsive web interface
- 🚀 Spring Boot backend
- 📡 Instant message broadcasting

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring WebSocket
- STOMP Protocol
- SockJS
- Maven
- HTML
- CSS
- JavaScript

---

## 📂 Project Structure

```text
chat/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   │   └── static/
│   │   │       └── chat.html
│   │   └── application.properties
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## ⚙️ Installation

### Clone the Repository

```bash
git clone https://github.com/yourusername/websocket-chat.git
```

### Navigate to the Project

```bash
cd websocket-chat
```

### Run the Application

**Windows**

```bash
mvnw.cmd spring-boot:run
```

**Linux / macOS**

```bash
./mvnw spring-boot:run
```

The application will start on:

```
http://localhost:8081
```

---

## 🌐 Access the Application

Open your browser and visit:

```
http://localhost:8081/chat.html
```

---

## 🔗 WebSocket Endpoints

| Endpoint | Description |
|-----------|-------------|
| `/ws` | WebSocket Connection |
| `/topic/public` | Public Message Broadcast |
| `/app/chat.join` | Join Chat |
| `/app/chat.leave` | Leave Chat |
| `/app/chat.sendMessage` | Send Message |

---

## 📌 Future Enhancements

- User Authentication
- Private Messaging
- Online User Status
- Chat History
- File Sharing
- Emoji Support
- Typing Indicators
- Dark Mode

---

## 📄 License

This project is licensed under the Apache 2.0 License.

---

## 👨‍💻 Developed By

**G Manohara**

