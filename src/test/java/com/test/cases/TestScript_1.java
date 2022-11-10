package com.test.cases;

import org.testng.annotations.Test;

import com.Base.Baseclass;
import com.page.classes.Homepage;

public class TestScript_1 extends Baseclass {
	
	@Test
	public void LoginFun() throws InterruptedException {
		
		driver.get(URL);
		
		Homepage hp = new Homepage(driver);
		hp.enterCred();
		hp.Click();
		
		Thread.sleep(3000);
		
	}

}
