package com.eva.bobShop.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class VerifiProductAddToCartOR {
	WebDriver driver;

	public VerifiProductAddToCartOR(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='View your cart']/child::span[@class='fa fa-cart-shopping font-lg']/following-sibling::span[text()='Cart']")
	private WebElement clickAddCartLK;
	
	@FindBy(xpath = "//a[@title='K8 Pro 8K Ultra HD TV Dual Controller Game Console 40000+ Built-in Games TV Stick TV Box']")
	private WebElement productINT;
}
