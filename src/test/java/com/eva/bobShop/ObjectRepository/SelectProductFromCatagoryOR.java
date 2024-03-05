package com.eva.bobShop.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class SelectProductFromCatagoryOR {
	WebDriver driver;

	public SelectProductFromCatagoryOR(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='category-card-header']//i[@class='bfa bfa-computers-and-networking']")
	private WebElement digitlLK;
	@FindBy(xpath = "//a[text()='Computers & Networking']")
	private WebElement clickComputerLK;

	@FindBy(xpath = "//h1[text()='Computers & Networking | Computers, components and accessories']")
	private WebElement pageHeaderVerify;
	@FindBy(xpath = "//label[@for='Condition-NEW']")
	private WebElement conditionOfProductRB;
	@FindBy(xpath = "//div[@class='tradelist-item-actions']//span[@title='Add this item to your Watchlist: K8 Pro 8K Ultra HD TV Dual Controller Game Console 40000+ Built-in Games TV Stick TV Box']/following-sibling::div")
	private WebElement gamecontrolLK;

	
}
