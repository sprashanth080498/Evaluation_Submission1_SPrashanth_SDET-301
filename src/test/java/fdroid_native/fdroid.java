package fdroid_native;

import org.aspectj.lang.annotation.Before;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import native_app.Fdroid_capabilities;

public class fdroid extends Fdroid_capabilities{
	AndroidDriver<AndroidElement> driver; 
	
@beforetest
public void tc1() {
		
	}
	
}
