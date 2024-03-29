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

WebUI.setText(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Login username'), 
    'Sherlock')

WebUI.setEncryptedText(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Login password'), 
    'Ae2KZyjYBr0MQlyqU7ThAA==')

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Log Button'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/My Account'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/My Haboom Account'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Payments'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Deposit'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Bank Transfer'))

WebUI.setText(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Amount input field'), 
    '1000')

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/Pay button'))

WebUI.setText(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/UTR number enter field'), 
    '54892179621539569')

WebUI.click(findTestObject('Object Repository/My Account_Payment/Deposit Bank Transfer/UTR Submit button'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('My Account_Payment/Transaction history page/Betting Activity'))

WebUI.click(findTestObject('My Account_Payment/Transaction history page/Transaction History'))

WebUI.click(findTestObject('My Account_Payment/Transaction history page/Transaction History (Options)'))

WebUI.click(findTestObject('My Account_Payment/Transaction history page/Transactions filter'))

WebUI.click(findTestObject('My Account_Payment/Transaction history page/Deposit Requests'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

