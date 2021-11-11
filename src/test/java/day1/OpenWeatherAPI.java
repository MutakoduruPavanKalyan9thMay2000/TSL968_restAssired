package day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class OpenWeatherAPI {
	 @Test
	  public void getWeatherInfo() {
		  RestAssured.given()
		  .when()
		  .get("https://api.openweathermap.org/data/2.5/weather?q=kollegal&appid=f0cf45f69411773e1457cdaf5f1bfeed")
		  .then()
		  .log()
		  .body()
		  .statusCode(200);
		  }
	 @Test(enabled=false,description="Getting weather API ifo generally")
	  public void OpenWeatherInfo2() {
		  
		 Response res=RestAssured.given()
		              .when()
		              .get("http://api.openweathermap.org/data/2.5/weather?q=hyderabad&appid=026582a999ef7e1d7f951f7b3e14e8b5");
		  System.out.println(res.prettyPrint());
		  System.out.println(res.getTime());
		  System.out.println(res.getStatusCode());
		  System.out.println(res.getContentType());
		              
	  }
	  @Test(enabled=true,description="Getting weather API ifo generally")
	  public void OpenWeatherInfo3() {
		  Map<String, String> param=new HashMap<String, String>();
		  param.put("q", "mumbai");
		  param.put("appid", "563f35938249e8885aa209bdd3a60c31");
		  RestAssured.given()
		              .queryParam("q","Mumbai")
		              .queryParam("appid", "563f35938249e8885aa209bdd3a60c31")
		              .when()
		              .get("http://api.openweathermap.org/data/2.5/weather")
		              .then()
		              .log()
		              .body()
		              .statusCode(200);
		
	  }
	}