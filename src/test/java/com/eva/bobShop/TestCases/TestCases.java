package com.eva.bobShop.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eva.bobShop.PageObject.AccountPage;
import com.eva.bobShop.PageObject.CommonPage;
import com.eva.bobShop.PageObject.SelectProductFromCatagory;
import com.eva.bobShop.PageObject.VerifiProductAddToCartPage;
import com.eva.bobShop.utilities.Utils;

public class TestCases {
	Utils ut = Utils.getInstance();

	@BeforeClass
	public void createreport() {
		ut.createExtentReport("BOB Shop Application");
	}

	@Test(groups = "@Smoke", priority = 0)
	public void verifyLogin() {

		ut.createTestReport("verifyLogin");
		WebDriver driver = ut.getDriver("chrome");

		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();

	}

	@Test(groups = "@Regression", priority = 1)
	public void verifyAccount() {

		ut.createTestReport("verifyAccount");
		WebDriver driver = ut.getDriver("chrome");
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();
		AccountPage acc = new AccountPage(ut, driver);
		acc.accountVerification();
	}

	@Test(groups = "@Sanity", priority = 2)
	public void selectProductByCategory() {
		ut.createTestReport("selectProductByCategory");
		WebDriver driver = ut.getDriver("chrome");
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();
		SelectProductFromCatagory sltproduct = new SelectProductFromCatagory(ut, driver);
		sltproduct.selectDigitalCotegary();
		sltproduct.headerOfPage();
		sltproduct.clickOnNewConditionCetagory();

		sltproduct.clickAddCart();
		ut.threadWait(2000);
	}

	@Test(groups = "@Sanity", priority = 3)
	public void verifyProductAddToCard() {
		ut.createTestReport("verifyProductAddToCard");
		WebDriver driver = ut.getDriver("chrome");
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();

		VerifiProductAddToCartPage addCardproduct = new VerifiProductAddToCartPage(ut, driver);
		addCardproduct.checkProductAddCart();

	}

	@AfterMethod()
	public void teardown(ITestResult result) {
		String[] groups = result.getMethod().getGroups();

		for (String group : groups) {
			ut.addtags(group);

		}

		ut.tearDown_Quit();
		ut.flushReport();

	}
}
