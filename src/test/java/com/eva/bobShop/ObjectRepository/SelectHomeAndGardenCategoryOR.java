package com.eva.bobShop.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class SelectHomeAndGardenCategoryOR {
WebDriver ldriver;
	
	public SelectHomeAndGardenCategoryOR(WebDriver driver) {
		this.ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy( xpath = "//i[@class='bfa bfa-garden-outdoor-living-and-pets']/parent::span")
	private WebElement clickHomeCategoryLK;
	
	@FindBy(xpath = "//i[@class='bfa bfa-garden-outdoor-living-and-pets']/ancestor::dt/following-sibling::dd/descendant::ul//a[text()='Home & Living']")
	private WebElement clickOnHomeAndLivingLK;
}
