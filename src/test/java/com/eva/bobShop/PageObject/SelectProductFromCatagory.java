package com.eva.bobShop.PageObject;

import org.openqa.selenium.WebDriver;

import com.eva.bobShop.ObjectRepository.SelectProductFromCatagoryOR;
import com.eva.bobShop.utilities.Utils;

public class SelectProductFromCatagory extends SelectProductFromCatagoryOR {
	Utils ut;

	public SelectProductFromCatagory(Utils ut, WebDriver driver) {
		super(driver);
		this.ut = ut;
	}

	public void selectDigitalCotegary() {

		ut.actionMouseOver(getDigitlLK());
		ut.click(getClickComputerLK());
	}

	public void headerOfPage() {
		ut.verifyText(ut.getText(getPageHeaderVerify()),
				"Computers & Networking | Computers, components and accessories");
	}

	public void clickOnNewConditionCetagory() {
		ut.click(getConditionOfProductRB());
	}

	public void clickAddCart() {
		ut.click(getGamecontrolLK());
	}
	
}
