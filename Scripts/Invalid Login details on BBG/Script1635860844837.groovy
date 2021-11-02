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

WebUI.navigateToUrl('http://172.27.15.103:8024/BbgLoginScreenUI.aspx?reason=sessiontimeout')

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__txtLoginName (6)'))

WebUI.setText(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__txtLoginName (6)'), 'iswale123@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__txtPassword (6)'), '+eZPO2BuUF+R8ZUo5+s6BQ==')

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input_Remember me on this computer_btnLogin (6)'))

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/span_Your UserId or Password is not correct'))

