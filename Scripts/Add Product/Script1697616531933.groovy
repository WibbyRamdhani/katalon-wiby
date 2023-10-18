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

WebUI.click(findTestObject('Homepage/product'))

WebUI.click(findTestObject('Homepage/addtocard'))

WebUI.click(findTestObject('Homepage/shopping_cart'))

WebUI.click(findTestObject('Homepage/button_checkout'))

WebUI.setText(findTestObject('Homepage/inputfirstname'), firstname)

WebUI.setText(findTestObject('Homepage/inputlastname'), lastname)

WebUI.setText(findTestObject('Homepage/input_postal-code'), pos)

WebUI.click(findTestObject('Homepage/button_continue'))

WebUI.click(findTestObject('Homepage/button_finish'))

WebUI.verifyElementText(findTestObject('Homepage/test_thankyou'), 'Thank you for your order!')

WebUI.click(findTestObject('Homepage/backtoproduct'))

