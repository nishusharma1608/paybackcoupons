# Payback Coupons
Payback Coupons is a Rest Service which helps in fetching members and coupons from Payback's database.

Problem Statement : CodingChallenge_GMLE.pdf


## Endpoints
_allCoupons_ : Fetches all coupons

_allMembers_ : Fetches all members

_getMemberCoupons_ : Fetches all valid member coupons

_getCouponMember_ : Fetches member details for the coupon specified

## Software Requirements
1. Maven 3.0+
2. IDE(Eclipse or IntelliJ)
3. Java 17
4. MYSQL database server
5. Postman for testing

## Steps 
1. Create the Spring Boot Project from Spring Initializr
2. Create MYSQL database and define Database configurations
3. Create Entity model class
4. Create JPA Data Repository
5. Create Service class
6. Create Rest Controllers class
7. Create Custom Exceptions
8. Create Unit Tests
9. Build and Run the Project
10. Testing using Postman

##

### 1. Create the Spring Boot Project from Spring Initializr
Include web, jpa, lombok and mysql dependencies in pom

### 2. Create MYSQL database and define Database configurations
Create DB and tables with table entries mentioned in _PaybackCoupons/src/main/resources/static/db-script.sql_.
Database configurations are mentioned in _application.properties_

### 3. Create Entity model class
Create entities _Coupon_ and _Member_

location : src/main/java/data

### 4. Create JPA Data Repository
Create JPA repositories for handling connectivity, fetching query results, etc. from the database

location : src/main/java/repositories

### 5. Create Service class
Create coupon service and member service to fetch coupons and members respectively.

location : src/main/java/service

### 6. Create Rest Controllers class
Create _PaybackController_ and add methods for all the endpoints.

location : src/main/java/controller

### 7. Create Custom Exceptions
Create custom exceptions to notify the user whenever the member id or coupon id specified is invalid.

location : src/main/java/util

### 8. Create Unit Tests
Create unit tests for the controller and it's methods

location : src/test

### 9. Build and Run
Build using maven. Access the API at _http://localhost:8080/payback_

### 10. Testing using Postman
Test responses using postman

## Screenshots
Attaching screenshots for the demo

#### Database
#### Member table

![Alt text](/PaybackCoupons/screenshots/db-members.PNG?raw=true)


#### Coupon table

![Alt text](/PaybackCoupons/screenshots/db-coupons.PNG?raw=true)



#### Rest Responses
##### _allCoupons_

![Alt text](/PaybackCoupons/screenshots/allcoupons.PNG?raw=true)




##### _allMembers_

![Alt text](/PaybackCoupons/screenshots/allmembers.PNG?raw=true)




##### _getMemberCoupons_

![Alt text](/PaybackCoupons/screenshots/member%20coupons.PNG?raw=true)




##### _getCouponMember_

![Alt text](/PaybackCoupons/screenshots/coupon%20member.PNG?raw=true)




#### Exceptions
##### Member Not Found

![Alt text](/PaybackCoupons/screenshots/invalid-member.PNG?raw=true)





##### Coupon Not Found

![Alt text](/PaybackCoupons/screenshots/invalid-coupon.PNG?raw=true)






##
Author : Nishu Sharma




