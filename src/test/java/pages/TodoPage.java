package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class TodoPage {
    WebDriver driver;

    @FindBy(css = "input.new-todo")
    private WebElement newTodoInput;

    @FindBy(css = "ul.todo-list li")
    private List<WebElement> todoItems;

    public TodoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addTask(String taskName) {
        newTodoInput.sendKeys(taskName + Keys.ENTER);
    }

    public void completeTask(int index) {
        todoItems.get(index).findElement(By.cssSelector("input.toggle")).click();
    }

    public void deleteTask(int index) {
        WebElement item = todoItems.get(index);
        new Actions(driver).moveToElement(item).perform();
        item.findElement(By.cssSelector("button.destroy")).click();
    }

    public boolean isCompleted(int index) {
        return todoItems.get(index).getAttribute("class").contains("completed");
    }

    public int getCount() {
        return todoItems.size();
    }
}
