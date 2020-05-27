This is Sample Spring Boot Application with Docker File.

Instuctions to Start with Docker :

1. Install Docker from Official Site and Keep running.
2. Clone the reposotory and extract on the drive
3. open CMD Terminal in extracted the folder.
4. Execute below commands: 
   i)  docker build -f Dockerfile -t spring-boot-app .
       (Used to build the docker image)
   
   ii) docker images 
       (check for images whether created or not)
       
   iii) docker run -p 8084:8084 spring-boot-app
       (it will run the application and bind with port 8084)
  
  5) open the Browser and type --> http://localhost:8084/MyApp/greeting
