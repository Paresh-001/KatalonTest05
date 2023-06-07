package cogmentoPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Cogmento_CreateContactKeyword {
	@Keyword
	public login(emailId,Password){


		WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM and VRM Verifiable Creden_5f495a/span_Log In'))

		WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Login_email'),
				emailId)

		WebUI.setEncryptedText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_04TestObjectiveOfCogmento/Page_Cogmento CRM/input_Login_password'),
				Password)
		//		WebUI.click(findTestObject('Object Repository/Companies/Page_Cogmento CRM/div_Login'))
		//		'6LVF0EDOI3bjesnKVNQvwA=='
	}


	public waitandclick(object) {
		WebUI.waitForElementPresent(findTestObject(object), 5)

		WebUI.click(findTestObject(object))
	}


	public logout() {
		WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/DemoUrl/Page_Cogmento CRM/i_Free account_settings icon'))

		WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/DemoUrl/Page_Cogmento CRM/a_Log Out'))
		WebUI.closeBrowser()
	}
}
