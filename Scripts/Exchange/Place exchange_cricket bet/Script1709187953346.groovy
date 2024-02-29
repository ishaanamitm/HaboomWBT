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

String oddvalue = getvalue.getText()

println(oddvalue)

//int oddvalueint = oddvalue.toInteger()


 
 
int value = oddvalue as Integer
   
   
println(value)
 
int passvalue = value + 0.10

println(passvalue)

//println(passvalue)

WebUI.delay(5)



