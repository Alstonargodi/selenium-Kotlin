import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import java.sql.Driver
import kotlin.test.BeforeTest
import kotlin.test.Test

class test {
    lateinit var driver : WebDriver

    @BeforeTest
    fun setup(){
        driver = FirefoxDriver()
    }

    @Test
    fun openBrowser(){
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html")
        driver.get("https://www.google.com")
    }
}