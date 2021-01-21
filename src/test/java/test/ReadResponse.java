package test;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class ReadResponse {

	@Test
	public void readResponseoutput()
	{
	String url = "http://deckofcardsapi.com/api/new";
	System.out.println("ContentType = "+ given().when().get(url).then().extract().contentType());
	}
}