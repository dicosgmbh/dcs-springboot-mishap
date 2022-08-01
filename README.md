# mishap

Spring Boot RESTful services 

Unfortunately we have problems to secure the rest-call /rest/mystery with basic auth.

We would be grateful if someone could help us to solve the problem.


# Installing dependencies

project is managed by maven. Version 3.6.3 recommended

mvn install

# Running the Application

mvn spring-boot:run

Server is running on port 8081

# REST-Endpoints

http://localhost:8081/mishap/rest/ok

check if server is up and running 


http://localhost:8081/mishap/rest/mystery/secured

the access to this endpoint should be secured with basic auth, but unfortunately the code isn't working.

