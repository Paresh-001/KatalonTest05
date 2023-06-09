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

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-5'), 
    FirstName)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-7'), 
    LastName)

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-31'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Address_vfb-13address'), 
    Address1)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Street Address_vfb-13address-2'), 
    Address2)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_City_vfb-13state'), 
    State)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_State  Province  Region_vfb-13zip'), 
    City)

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Postal  Zip Code_select2-selection sel_e0ab4c'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Copyright 2018-2023. All Rights Reser_b02561'), 
    Country)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-14'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Date of Demo_vfb-18'), 
    '')

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Date of Demo_vfb-18'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/a_16'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Convenient Time_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/ul_000510152025303540455055'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Mobile Number_vfb-19'), 
    PhoneNo)

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Selenium WebDriver'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Course Interested_vfb-20'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Selenium WebDriver_vfb-20'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/label_UFT'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_UFT_vfb-20'))

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Selenium WebDriver_vfb-20'))

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/textarea_Enter your query_vfb-23'), 
    comment)

WebUI.setText(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-3'), 
    '99')

WebUI.click(findTestObject('Object Repository/Day-3PracticeObjectFolder/day-3_01TestObjective/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_This box is for spam protection - str_2dcb9b'))

WebUI.closeBrowser()

