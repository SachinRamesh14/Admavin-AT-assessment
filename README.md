# Admavin-AT-assessment

This repository contains the solution to the ** Automation Assignment** as provided by **Admavin**.  
The tasks were implemented using:
- 💻 Java + Selenium WebDriver
- ✅ TestNG (test framework)
- 🧱 Page Object Model
- 📊 Allure Reporting
- 🧪 Manual + Automated Testing coverage

Manual test answers entered in the google sheet.
Task 1, 3 and 4 Google Sheet link = "https://docs.google.com/spreadsheets/d/1kMlOBGa1HOSYG1hlV2SgXQEbSKkct3JFfpeuzNXp4oE/edit?usp=sharing"
 open this link for task answers.
---

## 📋 Task Summary

### ✅ Task 1: Test Case Design (ToDoMVC)
- Website: [https://todomvc.com/examples/react/dist/](https://todomvc.com/examples/react/dist/)
- 📄 Designed detailed test cases with:
  - Clear titles, steps, expected results
  - Priority levels
  - Automation feasibility justification
- ✔️ See: `Task1_TestCases.xlsx` (or refer to documentation)

---

### ✅ Task 2: Test Automation (Selenium WebDriver)
- 🚀 Automated the following actions:
  - Open app
  - Add 3 tasks
  - Mark 2nd as complete
  - Delete 1st task
  - Validate status at each step
- 💡 Bonus:
  - Used Page Object Model (POM)
  - Integrated Allure Reporting
- 🧪 Run with:
  ```bash
  mvn clean test
  allure serve target/allure-results


 ### ✅ Task 3: Bug Report
🔍 Reported 8 realistic bugs from ToDoMVC:

Input validation issues

Deletion/editing edge cases

UI/UX bugs

📝 Format includes:

Bug ID, Title, Steps to Reproduce, Expected vs Actual, Severity

 ### ✅ Task 4: Google Maps Functional Testing
🗺️ Website: https://www.google.com/maps

✔️ Verified:

Map load, zoom, pan

Location search

Route & distance

Street View & geo-location

📊 Table includes:

Test IDs, steps, expected and actual results, status


🚀 Tech Stack
| Tool         | Usage                |
| ------------ | -------------------- |
| Java         | Programming Language |
| Selenium     | Web Automation       |
| TestNG       | Testing Framework    |
| Maven        | Build Tool           |
| Allure       | Reporting            |
| ChromeDriver | Browser Driver       |


