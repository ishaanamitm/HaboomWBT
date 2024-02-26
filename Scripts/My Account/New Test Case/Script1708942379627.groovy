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

WebUI.setText(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Trusted Online Casino and Spo_832508/input_Help_username'), 
    'sherlock')

WebUI.setEncryptedText(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Trusted Online Casino and Spo_832508/input_Help_password'), 
    'Ae2KZyjYBr0MQlyqU7ThAA==')

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Trusted Online Casino and Spo_832508/input_Help_submitLogForm'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Trusted Online Casino and Spo_832508/span_My Account'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Trusted Online Casino and Spo_832508/a_My Haboom Account'))

WebUI.click(findTestObject('My Account_Payment/Deposit page/Payments'))

WebUI.setText(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/input_Enter in amount and click on Withdraw to initiate transaction_amt_field'), 
    '1000')

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/button_Withdraw'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/label_Checkbox'))

WebUI.rightClick(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/button_Submit'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/div_Withdraw request                       _8ee0e2'))

WebUI.click(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/My Account_Payment/Page_Haboom - Best 1 Indias Online Sports Betting/div_Insufficient Funds'), 
    'Insufficient Funds')

