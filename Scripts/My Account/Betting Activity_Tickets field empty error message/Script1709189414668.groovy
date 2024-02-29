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

//click on betting activity
WebUI.click(findTestObject('My Account_Payment/Betting Activity/a_Betting Activity'))

//Click on Tickets
WebUI.click(findTestObject('My Account_Payment/Betting Activity/a_Tickets'))

//click on add new query
WebUI.click(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Add new query'))

// Click on submit button
WebUI.click(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Submit'))

WebUI.verifyElementText(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/div_The issue field is required'), 
    'The issue field is required.')

WebUI.delay(1)

//take screenshot
WebUI.takeFullPageScreenshot()

