package MindSphere.AssetManager;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertManagerUI {
	
	@BeforeClass
	public void launcBrowser() {
		System.out.println("Browser is launching----");
	}
	
	@BeforeMethod
	public void loginToMDSP() {
		System.out.println("Login to MindSphere----");
	}
	
	@Test (priority = 1)
	public void createAnAsset() {
		System.out.println("Creating an asset in asset manager----");
		//int a = 5/0;
	}
	
	@Test (priority=2)
	public void createAnAspectType() {
		System.out.println("Create new aspect type---");
	}
	
	@AfterMethod
	public void logoutFromMDSP() {
		System.out.println("Logout from MindSphre");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing the browser---->");
	
	}

}
