package api.test;

import com.aventstack.extentreports.gherkin.model.Given;

import static io.restassured.RestAssured.given;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class testRequres {

	
	
	
	
	@Test
	public void response () {
		
		
		
		RestAssured.baseURI= "https://reqres.in/api/users?page=2";
		// 'x-api-key': 'YOUR_API_KEY'
		
		String boqbody = "{\n"
				+ "    \"comp_cd\": 1,\n"
				+ "    \"div_cd\": 1,\n"
				+ "    \"loc_cd\": 2,\n"
				+ "    \"proj_sr_no\": \"2455\",\n"
				+ "    \"proj_act_srno\": 6910,\n"
				+ "    \"fin_yr\": 2025,\n"
				+ "    \"created_by\": 201,\n"
				+ "    \"created_dt\": \"2025-12-04\",\n"
				+ "    \"creator_role_cd\": 22,\n"
				+ "    \"updated_by\": 201,\n"
				+ "    \"updated_dt\": \"2025-12-04\",\n"
				+ "    \"updator_role_cd\": 22,\n"
				+ "    \"next_updator_role\": 0,\n"
				+ "    \"proj_act_catg\": \"FORM\",\n"
				+ "    \"proj_act_catg_type\": \"BQC\",\n"
				+ "    \"app_by\": 201,\n"
				+ "    \"app_dt\": \"2025-12-04\",\n"
				+ "    \"projBoqList\": [\n"
				+ "        {\n"
				+ "            \"proj_boqdtl_srno\": 1601,\n"
				+ "            \"comp_cd\": 1,\n"
				+ "            \"div_cd\": 1,\n"
				+ "            \"loc_cd\": 2,\n"
				+ "            \"boq_id\": \"1\",\n"
				+ "            \"basic_dtls\": \"nf\",\n"
				+ "            \"bq_qty\": 23,\n"
				+ "            \"bq_uom\": 36,\n"
				+ "            \"created_by\": 201,\n"
				+ "            \"created_dt\": \"2025-12-04\",\n"
				+ "            \"creator_role_cd\": 22,\n"
				+ "            \"updated_by\": 201,\n"
				+ "            \"updated_dt\": \"2025-12-04\",\n"
				+ "            \"updator_role_cd\": 22,\n"
				+ "            \"terminal_id\": null,\n"
				+ "            \"active_yn\": 1,\n"
				+ "            \"ver_no\": 0,\n"
				+ "            \"proj_act_srno\": 6910,\n"
				+ "            \"proj_sr_no\": \"2455\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "            \"boq_id\": \"2\",\n"
				+ "            \"basic_dtls\": \"computers\",\n"
				+ "            \"bq_qty\": 24,\n"
				+ "            \"bq_uom\": 44,\n"
				+ "            \"comp_cd\": 1,\n"
				+ "            \"div_cd\": 1,\n"
				+ "            \"loc_cd\": 2,\n"
				+ "            \"proj_boqdtl_srno\": null,\n"
				+ "            \"proj_sr_no\": \"2455\",\n"
				+ "            \"proj_act_srno\": 6910,\n"
				+ "            \"created_by\": 201,\n"
				+ "            \"created_dt\": \"2025-12-04\",\n"
				+ "            \"updated_by\": 201,\n"
				+ "            \"updated_dt\": \"2025-12-04\",\n"
				+ "            \"creator_role_cd\": 22,\n"
				+ "            \"updator_role_cd\": 22\n"
				+ "        }\n"
				+ "    ]\n"
				+ "}";
		
	//	Response res = given().body(boqbody).contentType(ContentType.JSON).accept("application/json").when().post("/erp-fms-api/v2/project/boq/dtl");
		
		Response res = given().header("x-api-key", "YOUR_API_KEY").contentType(ContentType.JSON).queryParam("page", "2").when().get("/users").then().assertThat().statusCode(200).log().all().extract().response();
		
		
	//	ValidatableResponse testschema= given().contentType(ContentType.JSON).body(userPayload.userpayload1()).accept("application/json").when().post("/erp-fms-api/v2/project/boq/dtl").then().body(matchesJsonSchemaInClasspath("payload.json"));
		
	//	System.out.println(res);
//		res.then()
//		.body("data[0].projBoqList[0].proj_boqdtl_srno", equalTo(1625));
		
		

//	
//		boolean projsrnook = res.then().statusCode(200).body("",equalTo(1604));
	
	//	System.out.println(res.asPrettyString());
		
	//	JsonPath js = res.jsonPath();
		
	//	int boqdtsrno = js.getInt("Data[0].projBoqList[0].proj_boqdtl_srno");/////---------------getting null study
//int boqdtsrno = js.getInt("data[0].projBoqList[0].proj_boqdtl_srno");
		
	//.//	System.out.println(boqdtsrno);

		
		
	
	
		
	}
}
