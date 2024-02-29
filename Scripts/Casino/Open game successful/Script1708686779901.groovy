import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.click(findTestObject('Object Repository/Casino Page/CasinoMenu'))


List<WebElement> provider= DriverFactory.getWebDriver().findElements(By.xpath("//input[@name='provider_list']"))

println(provider.size())

for (int i = 0; i < provider.size(); i++) {
	if (i != 0) {
		
		WebElement currentElement = provider.get(i)
		currentElement.click()
		
		String providerwindow =  WebUI.getWindowTitle()
		
		List<WebElement> allgames = DriverFactory.getWebDriver().findElements(By.xpath("//input[@name='provider_list']"))
		
		WebUI.click(findTestObject('Object Repository/Casino Page/PlayNowButton'))
		
		WebUI.switchToWindowIndex(1)
		
		WebUI.delay(10)
		
		String gamewindow =  WebUI.getWindowTitle()
		
		//String Expectedtitle = WebUI.getWindowTitle()
		
		//String Actualtitle = Expectedtitle
		
		WebUI.takeFullPageScreenshot()
		
		//WebUI.verifyMatch(Actualtitle, Expectedtitle, true)
		
		//WebUI.verifyTextPresent("", false)
		
		WebUI.closeWindowIndex(1)
		
		WebUI.switchToWindowTitle(providerwindow)

	}	
		
	}