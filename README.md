# Star Wars API
This project is a challenge from our  to implement a API using REST to get data from planets according to [swapi](https://swapi.co/).

Calling the 3rd party API(Start Wars API) project using Java, Spring Boot for this solution purpose.

## Requirements:

- The API must be REST;

 - Call to 3rd party API services
 
 -  Java version 1.8 
 

- For each planet we must also have the number of movie appearances that can be obtained through the public Star Wars API: https://swapi.co/

## Desired Features:

- List Planets;

- Search by Id;


## Description:

Since this is java maven spring boot project, you need the JVM installed in your machine in order to run.

To run this project there is a Boot.java class that there is a main method, just run it or use the maven command: `mvn clean compile spring-boot:run` and see the results in [http://localhost:8080/](http://localhost:8080/)

In order to package the application run the command `mvn clean package` and see the output file `starwarsapi-1.0.0.jar` in the target folder. To run the api with the jar generated just use the command `java -jar starwarsapi-1.0.0.jar`

## Usage:


### List Planets:

Do a GET at /planets and see all planets in the Start Wars API.


### Search by Id:

Do a GET at /planets/{id}, where {id} is the id of the planet to be searched.


