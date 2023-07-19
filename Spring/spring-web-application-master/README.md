# Spring Web MVC Application example (Hello World)

## An example contains:
- Spring application initial and configuration classes
- controller with GET-method handler for the index page that returns recieved message
- index.jsp with linked css and javascript files

## Tech stack
- Java 12
- Spring 5
- Maven

## Usage
1. Clone repo
```
git clone https://github.com/VladimirFrank/spring-web-application.git
```
2. Build via Maven
```
mvn clean package
```
3. Deploy the build application (%app_root_directory%/target/spring-web-application.war)
to an Application Server (WildFly (JBoss), WebSphere, etc)
4. Go to the index page with message parameter
```
http(s)://AS_IP:AS_WEB_PORT/spring-web-application/?message=Hola%20Worlda
```
5. ...
6. Profit!
