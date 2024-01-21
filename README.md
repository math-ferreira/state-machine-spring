# Spring - State Machine

## Overview

This repository serves as a learning resource for understanding and implementing Spring State Machine within a Spring Boot application. The primary goal is to provide a practical guide on leveraging the Spring State Machine library to build stateful applications and integrate them seamlessly into Spring Boot projects and APIs.

## Repository Structure

The repository is organized as follows:

- **src/main/java/com/statemachine:** Contains the main Java source code for the Spring Boot application.
    - **config:** Configuration classes for Spring State Machine.
    - **controller:** API controllers for handling state transitions.
    - **service:** Service classes implementing business logic.

- **src/main/resources:** Configuration files and resources for the application.
    - **application.properties:** Spring Boot configuration file.
    - **state-machine-config.yaml:** Configuration file for defining state machine transitions.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/math-ferreira/state-machine-spring.git
```

2. Open the project in your preferred IDE.

3. Build and run the application using Maven:

```bash
./mvnw spring-boot:run
```

4. Access the API documentation at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to explore and interact with the state machine API.

## API Endpoints

The application exposes RESTful API endpoints for interacting with the state machine. Explore the Swagger UI documentation for a detailed overview of available endpoints and their functionalities.

## Learn and Contribute

Feel free to explore, experiment, and contribute to this repository. Use it as a reference for learning Spring State Machine and how to integrate it with Spring Boot applications. If you have insights, improvements, or additional features, create an issue or submit a pull request.

For more detailed information on Spring State Machine, refer to the official documentation: [https://docs.spring.io/spring-statemachine/docs/current/reference/html/](https://docs.spring.io/spring-statemachine/docs/current/reference/html/)
