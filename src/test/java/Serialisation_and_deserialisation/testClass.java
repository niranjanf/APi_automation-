package Serialisation_and_deserialisation;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.ProxySpecification;
public class testClass {

	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
	//	ProxySpecification proxy = new ProxySpecification("", DEFAULT_PORT, DEFAULT_BODY_ROOT_PATH)
		
		Seriaisation_payload payload = new Seriaisation_payload("admin","password123");
		
		
		Response res = given().contentType(ContentType.JSON).queryParam("", "").body(payload).when().post("/auth").then().statusCode(200).extract().response();
		

		
		
	//	System.out.println(res.asPrettyString());
		
		//deserialisation 
		
		repsonsepayload_for_deserialisation res_deserialise = res.as(repsonsepayload_for_deserialisation.class);
		
		
	//	System.out.println(res_deserialise.gettoken());
		
		
		
		
		
		
		
		
	}
	
}
