# 🚀 Legacy Accounting Report Optimization

## 📘 Description

This project simulates one of my favorite challenges in my career as a **Fullstack Developer (Spring Boot + Angular)**.  
As a Fullstack Developer, I encountered a performance issue in the **Accounting Reporting Module**. The report generation process took a long time — between 20 and 30 minutes per request.  
Naturally, this was not optimal for our end users.

### 🔍 Problem Analysis

After debugging and reviewing the code, I identified the following issues:

1. The data sources were from a third-party provider and used Oracle.
2. Each customer had their own database, and each of them could also have their own sub-customers.
3. The SQL queries were huge, as the PL/SQL contained a lot of embedded business rules.
4. I used `JdbcTemplate` since there were many data sources and their schemas were outside of our control.
5. The microservice needed to be broken down into smaller components.
6. The report had multiple search criteria, such as customer name and date range.
7. The report’s output remained mostly the same because it was based on historical accounting data. For example, the totals for January 1, 2025, would always be the same — except for the current date.

### 🛠️ Solution

1. Extracted the large query into a scheduled ETL job to avoid recalculating data on every request.
2. Created a new schema to store simplified accounting report data.
3. Used the ETL job to process and populate the new schema.
4. Built a new microservice to serve data from this schema.

As a result, the accounting report performance improved drastically — from **minutes to seconds**.  
I was **over the moon**. It had been a very difficult problem for me, and it took a long time to solve.

---

## 💡 Reflection and Motivation

Over time, I have learned new concepts such as **caching**, **horizontal scaling**, and other tools.  
I don’t believe my previous solution was either perfect or terrible — it was simply the best I could do at the time, with the knowledge and creativity I had.

Now, I want to **recreate this scenario** and explore alternative approaches using my current knowledge.  
This side project won’t be exactly the same as the original, but the main idea is to simulate a similar scenario on a smaller scale.  

For example, I will use **two PostgreSQL databases**, each representing a different customer, with more than **1 million records** to simulate real-world volume.

I’ll document this journey on my blog — both the **process and the lessons learned**.

---

## 🧰 Technology Stack

| Tool         | Description                             |
|--------------|-----------------------------------------|
| Java 17      | Core language                           |
| Spring Boot  | Java framework                          |
| PostgreSQL   | Open-source relational database         |
| Docker       | Containerization platform               |
| Node.js      | JavaScript runtime (V8 engine)          |
| Artillery    | Load testing tool                       |
