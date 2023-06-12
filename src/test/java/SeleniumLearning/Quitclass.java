package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Quitclass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='field-keywords' or @placeholder='Search Amazon']")).click();
        Thread.sleep(5000);
        List<WebElement> element=driver.findElements(By.xpath("(//div[@class='left-pane-results-container']/div/div/div)/span"));
        System.out.println(element.size());
        for(int i=0;i<element.size();i++)
        {
           if(element.get(i).getText().equalsIgnoreCase("hose nozzle"))
           {
               element.get(i).click();
               break;
           }
        }
        try
        {
            driver.close();
        }
        catch (Exception e)
        {
            System.out.println("Issue in Closing the browser");
        }
}}
