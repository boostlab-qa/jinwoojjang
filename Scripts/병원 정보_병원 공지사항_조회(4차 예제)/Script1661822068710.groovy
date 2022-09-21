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

'병원정보 확인'
WebUI.verifyElementPresent(findTestObject('Page_병드민/hospital_info'), 5)

'병원정보_병원정보 진입'
WebUI.click(findTestObject('Page_병드민/hospital_info'))

'병원정보_공지사항 진입'
WebUI.click(findTestObject('notice/notice'))

'공지사항 타이틀 문구 확인\r\n'
WebUI.verifyElementPresent(findTestObject('notice/menu_txt_notice'), 5)

'똑닥 진우 테스트 입력'
WebUI.setText(findTestObject('notice/notice_input_search'), '진우 테스트 2')

'검색 버튼 선택'
WebUI.click(findTestObject('notice/notice_btn_search'))

if (WebUI.verifyElementClickable(findTestObject('notice/btn_noticeEdit'), FailureHandling.OPTIONAL)) {
   
	 '공지사항 저장 버튼 확인'
    WebUI.click(findTestObject('notice/btn_noticeEdit'))

    '공지사항 제목 수정본 입력'
    WebUI.setText(findTestObject('notice/notice_input_title'), '진우 테스트 2')

    '공지사학 내용 입력'
    WebUI.setText(findTestObject('notice/notice_input_description'), '진우 테스트 내용 2')

    '공지사항 저장 버튼 선택'
    WebUI.click(findTestObject('notice/btn_save'))
	
	'공지사항 알럿 팝업 저장 버튼 선택'
	WebUI.click(findTestObject('null'))
	
} else {
    '공지사항 등록 버튼 선택'
    WebUI.click(findTestObject('notice/btn_noticeAdd'))

    '공지사항 제목 입력'
    WebUI.setText(findTestObject('notice/notice_input_title'), '진우 테스트 2')

    '공지사항 내용 입력'
    WebUI.setText(findTestObject('notice/notice_input_description'), '진우 테스트 내용 2')

    '공지사항 등록_저장'
    WebUI.click(findTestObject('notice/btn_save'))

    '공지사항 알럿 팝업 저장 버튼 선택'
    WebUI.click(findTestObject('null'))
}

'똑닥 진우 테스트 노출 확인'
WebUI.verifyTextPresent('진우 테스트 2', false)

'브라우저 닫기'
WebUI.closeBrowser()

