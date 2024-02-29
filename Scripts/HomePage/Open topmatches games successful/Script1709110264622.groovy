import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.click(findTestObject('Object Repository/Home Page/Top10games_Roulette_image'))

WebElement element = DriverFactory.getWebDriver().findElement(By.xpath("(//div[@id='cricketMatches']/div)[1]"))

TestObject Object = WebUI.convertWebElementToTestObject(element)

WebUI.click(Object)

String actualtitle = WebUI.getWindowTitle()

String expectedtitle = WebUI.getWindowTitle()

WebUI.verifyMatch(actualtitle, expectedtitle, true)