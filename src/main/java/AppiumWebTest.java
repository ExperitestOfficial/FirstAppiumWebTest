import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Class for Web Testing using Appium in an Android Device.
 */
public class AppiumWebTest {

    DesiredCapabilities dc = new DesiredCapabilities();
    protected RemoteWebDriver driver = null;

    public static final String APPIUM_SRV_URL = "http://localhost:4723/wd/hub";
    public static final String DEVICE_NAME = "a3ae1c63";
    public static final String CHROME_DRIVER_PATH = "C:\\experitest1\\chromedriver_win32\\chromedriver.exe";

    @BeforeTest
    public void setUp() throws MalformedURLException {

        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName", DEVICE_NAME);
        dc.setCapability("browserName", "Chrome");
        dc.setCapability("chromedriverExecutable","CHROME_DRIVER_PATH");
        driver = new AndroidDriver(new URL(APPIUM_SRV_URL), dc);
    }

    @Test
    public void testWeb() {
        driver.get("http://www.google.com");
        By qBy = By.xpath("//*[@name='q']");
        driver.findElement(qBy).click();
        driver.findElement(qBy).sendKeys("experitest");
        driver.findElement(qBy).sendKeys(Keys.ENTER);
    }

    @AfterTest
    public void tearDown() throws MalformedURLException {
        driver.quit();
    }

}
