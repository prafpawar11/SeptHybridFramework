package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.JSMethods;

public class LoginPage extends BaseClass{

	public void loginButton() {
		WebElement wb=driver.findElement(By.name("login"));
		JSMethods.ClickOnElementByJs(wb);
	}
	
}
