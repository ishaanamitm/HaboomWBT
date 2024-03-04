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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://haboom.com/')

WebUI.click(findTestObject('Object Repository/JOINNOW/Join Now_button'))

def randomusername = RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('Object Repository/JOINNOW/User name_Field'), randomusername)

def randomemail = RandomStringUtils.randomAlphanumeric(10)

WebUI.setText(findTestObject('Object Repository/JOINNOW/Email address_Field'), randomemail + '@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/JOINNOW/Password_Field'), 'Ae2KZyjYBr3zjExtfoMITg==')

def randomnumber = RandomStringUtils.randomNumeric(14)

WebUI.setText(findTestObject('Object Repository/JOINNOW/Mobile number_Field'), randomnumber)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOINNOW/Register_button'))

WebUI.verifyElementPresent(findTestObject('null'), 
    0)

WebUI.takeScreenshot()

