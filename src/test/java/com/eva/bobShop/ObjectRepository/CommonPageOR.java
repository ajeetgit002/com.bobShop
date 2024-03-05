package com.eva.bobShop.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class CommonPageOR {
	WebDriver driver;

	public CommonPageOR(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='font-sm cd-none']//a[text()='Log in']")

	private WebElement loginLK;
	@FindBy(xpath = "//span[text()='X']")
	private WebElement dismissedPpup;
	@FindBy(xpath = "//h2[text()='Log in']")
	private WebElement verifyHeader;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameTB;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTB;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement LoginBT;

}
