package com.TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.UtilsLayer.JSMethods;

public class Demo1 extends BaseClass {

	@Test
	public void setUp() {
		BaseClass.intilization();
		LoginPage loginpage=new LoginPage();
		loginpage.loginButton();
	}
	
	
}
