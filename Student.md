Create Student
```json
curl --location --request POST 'http://localhost:8080/student/' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=802E3A4F90160F1DC623EDED20EA3010' \
--data-raw '    {
    "name":"Anurag",
    "age":28,
    "email":"argmishra.ece@gmail.com"
    }'
```

Get Student
```json
curl --location --request GET 'http://localhost:8080/student/1' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=802E3A4F90160F1DC623EDED20EA3010'
```

Update Student 
```json
curl --location --request PUT 'http://localhost:8080/student/1' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=802E3A4F90160F1DC623EDED20EA3010' \
--data-raw '    {
    "name":"Anurag",
    "age":32
    }'
```

Delete Student
```json
curl --location --request DELETE 'http://localhost:8080/student/1' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=802E3A4F90160F1DC623EDED20EA3010'
```