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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/New Folder/img__attachment-woocommerce_thumbnail size-_5f269b'))

WebUI.click(findTestObject('Object Repository/New Folder/div_Ninja Silhouette quantity_quantity-butt_54eb5f'))

WebUI.click(findTestObject('Object Repository/New Folder/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/New Folder/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/New Folder/input__billing_first_name'), 'First Name')

WebUI.setText(findTestObject('Object Repository/New Folder/input__billing_last_name'), 'Name')

WebUI.setText(findTestObject('Object Repository/New Folder/input__billing_address_1'), '20')

WebUI.setText(findTestObject('Object Repository/New Folder/input_(optional)_billing_address_2'), 'D')

WebUI.setText(findTestObject('Object Repository/New Folder/input__billing_city'), 'Amt')

WebUI.click(findTestObject('Object Repository/New Folder/label_State  County'))

WebUI.setText(findTestObject('Object Repository/New Folder/input__billing_postcode'), '222222')

WebUI.click(findTestObject('Object Repository/New Folder/button_Place order'))

WebUI.closeBrowser()

