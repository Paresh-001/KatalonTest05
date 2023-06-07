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

WebUI.navigateToUrl(GlobalVariable.next1)

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_02TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Toggle navigation_icon-bar'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_02TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Demo Sites_arrow'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_02TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/a_Demo Site  Multiple Windows'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_02TestObjective/Page_Demo Site  Multiple Windows  NxtGen A._3e4057/button_New Browser Window'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_02TestObjective/Page_Demo Site  Multiple Windows  NxtGen A._3e4057/button_New Message Window'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day3_02TestObjective/Page_Demo Site  Multiple Windows  NxtGen A._3e4057/button_New Browser Tab'))

WebUI.closeBrowser()

