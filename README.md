# IDOR Prevention Application

This is a web application developed using Java Spring Boot to detect and prevent Insecure Direct Object References (IDOR) related to primary keys. The application provides a user interface for users to access and modify data, implementing security measures to prevent unauthorized access to sensitive resources.

## Project Objectives

1. **IDOR Simulation:**
   - Develop a module that simulates Insecure Direct Object References (IDOR) attempts related to primary keys.
   - Implement a mechanism to identify and log IDOR attempts in real-time.

2. **IDOR Prevention:**
   - Implement secure access control mechanisms to prevent unauthorized access to sensitive resources.
   - Validate and sanitize user input to prevent direct object references.
   - Implement proper authentication and authorization checks to ensure users can only access resources they are authorized to access.

3. **User Interface (UI):**
   - Design and develop an intuitive and user-friendly web interface using HTML, CSS, and JavaScript.
   - Include interactive elements for users to access and modify data while ensuring secure access controls.
   - Display informative error messages and alerts for unauthorized access attempts or invalid inputs.

4. **Docker Containerization:**
   - Dockerize the entire application, including all dependencies and configurations, into a Docker container.
   - Provide Dockerfile(s) and docker-compose.yml (if applicable) for building the Docker image.
   - Ensure the application can be easily deployed and run in any environment using Docker containers.

## Deliverables

1. **Source Code:**
   - Clean, well-documented, and organized Java Spring Boot source code implementing IDOR detection and prevention mechanisms.
   - HTML, CSS, and JavaScript files for the user interface.

2. **Docker Containerization:**
   - Dockerfile(s) and docker-compose.yml (if applicable) for building the Docker image.
   - Instructions for building the Docker image:
     ```
     docker build -t idor-prevention-app .
     ```
   - Instructions for running the Docker container:
     ```
     docker run -p 8080:8080 idor-prevention-app
     ```
   - Guidelines for deploying the Docker container in various environments (development, testing, production).

3. **Documentation:**
   - Detailed technical documentation explaining the implemented IDOR detection and prevention strategies.
   - User guide describing how to interact with the UI and understand the application responses.
   - Clear instructions for Docker build and run steps.

## Evaluation Criteria

- Successful implementation of IDOR detection and prevention mechanisms.
- User interface design and interactivity.
- Quality of documentation and clarity of Docker build and run instructions.
- Adherence to best practices and security standards.

Please refer to the source code and documentation for more details on the implementation of the IDOR prevention application.