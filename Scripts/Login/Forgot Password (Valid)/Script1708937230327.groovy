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

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password (Valid)/Login Page Forgot Password/a_Forgot Password'))

WebUI.switchToWindowTitle('Haboom - Best #1 India\'s Online Sports Betting')

WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password (Valid)/Forgot Password Page/Email or Username'), 
    'vipereagle0306@gmail.com')

WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password (Valid)/Forgot Password Page/Phone Number'), 
    '6366763704')

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password (Valid)/Forgot Password Page/Check Button'))

WebUI.verifyElementText(findTestObject('Login Page/Forgot Password (Valid)/Forgot Password Page/OTP sent successfully'), 
    'OTP sent successfully')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password (Valid)/Forgot Password Page/OTP'))

