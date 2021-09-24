package com.UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JSMethods extends BaseClass {
	public static JavascriptExecutor js;

	//Click On Element using Java Script Executor
	public static void ClickOnElementByJs(WebElement wb) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);
	}
	
	
}
