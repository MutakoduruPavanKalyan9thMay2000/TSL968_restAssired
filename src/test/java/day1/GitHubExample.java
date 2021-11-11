package day1;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class GitHubExample {
	@Test(enabled=true,description="getting all repositories")
	  public void getAllRepo(){
		  given()
		     .auth()
		     .oauth2("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")
		  .when()
		     .get("https://api.github.com/user/repos")
		  .then()
		      .log()
		      .body()
		      .statusCode(200)
		      .time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);
		  
	  }
	@Test(enabled=true,description="Adding repository")
	 public void addRepository() {
	  JSONObject js=new JSONObject();
	js.put("name","tsl968");
	js.put("description","I am created by Rest");
	js.put("homepage","https://github.com/MutakoduruPavanKalyan9thMay2000");

	given()
	.auth()
	.oauth2("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")
	.when()
	.get("https://api.github.com/user/repos")
	// .get(" https://api.github.com/orgs/ORG/repos")
	.then()
	.log()
	.body()
	.statusCode(200)
	.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);  
	  } 
	  }