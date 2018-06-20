package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://etsy.com");
		WebElement input = driver.findElement(By.id("search-query"));
//		System.out.println(input.getAttribute("innetHTML"));
		System.out.println(input.getAttribute("outerHTML"));
		driver.findElement(By.partialLinkText("Sell on")).click();

	}

}
