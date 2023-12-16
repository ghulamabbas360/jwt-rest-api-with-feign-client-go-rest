# jwt-rest-api-with-feign-client

jdk 17 required

steps for runing project

# 1.mvn clean

# 2.mvn install 

# 3.mvn spring-boot:run

#====================================================================================
steps for testing api's
# 1 for login JWT auth below is curl

curl --location --request POST 'localhost:8080/api/v1/auth' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username":"abbas",
    "password":"abbas"
}'

# 2 for users,posts,comments api curl is given below

please pass the token as authorization

curl --location --request GET 'localhost:8080/api/v1/users' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmJhcyIsImlhdCI6MTcwMjc0NjUwNiwiZXhwIjoxNzAyNzQ2NTc2fQ.ddmrw-t7NdXWaOYty2wvhyOd3LOieJ1niWaJabP3iX8'
