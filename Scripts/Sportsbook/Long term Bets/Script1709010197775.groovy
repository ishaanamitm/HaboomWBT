import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://haboom.com/')

WebUI.setText(findTestObject('sportsbook/Long-Term Bets/input_Help_username'), 'rock')

WebUI.setEncryptedText(findTestObject('sportsbook/Long-Term Bets/input_Help_password'), 
    'Ae2KZyjYBr3zjExtfoMITg==')

WebUI.click(findTestObject('sportsbook/Long-Term Bets/input_Help_submitLogForm'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/a_Sportsbook'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_Long Term Bets'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_UEFA EURO 2024, Qualification'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_Ukraine'))

WebUI.setText(findTestObject('sportsbook/Long-Term Bets/input_Betslip_stake_input slip_stake_single'), 
    '9')

WebUI.click(findTestObject('Object Repository/sportsbook/Long-Term Bets/button_Place Bet'))

WebUI.verifyElementPresent(findTestObject('sportsbook/Long-Term Bets/div_Minimum stake allowed is 10'), 
    0)

WebUI.delay(2)

WebUI.setText(findTestObject('sportsbook/Long-Term Bets/input_Betslip_stake_input slip_stake_single'), 
    '10')

not_run: WebUI.click(findTestObject('sportsbook/Long-Term Bets/button_Place Bet'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_Svenska Cup 2324'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_Hacken Gothenburg'))

WebUI.back()

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_UEFA Champions League 2324'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/span_Yes'))

WebUI.click(findTestObject('sportsbook/Long-Term Bets/p_Combo'))

WebUI.delay(2)

WebUI.setText(findTestObject('sportsbook/Long-Term Bets/input_Betslip_stake_input slip_stake_single'), 
    '9')

WebUI.click(findTestObject('sportsbook/Long-Term Bets/button_Place Bet'))

WebUI.verifyElementPresent(findTestObject('sportsbook/Long-Term Bets/div_Minimum stake allowed is 10'), 
    0)

WebUI.setText(findTestObject('sportsbook/Long-Term Bets/input_Betslip_stake_input slip_stake_single'), 
    '10')

WebUI.delay(2)

not_run: WebUI.click(findTestObject('sportsbook/Long-Term Bets/button_Place Bet'))

WebUI.takeScreenshot()

