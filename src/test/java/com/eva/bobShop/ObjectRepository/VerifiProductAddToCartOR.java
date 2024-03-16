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
	
	@FindBy(xpath = "//div[@id='seller-container-2601936-0']")
	private WebElement productdetailsINT;
	
	@FindBy(xpath = "//select[@id='fld_qty_1']")
	private WebElement quntityOfProductDD;
	
	@FindBy(xpath = "//a[@title='K8 Pro 8K Ultra HD TV Dual Controller Game Console 40000+ Built-in Games TV Stick TV Box']/parent::div/parent::div/parent::div/parent::div[@class='cart-item']/following-sibling::div[@class='cart-items-buttons']//button")
   private WebElement clickCheckOutBT;
	
	@FindBy(xpath = "//h2[text()='Summary']")
	private WebElement verifyCheckOutPage;
	
	@FindBy(xpath = "//span[text()='2 items']")
	private WebElement quantityOfItemsINT;
	
	@FindBy(xpath = "//span[@id='checkout_order_total']")
	private WebElement totalAmmountINT;
	
	
	
	@FindBy(xpath = "//button[@title='Proceed with checkout']")
	private WebElement continueBT;
	
	@FindBy(xpath = "//button[@title='Proceed with checkout']")
	private WebElement continuePaymentOptionsBT;
	
	@FindBy(xpath = "//h2[text()='Payment options']")
	private WebElement headerVerifyPaymentPageINT;
	
	@FindBy(xpath = "//input[@value='BOBPAYINSTANTEFT']/parent::span")
	private WebElement selectRadioBT;
	
	@FindBy(xpath = "//input[@value='BOBPAYINSTANTEFT']/parent::span")
	private WebElement paymentWithBT;
	
	@FindBy(xpath = "//button[@id='subMitPaymentOptionForm']")
	private WebElement  paymentEFTBT;

}
