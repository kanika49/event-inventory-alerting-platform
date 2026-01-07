# Event-Driven Inventory & Alerting Platform

## Overview
This project demonstrates a backend system designed to process inventory updates asynchronously. It uses an event-driven architecture to decouple inventory changes from alert generation, improving scalability and reliability.

## Tech Stack
- Java
- SQL (PostgreSQL/MySQL)
- Asynchronous Messaging (In-memory Queue / RabbitMQ)

## Features
- Event-driven inventory processing
- Producer-consumer architecture for alert generation
- Fault-tolerant processing with retry and idempotency
- Structured logging and metrics for observability and performance
  
## How to Run
1. Clone the repository
2. Compile all Java files
3. Run `MainApplication.java`

## Sample Output
- Inventory events published
- Alerts triggered for low stock 

## Key Learnings
- Asynchronous processing
- Scalable and fault-tolerant system design
- Event-driven architecture
