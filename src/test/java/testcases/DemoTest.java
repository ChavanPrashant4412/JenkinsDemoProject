package testcases;

import org.testng.annotations.Test;

import com.deskera.basePage.BasePage;

public class DemoTest extends BasePage {

	//Jenkins parameterrized Build test
	// -Dbrowser="$browser" -Dgroups=$groups" -Denv="$env"
	
	//Code from Develope Branch
	
	// Second Modification from Develop branch.
	
	@Test(groups = { "Sanity" })
	public void luanchBrowser() {

		System.out.println("Inside luanchBrowser");
		String nameOfbrowser = System.getProperty("browser");

		System.out.println("Browser Name is ::-" + nameOfbrowser);
		if (nameOfbrowser.equals("Chrome")) {
			System.out.println("Opening in chrome browser");
		} else {
			System.out.println("Opening in Firefox browser");
		}
	}

	@Test(groups = { "Sanity" })
	public void printEnvironment() {
		/*
		 * String envName=System.getProperty("env");
		 * System.out.println("Environament Name is "+envName);
		 */
		String url = globalProperties.getProperty(System.getProperty("env"));
		System.out.println("Print the URL" + url);
	}

	@Test(groups = { "Smoke" })
	public void m1() {
		System.out.println("M1");
	}

	@Test(groups = { "Regression" })
	public void m2() {
		System.out.println("M2");
	}

	@Test(groups = { "DryRun" })
	public void m3() {
		System.out.println("Executed DryRun Cases");
	}
}
