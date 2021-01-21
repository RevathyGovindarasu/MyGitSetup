package test;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class RestAssuredTest {
	
	@Test
	public void getResponse()

	{
		given().pathParam("deck_id", "b0e4naabunww").queryParam("count", 2)
		.when().get("http://deckofcardsapi.com/api/deck/{deck_id}/draw/")
		.then().log().all();
		System.out.println(given().pathParam("deck_id", "b0e4naabunww").queryParam("count", 2)
		.when().get("http://deckofcardsapi.com/api/deck/{deck_id}/draw/")
		.then().extract().path("Cards:code[0]"));
		
		}
}
