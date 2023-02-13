import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static  AndroidDriver<AndroidElement> driver;
	//Homepage objHome;
	
@BeforeSuite
public static void main() {
		// TODO Auto-generated method stub
	try {
		
		String app = System.getProperty("user.dir") + "\\src\\main\\resources\\TODOApp (1) (1).apk";
		//File app=new File(apkpath);

		DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.VERSION, "12");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
		cap.setCapability(MobileCapabilityType.APP, app);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		 driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}catch (Exception exp) {
		System.out.println("cause is:"+exp.getCause());
		System.out.println("message is:"+exp.getMessage());
		exp.printStackTrace();
		
	}
		
	}


	@AfterSuite
	public void teardowns(){
	

	//	driver.quit();
		
		
	}

}