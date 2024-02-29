import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.click(findTestObject('Object Repository/Casino Page/CasinoMenu'))


List<WebElement> provider= DriverFactory.getWebDriver().findElements(By.xpath("//input[@name='provider_list']"))

println(provider.size())

for (int i = 1; i < provider.size(); i++) {
	
	          
			  WebElement currentElement = provider.get(i)
		      currentElement.click()
			  
			  WebUI.delay(30)
			  
			  WebUI.scrollToPosition(0, 250)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 500)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 750)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 1000)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 1250)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 1500)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 1750)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 2000)
			  
			  WebUI.delay(5)
		
		      String providerwindow =  WebUI.getWindowTitle()
		
		      List<WebElement> allgames = DriverFactory.getWebDriver().findElements(By.xpath("//div[@class='tile-container' and @bis_skin_checked='1']"))
		
			  println(allgames.size())
			  
			  
			  
		            for (int j = 71; j < allgames.size(); j++) {
			
			             println(j)
			
			             WebElement playgame = allgames.get(j)
			
		                 TestObject Object = WebUI.convertWebElementToTestObject(playgame)
			
						 WebUI.scrollToElement(Object, 10)
						
			             WebUI.mouseOver(Object)
			
			             //WebUI.scrollToElement(Object, 10)
						 
						     if(WebUI.verifyElementClickable(Object)) {
								 
			                    playgame.click()
			
			                    WebUI.delay(5)
			
			                    WebUI.switchToWindowIndex(1)
						 
			                    String title = WebUI.getUrl()
						 
						        println(title)
						 
			
			                         if(title.contains("notavailable")) {
								  
								              println("Failed")
				                              println("Game number -" + j +"- Failed to open")
				
			                         }
						 
			
			
			
			
			              WebUI.switchToWindowIndex(1)
			
			              WebUI.closeWindowIndex(1)
			
			              WebUI.switchToWindowIndex(0)
			
			
			              WebUI.delay(2)
			
						 }
			
		 }
		
          
		      WebUI.scrollToPosition(0, 1000)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 750)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 500)
			  
			  WebUI.delay(5)
	   
			  WebUI.scrollToPosition(0, 250)
			  
			  WebUI.delay(5)
			  
			  WebUI.scrollToPosition(0, 50)
			  
			  WebUI.delay(5)
		
	}