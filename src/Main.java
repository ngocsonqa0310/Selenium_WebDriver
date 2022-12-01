import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // lay duong dan thu muc goc
        String projectPath = System.getProperty("user.dir");

        // tro duong dan den edge driver
        System.setProperty("webdriver.opera.driver", projectPath + "/web_drivers/operadriver.exe");

        // khoi tao 1 doi tuong edge driver
        WebDriver driver = new OperaDriver();

        // dieu huong den trang google.com
        driver.get("https://google.com");

        //mo full man hinh
        driver.manage().window().maximize();

        // dung luong chay 5000 millis
        Thread.sleep(5000);

        // dong cua so trinh duyet
        driver.quit();

        myname => myName (camelCase)
         => MyName (PascalCase)
        => my_name (snake_case)
        => my-name (kebab-case)
    }
}