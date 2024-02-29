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

WebUI.openBrowser('https://haboom.com/')

//Username
WebUI.setText(findTestObject('My Account_Payment/My Account page/Login Username'), 'Sherlock')

//Password
WebUI.setText(findTestObject('My Account_Payment/My Account page/Login Password'), 'Eternals@123')

//login
WebUI.click(findTestObject('My Account_Payment/My Account page/Login Button'))

//my account
WebUI.click(findTestObject('My Account_Payment/My Account page/My Account'))

//Click my haboom account
WebUI.click(findTestObject('My Account_Payment/My Account page/My Haboom Account'))

//click payments
WebUI.click(findTestObject('My Account_Payment/Deposit page/Payments (1) (1)'))

//Click Deposit
WebUI.click(findTestObject('My Account_Payment/Deposit page/Deposit'))

//Enter the amount
WebUI.setText(findTestObject('My Account_Payment/Deposit page/Deposit amount entry'), 
    '10')

//click deposit button
WebUI.click(findTestObject('My Account_Payment/Deposit page/button_Deposit (1)'))

//screenshot
WebUI.takeFullPageScreenshot()

//close browser
WebUI.closeBrowser()

