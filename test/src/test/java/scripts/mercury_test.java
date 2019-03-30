package scripts;

import org.testng.annotations.Test;

import configuration.StartBrowser;
import customCommands.ActionDriver;
import or.mercury_Home;

public class mercury_test extends StartBrowser {
	public ActionDriver aDriver;
	
	
  @Test()
  public void a_launchApplication() throws InterruptedException{
	aDriver = new ActionDriver();
	aDriver.launchApplication("http://newtours.demoaut.com/");
	String page_title = aDriver.getTitle();	
	if (page_title.equals("Welcome: Mercury Tours")){
		System.out.println("Application is launched successfully - Passed");
	}
	else
	{			
		System.out.println("Application did not launch successfully - Failed");		
	}
	
	Thread.sleep(2000);
  }
  
  @Test
  public void b_Login() throws InterruptedException{
	  aDriver = new ActionDriver();
	  aDriver.typeText(mercury_Home.user_name, "mercury");
	  aDriver.typeText(mercury_Home.password, "mercury");
	  aDriver.clickOnElement(mercury_Home.login_button);
	  Thread.sleep(10000);
	  String page_title = aDriver.getTitle();	  
	  if (page_title.contentEquals("Find a Flight: Mercury Tours:")){
			System.out.println("Login is successful - Passed");
		}
		else
		{			
			System.out.println("Login failed- Failed");		
		}
  }
 
  @Test
  public void c_Logout() throws InterruptedException{
	  aDriver = new ActionDriver();	  
	  aDriver.clickOnElement(mercury_Home.logoff_link);
	  Thread.sleep(10000);
	  String page_title = aDriver.getTitle();	  
	  if (page_title.equals("Sign-on: Mercury Tours")){
			System.out.println("Logout is successful - Passed");
		}
		else
		{			
			System.out.println("Logout failed- Failed");		
		}
  }
  
}