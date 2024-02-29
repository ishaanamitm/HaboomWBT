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

WebUI.setText(findTestObject('My Account_Payment/Deposit Bank Transfer/Login username'), 'sherlock')

WebUI.setText(findTestObject('My Account_Payment/Deposit Bank Transfer/Login password'), 'Eternals@123')

WebUI.click(findTestObject('My Account_Payment/Deposit Bank Transfer/Log Button'))

WebUI.click(findTestObject('My Account_Payment/Deposit Bank Transfer/My Account'))

WebUI.click(findTestObject('My Account_Payment/Deposit Bank Transfer/My Haboom Account'))

WebUI.click(findTestObject('My Account_Payment/Betting Activity/a_Betting Activity'))

WebUI.click(findTestObject('My Account_Payment/Betting Activity/a_My Slots Bets'))

WebUI.verifyElementText(findTestObject('My Account_Payment/Betting Activity/Slots Bets History'), 'SLOTS BETS HISTORY')

