import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

Mobile.startApplication(GlobalVariable.APK_PATH, true)

Mobile.delay(30)

Mobile.comment('Enter Username')
Mobile.setText(findTestObject('LoginScreen/usernameTextbox'), findTestData('ValidCredentials').getValue('Username', 1), 30)

Mobile.comment('Enter Password')
Mobile.setText(findTestObject('LoginScreen/passwordTextbox'), findTestData('ValidCredentials').getValue('Password', 1), 30)

Mobile.tap(findTestObject('LoginScreen/loginBtn'), 30)	
							

