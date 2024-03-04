import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://haboom.com/')

WebUI.setText(findTestObject('sportsbook/Cricket Bets/input_Help_username'), 'rock')

WebUI.setEncryptedText(findTestObject('sportsbook/Cricket Bets/input_Help_password'), 'Ae2KZyjYBr3zjExtfoMITg==')

WebUI.click(findTestObject('sportsbook/Cricket Bets/input_Help_submitLogForm'))

WebUI.click(findTestObject('sportsbook/Cricket Bets/a_Sportsbook'))

WebUI.click(findTestObject('sportsbook/Cricket Bets/span_Cricket'))

WebUI.click(findTestObject('sportsbook/Basketball/li_Today'))

Thread.sleep(3000)

WebElement a = DriverFactory.getWebDriver().findElement(By.xpath('(//span[@class=\' ui-runner-price ui-924_285947290-8036605 ui-display-fraction-price sb_odds_val lock_ui-runner-price\'])[1]'))

Thread.sleep(3000)

a.click()

not_run: WebUI.click(findTestObject('sportsbook/Basketball/button_Place Bet'))

Thread.sleep(3000)

WebUI.click(findTestObject('sportsbook/Basketball/div_Betslip_slip_lft betslip_toggle_arrow b_22464f'))

Thread.sleep(3000)

WebElement b = DriverFactory.getWebDriver().findElement(By.xpath('(//span[@class=\' ui-runner-price ui-924_285947290-8036605 ui-display-fraction-price sb_odds_val lock_ui-runner-price\'])[5]'))

Thread.sleep(3000)

b.click()

Thread.sleep(3000)

WebUI.click(findTestObject('sportsbook/Basketball/div_Betslip_slip_lft betslip_toggle_arrow b_22464f'))

Thread.sleep(3000)

WebElement c = DriverFactory.getWebDriver().findElement(By.xpath('(//span[@class=\' ui-runner-price ui-924_285947290-8036605 ui-display-fraction-price sb_odds_val lock_ui-runner-price\'])[7]'))

Thread.sleep(3000)

c.click()

WebUI.click(findTestObject('sportsbook/Basketball/p_Combo'))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('sportsbook/Cricket Bets/button_Place Bet'))

WebUI.delay(2)

WebUI.takeScreenshot('')

