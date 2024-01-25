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

WebUI.navigateToUrl('http://130.211.243.37:96/login')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Login  Elearning CMS/div_Selamat Datang                        S_5442a5'))

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Login  Elearning CMS/input_email'), 
    'admin@indocyber.com')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Login  Elearning CMS/div_Selamat Datang                        S_5442a5'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Login  Elearning CMS/input_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Login  Elearning CMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Home  Elearning CMS/a_Master Question'))

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/button_Tambah                              _531150'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Level'))

WebUI.scrollToElement(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Level Choose 1'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Level Choose 1'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Module'))

WebUI.scrollToElement(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Module Choose'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Module Choose'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Chapter'))

WebUI.scrollToElement(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Chapter Choose'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/Chapter Choose'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/textarea_optA'), 
    'Test Option A')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/textarea_desc'), 
    'Apa Option Terbaik?')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/textarea_optB'), 
    'Test Option B')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/textarea_optC'), 
    'Test Option C')

WebUI.setText(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/textarea_optD'), 
    'Test Option D')

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/input_correctAnswer'))

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/input_isActive'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Master Quiz  Elearning CMS/Test Record/Page_Master Quiz  Elearning CMS/button_Save'))

WebUI.delay(3)

WebUI.back()

