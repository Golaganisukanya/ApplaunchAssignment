package Assignment1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;

public class Applaunch {


    AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"DemoDevice");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.youtube");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.youtube.app.honeycomb.Shell$HomeActivity");

        driver = new AndroidDriver(new URL( "http://0.0.0.0:4723/wd/hub"),cap);







    }

    @Test
    public void test(){
        System.out.println("App Launch");
    }
}