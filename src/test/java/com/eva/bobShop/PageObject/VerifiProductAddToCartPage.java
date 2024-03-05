package com.eva.bobShop.PageObject;

import org.openqa.selenium.WebDriver;

import com.eva.bobShop.ObjectRepository.VerifiProductAddToCartOR;
import com.eva.bobShop.utilities.ReadConfig;
import com.eva.bobShop.utilities.Utils;

public class VerifiProductAddToCartPage extends VerifiProductAddToCartOR {
	Utils ut;
	ReadConfig config;

	public VerifiProductAddToCartPage(Utils ut, WebDriver driver) {
		super(driver);
		this.ut = ut;
		config = new ReadConfig();
	}

	public void checkProductAddCart() {
		ut.click(getClickAddCartLK());
	}

	public void fetchInnerText() {
		ut.verifyText(ut.getText(getProductINT()), config.getProductInfo());
	}

}
