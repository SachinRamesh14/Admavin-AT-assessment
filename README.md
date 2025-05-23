# ToDoMVC Automation Testing with Selenium and Allure

## Description
This project automates the [ToDoMVC React App](https://todomvc.com/examples/react/dist/) using Java, Selenium WebDriver, TestNG, and Allure Reports.

## Requirements
- Java 11+
- Maven
- ChromeDriver installed and in PATH
- Allure CLI (for report)

## Run Tests
```
mvn clean test
```

## Generate Allure Report
```
allure serve target/allure-results
```

## Features
- Page Object Model structure
- Selenium WebDriver test automation
- Task addition, completion, deletion
- Allure report integration
