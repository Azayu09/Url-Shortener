# URL Shortener REST API with Spring Boot

![Language](https://img.shields.io/badge/Language-Java-blue.svg)
![Framework](https://img.shields.io/badge/Framework-Spring%20Boot-green.svg)

A simple but powerful backend REST API built with Spring Boot that shortens long URLs, inspired by services like bit.ly. This project serves as a practical introduction to building RESTful web services using the Spring ecosystem.

## Features

- **Shorten URL**: Accepts any valid long URL and generates a unique, 6-character short key.
- **Redirect**: Redirects users from the short URL to the original long URL with an HTTP 302 status code.
- **RESTful Design**: Clean and straightforward API endpoints.
- **In-Memory Database**: Uses H2, an in-memory database, for easy setup and data persistence during the application's lifecycle.

## Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web**: For building RESTful APIs.
- **Spring Data JPA**: For data persistence.
- **Hibernate**: JPA implementation.
- **H2 Database**: In-memory relational database.
- **Maven**: For dependency management and build automation.
- **Lombok**: To reduce boilerplate code.

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You will need the following software installed on your machine:
- JDK 17 or later
- Apache Maven

### Installation & Running the Application

1. **Clone the repository**
   ```sh
   git clone [https://github.com/your-username/url-shortener.git](https://github.com/your-username/url-shortener.git)
