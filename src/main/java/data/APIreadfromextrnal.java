package data;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import groovy.util.logging.Log;

public class APIreadfromextrnal {
	

		
		@Test
		public void tcoo1() throws IOException
		{
			
			
			//given all the input
			
			//when submit the api
			
			//then validate the response
			
			
			RestAssured.baseURI="https://rahulshettyacademy.com";
			Response res=given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
			
			.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Dell\\Desktop\\file.json")))).when().post("maps/api/place/add/json")
			.then().log().all().extract().response();
			
			System.out.println(res.statusCode());

}
}