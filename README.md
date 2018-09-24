[![Build Status](https://travis-ci.org/systelab/identity.svg?branch=master)](https://travis-ci.org/systelab/identity)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7ce4e563c45b4d09a975d61bed7d5d50)](https://www.codacy.com/app/alfonsserra/identity?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=systelab/identity&amp;utm_campaign=Badge_Grade)
[![Known Vulnerabilities](https://snyk.io/test/github/systelab/identity/badge.svg?targetFile=pom.xml)](https://snyk.io/test/github/systelab/identity?targetFile=pom.xml)

#  Microservice `identity`

This project is simple microservice.

## Getting Started

To get you started you can simply clone the `identity` repository and install the dependencies:

### Prerequisites

You need [git][git] to clone the `identity` repository.

You will need [Java™ SE Development Kit 8][jdk-download] and [Maven][maven].

### Clone `identity`

Clone the `identity` repository using git:

```bash
git clone https://github.com/systelab/identity.git
cd identity
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
java -jar identity-1.0.jar
```

## API

You will find the swagger UI at http://localhost:8080/swagger-ui.html

## Docker

### Build docker image

There is an Automated Build Task in Docker Cloud in order to build the Docker Image. 
This task, triggers a new build with every git push to your source code repository to create a 'latest' image.
There is another build rule to trigger a new tag and create a 'version-x.y.z' image

You can always manually create the image with the following command:

```bash
docker build -t systelab/identity . 
```

### Run the container

```bash
docker run -p 8080:8080 systelab/identity
```

The app will be available at http://localhost:8080/swagger-ui.html


