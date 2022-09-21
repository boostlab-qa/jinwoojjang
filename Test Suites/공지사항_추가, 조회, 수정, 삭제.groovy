import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = true) // Please change skipped to be false to activate this method.
def setUp() {
	// Put your code here.
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = true) // Please change skipped to be false to activate this method.
def tearDown() {
	// Put your code here.
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = false) // Please change skipped to be false to activate this method.
def 병드민로그인() {
	
	'병드민 URL OPEN'
	WebUI.openBrowser(GlobalVariable.URL)
	
	'창 최대화'
	WebUI.maximizeWindow()
	
	'로그인 버튼 확인'
	WebUI.verifyElementPresent(findTestObject('login/btn_trylogin'), 5)
	
	'로그인 버튼 선택'
	WebUI.click(findTestObject('login/btn_trylogin'))
	
	'로그인 화면 확인'
	WebUI.verifyElementPresent(findTestObject('login/input_id'), 5)
	
	'id 입력 전역변수 활용'
	WebUI.sendKeys(findTestObject('login/input_id'), GlobalVariable.ID)
	
	'pw 입력 전역변수 활용'
	WebUI.sendKeys(findTestObject('login/input_pw'), GlobalVariable.PW)
	
	'활성화된 로그인 버튼 선택'
	WebUI.click(findTestObject('login/btn_login'))
	
	'병드민 홈 화면 진입 확인'
	WebUI.verifyElementPresent(findTestObject('Page_병드민/home'), 5)
	
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = false) // Please change skipped to be false to activate this method.
def 브라우저종료() {
	// Put your code here.
	WebUI.closeBrowser()
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */