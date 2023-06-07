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

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/input_Login_email'), 
    '190320116015.it.paresh.mali@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/input_Login_password'), 
    '6LVF0EDOI3bjesnKVNQvwA==')

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/div_Login'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/span_Companies'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/button_Create'))

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/input_Name_name'), 
    'simform14')

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/span_Companies'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/i_simform14_edit icon'))

WebUI.setText(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/input_Name_name'), 
    'simform1413')

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/a_Companies'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/i_simform1413_trash icon'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/button_Delete'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/span_Companies'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/i_simform01_unhide icon'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/i_Free account_settings icon'))

WebUI.click(findTestObject('Object Repository/Day-5TestObject(CogmentoContactpage)/CompanyPageCogmentoCRM/Page_Cogmento CRM/a_Log Out'))

WebUI.closeBrowser()

