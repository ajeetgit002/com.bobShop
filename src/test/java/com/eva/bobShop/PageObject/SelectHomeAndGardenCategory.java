package com.eva.bobShop.PageObject;

import org.openqa.selenium.WebDriver;

import com.eva.bobShop.ObjectRepository.SelectHomeAndGardenCategoryOR;
import com.eva.bobShop.utilities.Utils;

public class SelectHomeAndGardenCategory extends SelectHomeAndGardenCategoryOR {
	Utils ut;

	public SelectHomeAndGardenCategory(Utils ut, WebDriver driver) {
		super(driver);
		this.ut = ut;
	}
	
	public void mouseOverOnHemeCategory() {
		ut.actionMouseOver(getClickHomeCategoryLK());
	}
	
	public void clickOnHomeAndLiving() {
		ut.click(getClickOnHomeAndLivingLK());
	}
	
	
	
}
