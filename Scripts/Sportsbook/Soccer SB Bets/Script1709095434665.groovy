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

WebUI.setText(findTestObject('sportsbook/Soccer/input_Help_username'), 'rock')

WebUI.setEncryptedText(findTestObject('sportsbook/Soccer/input_Help_password'), 'Ae2KZyjYBr3zjExtfoMITg==')

WebUI.click(findTestObject('sportsbook/Soccer/input_Help_submitLogForm'))

WebUI.click(findTestObject('sportsbook/Soccer/a_Sportsbook'))

WebUI.click(findTestObject('sportsbook/Soccer/span_Soccer'))

WebUI.click(findTestObject('sportsbook/Soccer/li_Today'))

WebUI.click(findTestObject('sportsbook/Soccer/span_Assam FT'))

WebUI.click(findTestObject('sportsbook/Soccer/span_Assam FT or draw'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('sportsbook/Soccer/button_Place Bet'))

WebUI.back()

WebUI.click(findTestObject('sportsbook/Soccer/li_Today'))

WebUI.click(findTestObject('sportsbook/Soccer/span_Prachuap FC'))

WebUI.click(findTestObject('sportsbook/Soccer/span_Prachuap FCdraw  yes'))

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('sportsbook/Soccer/li_Today'))

WebUI.click(findTestObject('sportsbook/Soccer/span_Samut Sakhon City FC'))

WebUI.click(findTestObject('sportsbook/Soccer/span_draw'))

WebUI.delay(3)

WebUI.click(findTestObject('sportsbook/Soccer/p_Combo'))

not_run: WebUI.click(findTestObject('sportsbook/Soccer/Page_Haboom - Trusted Online Casino and Spo_832508/button_Place Bet'))

