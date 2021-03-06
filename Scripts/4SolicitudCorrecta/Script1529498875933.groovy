import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://sayes-des:9443/ProcessPortal/login.jsp')

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('input_j_username'), 'aperez')

WebUI.setText(findTestObject('input_j_password'), 'Ab123456')

WebUI.sendKeys(findTestObject('input_j_password'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('a_Crear Ausencia'))

WebUI.click(findTestObject('input_ao de cargoao de cargo obligatorio'))

WebUI.click(findTestObject('button_ACEPTAR'))

WebUI.click(findTestObject('button_CONFIRMAR'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('a_Crear Ausencia'), 0)

WebUI.closeBrowser()

