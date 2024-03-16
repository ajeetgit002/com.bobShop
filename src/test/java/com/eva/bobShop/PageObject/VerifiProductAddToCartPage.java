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
	
	public void productDeatils() {
		
		System.out.println(ut.getText(getProductdetailsINT()));
	}
	
	public void chooseQuantityOfProduct(String numberOfQuantity) {
		ut.selectByText(getQuntityOfProductDD(), numberOfQuantity);
	}
	
	public void ClickCheckOut() {
		ut.click(getClickCheckOutBT());
	}
	public void checkOutpageHeader() {
		ut.verifyText(ut.getText(getVerifyCheckOutPage()), "Summary");
	}

	public void verifyItemsQuntity() {
		ut.verifyText(ut.getText(getQuantityOfItemsINT()),"2 items");
	}
	
	public void verifyTotalAmount() {
		ut.verifyText(ut.getText(getTotalAmmountINT()), "R1,900");
	}
	
	public void continueTheProcess() {
		ut.click(getContinueBT());
	}
	public void clickContinuePayment() {
		ut.click(getContinuePaymentOptionsBT());
	}
	public void verifyPaymentPageHeader() {
		ut.verifyText(ut.getText(getHeaderVerifyPaymentPageINT()), "Payment options");
	}
	public void selectRedioButtonForPayment() {
		ut.click(getSelectRadioBT());
	}
	public void clickPaymentProcess() {
		ut.click(getPaymentWithBT());
	}
	
	public void clickPayment() {
		ut.click(getPaymentEFTBT());
	}
	
}
