package com.eva.bobShop.PageObject;

import org.openqa.selenium.WebDriver;

import com.eva.bobShop.ObjectRepository.CommonPageOR;
import com.eva.bobShop.utilities.ReadConfig;
import com.eva.bobShop.utilities.Utils;

public class CommonPage extends CommonPageOR {
	Utils ut;
	ReadConfig confi;

	public CommonPage(Utils ut, WebDriver driver) {
		super(driver);
		this.ut = ut;
		confi = new ReadConfig();
	}

	public void verifyTitle() {
		ut.verifyTitle("Bob Shop online shopping South Africa | bid or buy today");
	}

	public void openUrl() {
		ut.implicityWaitSecond(20);
		ut.maximize();
		ut.openUrl(confi.getUrl());
	}

	public void login() {

		ut.click(getLoginLK());
		ut.click(getDismissedPpup());
		ut.verifyText(ut.getText(getVerifyHeader()), "Log in");

		ut.inputValue(getUsernameTB(), confi.getEmailOrUsername());
		ut.inputValue(getPasswordTB(), confi.getPassword());
		ut.click(getLoginBT());
	}

}
