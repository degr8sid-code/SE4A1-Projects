# SE4A1-Projects
OS Lab End Semester GitHub Actions (Building And Testing Java With Maven) project

## Java Maven

Maven is a build automation tools used primarily for Java projects. It is a powerful project management tool that is based on POM (Project Object Model). It is used for projects build, dependency and documentation.
> Maven makes a project easy to build also provides uniform build process (maven project can be shared by all the maven projects)


The common features of Maven are following:

1. Dependency management includes automation updating
2. Consistent usage across all projects
3. Instant access to new features with little or no extra configuration

## Prerequisites

- Java
- IntelliJ IDEA Community Edition

## Github Action
GitHub Actions is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline. You can create workflows that build and test every pull request to your repository, or deploy merged pull requests to production.

### Build Actions
Create maven.yml file in the workflow directory

![Screenshot from 2022-07-15 13-39-56](https://user-images.githubusercontent.com/80242957/179191706-39825f72-61d4-46fb-9182-baff5fabcace.png)


### Project Object Model
A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project. It contains default values for most projects.

Create pom.xml file in project directory

![Screenshot from 2022-07-15 13-41-41](https://user-images.githubusercontent.com/80242957/179192542-08aefb17-1642-4d18-ac2e-8238f142132c.png)


## Test Cases

### Open IDE

For Using IDE [IntelliJ Idea] open console and write intellij-idea-community
![Screenshot from 2022-07-15 14-57-33](https://user-images.githubusercontent.com/80242957/179200781-595d684a-baa0-4b28-8cde-46c368c366d7.png)

Create Test case file with java extension in the project source directory src/test/java/
For Testing, 2 test cases have made of all 4 methods [Addition, Subtraction, Multiplication, Division] shown as below

### Source Code

![Screenshot from 2022-07-15 14-18-48](https://user-images.githubusercontent.com/80242957/179194211-7216cc39-48ae-4315-867c-c561d5d47a5b.png)


### Output

![Screenshot from 2022-07-15 14-38-34](https://user-images.githubusercontent.com/80242957/179197710-b8351dfa-2066-4768-a350-d302b071af8f.png)


