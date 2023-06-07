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

//CustomKeywords.'cogmentoPackage.Cogmento_CompanyKeyword.contact'()
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.cogurl)

try {
	WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM and VRM Verifiable Creden_5f495a/span_Log In'))
    CustomKeywords.'cogmentoPackage.Cogmento_CreateContactKeyword.login'(emailId,Password)
}
catch (Exception e) {
	CustomKeywords.'cogmentoPackage.Cogmento_CreateContactKeyword.login'(emailId,Password)
} 
finally { 


//CustomKeywords.'cogmentoPackage.Cogmento_CreateContactKeyword.login'(emailId)

//WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM and VRM Verifiable Creden_5f495a/span_Log In'))
//
//WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Login_email'), 
//    '190320116015.it.paresh.mali@gmail.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Login_password'), 
//    '6LVF0EDOI3bjesnKVNQvwA==')
//
WebUI.sendKeys(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Login_password'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Companies/Page_Cogmento CRM/div_Login'))
CustomKeywords.'cogmentoPackage.Cogmento_CreateContactKeyword.waitandclick'('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/a_Contacts')

//WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/a_Contacts'))
WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/button_Create'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_First Name_first_name'), 
    FirstName)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Last Name_last_name'), 
    MiddleName)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Middle Name(s)_middle_name'), 
    LastName)

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/span_Contacts'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/i_good simform morning_edit icon'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_First Name_first_name'), 
    'good vali')

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/span_Contacts'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/button_good vali simform morning_ui button icon'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/button_Delete'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/span_Contacts'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/i_paresh hellodhanjibhai mali_unhide icon'))

//WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/DemoUrl/Page_Cogmento CRM/i_Free account_trash alternate outline icon'))
CustomKeywords.'cogmentoPackage.Cogmento_CreateContactKeyword.logout'()

//WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/DemoUrl/Page_Cogmento CRM/i_Free account_settings icon'))
//
//WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/DemoUrl/Page_Cogmento CRM/a_Log Out'))
WebUI.closeBrowser()
}
