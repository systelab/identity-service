[![Build Status](https://travis-ci.org/systelab/identity-service.svg?branch=master)](https://travis-ci.org/systelab/identity-service)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7ce4e563c45b4d09a975d61bed7d5d50)](https://www.codacy.com/app/systelab/identity-service?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=systelab/identity-service&amp;utm_campaign=Badge_Grade)
[![Known Vulnerabilities](https://snyk.io/test/github/systelab/identity-service/badge.svg?targetFile=pom.xml)](https://snyk.io/test/github/systelab/identity-service?targetFile=pom.xml)

# Identity Service

This project is simple microservice.

## Getting Started

To get you started you can simply clone the `identity-service` repository and install the dependencies:

### Prerequisites

You need [git][git] to clone the `identity-service` repository.

You will need [Java™ SE Development Kit 8][jdk-download] and [Maven][maven].

### Clone `identity-service`

Clone the `identity-service` repository using git:

```bash
git clone https://github.com/systelab/identity-service.git
cd identity-service
```

### Install Dependencies

In order to install the dependencies and generate the Uber jar you must run:

```bash
mvn clean install
```

### Run

To launch the server, simply run with java -jar the generated jar file.

```bash
cd target
java -jar identity-service-1.0.jar
```

## API

You will find the swagger UI at http://localhost:9090/swagger-ui.html

## Docker

### Build docker image

There is an Automated Build Task in Docker Cloud in order to build the Docker Image. 
This task, triggers a new build with every git push to your source code repository to create a 'latest' image.
There is another build rule to trigger a new tag and create a 'version-x.y.z' image

You can always manually create the image with the following command:

```bash
docker build -t systelab/identity-service . 
```

### Run the container

```bash
docker run -p 9090:9090 systelab/identity-service
```

The app will be available at http://localhost:9090/swagger-ui.html


[git]: https://git-scm.com/
[sboot]: https://projects.spring.io/spring-boot/
[maven]: https://maven.apache.org/download.cgi
[jdk-download]: http://www.oracle.com/technetwork/java/javase/downloads
[JEE]: http://www.oracle.com/technetwork/java/javaee/tech/index.html
