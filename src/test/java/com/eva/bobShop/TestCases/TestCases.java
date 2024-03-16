package com.eva.bobShop.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eva.bobShop.PageObject.AccountPage;
import com.eva.bobShop.PageObject.CommonPage;
import com.eva.bobShop.PageObject.SelectHomeAndGardenCategory;
import com.eva.bobShop.PageObject.SelectProductFromCatagory;
import com.eva.bobShop.PageObject.VerifiProductAddToCartPage;
import com.eva.bobShop.utilities.Utils;

public class TestCases {
	Utils ut = Utils.getInstance();

	@BeforeSuite
	public void createreport() {
		ut.createExtentReport("BOB Shop Application");
	}

	@Parameters("browser")
	@Test(groups = "@Smoke", priority = 0)
	public void verifyLogin(String browser) {
		ut.createTestReport("verifyLogin");
		WebDriver driver = ut.getDriver(browser);
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();
		cp.allCategory();
	}

	@Parameters("browser")
	@Test(groups = "@Regression", priority = 1)
	public void verifyAccount(String browser) {
		ut.createTestReport("verifyAccount");
		WebDriver driver = ut.getDriver(browser);
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();
		AccountPage acc = new AccountPage(ut, driver);
		acc.accountVerification();
	}

	@Parameters("browser")
	@Test(groups = "@Sanity", priority = 2)
	public void selectProductByCategory(String browser) {
		ut.createTestReport("selectProductByCategory");
		WebDriver driver = ut.getDriver(browser);
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

	@Parameters({ "browser", "quantity" })
	@Test(groups = "@Smoke", priority = 3)
	public void verifyProductAddToCardAndBuy(String browser, String quantity) {
		ut.createTestReport("verifyProductAddToCardAndBuy");
		WebDriver driver = ut.getDriver(browser);
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();
		VerifiProductAddToCartPage addCardproduct = new VerifiProductAddToCartPage(ut, driver);
		addCardproduct.checkProductAddCart();
		addCardproduct.fetchInnerText();
		// addCardproduct.productDeatils();
		addCardproduct.chooseQuantityOfProduct(quantity);
		addCardproduct.ClickCheckOut();
		addCardproduct.checkOutpageHeader();
		addCardproduct.verifyItemsQuntity();
		addCardproduct.verifyTotalAmount();
		addCardproduct.continueTheProcess();
		addCardproduct.clickContinuePayment();
		addCardproduct.verifyPaymentPageHeader();
		addCardproduct.clickPaymentProcess();
	}

	@Test(groups = "@Sanity", priority = 4)
	@Parameters("browser")
	public void selectProductFromHomeCategory(String browser) {
		ut.createTestReport("selectProductFromHomeCategory");
		WebDriver driver = ut.getDriver(browser);
		CommonPage cp = new CommonPage(ut, driver);
		cp.openUrl();
		cp.verifyTitle();
		cp.login();
		SelectHomeAndGardenCategory homeAndgarden = new SelectHomeAndGardenCategory(ut, driver);
		homeAndgarden.mouseOverOnHemeCategory();
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
