package api.test;

import java.net.ResponseCache;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;




import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class broken_link {

	
	
	
	
	
	
	
	
	@Test
	public void testlink() throws InterruptedException {

	    WebDriverManager.chromedriver().setup();
	    WebDriver dr = new ChromeDriver();
	    dr.manage().window().maximize();
	    dr.get("https://demoqa.com/broken");

	    Thread.sleep(3000);

	    List<WebElement> listweb = dr.findElements(By.tagName("a"));

	    for (WebElement l : listweb) {

	        String url = l.getAttribute("href");

	        if (url == null || url.isEmpty()) {
	            System.out.println("⚠ No href attribute found");
	            continue;
	        }

	        try {
	            Response res = RestAssured
	                    .given()
	                    .when()
	                    .head(url)
	                    .then()
	                    .extract()
	                    .response();

	            int status = res.getStatusCode();

	            if (status != 200) {
	                System.out.println("❌ Broken link --> " + url + " | Status Code: " + status);
	            } else {
	                System.out.println("✔ Working link --> " + url + " | Status Code: " + status);
	            }

	        } catch (Exception e) {
	            System.out.println("⚠ Error while calling: " + url);
	        }
	    }

	    dr.quit();
	}


	}
		
	

