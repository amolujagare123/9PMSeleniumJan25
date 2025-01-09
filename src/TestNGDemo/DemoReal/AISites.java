package TestNGDemo.DemoReal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

    private WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openai() {
        driver.get("https://www.openai.com");
        System.out.println("Navigated to OpenAI");
    }

    @Test
    public void huggingface() {
        driver.get("https://huggingface.co");
        System.out.println("Navigated to Hugging Face");
    }

    @Test
    public void tensorflow() {
        driver.get("https://www.tensorflow.org");
        System.out.println("Navigated to TensorFlow");
    }

    @Test
    public void pytorch() {
        driver.get("https://pytorch.org");
        System.out.println("Navigated to PyTorch");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}