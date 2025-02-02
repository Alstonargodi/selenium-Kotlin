import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.devtools.v129.filesystem.model.File
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
        driver.get("https://www.selenium.dev/selenium/web/web-form.html")

        setText()

        uploadFile()
    }

    fun setText(){
        val title = driver.title
        println(title)

        val textBox = driver.findElement(By.name("my-text"))
        textBox.sendKeys("aaa")
    }

    fun uploadFile(){
        val nameFile : java.io.File = java.io.File("C:/Users/alston/software-project/katalon-project/miniproject-2/kotllin-selenium/resources/testupload.txt")
        val fileInput : WebElement = driver.findElement(By.cssSelector("input[type=file]"))
        fileInput.sendKeys(nameFile.absolutePath)
        driver.findElement(By.id("file-submit")).click()
    }
}