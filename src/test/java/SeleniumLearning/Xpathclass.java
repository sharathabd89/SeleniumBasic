package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Xpathclass {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@name='q']")).click();
        List<WebElement> list= driver.findElements((By.xpath("//li[@class='Y5N33s']")));
        for(int i=0; i<list.size()-1;i++) {
            if(list.get(i).getText().equalsIgnoreCase("mobiles"))
            {
                list.get(i).click();
            }
        }
       try
       {
           driver.quit();
       }
       catch (Exception e)
       {
           System.out.println("nothing else here");
       }
    }}