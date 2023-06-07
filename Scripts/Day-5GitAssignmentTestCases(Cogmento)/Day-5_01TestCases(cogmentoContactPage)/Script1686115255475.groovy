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

WebUI.navigateToUrl('https://ui.cogmento.com/')

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_Login_email'), 
    '19032011015.it.paresh.mali@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_Login_password'), 
    '6LVF0EDOI3bjesnKVNQvwA==')

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/div_Login'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/span_Contacts'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/i_Create_edit icon'))

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_First Name_first_name'), 
    'simform')

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_Last Name_last_name'), 
    'solution')

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_Middle Name(s)_middle_name'), 
    'good')

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_Company_search'), 
    '')

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/input_Company_search'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/Page_Cogmento CRM/button_Save'))

WebUI.closeBrowser()

