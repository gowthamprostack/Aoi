package data;


import org.apache.poi.ss.usermodel.SheetVisibility;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.restassured.http.Method;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.Excelread;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import Extractresponse.Details;
import Extractresponse.Ext;

public class TC001_Get_whether extends Baseclass {
	
	
	
	
	
	@Test(priority =1)
	void get()
	{
		
        List<Details> l1=new ArrayList<>();	
		RestAssured.baseURI="https://reqres.in";
			
		Ext a=given().queryParam("page", "2").expect().defaultParser(Parser.JSON).when().get("api/users").as(Ext.class);
		
	
		System.out.println(a.getSupport().getText());
		
		int c=a.getData().size();
		System.out.println(c);
		
		
	   l1=a.getData();
	   
	   for(int i=0;i<l1.size();i++)
	   {
		   
		   Details d=l1.get(i);
		   System.out.println(d.getEmail());
		   
	   }
	   
		
    }
	
	
	
	/*@Test(priority=2)
	public void post()
	{
        List<String> type=new ArrayList<String>();
		type.add("shoe park");
		
		type.add("shop");
		Requestbody b=new Requestbody();
		LocationAs loc=new LocationAs();
		
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		
		
		
		b.setName("Frontline house");
		b.setLocation(loc);
		
		b.setAccuracy(50);
		b.setPhone_number(91983893);
		b.setAddress("29, side layout, cohen 09");
		
		
		b.setTypes(type);
		
		b.setWebsite("www.google.com");
		b.setLanguage("english");
		
		System.out.println("body object");
		
		ObjectMapper Obj = new ObjectMapper();
		 
        try {
 
            // get Oraganisation object as a json string
            String jsonStr = Obj.writeValueAsString(b);
 
            // Displaying JSON String
            System.out.println(jsonStr);
        }
 
        catch (IOException e) {
            e.printStackTrace();
        }
		
		
        RestAssured.baseURI="https://rahulshettyacademy.com";
		
		RequestSpecification resuest=RestAssured.given();
		
		resuest.header("Content-Type","application/json");
		  
		resuest.queryParam("key","qaclick123");
		  resuest.body(b);
		
		Response response= resuest.request(Method.POST,"/maps/api/place/add/json");
		  
		  String s=response.getBody().asString();
			
			System.out.println(s);
			
			
			
			
	}*/
	
	
	/*@Test(priority = 3)
	public void postdata()
	{
		System.out.println("body Map");
		
		JSONObject jsonob=new JSONObject();
		Map<String, String>body=new HashedMap<String,String>();
		
		body.put("name", "morpheus");
		body.put("job", "leader");
		jsonob.putAll(body);
		httprequest.body(jsonob.toJSONString());
		  
		  Response response=httprequest.request(Method.POST,"/api/users");		  
		  String s=response.getBody().asString();
		
		System.out.println(s);

			
	}
	
	
	@Test(priority = 4)
	public void datass()
	{
		
		System.out.println("string");
		
		httprequest.body("{\"name\":\"morpheus\",\"job\":\"leader\"}");
		
		Response r=httprequest.request(Method.POST,"/api/users");
		
		System.out.println(r.getBody().asString());
				
	}
	

	@Test(priority = 5)
	public void update()
	{
		
System.out.println("stecvvdfrist body string put");
		
		httprequest.body("{\"name\":\"morpheus\",\"job\":\"zion resident\"}");
		
		Response r=httprequest.request(Method.PUT,"/api/users/2");
		
		System.out.println(r.getBody().asString());
		
		
	}*/
	
	
}