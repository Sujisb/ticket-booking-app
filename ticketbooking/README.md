# Ticket Booking - Spring Boot + MySQL + HTML/CSS

## Quick setup

1. Create database:
   ```sql
   CREATE DATABASE ticketdb;
   ```

2. Update `src/main/resources/application.properties` if your DB credentials differ (currently username=root password=root).

3. Build & run:
   ```bash
   mvn clean package
   mvn spring-boot:run
   ```

4. Open frontend:
   http://localhost:8080/index.html

## APIs
- GET /api/tickets
- POST /api/tickets
- PUT /api/tickets/{id}
- DELETE /api/tickets/{id}
