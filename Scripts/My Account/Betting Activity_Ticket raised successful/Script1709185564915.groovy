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

//my account
WebUI.click(findTestObject('My Account_Payment/My Account page/Login Button'))

//Click my haboom account
WebUI.click(findTestObject('My Account_Payment/My Account page/My Account'))

WebUI.click(findTestObject('My Account_Payment/My Account page/My Haboom Account'))

//click on betting activity
WebUI.click(findTestObject('My Account_Payment/Betting Activity/a_Betting Activity'))

//Click on Tickets
WebUI.click(findTestObject('My Account_Payment/Betting Activity/a_Tickets'))

//click on add new query
WebUI.click(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Add new query'))

//select the issuetype
WebUI.selectOptionByIndex(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Select your issue type'), 
    2, FailureHandling.STOP_ON_FAILURE)

//select issue subject type
WebUI.selectOptionByIndex(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Subject type'), 
    2)

//Description
WebUI.setText(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Description'), 
    'Want to change the phone number')

// Click on submit button
WebUI.click(findTestObject('My Account_Payment/Betting Activity_Tickets/Page_Haboom - Best 1 Indias Online Sports Betting/Submit'))

//Delay
WebUI.delay(5)

//take screenshot
WebUI.takeFullPageScreenshot()

//take screenshot
WebUI.takeFullPageScreenshot()
 
//get actual title
String Actualtitle = WebUI.getWindowTitle()
 
//Print actual title
println(Actualtitle)
 
//Expected page tile
String Expectedtitle = 'Haboom - Best #1 India\'s Online Sports Betting'
 
//compare expected and actual
WebUI.verifyMatch(Actualtitle, Expectedtitle, true)

