# registration of people with MongoDB e SpringData

API for maintenance of people using, spring validation, springData, MongoDB.



## Running and testing the project

### Prerequisites

* MongoDB
* JDK 8
* Maven

### Step by step

use the following instruction to make a copy of the project: <br/>
`git clone https://github.com/infortic/Registration_People_with_MongoDB.git`


it is possible to use the docker to upload an image of the application, it will be accessible through port 5041. It is possible to use the swagger client through the url:<br/> `http: // localhost: 5041 / swagger-ui.html`


### 1 - Install  o MongoDB:

Installing MongoDB on windows is quite intuitive but if you have any questions, this article can be consulted: https://netovieiraleo.medium.com/instalando-e-configurando-o-mongodb-no-windows-b1d4e1e58911 <br/><br/>

It is possible to use the docker to upload an official MongoDB image. To do so, use the instruction:

`docker run --name mongodb -d mongo:latest`

this command will download MongoDB and configure it to run on port 27017 which is the default for it.

#### 2 - Configure the application properties. 

by default the `spring-boot-starter-data-mongodb` It is already configured to access Mongo on the default port and default username and password. No configuration is required to run the API, however, if necessary, apply the settings in the:

`Registration_People_with_MongoDB/src/main/resources/application.yml`

#### 3 - Buildar and run the application

Within the root directory of the application perform the steps below.

3.1 To run the tests:

## Note to run the tests remember that the maven needs to be installed. 

`$ mvn test #To run the tests`

3.2 To build the application:
`$ mvn clean install #building the application package`

3.3 To run the application:

Maven through `spring-boot-maven-plugin` generates the executable jar.
so just enter the directory `target/` and run:

`$ java -jar RegistrationPeople-0.1.jar`

From this point on, if everything happens correctly, the application will be running and fulfilling requests through the port registered in the file. `application.yml` (if not changed it will be on port 5041). <br/><br/>

It is possible to use the swagger client through the url [http://localhost:5041/swagger-ui.html]

in the swagger it is possible to perform CRUD test.
