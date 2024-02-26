import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils
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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://haboom.com/')

WebUI.click(findTestObject('JOINNOW/Joinnow Invalid/Join Now_button'))

def randomusername = RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('JOINNOW/Joinnow Invalid/User name_Field'), randomusername)

def randomemail = RandomStringUtils.randomAlphanumeric(10)

WebUI.setText(findTestObject('JOINNOW/Joinnow Invalid/Email address_Field'), randomemail + 'gmail.com')

WebUI.setEncryptedText(findTestObject('JOINNOW/Joinnow Invalid/Password_Field'), 'Ae2KZyjYBr3zjExtfoMITg==')

def randomnumber = RandomStringUtils.randomNumeric(10)

WebUI.setText(findTestObject('JOINNOW/Joinnow Invalid/Mobile number_Field'), randomnumber)

WebUI.delay(2)

WebUI.click(findTestObject('JOINNOW/Joinnow Invalid/Register_button'))

WebUI.verifyElementPresent(findTestObject('JOINNOW/Joinnow Invalid/Error Invalid Phone Number'), 0)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

