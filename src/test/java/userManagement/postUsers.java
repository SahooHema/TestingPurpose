package userManagement;

import pojo.CityRequest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import java.util.*;

import core.StatusCode;
import io.restassured.response.Response;
import pojo.postRequestBody;
import java.util.ArrayList;

import static io.restassured.RestAssured.*;

@Test
public class postUsers {
	
	public static FileInputStream fileInputStreamMethod() throws FileNotFoundException {
		FileInputStream filestream = null;
		try {
			filestream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/testdata/postRequestBody.json"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filestream;
	
	}
	
//	@Test
//	public void validatePostWithString() {
//	
//	Response response = given()
//			.header("Content-Type","application/json")
//			.header("x-api-key","reqres-free-v1")
//			.body("{\"name\":\"hema\",\"job\":\"SDET\"}")
//			.when()
//			.post("https://reqres.in/api/users");
//	 assertEquals(response.getStatusCode(),201);
//	 System.out.println(response.getBody().asString());
//}
//	public void validatePutWithString() {		
//	Response response = given()
//			.header("Content-Type","application/json")
//			.header("x-api-key","reqres-free-v1")
//			.body("{\"name\":\"hema\",\"job\":\"QA\"}")
//			.when()
//			.put("https://reqres.in/api/users/2");
//	 assertEquals(response.getStatusCode(),StatusCode.success.code);
//	 System.out.println(response.getBody().asString());
//}
//	public void validatePatchWithString() {		
//		Response response = given()
//				.header("Content-Type","application/json")
//				.header("x-api-key","reqres-free-v1")
//				.body("{\"name\":\"sumit\"}")
//				.when()
//				.patch("https://reqres.in/api/users/2");
//		 assertEquals(response.getStatusCode(),StatusCode.success.code);
//		 System.out.println(response.getBody().asString());
//	}
	
//	@SuppressWarnings("deprecation")
//	@Test
//	public void validatePostWithJsonFile() throws FileNotFoundException, IOException {
//			Response response = given()
//					.header("Content-Type","application/json")
//					.header("x-api-key","reqres-free-v1")
//					   .body(IOUtils.toString(fileInputStreamMethod()))
//					   .when()
//					 .post("https://reqres.in/api/users");
//			assertEquals(response.getStatusCode(),200);
//			System.out.println(response.getBody().asString()); 		
//	}
	
//	@Test
//	public void ValidatePostWithPOJO() { 
//		postRequestBody postrequest = new postRequestBody();
//		postrequest.setName("morpheous");
//		postrequest.setJob("leader");
//		Response response = given()
//				.contentType("application/json")
//				.header("x-api-key","reqres-free-v1")			
//				.body(postrequest)
//				.when()
//				.post("https://reqres.in/api/users");
//		System.out.println(response.getBody().asString());		
//	}	
//	
//	@Test
//	public void ValidatePostWithPOJOList() { 		
//		List<String> listlng = new ArrayList<>();
//		listlng.add("java");
//		listlng.add("c++");
//		postRequestBody postrequest = new postRequestBody();
//		postrequest.setName("morpheous");
//		postrequest.setJob("leader");
//		postrequest.setLanguages(listlng);
//		Response response = given().contentType("application/json").header("x-api-key", "reqres-free-v1")
//				.body(postrequest).when().post("https://reqres.in/api/users");
//		System.out.println(response.getBody().asString());	
//	}
	
//	@Test
//	public void ValidatePostWithPOJOListObject() { 		
//		List<String> listlng = new ArrayList<>();
//		listlng.add("java");
//		listlng.add("c++");
//		
//		CityRequest city1 = new CityRequest();
//		city1.setCity("banglore");
//		city1.setTemperature("40");
//
//		CityRequest city2 = new CityRequest();
//		city2.setCity("delhi");
//		city2.setTemperature("30");
//
//		List<CityRequest> listcity = new ArrayList<>();
//		listcity.add(city1);
//		listcity.add(city2);
//
//		postRequestBody postrequest = new postRequestBody();
//		postrequest.setName("morpheous");
//		postrequest.setJob("leader");
//		postrequest.setLanguages(listlng);
//		postrequest.setCities(listcity);
//
//		Response response = given()
//				.contentType("application/json")
//				
//				.header("x-api-key", "reqres-free-v1")
//				.body(postrequest)
//				.when()
//				.post("https://reqres.in/api/users");
//		postRequestBody  responsebody = response.then().extract().as(postRequestBody.class);
//		System.out.println(responsebody.getName());
//		System.out.println(responsebody.getCities().get(0).getCity());
//		System.out.println(responsebody.getCities().get(0).getTemperature());
		
//		System.out.println(responsebody.getCities().get(0).getCity());
//		System.out.println(responsebody.getCities().get(0).getTemperature());
	//	System.out.println(response.getBody().asString());
	
}