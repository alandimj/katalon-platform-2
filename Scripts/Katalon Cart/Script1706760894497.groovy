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

WebUI.callTestCase(findTestCase('Katalon Shop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Flying Ninja  Katalon Shop/Cart shop'), 2)

WebUI.click(findTestObject('Object Repository/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.navigateToUrl('https://cms.demo.katalon.com/checkout/')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_first_name'), 'Admin')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_last_name'), 'indo')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_company'), 'Indocyber')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_address_1'), 'komplek aldion hero')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_address_2'), '')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_address_2'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_city'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/span_Select an option'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_postcode'), '1366')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_postcode'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_phone'), '08123456789')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_billing_email'), 'admin.indo@indocyber.id')

