# jwt-spring-boot
Jwt example with spring boot



This is the example of using JWT (JSON WEB TOKEN) for securing RestApi in spring boot 2.x



In this example Jwt token is used to secure rest api and every request need this jwt token 
so that every request to the serve will know that the user which is requested is an 
Authenticated user 



This Jwt token is generated with you hit http://localhost:8080/generate uri with valid username
and password as a raw body which is application/json


This will give you a token which is actual JWT token.


And you have to pass this token as header with a key value pair just like normal header you passed before
with a key Authorization and a value Bearer --#Your_actual_token_#--


"Bearer" word can be change to any word but you have to change it into the code too

This example is done with mysql DB ..

Thanks have a good day  :)
