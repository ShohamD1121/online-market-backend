# Online Market Backend

Welcome to the Online Market Backend, built with Spring Boot on microservices architecture. This backend is comprised of the following microservices:

Product Service
Order Service
Inventory Service
Notification Service

## Microservices

### Product Service

The Product Service provides functionality to create and view products. It acts as a product catalog, providing information such as the product name, description, price, and availability. The Product Service is a critical component of the online market, as it enables customers to browse and purchase products.

### Order Service

The Order Service is responsible for managing orders placed by customers. It receives requests from the frontend to purchase products and validates that the requested products are available in the inventory. It then updates the order status and sends a notification to the customer that the order has been successfully placed.

### Inventory Service

The Inventory Service is responsible for keeping track of the availability of products. It is used by the Order Service to validate that products are in stock before an order is placed. The Inventory Service is also responsible for updating the stock levels of products after orders are placed.

### Notification Service

The Notification Service is responsible for sending email notifications to customers. It is used by the Order Service to send a confirmation email to the customer after an order has been successfully placed.


## Getting Started
To get started with the Online Market Backend, you will need to have the following installed:

- Java 17 or higher
- Maven 3.9 or higher

### To build and run the backend, follow these steps:

1. Clone the repository
2. Navigate to the root directory of the project
3. Run the following command to build the project: mvn clean install
4. Navigate to the directory of the microservice you want to run
5. Run the following command to start the microservice: mvn spring-boot:run
6. Once the microservice is up and running, you can access its endpoints through the appropriate URL.

