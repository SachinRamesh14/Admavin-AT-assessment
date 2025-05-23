package tests;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.TodoPage;
import utils.DriverFactory;

@Epic("ToDoMVC")
@Feature("Task CRUD Automation")
public class TodoTest {
    WebDriver driver;
    TodoPage todo;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://todomvc.com/examples/react/dist/");
        todo = new TodoPage(driver);
    }

    @Test(description = "Add, complete, delete tasks and validate UI")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Basic Task Workflow")
    public void taskFlowTest() {
        Allure.step("Add 3 tasks");
        todo.addTask("Task 1");
        todo.addTask("Task 2");
        todo.addTask("Task 3");
        Assert.assertEquals(todo.getCount(), 3);

        Allure.step("Complete 2nd task");
        todo.completeTask(1);
        Assert.assertTrue(todo.isCompleted(1));

        Allure.step("Delete 1st task");
        todo.deleteTask(0);
        Assert.assertEquals(todo.getCount(), 2);
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
