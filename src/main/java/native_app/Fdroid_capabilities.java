package native_app;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Fdroid_capabilities {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Prash");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.fdroid.fdroid");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.fdroid.fdroid.nearby.SwapWorkflowActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, false);
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;
	}
}
