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

// WebUI.verifyTextNotPresent > 해당 텍스트가 없는지 확인
//'병드민 URL OPEN'
//WebUI.openBrowser(GlobalVariable.URL)
//
//'창 최대화'
//WebUI.maximizeWindow()
//
//'로그인 버튼 확인'
//WebUI.verifyElementPresent(findTestObject('login/btn_trylogin'), 5)
//
//'로그인 버튼 선택'
//WebUI.click(findTestObject('login/btn_trylogin'))
//
//'로그인 화면 확인'
//WebUI.verifyElementPresent(findTestObject('login/input_id'), 5)
//
//'id 입력 전역변수 활용'
//WebUI.setText(findTestObject('login/input_id'), GlobalVariable.ID)
//
//'pw 입력 전역변수 활용'
//WebUI.setText(findTestObject('login/input_pw'), GlobalVariable.PW)
//
//'활성화된 로그인 버튼 선택'
//WebUI.click(findTestObject('login/btn_login'))
//
//'병드민 홈 화면 진입 확인'
//WebUI.verifyElementPresent(findTestObject('Page_병드민/home'), 5)
'병원정보 확인'
WebUI.verifyElementPresent(findTestObject('Page_병드민/hospital_info'), 5)

'병원정보_병원정보 진입'
WebUI.click(findTestObject('Page_병드민/hospital_info'))

'병원정보_공지사항 진입'
WebUI.click(findTestObject('notice/notice'))

'리스트 유무 확인'
WebUI.verifyTextPresent('똑닥 진우 테스트 수정', false)

'삭제 버튼 선택'
WebUI.enhancedClick(findTestObject('notice/btn_noticeDelete'))

'공지사항 삭제 문구 확인'
WebUI.verifyTextPresent('공지사항을 삭제하시겠습니까?', false)

'알럿 팝업 확인 선택'
WebUI.click(findTestObject('null'))

'삭제된 리스트 유무 확인'
WebUI.verifyTextNotPresent('똑닥 진우 테스트 수정', false)

