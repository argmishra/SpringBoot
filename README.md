Spring Boot 
==========

## Spring Boot
The spring boot application is developed on basis of the RAD (Rapid Action Development) feature of the spring framework which supports to development of a stand-alone application with minimal configuration. It is built on top of the spring framework and supports easy and faster ways to set up, configure and run applications.

## Goals
Spring boot has below goals to reduce efforts on development, unit test and integration test.
1. Adopt an opinionated development approach.
2. No XML configuration.
3. Not many annotations.
4. Avoid too many import statements.

## Advantages
1. It is a stand-alone application that can be started using a java jar file.
2. It can be deployed on in-build Jetty or Tomcat Server.
3. It has production-ready services like health check, metrics etc.
4. It has opinionated starter POMs to simplify maven configuration.
5. It does not have an XML configuration.
6. It avoids boilerplate codes in the application.
7. It has many in-build plugins.

## Features
1. Web Application
2. Spring Application 
3. Admin Features
4. YAML Support
5. Property Files 
6. Logging
7. Security
8. Type-Safe Configuration

## Difference between Spring and Spring Boot
| S. No.| **Spring**                             |**Spring Boot**                                    |
|-------| ---------------------------------------|---------------------------------------------------|
| 1     | To develop web applications            | To develop stand-alone applications                |
| 2     | Primary feature is dependency injection| Primary feature is auto configuration             |
| 3     | Builds loosely coupled application     | Builds stand-alone application                     |
| 4     | Need an external server for deployment | In-built server for deployment                    |
| 5     | No in-memory database                  | Supports H2 database and plugins                  |
| 6     | More boiler plate code                 | Less boiler plate code                            |
| 7     | Define dependencies in pom manually    | Uses starter of pom to auto-download dependencies |

## Difference between Spring MVC and Spring Boot
| S. No.| **Spring MVC**                     |**Spring Boot**                          |
|-------| -----------------------------------|-----------------------------------------|
| 1     | It uses MVC design pattern         | It uses packaging strategy              |
| 2     | Deployment descriptor is mandatory |  Deployment descriptor is not mandatory |
| 3     | Specify each dependency separately | Dependency and code are a singular unit |
| 4     | Manual configuration is required   | Support auto configuration              |
| 5     | Provides ready to use features     | Default configuration                   |
| 6     | Slow development                   | Fast development                        |

## Spring Boot Architecture
1. **Presentation Layer** = JSON Translation and Authentication
2. **Business Layer**     = Authorization, Validation and Business Logic
3. **Persistence Layer**   = Storage Logic      
4. **DataBase**            = Actual DB          

## Code Samples
1. Call end-point to show a constant string from property file. (http://localhost:8080/hello?prefix=Mr)
2. Call end-point to show a constant user define object. (http://localhost:8080/user)
3. Call end-point to actuator. (http://localhost:8080/actuator)
4. Call end-point for CRUD operations with H2 database. (http://localhost:8080/student)
5. Swagger Integration (http://localhost:8080/swagger-ui.html)
6. Generic Exception Handling and Validations
7. Static and Dynamic Filtering
8. Data Base Mapping example (http://localhost:8080/author)
9. Basic Authentication.