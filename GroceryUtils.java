package grocerybuy;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.FieldAccessor;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hpsf.Property;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class GroceryUtils {
    public static WebDriver driver=null;
    public static Properties properties=null;
 static Logger logger=Logger.getLogger(GroceryUtils.class);




    public Properties loadpropertyFile() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("GroceryFile");
        properties=new Properties();
        properties.load(fileInputStream);
        return properties;
    }
    @BeforeSuite
    public void launchBrowser() throws IOException {
        logger.info("driver launched");
        PropertyConfigurator.configure("loggerproperty");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
       logger.info("Loading the property file");
        loadpropertyFile();
        String url = properties.getProperty("url");
        driver.manage().window().maximize();
        logger.info("driver get url");
        driver.get(url);
        logger.info("grocery website open)");
        logger.info("GroceryBuy website launch");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterSuite
    public void teardown(){
        logger.info("Execution done");
        driver.quit();
    }


    }





