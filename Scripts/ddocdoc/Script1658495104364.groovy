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

//###########################################################################
// WebUI.openBrowser("url") < 브라우저 진입
// WebUI.click(findTestObject('')) < 객체 선택
// WebUI.verifyElementPresent(findTestObject('')) < 객체 확인
// WebUI.sendKeys(findTestObject(url), "blabla") < 검색창 선택 및 텍스트 전송
// WebUI.verifyTextpresent('blablabla', false) < 텍스트 유무로 판별
// ##########################################################################
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

WebUI.verifyElementPresent(findTestObject('Page_병드민/hospital_info'), 5)

WebUI.click(findTestObject('Page_병드민/hospital_info'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/span_병원정보 타이틀'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/button_저장'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/pre_변경된 정보를 저장하시겠습니'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/button_취소'))

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/button_저장'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/pre_변경된 정보를 저장하시겠습니'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/button_확인'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/pre_병원 정보를 수정하였습니다'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_병원 정보/button_확인'))

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/span_진료시간 정보'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/span_진료시간 정보 타이틀'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/button_진료시간 설정'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/span_우측 하단의 저장 버튼 클릭해야 반영 문구'), 5)

WebUI.clearText(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/input__월요일 시작 시'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/input__HH 확인'), 5)

WebUI.sendKeys(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/input__월요일 시작 시'), '10')

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/button_저장'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/pre_업데이트 되었습니다'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_진료시간 정보/button_확인'))

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_의사 정보/span_의사 정보'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_의사 정보/span_의사 정보 타이틀'), 5)

WebUI.click(findTestObject('Page_병드민/병원 정보/병원 정보_진료비 정보/span_진료비 정보'))

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_진료비 정보/span_진료비 정보 타이틀'), 5)

WebUI.click(findTestObject('notice/notice'))

WebUI.delay(2)

WebUI.click(findTestObject('notice/btn_noticeAdd'))

WebUI.click(findTestObject('notice/btn_cancel'))

WebUI.verifyTextNotPresent('병원 공지사항', false)

WebUI.click(findTestObject('notice/btn_noticeAdd'))

WebUI.click(findTestObject('notice/btn_save'))

WebUI.verifyTextNotPresent('내용을 입력해주세요', false)

WebUI.click(findTestObject('notice/notice_btn_saveConfirm22'))

WebUI.verifyElementPresent(findTestObject('notice/menu_txt_notice'), 5)

WebUI.setText(findTestObject('notice/notice_input_title'), '똑닥 진우 테스트')

WebUI.verifyTextNotPresent('똑닥 진우 테스트', false)

WebUI.setText(findTestObject('notice/notice_input_description'), '똑닥 진우 테스트 내용 ~~')

WebUI.verifyTextNotPresent('똑닥 진우 테스트 내용 ~~', false)

WebUI.click(findTestObject('notice/notice_btn_saveConfirm22'))

WebUI.acceptAlert()

WebUI.click(findTestObject('notice/btn_noticeAdd'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Page_병드민/병원 정보/병원 정보_진료비 정보/span_진료비 정보 타이틀'), 5)

WebUI.click(findTestObject('Page_병드민/span_환자 현황'))

WebUI.click(findTestObject('Page_병드민/span_환자 CRM'))

WebUI.click(findTestObject('Page_병드민/span_똑닥서비스'))

WebUI.click(findTestObject('Page_병드민/span_공지사항 자주 묻는 질문'))

WebUI.click(findTestObject('Page_병드민/span_고객의 소리'))

WebUI.click(findTestObject('Page_병드민/span_원격 지원'))

WebUI.click(findTestObject('logout/btn_hospitalName'))

WebUI.click(findTestObject('logout/btn_logout'))

WebUI.verifyElementPresent(findTestObject('null'), 5)

WebUI.closeBrowser()

