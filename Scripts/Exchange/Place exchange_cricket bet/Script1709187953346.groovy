import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.click(findTestObject('Object Repository/Exchange Page/Exchange_menu'))

WebUI.click(findTestObject('Object Repository/Exchange Page/Cricket_menu'))

WebUI.delay(5)


WebElement game1 = DriverFactory.getWebDriver().findElement(By.xpath("(//section[@class='mod-event-line ng-scope ng-isolate-scope'])[1]/ul[1]/li[1]"))

game1.click()

WebUI.delay(5)

WebElement teamAback = DriverFactory.getWebDriver().findElement(By.xpath("(//tr[@class='runner-line ng-scope'])[1]/td[4]/button"))

teamAback.click()

WebElement getvalue = DriverFactory.getWebDriver().findElement(By.xpath("(//tr[@class='runner-line ng-scope'])[1]/td[4]/button/div/span[1]"))

String stringoddvalue = getvalue.getText()

println(stringoddvalue)

//convert string to float code
	float floatoddvalue = stringoddvalue.toFloat()
	
	println(floatoddvalue)
	
	if(floatoddvalue > 5) {
		
		println("since odd value is greater than 5, bet cannot be placed")
	}
	
	else {
	
	float newoddvalue = floatoddvalue + 0.10
	
	println(newoddvalue)
	
	
	
//convert float to string
	
	String newstringoddvalue = newoddvalue.floatValue()
	
	String roundoffvalue = newstringoddvalue.substring(0, 4)
	
	println(roundoffvalue)
	
	
WebUI.setText(findTestObject('Object Repository/Exchange Page/oddvalue_field'), roundoffvalue)

WebUI.click(findTestObject('Object Repository/Exchange Page/Placebet_button'))


WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Exchange Page/cancelallunmatchedbet_button'))

println("bet placed successfully")

WebUI.click(findTestObject('Object Repository/Exchange Page/cancelallunmatchedbet_button'))


	}
