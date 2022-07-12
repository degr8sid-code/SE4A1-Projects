# SE4A1 - Projects
This repository consists of projects by SE-4A1.

## Docker

Docker is an open source platform that enables developers to build, deploy, run, update and manage containers—standardized, executable components that combine application source code with the operating system (OS) libraries and dependencies required to run that code in any environment.

### System Requirements

Docker does not have any special requirement, it runs on all modern operating systems like Linux, Windows & MacOS.


## Installing Docker

Install Docker using apt package manager

    sudo apt install docker.io

![docker install apt](/steps/1.jpeg)

Install Docker using snap then checking version and status

    sudo snap install docker
    docker --version
    sudo systemctl status docker

![docker install apt](/steps/2.jpeg)


## Creating Docker Container

First lets check all the available Docker images then check all the running Docker containers

    sudo docker images
    sudo docker ps -a

![docker install apt](/steps/3.jpeg)

### Creating Node application

first run the following command:

    npm init -y


![docker install apt](/steps/9.jpeg)

create file named **app.js** and add the following code:

    console.log("Hello from Node");

![docker install apt](/steps/4.jpeg)

then create a file named **Dockerfile** and add the following code:

    FROM node:16
    WORKINGDIR /app
    COPY ./ /app
    CMD ["node", "app.js"]

![docker install apt](/steps/5.jpeg)

now lets build the container from node image

    sudo docker build -t node-app .

![docker install apt](/steps/11.jpeg)

finally, lets run the container, check logs and check running containers

    sudo docker run -it --name "node-app-demo" -d node-app
    sudo docker logs node-app-demo
    sudo docker ps -a

![docker install apt](/steps/10.jpeg)

