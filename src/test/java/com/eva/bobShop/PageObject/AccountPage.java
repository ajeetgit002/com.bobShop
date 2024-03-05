package com.eva.bobShop.PageObject;

import org.openqa.selenium.WebDriver;

import com.eva.bobShop.ObjectRepository.AccountPageOR;
import com.eva.bobShop.utilities.ReadConfig;
import com.eva.bobShop.utilities.Utils;

public class AccountPage extends AccountPageOR {
	Utils ut;
	ReadConfig config;
  public AccountPage(Utils ut,WebDriver driver) {
	  super(driver);
	  this.ut=ut;
	  config=new ReadConfig();
  }
  public void accountVerification() {
	  ut.click(getAccLK());
	 ut.verifyText(ut.getText(getLsAccINNT()), config.getACCHead());
	 ut.verifyTextContains(ut.getText(getAccNameINT()), config.getACCDetails());
  }
}
