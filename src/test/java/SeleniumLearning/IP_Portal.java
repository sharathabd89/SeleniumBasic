package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class IP_Portal {
    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging-auth.leapscholar.com/auth/loginView?app=leap_scholar_portal_staging&redirectUrl=https://staging-portal.leapscholar.com/api/loginCallback&postRedirectUrl=/");
    WebElement Phoneelement= driver.findElement(By.xpath("//input[@name='phone_number']"));
    Boolean Field_Phone_value=Phoneelement.isEnabled();
    Phoneelement.sendKeys("1111111111");
    WebElement Otpelement1=driver.findElement(By.xpath("//button[@id='btn_phone_submit']"));
    Boolean Request_otp_is_enabled=Otpelement1.isEnabled();
    Otpelement1.click();
    System.out.println(Field_Phone_value);
    System.out.println(Request_otp_is_enabled);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement enter_otp= driver.findElement(By.xpath("//input[@id='in_otp']"));
    enter_otp.click();
    enter_otp.sendKeys("123456");
    driver.findElement(By.xpath("//button[@id='btn_otp_submit']")).click();
    //(//button[contains(text(),'Move To Final')])[4]
    WebElement Search_Student_Phone=driver.findElement(By.xpath("//input[@placeholder='Phone']")) ;
    if(Search_Student_Phone.isEnabled())
    {
        Search_Student_Phone.sendKeys(" 2223232332");
        System.out.println("Search_Student_Phone_enabled");
    }
    else{
        System.out.println("Search_Student_Phone_Disabled");
    }

    driver.quit();
    }
}
