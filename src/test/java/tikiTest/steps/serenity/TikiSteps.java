package tikiTest.steps.serenity;


import java.util.concurrent.TimeUnit;

import net.thucydides.core.steps.ScenarioSteps;
import tikiTest.pages.TikiPages;

public class TikiSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TikiPages tikivnPage;

	public void LoginPage(String user, String pwd) throws InterruptedException {
		tikivnPage.open();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tikivnPage.inputAccountInfo(user,pwd);
		Thread.sleep(1000);
			
	}

	public void LookingProductByKeyword(String keyword) throws Exception {
		tikivnPage.InputKeywords(keyword);
		tikivnPage.CheckProducts(keyword);
		
		
	}

	public void PaymentProduct() {
		
		tikivnPage.SelectProduct();
		tikivnPage.PaymentProductByCash();
	}

}
