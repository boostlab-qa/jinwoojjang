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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType

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

'공지사항 타이틀 문구 확인'
WebUI.verifyElementPresent(findTestObject('notice/menu_txt_notice'), 5)

'검색 버튼 선택'
WebUI.click(findTestObject('notice/notice_btn_search'))

'랜덤 난수 초기화'
Random rnd = new Random()

'랜덤 난수 생성'
randomNumber = (50 + rnd.nextInt(10))

while (true) {
    '랜덤 난수 초기화'
    Random rnd2 = new Random()

    '랜덤 난수 생성'
    randomNumber2 = (50 + rnd2.nextInt(10))

    '랜덤 난수 입력'
    WebUI.setText(findTestObject('notice/notice_input_search'), String.valueOf(randomNumber2))

    '검색 버튼 선택'
    WebUI.click(findTestObject('notice/notice_btn_search'))
	

    if (WebUI.verifyElementClickable(findTestObject('notice/btn_noticeEdit'), FailureHandling.OPTIONAL)) {
        '검색 버튼 선택'
        WebUI.click(findTestObject('notice/notice_btn_search'))

        WebUI.verifyElementClickable(findTestObject('notice/btn_noticeDelete'))

		'if 문에서 최초 난수에 해당하는 리스트 노출 시 break! 빠져나가기 > else 건너뛰기'
        break;
		
    } 
    
}

'현재 행 카운트'
WebDriver driver = DriverFactory.getWebDriver()

'웹 테이블'
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

//행1
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println(rows_count)

WebUI.click(findTestObject('notice/btn_noticeDelete'))

'공지사항 삭제 문구 확인'
WebUI.verifyTextPresent('공지사항을 삭제하시겠습니까?', false)

'알럿 팝업 확인 선택'
WebUI.click(findTestObject('null'))

//행2
List<WebElement> rows_tables = Table.findElements(By.tagName('tr'))

int rows_counts = rows_tables.size()

println(rows_counts)

WebUI.verifyEqual(rows_counts, rows_count-1)

//'브라우저 닫기'
//WebUI.closeBrowser()