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

WebUI.setText(findTestObject('My Account_Payment/My Account page/Login Username'), 'Sherlock')

WebUI.setText(findTestObject('My Account_Payment/My Account page/Login Password'), 'Eternals@123')

WebUI.click(findTestObject('My Account_Payment/My Account page/Login Button'))

WebUI.click(findTestObject('My Account_Payment/My Account page/My Account'))

WebUI.click(findTestObject('My Account_Payment/My Account page/My Haboom Account'))

WebUI.click(findTestObject('My Account_Payment/Deposit Bank Transfer/Payments'))

WebUI.click(findTestObject('My Account_Payment/Transfer Funds/Transfer Funds'))

WebUI.click(findTestObject('My Account_Payment/Transfer Funds/transfer amount'))

WebUI.setText(findTestObject('My Account_Payment/Transfer Funds/transfer amount'), '100')

WebUI.click(findTestObject('My Account_Payment/Transfer Funds/From Transfer amount'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('My Account_Payment/Transfer Funds/To player'), 'deepak')

WebUI.click(findTestObject('My Account_Payment/Transfer Funds/Transfer button'))

WebUI.verifyElementText(findTestObject('My Account_Payment/Transfer Funds/Invalid user'), 
    'Invalid Payee details')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

