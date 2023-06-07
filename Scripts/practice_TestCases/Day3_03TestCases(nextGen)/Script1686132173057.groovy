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

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Toggle navigation_icon-bar'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/i_Demo Sites_fa fa-angle-right'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/a_Demo Site  Alert and Popup'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Alert and Popup  NxtGen A.I_3cd99a/button_Alert Box'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Alert and Popup  NxtGen A.I_3cd99a/button_Confirm Alert Box'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Alert and Popup  NxtGen A.I_3cd99a/button_Prompt Alert Box'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Alert and Popup  NxtGen A.I_3cd99a/span_Toggle navigation_icon-bar'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Alert and Popup  NxtGen A.I_3cd99a/i_Demo Sites_fa fa-angle-right'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Alert and Popup  NxtGen A.I_3cd99a/a_Demo Site  Mouse Event'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Mouse Event  NxtGen A.I Academy/input_Mouse Actions - Tooltip_textbox'), 
    'first')

WebUI.doubleClick(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Mouse Event  NxtGen A.I Academy/button_Double Click Me'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Mouse Event  NxtGen A.I Academy/button_Right Click Me'))

WebUI.rightClick(findTestObject('Object Repository/Day-3PracticeObjectFolder/Day-3_03TestObjective/Page_Demo Site  Mouse Event  NxtGen A.I Academy/button_Right Click Me'))

WebUI.closeBrowser()

