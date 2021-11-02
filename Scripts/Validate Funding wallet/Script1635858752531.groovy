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

WebUI.setText(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__txtLoginName (3)'), 'christybrr1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__txtPassword (3)'), 'TPqEY6d32Epb51oDJ4PtWg==')

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input_Remember me on this computer_btnLogin (3)'))

WebUI.click(findTestObject('Object Repository/Page_Your Online Banking Summary/span_eNaira (3)'))

WebUI.click(findTestObject('Object Repository/Page_Your Online Banking Summary/a_eNaira (3)'))

WebUI.setText(findTestObject('Object Repository/Page_Login to eNaira/input_Email_ctl00ContentPlaceHolder1textEmail (3)'), 
    'testing_ark@bitt.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to eNaira/input_Password_ctl00ContentPlaceHolder1text_5a6da8 (3)'), 
    '8SQVv/p9jVQbixvz/0SAXQ==')

WebUI.click(findTestObject('Object Repository/Page_Login to eNaira/input__ctl00ContentPlaceHolder1btnEnairaLogin (3)'))

WebUI.click(findTestObject('Object Repository/Page_eNaira Balance/div_e-Naira Wallet'))

WebUI.click(findTestObject('Object Repository/Page_eNaira Balance/input_Current Balance_ctl00ContentPlaceHold_78468c (1)'))

WebUI.setText(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__ctl00ContentPlaceHolder1textAmount (1)'), 
    '4')

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input__ctl00ContentPlaceHolder1btnContinue (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input_Transaction Token_ctl00ContentPlaceHo_1a3902 (1)'), 
    'Kzv5UBfHI4M=')

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/input_Transaction Token_ctl00ContentPlaceHo_f79aff (1)'))

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/div_Funding of wallet successful. Click    _13a0b9'))

WebUI.click(findTestObject('Object Repository/Page_FCMB ONLINE (BUSINESS VERSION)/span_Funding of wallet successful. Click   _4e63ec'))

WebUI.closeBrowser()

