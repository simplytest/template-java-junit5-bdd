# Template for Java with JUnit5, Cucumber7 and Allure

Getting started with a Project from scratch can sometimes use a little jump start.
This template helps you getting started with setting up a project with Cucumber v7 in a JUnit5 - Jupiter Test-Framework.
Combined with a nice Allure report in place to convince your management.

For a German Guide check this link: https://www.testautomatisierung.org/java-projekt-mit-junit5-cucumber7-und-allure/

## What you get

This project has a single scenario described in the example.feature file.
These sentences are linked by the cucumber test runner to the MyStepdefs.java file where the execution is implemented.
The allure report is integrated with the configuration and you can start right off with writing new sentences to the scenario or start writing your own scenarios right away.

## Prerequisites

You need :

* an installed JDK
* Apache Maven
* IDE or Texteditor of your choice
* have allure installed https://allurereport.org/docs/gettingstarted/installation/ 

## How to start

Download or clone the repository.
Open a console in the root of this repository, where the pom.xml files resides.
Run:

    mvn test

You should get a green message of "BUILD SUCCESS".
Now run

    allure generate --clean
    allure open

The second command will launch a local web server and present the allure report in your default browser.
Have fun organizing your Behavior Driven Testing.
