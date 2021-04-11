package tikiTest.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tiki.vn/")
public class TikiPages extends PageObject{

	@FindBy(xpath="//*[contains(text(), 'Đăng nhập')]")
	WebElement lbLogin;
	@FindBy(xpath="//*[@id=\"__next\"]/div/header/div[3]/div/div[2]/div[2]/div/button[1]")
	WebElement btnLogin;
	@FindBy(id="email")
	WebElement txtEmail;
	@FindBy(id="password")
	WebElement txtPassword;
	@FindBy(css=".jpHvvv")
	WebElement btnSubmit;
	@FindBy(css=".FormSearch__Input-hwmlek-2")
	WebElement txtQuickSearch;
	@FindBy(css=".FormSearch__Button-hwmlek-3")
	WebElement btnQuickSearch;
	@FindBy(css="h1")
	WebElement lbKeyword;
	@FindBy(css=".product-item:nth-child(3) .final-price")
	WebElement lbPrice;
	@FindBy(id="qty")
	WebElement btnQuantity;
	@FindBy(css="#\\#mainAddToCart > .text")
	WebElement btnSelectBuy;
	@FindBy(css=".header-cart")
	WebElement btnCart;
	@FindBy(xpath="//a[contains(text(),'HÀNG MỚI')]")
	WebElement lbNewProduct;
	//span[contains(text(),'3.300.000 ₫')]
	
	public void inputAccountInfo(String user, String pwd) {
		Actions actionHover = new Actions(getDriver());
		actionHover.moveToElement(lbLogin).click().build().perform();
		btnLogin.click();
		txtEmail.sendKeys(user);
		txtPassword.sendKeys(pwd);
		btnSubmit.click();
	}

	public void InputKeywords(String keyword) throws InterruptedException {
		txtQuickSearch.clear();
		txtQuickSearch.sendKeys(keyword);
		btnQuickSearch.click();
		Thread.sleep(2000);
		
		
	}

	public void CheckProducts(String keyword) {
		//show product list with keyword
		String actualString = lbKeyword.getText();
		assertTrue(actualString.contains(keyword));
		//String productPrice = lbPrice.getText();
		//capture any product with price greater than 500k
		
	}

	public void SelectProduct() {
//		String productPriceInt = lbPrice.getText();
//		if (Integer.parseInt(productPriceInt)>500.000){
//			lbPrice.click();
//		}
		lbNewProduct.click();
		
	}

	public void PaymentProductByCash() {
		//add product to cart

		//go to cart

		//payment by cash

		
	}
	
	

}
