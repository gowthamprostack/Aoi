package data;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import groovy.util.logging.Log;


public class Tcoo2API {
	
	
	@Test
	public void tcoo1()
	{
		
		
		//given all the input
		
		//when submit the api
		
		//then validate the response
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Response res=given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
		
		.body(DataClass.addplace()).when().post("maps/api/place/add/json")
		.then().log().all().extract().response();
		
		System.out.println(res.statusCode());
		System.out.println(res.statusLine());
		
		System.out.println("------------------------");
		System.out.println(res.body());
		
  String name = res.getBody().asString();
		
		String placeid=DataClass.getdata(name, "place_id");
		
		System.out.println(placeid);
		
		System.out.println("------------------------");
		
		
		
		
		String name1=given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeid)
		
		.when().get("maps/api/place/get/json").then().log().all().extract().response().asString();
		
		
		System.out.println(name1);
		
		JsonPath p=DataClass.getdataresponse(DataClass.getcoueces());
		System.out.println(p.getInt("courses.size()"));
		
		System.out.println(p.getInt("dashboard.purchaseAmount"));
		System.out.println(p.get("courses[0].title"));
		
	}

}
