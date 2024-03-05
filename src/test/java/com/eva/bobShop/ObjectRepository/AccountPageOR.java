package com.eva.bobShop.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class AccountPageOR {
	WebDriver driver;

	public AccountPageOR(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='d-flex flex-column c-min-width-5']//a[@class='font-weight-bold my-account-label cd-none']")
	private WebElement accLK;
	
	@FindBy(xpath = "//a[text()='AjeSin0376']")
	private WebElement lsAccINNT;
	
	@FindBy(xpath = "//div[contains(text(),'Ajeet Singh Singh')]")
	private WebElement accNameINT;

}
