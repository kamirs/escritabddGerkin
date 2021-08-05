package br.com.desafio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Util {
	
	public static WebDriver driver = null;	
	
	
	
	public void  setup(String url) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("start-maximized");
		    options.addArguments("disable-infobars");
		    //driver = webdriver.Chrome(chrome_path, chrome_options=options)
		    driver = new ChromeDriver(options);
		    driver.get(url);
		    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		  }
		
	
    
	public void finalizar() {
		
		driver.quit();
		
	}
	
	

}
