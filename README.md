# fitness-app-microservices
This is a production-grade full-stack fitness application built using **Spring Boot Microservices**, **Spring Security**, **Keycloak**, and integrated with **AI-powered recommendations** for a smarter fitness experience. The project follows best practices in microservice architecture, containerization, and secure API design.

---

## 🎯 Overview

The **AI-Powered Fitness App** allows users to track their physical activities, generate AI-based personalized fitness recommendations, and interact with multiple services via a secure and scalable microservices ecosystem.

### Key Features:
- Microservices-based backend (Spring Boot)
- AI-based fitness recommendation engine
- Authentication & Authorization using Keycloak
- API Gateway for unified routing
- Dockerized architecture
- Production-ready codebase

---
## 🧾 Modules Overview

| Module               | Description                                                   |
|----------------------|---------------------------------------------------------------|
| `activityservice`     | Handles user activity data (e.g. workouts, steps, calories)   |
| `aiservice`           | Provides AI-powered fitness recommendations                   |
| `configserver`        | Centralized Spring Cloud Config Server                        |
| `eureka`              | Eureka server for service discovery                           |
| `gateway`             | Spring Cloud API Gateway for routing                          |
| `userservice`         | Manages user information and registration/login               |
| `fitness-app-frontend`| Frontend (React) for user interface                           |

---

## 🔧 Tech Stack

- **Backend:** Spring Boot, Spring Web, Spring Security, Spring Cloud
- **AI Layer:** Gemini API integrations
- **Auth:**  Keycloak, OAuth2, JWT 
- **Service Discovery:** Eureka
- **Configuration Management:** Spring Cloud Config
- **API Gateway:** Spring Cloud Gateway
- **Frontend:** React (
- **Containerization:** Docker & Docker Compose
- **Database:** PostgreSQL , MongoDB

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Docker & Docker Compose
- Node.js (for frontend)
- Git

### Running the Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/satyamkumarmishra2005/fitness-app-microservices.git
   cd fitness-app-microservices

2.Access the Services

Frontend: http://localhost:3000

API Gateway: http://localhost:8080

Eureka Dashboard: http://localhost:8761

Keycloak (if used): http://localhost:8181


📦 Project Structure


fitness-app-microservices/
├── activityservice         # Handles user activity data
├── aiservice               # AI recommendations
├── configserver            # Centralized config management
├── eureka                  # Eureka discovery service
├── gateway                 # API Gateway for routing
├── userservice             # User registration and profiles
├── fitness-app-frontend    # React UI
└── README.md


🔮 Future Enhancements
Add Prometheus + Grafana for monitoring

Integrate chat-based AI coach (using LLM)

Real-time notifications with WebSockets

Push to cloud-native deployment (Kubernetes, Helm)

🙌 Acknowledgment
This project was developed to master microservice architecture with Spring Boot and to integrate modern features like AI, secure authentication, and centralized configuration.


