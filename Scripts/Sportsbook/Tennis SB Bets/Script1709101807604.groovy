import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haboom.com/')

WebUI.setText(findTestObject('Object Repository/sportsbook/Tennis/input_Help_username'), 'rock')

WebUI.setEncryptedText(findTestObject('Object Repository/sportsbook/Tennis/input_Help_password'), 'Ae2KZyjYBr3zjExtfoMITg==')

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/input_Help_submitLogForm'))

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/a_Sportsbook'))

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/span_Tennis'))

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/li_Today'))

WebUI.click(findTestObject('sportsbook/Tennis/span_Bouquet, Lucas'))

WebUI.click(findTestObject('sportsbook/Tennis/span_yes'))

not_run: WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/button_Place Bet'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/li_Today'))

WebUI.click(findTestObject('sportsbook/Tennis/span_Andre, Seydina'))

WebUI.click(findTestObject('sportsbook/Tennis/span_over 9.5'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/li_Today'))

WebUI.click(findTestObject('sportsbook/Tennis/span_Szajrych, Jasza'))

WebUI.click(findTestObject('sportsbook/Tennis/span_over 9.5'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/p_Combo'))

not_run: WebUI.click(findTestObject('Object Repository/sportsbook/Tennis/button_Place Bet'))

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://haboom.com/')

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.setText(findTestObject('null'), 
    'rock')

not_run: WebUI.setEncryptedText(findTestObject('null'), 
    'Ae2KZyjYBr3zjExtfoMITg==')

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

